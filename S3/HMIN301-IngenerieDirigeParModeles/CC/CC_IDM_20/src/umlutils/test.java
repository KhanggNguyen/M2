package umlutils;



import java.util.ArrayList;

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
	
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
		Resource resource = chargerModele("model/process.xmi", ProcessusPackage.eINSTANCE);
		if (resource == null) System.err.println(" Erreur de chargement du modèle");
		else System.out.println("Chargement succès");
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "process"
		Process myProcess = (Process) resource.getContents().get(0);
		System.out.println("Début de transformation");
		sauverModele("model/newActivityDiagram.uml", transform(myProcess));
		System.out.println("Fin de transformation");
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
        init.setName("beginning");
        if(myProcess.getBeginning() != null) {
        	activity.getOwnedNodes().add(init);
            ControlFlow cf = myFactory.createControlFlow();
            cf.setSource(init);
            cf.setTarget(getOpaqueActionByName(myProcess.getBeginning().getReferencedActivity().getNom(), opaqueActionList));
            cf.setName("beginning-"+myProcess.getBeginning().getReferencedActivity().getNom());
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
