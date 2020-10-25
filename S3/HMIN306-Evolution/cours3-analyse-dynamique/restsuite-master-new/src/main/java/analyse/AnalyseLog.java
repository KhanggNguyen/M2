package analyse;

import java.io.FileWriter;
import java.io.IOException;

public class AnalyseLog {

	public static void analyseLog(String m1, String m2) {		
		try {
			FileWriter  myWriter = new FileWriter (System.getProperty("user.dir") + "/myLog.txt", true);
			myWriter.write(m1 + " -> " + m2 + "\n");
			myWriter.close();
		}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
}
