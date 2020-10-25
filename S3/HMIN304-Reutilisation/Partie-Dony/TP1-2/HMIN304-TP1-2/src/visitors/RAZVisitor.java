package visitors;

import stockage.Archive;
import stockage.Directory;
import stockage.ElementStockage;
import stockage.File;
import stockage.Link;
import stockage.Symlink;

public class RAZVisitor implements Visitor{
	
	@Override
	public void visitDirectory(Directory directory) {
		
	}

	@Override
	public void visitFile(File file) {
		// TODO Auto-generated method stub
		file.setContents("");
	}

	@Override
	public void visitLink(Link link) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSymLink(Symlink symlink) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitArchive(Archive archive) {
		// TODO Auto-generated method stub
		
	}




}
