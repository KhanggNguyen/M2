package analyse;
import model.Node;
import java.util.HashSet;
import java.util.Set;

//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.IWorkspace;
//import org.eclipse.core.resources.IWorkspaceRoot;
//import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class JDTMain {

	public static void main(String[] args) {
        
        ASTParser parser = ASTParser.newParser(AST.JLS3); 
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		//parser.setSource("public class A { int i = 9;  \\n int j; \\n ArrayList<Integer> al = new ArrayList<Integer>();j=1000; }".toCharArray()); // set source
		parser.setSource(ClassAsString.classAsString.toCharArray()); // set source
		parser.setResolveBindings(true); // we need bindings later on
		
		//*****Nécessiter d'implémenter la dépendance JDT***************
//		CompilationUnit cu = (CompilationUnit) parser.createAST(null /* IProgressMonitor */); // parse
//	
//		cu.accept(new ASTVisitor() {
//			Set names = new HashSet();
//			
//			public boolean visit(TypeDeclaration node) {
//				SimpleName name = node.getName();
//				this.names.add(name.getIdentifier());
//				System.out.println("Declaration of Class :  '"+name+"' at line"+cu.getLineNumber(name.getStartPosition()));
//				return true;
//			}
//			
//			public boolean visit(MethodDeclaration node ) {
//				SimpleName name = node.getName();
//				this.names.add(name.getIdentifier());
//				System.out.println("Declaration of Method :  '"+name+"' at line"+cu.getLineNumber(name.getStartPosition()));
//				return false;
//			}
//			
//			public boolean visit(VariableDeclarationFragment node) {
//				SimpleName name = node.getName();
//				this.names.add(name.getIdentifier());
//				System.out.println("Declaration of Variable : '"+name+"' at line"+cu.getLineNumber(name.getStartPosition()));
//				return false; // do not continue to avoid usage info
//			}
//			
//			/*
//			public boolean visit(Assignment node) {
//				Expression left = node.getLeftHandSide();
//				Assignment.Operator operator = node.getOperator();
//				Expression right = node.getRightHandSide();
//				System.out.println("Instruction : " + left);
//			}*/
//
//			public boolean visit(SimpleName node) {
//				if (this.names.contains(node.getIdentifier())) {
//				System.out.println("Usage of  : '" + node + "' at line " +	cu.getLineNumber(node.getStartPosition()));
//				}
//				return true;
//			}
//			
//		});
		
	
	}
}
