package analyse;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Font;
import guru.nidi.graphviz.attribute.Rank;
import guru.nidi.graphviz.attribute.Rank.RankDir;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import model.Node;
import spoon.Launcher;
import spoon.MavenLauncher;
import spoon.compiler.Environment;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import static guru.nidi.graphviz.model.Factory.*;

public class GraphVizMain {

	public static void main(String[] args) {
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
		
		// Load project (APP_SOURCE only, no TEST_SOURCE for now)
		
		Launcher launcher = null;
		/*
		if(arguments.isMavenProject() ) {
			launcher = new MavenLauncher(experiment_source_code, MavenLauncher.SOURCE_TYPE.APP_SOURCE); // requires M2_HOME environment variable
		}else {
			launcher = new Launcher();
			launcher.addInputResource(experiment_source_code + "/src");
		}*/
		
		launcher = new Launcher();
		launcher.addInputResource(experiment_source_code + "/src");
		
		// Setting the environment for Spoon
		Environment environment = launcher.getEnvironment();
		environment.setCommentEnabled(true); // represent the comments from the source code in the AST
		environment.setAutoImports(true); // add the imports dynamically based on the typeReferences inside the AST nodes.
//		environment.setComplianceLevel(0); // sets the java compliance level.
		
		System.out.println("Run Launcher and fetch model.");
		launcher.run(); // creates model of project
		CtModel model = launcher.getModel(); // returns the model of the project
		
		MutableGraph graph = mutGraph("AppelGraph").setDirected(true);
		for(CtType<?> classs : model.getAllTypes()) {
			Collection<CtTypeReference> typeReferenceList = classs.getElements(new TypeFilter<CtTypeReference>(CtTypeReference.class));
			for(CtTypeReference typeReference : typeReferenceList) {
				if(!typeReference.isPrimitive() && model.getAllTypes().contains(typeReference.getTypeDeclaration())) {//sans classe hors du projet
				//if(!typeReference.isPrimitive()) {//avec les references hors du projet (i.e : string/int/boolean/ioexception etc.
					graph.add(mutNode(classs.getSimpleName()).addLink(typeReference.getSimpleName()));
				}
			}
		}
		
		try {
			Graphviz.fromGraph(graph).render(Format.PNG).toFile(new File("./AppelGraphStaticClass.png"));
			Graphviz.fromGraph(graph).render(Format.DOT).toFile(new File("./AppelGraphStaticClass.dot"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
}
