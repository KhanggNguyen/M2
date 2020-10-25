package analyse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
