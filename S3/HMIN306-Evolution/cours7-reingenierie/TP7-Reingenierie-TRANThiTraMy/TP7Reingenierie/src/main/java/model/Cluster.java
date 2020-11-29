package model;

import java.util.ArrayList;

import spoon.reflect.declaration.CtType;

public class Cluster {
	private ArrayList<String> classListe = new ArrayList<String>();
	private float score;
	
	public Cluster(String className) {
		classListe.add(className);
		setScore(0);
	}

	public Cluster(ArrayList<String> classListe, float score) {
		super();
		this.classListe = classListe;
		setScore(score);
	}
	
	public ArrayList<String> getClassListe() {
		return classListe;
	}

	public void setClassListe(ArrayList<String> classListe) {
		this.classListe = classListe;
	}
	
	public void addClasses(ArrayList<String> classes) {
		for(String cls : classes) {
			if(!classListe.contains(cls))
				classListe.add(cls);
		}
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	
	
	
	
}
