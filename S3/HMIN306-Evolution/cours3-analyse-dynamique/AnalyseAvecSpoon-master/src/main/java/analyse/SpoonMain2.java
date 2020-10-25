package analyse;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;

import java.util.logging.Logger;

import spoon.Launcher;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtStatementListImpl;
import spoon.reflect.factory.Factory;

public class SpoonMain2 {
	
	public static String removeLastCharacter(String str) {
		
		String result = null;
		
		if ((str != null) && (str.length() > 0)) {
			
			result = str.substring(0, str.length() - 1);
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("Run Launcher and fetch model.");
		
		launcher.run(); // creates model of project
		CtModel model = launcher.getModel(); // returns the model of the project
		
		Collection<CtType<?>> classList = model.getAllTypes();
		
		String regex="[a-z|A-Z]+\\(";
		
		for(CtType<?> classs : classList) {
			
			for(CtMethod method : classs.getAllMethods()) {
		
				if(!method.isAbstract()) {
					
					List<CtInvocation> invocationList = method.getElements(new TypeFilter<CtInvocation>(CtInvocation.class));
					
					for(CtInvocation invocation : invocationList) {
						
						Pattern pattern = Pattern.compile(regex);
						Matcher matcher = pattern.matcher(invocation.toString());
						
						if(matcher.find()) {
							
							if(matcher.group(0).substring(0, 1).equals(".")){
								
								String method2_name = removeLastCharacter(matcher.group(0).substring(1));
								System.out.println(method.getDeclaringType().getQualifiedName() + "::" + method.getSimpleName() + " -> " + method2_name);
								CtStatement log_statement = launcher.getFactory().Code().createCodeSnippetStatement("analyse.AnalyseLog.analyseLog( \"" + method.getSimpleName() + "\", \"" + method2_name + "\")");
								invocation.getParent(CtBlock.class).insertBegin(log_statement);	
								
							}else {
								
								String method2_name = removeLastCharacter(matcher.group(0).substring(0));
								System.out.println(method.getDeclaringType().getQualifiedName() + "::" + method.getSimpleName() + " -> " + method2_name);
								CtStatement log_statement = launcher.getFactory().Code().createCodeSnippetStatement("analyse.AnalyseLog.analyseLog( \"" +  method.getSimpleName() + "\", \"" + method2_name + "\")");
								invocation.getParent(CtBlock.class).insertBegin(log_statement);	
								
							}
							
						}
						
					}

				}
				
			}
			
		}
		
		launcher.setSourceOutputDirectory(System.getProperty("user.dir") + "/restsuite-res");
		launcher.prettyprint();
		
		System.out.println("Done !");
	}

	

}
