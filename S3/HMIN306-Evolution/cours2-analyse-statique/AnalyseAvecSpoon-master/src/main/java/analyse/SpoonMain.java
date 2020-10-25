package analyse;

import java.util.Collection;
import java.util.List;

import spoon.Launcher;
import spoon.MavenLauncher;
import spoon.compiler.Environment;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class SpoonMain {

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
		
		System.out.println("------------------");
		
		//Nombre de classes
		Collection<CtType<?>> classList = model.getAllTypes();
		int cpt_class = 0;
		for(CtType<?> classe : classList) {
			cpt_class++;
			//System.out.println("class  " + cpt_class + " : " + classe.getSimpleName());
		}
		System.out.println("Nombre de classes : " + cpt_class);
		
		System.out.println("------------------");
		
		// basic type filter to retrive all methods in your model
		List<CtMethod> methodList = model.getElements(new TypeFilter<CtMethod>(CtMethod.class));
		int cpt_method = 0;
		for(CtMethod method : methodList) {
			cpt_method++;
			//System.out.println("method " + cpt + " : " + method.getSimpleName());
		}
		System.out.println("Nombre de methodes : " + cpt_method);
		
		System.out.println("------------------");
		
		//Nombre de lignes de code
		int cpt = 0;
		String[] lines;
		for(CtType<?> classs : classList) {
			lines = classs.toString().split("\r\n|\r|\n");
			cpt += lines.length;
		}
		System.out.println("Nombre de lignes de code : " + cpt);
		
		System.out.println("------------------");
		
		//Nombre de packages
		Collection<CtPackage> packageList = model.getAllPackages();
		cpt = 0;
		for(CtPackage packagee : packageList) {
			cpt++;
		}
		System.out.println("Nombre de packages : " + cpt);
		
		System.out.println("------------------");
		
		//Moyenne des méthodes
		int avg_method = cpt_method/cpt;
		System.out.println("Moyen methodes par classe : " + avg_method);
		
		System.out.println("------------------");
		
		//Moyenne de lignes de code par méthode
		int total_ligne_code_par_methode = 0;
		for(CtMethod method : methodList) {
			total_ligne_code_par_methode += method.toString().split("\\r\\n|\\r|\\n").length;
			
		}
		System.out.println("Moyen de ligne de code par méthode : " + total_ligne_code_par_methode/methodList.size());
		
		System.out.println("------------------");
		
		//Nombre d'attributes
		int cpt_variable = 0;
		//Collection<CtType<?>> classList = model.getAllTypes();
		for(CtType<?> classs : classList) {
			for(CtField field : classs.getFields()) {
				cpt_variable++;
				//System.out.println("Variable/Attribute : " + field.getSimpleName());
			}
		}
		System.out.println("Moyen de attributes : " + cpt_variable/cpt_class);		
		
		System.out.println("------------------");
		
		System.out.println("10% des classes qui possèdent le plus grand nombre de méthodes.");
		int tab_size = cpt_class/10;
		CtType<?> tab_class_most_methods[] = new CtType<?>[tab_size];
		int idx;
		boolean trouve;
		for(CtType<?> classs : classList) {
			trouve = false;
			idx = 0;
			while(idx<tab_size && !trouve) {
				if(tab_class_most_methods[idx] == null){
					tab_class_most_methods[idx] = classs;
					trouve = true;
				}
				
				if(tab_class_most_methods[idx].getMethods().size() < classs.getMethods().size()) {
					tab_class_most_methods[idx] = classs;
					trouve = true;
				}
				idx++;
			}
		}
		
		for(int i=0; i<tab_size; i++) {
			System.out.println(tab_class_most_methods[i].getSimpleName() + " : " + tab_class_most_methods[i].getMethods().size());
		}
		
		System.out.println("------------------");
		
		System.out.println("10% des classes qui possèdent le plus grand nombre d'attributes.");
		tab_size = cpt_class/10;
		CtType<?> tab_class_most_attributes[] = new CtType<?>[tab_size];
		
		for(CtType<?> classs : classList) {
			trouve = false;
			idx = 0;
			while(idx<tab_size && !trouve) {
				if(tab_class_most_attributes[idx] == null){
					tab_class_most_attributes[idx] = classs;
					trouve = true;
				}
				
				if(tab_class_most_attributes[idx].getFields().size() < classs.getFields().size()) {
					tab_class_most_attributes[idx] = classs;
					trouve = true;
				}
				idx++;
			}
		}
		
		for(int i=0; i<tab_size; i++) {
			System.out.println(tab_class_most_attributes[i].getSimpleName() + " : " + tab_class_most_attributes[i].getFields().size());
		}
		
		System.out.println("------------------");

		System.out.println("Tous les classes appartiennent aux 2 tables.");
		int i = 0,j;
		while(i<tab_size) {
			j=0;
			while(j<tab_size) {
				if(tab_class_most_attributes[i].getSimpleName().equals(tab_class_most_methods[j].getSimpleName())){
					System.out.println(tab_class_most_attributes[i].getSimpleName());
				}
				j++;
			}
			i++;
		}
		
		System.out.println("------------------");
		
		int x = 10;
		System.out.println("Les classes qui possèdent plus de " + x + " méthodes");
		for(CtType<?> classs : classList) {
			if(classs.getMethods().size() > x) {
				System.out.println("ClassName : " + classs.getSimpleName() + " avec "+ classs.getMethods().size() + " méthodes");
			}
		}
		
		System.out.println("------------------");
		
		System.out.println("Les 10% des méthodes qui possèdent le plus grand nombre de lignes de code (par classe).");
		CtMethod tab_method_most_lines[];
		for(CtType<?> classs : model.getAllTypes()) {
			System.out.println("ClassName : " + classs.getSimpleName());
			if(classs.getMethods().size() > 0) {
				tab_size = (classs.getMethods().size()/10)+1;
			}else {
				tab_size = (classs.getMethods().size()/10);
			}
			//%10 de methods de class
			tab_method_most_lines = new CtMethod[tab_size];
			for(CtMethod methodd : classs.getMethods()) {
				trouve = false;
				idx = 0;
				while(idx<tab_size && !trouve) {
					if(tab_method_most_lines[idx] == null){
						tab_method_most_lines[idx] = methodd;
						trouve = true;
					}
					
					if(tab_method_most_lines[idx].toString().split("\r\n|\r|\n").length < methodd.toString().split("\r\n|\r|\n").length) {
						tab_method_most_lines[idx] = methodd;
						trouve = true;
					}
					idx++;
				}
			}
			for(i=0; i<tab_size; i++) {
				System.out.println(tab_method_most_lines[i].getSimpleName() + " : " + tab_method_most_lines[i].toString().split("\r\n|\r|\n").length);
			}
			if(tab_size == 0) {
				System.out.println("Pas de méthode.");
			}
			
			System.out.println("");
		}
		
		System.out.println("------------------");
		
		System.out.println("Le nombre maximal de paramètres par rapport à toutes les méthodes de l’application.");
		int max_params = 0;
		for(CtMethod methodd : methodList) {
			if(methodd.getParameters().size() > max_params) {
				max_params = methodd.getParameters().size();
			}
		}
		System.out.println("Le nombre maximal de paramètres est : " + max_params);
		
	}
}
