package visitors;

import stockage.Archive;
import stockage.Directory;
import stockage.File;
import stockage.Link;
import stockage.Symlink;

public class CountVisitor implements Visitor{
	int count;
	
	public CountVisitor() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public void visitDirectory(Directory directory) {
		// TODO Auto-generated method stub
		//Rien à faire, l'appel de accept
		//sur la structure est fait ailleurs
	}

	@Override
	public void visitFile(File file) {
		// TODO Auto-generated method stub
		if(file.size() > 10 ) {
			count += 1;
		}
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
