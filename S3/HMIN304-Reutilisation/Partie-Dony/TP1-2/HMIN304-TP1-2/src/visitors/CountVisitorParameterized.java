//package visitors;
//
//import java.util.function.Function;
//
//import stockage.Archive;
//import stockage.Directory;
//import stockage.ElementStockage;
//import stockage.File;
//import stockage.Link;
//import stockage.Symlink;
//
//public class CountVisitorParameterized implements Visitor{
//	int count;
////	Function<ElementStockage, String> test = o->o.toString();
////	
////	public CountVisitorParameterized(Function<ElementStockage, Boolean> f) {
////		test = f;
////	}
//	
//	public int getCount() {
//		return count;
//	}
//
//	@Override
//	public void visitDirectory(Directory directory) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void visitFile(File file) {
//		// TODO Auto-generated method stub
//		if(this.test.apply(file) != null) {
//			count+=1;
//		}
//	}
//
//	@Override
//	public void visitLink(Link link) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void visitSymLink(Symlink symlink) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void visitArchive(Archive archive) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
