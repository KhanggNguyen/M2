package analyse;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import guru.nidi.graphviz.attribute.Attributes;
import guru.nidi.graphviz.attribute.ForNode;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

import static guru.nidi.graphviz.model.Factory.*;

import model.Cluster;
import model.Couplage;
import spoon.Launcher;
import spoon.MavenLauncher;
import spoon.compiler.Environment;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtAbstractInvocation;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class SpoonMain 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Begin Analysis");

		// Parsing arguments using JCommander
		Arguments arguments = new Arguments();
		boolean isParsed = arguments.parseArguments(args);

		// if there was a problem parsing the arguments then the program is terminated.
		if(!isParsed)
			return;
		
		// Parsed Arguments
		String experiment_source_code = arguments.getSource();
		String experiment_output_filepath = arguments.getTarget();
		
		CtModel model = getModel(arguments, experiment_source_code);

		// basic type filter to retrive all methods in your model
		
		System.out.println("Début de l'analyse couplages");
		
		ArrayList<Couplage> couplages = initCouplages(model);
		
		toMutableGraph(couplages);
		
		System.out.println("Fin de l'analyse couplages");
		
		System.out.println("Début de l'analyse clusters");
		
		ArrayList<Cluster> clusters = selectionClusters( regroupementHierarchique(model, couplages) );
		
		for(Cluster c : clusters) {
			for(String s : c.getClassListe()) {
				System.out.println(s);
			}
			System.out.println("Fin d'un groupe");
		}
		
		System.out.println("Fin de répartition des groupes");
	}

	private static void toMutableGraph(ArrayList<Couplage> couplages) {
		MutableGraph g = mutGraph("graphe").setDirected(false);
		for(Couplage c : couplages) {
			g.add(mutNode(c.getSource())
					.addLink(to(mutNode(c.getTarget()))
							.with(Label.of(Integer.toString(c.getCounter()))
									)
							)
					);
		}
		
		try {
			Graphviz.fromGraph(g).render(Format.DOT).toFile(new File("./graphe.dot"));
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static CtModel getModel(Arguments arguments, String experiment_source_code) {
		// Load project (APP_SOURCE only, no TEST_SOURCE for now)
		Launcher launcher = null;
		if(arguments.isMavenProject() ) {
			launcher = new MavenLauncher(experiment_source_code, MavenLauncher.SOURCE_TYPE.APP_SOURCE); // requires M2_HOME environment variable
		}else {
			launcher = new Launcher();
			launcher.addInputResource(experiment_source_code + "/src");
		}
		
		// Setting the environment for Spoon
		Environment environment = launcher.getEnvironment();
		environment.setCommentEnabled(true); // represent the comments from the source code in the AST
		environment.setAutoImports(true); // add the imports dynamically based on the typeReferences inside the AST nodes.
//		environment.setComplianceLevel(0); // sets the java compliance level.
		
		System.out.println("Run Launcher and fetch model.");
		launcher.run(); // creates model of project
		CtModel model = launcher.getModel(); // returns the model of the project
		return model;
	}

	private static ArrayList<Couplage> initCouplages(CtModel model) 
	{
		ArrayList<Couplage> couplages = new ArrayList<Couplage>();
		
		int totalRelations = 0;
		
		for(CtType<?> type : model.getAllTypes()) 
		{
			for(CtMethod<?> method : type.getAllMethods()) 
			{
				for (CtInvocation<?> invocation : method.getElements(new TypeFilter<CtInvocation<?>>(CtInvocation.class))) 
				{
					if(invocation.getTarget().getType() != null && !invocation.getTarget().getType().isPrimitive()) {
						CtType invocationType = invocation.getTarget().getType().getDeclaration();
						if(model.getAllTypes().contains(invocationType)) 
						{
							if(!type.getSimpleName().equals(invocation.getTarget().getType().getSimpleName())) 
							{
								totalRelations++;
								boolean existe = Couplage.arrayContainsCouple(couplages, type.getSimpleName(), invocation.getTarget().getType().getSimpleName());
								if(!existe) {
									Couplage c = new Couplage(type.getSimpleName(), invocation.getTarget().getType().getSimpleName());
									couplages.add(c);
								}
							}
						}
						
					}
				}
			}
		}
		for(Couplage c : couplages) 
		{	
			c.setTotalRelations(totalRelations);
			c.setScore((float) c.getCounter()/totalRelations);
		}
	
		return couplages;
	}
	
	private static Stack<Cluster> regroupementHierarchique(CtModel model, ArrayList<Couplage> couplages) {
		ArrayList<Cluster> clusters = new ArrayList<Cluster>();
				
		for(CtType<?> ctType : model.getAllTypes()) 
			if(!clusters.contains(ctType.getSimpleName()))
				clusters.add(new Cluster(ctType.getSimpleName()));
		
		Stack<Cluster> dendro = new Stack<Cluster>();
		
		while(clusters.size() > 1) {
			
			float best = 0f, current = 0f;
			Cluster source = null,target = null;
			
			for(Cluster clusterSource : clusters) {
				for(Cluster clusterTarget : clusters) {
					if(clusterSource != clusterTarget) {
						current = getScoreBetweenClusters(couplages, clusterSource, clusterTarget);
						if(current > best) {
							best = current;
							source = clusterSource;
							target = clusterTarget;
						}
					}
				}
			}
			
			if(best == 0 || source == null || target == null) break;
			
			System.out.println("new cluster");
			
			Cluster newCluster = new Cluster(source.getClassListe(), (float) (best + source.getScore() + target.getScore()));
			newCluster.addClasses(target.getClassListe());
			
			dendro.push(source);
			dendro.push(target);
			dendro.push(newCluster);
			
			clusters.remove(source);
			clusters.remove(target);
			clusters.add(newCluster);
		}
		
		return dendro;
	}
	
	private static ArrayList<Cluster> selectionClusters(Stack<Cluster> dendro){
		ArrayList<Cluster> clusters = new ArrayList<Cluster>();
		
		while(!dendro.isEmpty()) {
			
			Cluster pere = dendro.pop();
			Cluster f1 = dendro.pop();
			Cluster f2 = dendro.pop();
			
			if(pere.getScore() > (f1.getScore() + f2.getScore())/2 ) {
				clusters.add(pere);
			}
		}
		
		return clusters;
	}
	
	private static float getScoreBetweenClusters(ArrayList<Couplage> couplages, Cluster clusterSource, Cluster clusterTarget) {
		for(String source : clusterSource.getClassListe()) {
			for(String target : clusterTarget.getClassListe()) {
				for(Couplage c : couplages) {
					if(c.getSource().equals(source)
							&& c.getTarget().equals(target)) {
						return c.getScore();
					}
				}
			}
		}
		return 0;
	}
}
