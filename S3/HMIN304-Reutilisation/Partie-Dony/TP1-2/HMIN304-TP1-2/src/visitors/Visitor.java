package visitors;

import stockage.Archive;
import stockage.Directory;
import stockage.ElementStockage;
import stockage.File;
import stockage.Link;
import stockage.Symlink;

public interface Visitor {

	public  void visitDirectory(Directory directory);

	public  void visitFile(File file);
	
	public void visitLink(Link link);
	
	public void visitSymLink(Symlink symlink);

	public void visitArchive(Archive archive);
	
}
