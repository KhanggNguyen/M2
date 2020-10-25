package analyse;

import java.io.File;
import java.io.FileNotFoundException;
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

import java.io.BufferedReader;
import java.io.FileReader;

public class GraphVizMain2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Begin Drawing Graph");
		
		MutableGraph graph = mutGraph("AppelGraphDynamic").setDirected(true);
		try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/myLog.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	String[] line_split = line.split(" -> ");
		    	graph.add(mutNode(line_split[0]).addLink(line_split[1]));
		    }
		}
		
		
		try {
			Graphviz.fromGraph(graph).render(Format.PNG).toFile(new File("./AppelGraphDynamic.png"));
			Graphviz.fromGraph(graph).render(Format.DOT).toFile(new File("./AppelGraphDynamic.dot"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
}
