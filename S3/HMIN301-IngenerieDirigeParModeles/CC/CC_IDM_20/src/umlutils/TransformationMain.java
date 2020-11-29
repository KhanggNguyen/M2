package umlutils;



import java.util.ArrayList;
import java.util.Scanner;

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Package;

import processus.ProcessusPackage;
import processus.Process;
	
public class TransformationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez choisir le modèle processus 0 ou 1 ou 2 pour tester et -1 pour quitter: ");
		int i = sc.nextInt();
		String modeleNom, nouveauModeleNom;
		while(i != -1) {
			switch(i){
			case 0:
				modeleNom = "process.xmi";
				nouveauModeleNom = "newActivityDiagram" + String.valueOf(i) + ".uml";
				exec(modeleNom,nouveauModeleNom);
				break;
			case 1:
				modeleNom = "process" + String.valueOf(i) + ".xmi";
				nouveauModeleNom = "newActivityDiagram" + String.valueOf(i) + ".uml";
				exec(modeleNom,nouveauModeleNom);
				break;
			case 2:
				modeleNom = "process" + String.valueOf(i) + ".xmi";
				nouveauModeleNom = "newActivityDiagram" + String.valueOf(i) + ".uml";
				exec(modeleNom,nouveauModeleNom);
				break;
			default:
				System.out.println("Veuillez choisir le bon chiffre!");
				break;
			}
			
			System.out.print("Veuillez choisir le modèle processus 0 ou 1 ou 2 pour tester et -1 pour stopper: ");
			i = sc.nextInt();
		}
		
		System.out.println("Fin de programme");
		
		
	}
	
	public static void exec(String nomModeleProcess, String nomModeleActivity) {
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
		//mettez le nom de model xmi
				 
		Resource resource = chargerModele("model/" + nomModeleProcess, ProcessusPackage.eINSTANCE);
		if (resource == null) System.err.println(" Erreur de chargement du modèle");
		else System.out.println("Chargement modèle : " + nomModeleProcess + " succès");
				
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "process"
		Process myProcess = (Process) resource.getContents().get(0);
		System.out.println("Début de transformation");
				
		sauverModele("model/" + nomModeleActivity, transform(myProcess));
		System.out.println("Fin de transformation vers nouveau modèle : " + nomModeleActivity);
	}
	
	public static Package transform(Process myProcess) {
		UMLFactory myFactory = UMLFactory.eINSTANCE;
		
		Activity activity = myFactory.createActivity();
		
		EList<ActivityNode> opaqueActionList = activity.getOwnedNodes();
		
		for(processus.Activity a : myProcess.getActivities()) {
			OpaqueAction opaqueAction = myFactory.createOpaqueAction();
			opaqueAction.setName(a.getNom());
			opaqueActionList.add(opaqueAction);
			activity.getOwnedNodes().add(opaqueAction);
		}
		     
        
        
        InitialNode init = myFactory.createInitialNode();
        init.setName("Beginning");
        if(myProcess.getBeginning() != null) {
        	activity.getOwnedNodes().add(init);
            ControlFlow cf = myFactory.createControlFlow();
            cf.setSource(init);
            cf.setTarget(getOpaqueActionByName(myProcess.getBeginning().getReferencedActivity().getNom(), opaqueActionList));
            cf.setName(init.getName() + "-" + myProcess.getBeginning().getReferencedActivity().getNom());
            activity.getEdges().add(cf);
        }
        
        String cfName;
        processus.Activity currentActivity = myProcess.getBeginning().getReferencedActivity();
        while(currentActivity.getNext() != null) {
        	ControlFlow cf = myFactory.createControlFlow();
        	
        	cf.setSource(getOpaqueActionByName(currentActivity.getNom(), opaqueActionList));
        	cfName = currentActivity.getNom();
        	
        	currentActivity = currentActivity.getNext();
            cf.setTarget(getOpaqueActionByName(currentActivity.getNom(), opaqueActionList));
            cfName += "-" + currentActivity.getNom();
            cf.setName(cfName);
        	
        	activity.getEdges().add(cf);
        	
        	if(myProcess.getEnd().getReferencedActivity().getNom().equals(currentActivity.getNom())) {
        		ActivityFinalNode finalNode = myFactory.createActivityFinalNode();
        		finalNode.setName(myProcess.getEnd().getReferencedActivity().getNom());
        		cf = myFactory.createControlFlow();
        		cf.setSource(getOpaqueActionByName(currentActivity.getNom(), opaqueActionList));
        		cf.setTarget(finalNode);
            	activity.getOwnedNodes().add(finalNode);
        		cf.setName(currentActivity.getNom() + "-" + finalNode.getName());
        		activity.getEdges().add(cf);
        	}
        }
        
      
        Model modeleProcessus = myFactory.createModel();
        modeleProcessus.setName("modelProcess");
        activity.setPackage(modeleProcessus);
        return  activity.getPackage();
	}
	
	public static OpaqueAction getOpaqueActionByName(String nomOpaqueAction, EList<ActivityNode> opaqueActionList) {
		for(ActivityNode opaqueAction : opaqueActionList) {
			if(opaqueAction.getName().equals(nomOpaqueAction)) {
				return (OpaqueAction) opaqueAction;
			}
		}
		return null;
	}

	public static Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}
	
	public static void sauverModele(String uri, Package pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
		    resource.getContents().add(pack);
		    resource.save(null);
		}
		catch(Exception e) {
			System.err.println("ERREUR sauvegarde du modèle : "+e);
			e.printStackTrace();
		}
	}
}
