package model;

import java.util.ArrayList;

public class Couplage {
	private String source;
	private String target;
	private int counter;
	private int totalRelations;
	private float score;
	
	public Couplage(String classSource, String classTarget) {
		super();
		this.source = classSource;
		this.target = classTarget;
		this.counter = 1;
		totalRelations = 0;
		this.score = 0f;
	}
	public int getTotalRelations() {
		return totalRelations;
	}
	public void setTotalRelations(int totalRelations) {
		this.totalRelations = totalRelations;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String classSource) {
		this.source = classSource;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String classTarget) {
		this.target = classTarget;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int cpt) {
		this.counter = cpt;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	
	public void incrementCounter() {
		this.counter++;
	}
		
	/**
	 * Verifier si couplage est présent dans la liste
	 * @param liste Couplages
	 * @return
	 */
	public static boolean arrayContainsCouple(ArrayList<Couplage> couplages, String source, String target){
		for(Couplage c : couplages) {
			if( c.getSource().equals(source)&&c.getTarget().equals(target)  ||
			  c.getSource().equals(target)&&c.getTarget().equals(source) ) {
					c.incrementCounter();
					return true;
			}
		}
		return false;
	}
}
