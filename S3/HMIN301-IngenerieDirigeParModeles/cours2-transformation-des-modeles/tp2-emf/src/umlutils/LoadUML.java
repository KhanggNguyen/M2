package umlutils;


import java.util.List;

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import org.eclipse.uml2.uml.Model;
//import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Operation;

public class LoadUML {

	public static void main(String[] args) {

		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "Model"
		Model umlP = chargerModele("model/model.uml");
		
		String nomModele=  umlP.getName();
		
		Package p = null;
		Class c = null;
		for(Element element : umlP.allOwnedElements()) {
			if (element instanceof Class && ((Class)element).getName().equals("Class1")){
				c = (Class) element;
			}
			
			if(element instanceof Package && ((Package)element).getName().equals("P2")) {
				p = (Package) element;
			}
		}
		
		
		moveClass(c,p);
		changeAttributs(c);
		
		System.out.println("Ton modèle se nomme: \""+nomModele+"\"");
		
		
		//Modifier le nom du modèle UML
		umlP.setName("NewModelName");
		System.out.println("\""+nomModele+"\" Changé ! Le modèle se nomme: \""+umlP.getName()+"\"");
		
		
		//Sauvegarder le modèle avec son nouveau nom
		sauverModele("model/changerNom.uml", umlP);
		
		
		
	}
	
	public static void moveClass(Class c, Package p2) {		
		p2.getPackagedElements().add(c);
	}
	
	public static void changeAttributs(Class c) {
		for(Property property : c.getAttributes()) {
			property.setVisibility(VisibilityKind.PRIVATE_LITERAL);
			
			Operation getter = UMLFactory.eINSTANCE.createOperation();
			Parameter paramReturn = UMLFactory.eINSTANCE.createParameter();
			paramReturn.setType(property.getType());
			paramReturn.setUpper(property.getUpper());
			paramReturn.setLower(property.getLower());
			paramReturn.setDirection(ParameterDirectionKind.RETURN_LITERAL);
			getter.getOwnedParameters().add(paramReturn);
			getter.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			getter.setName("get"+property.getName().toUpperCase());
			c.getOwnedOperations().add(getter);
			
			Operation setter = UMLFactory.eINSTANCE.createOperation();
			Parameter param = UMLFactory.eINSTANCE.createParameter();
			param.setType(property.getType());
			param.setUpper(property.getUpper());
			param.setLower(property.getLower());
			param.setDirection(ParameterDirectionKind.IN_LITERAL);
			setter.getOwnedParameters().add(param);
			setter.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			setter.setName("set"+property.getName().toUpperCase());
			c.getOwnedOperations().add(setter);
		}
	}
	
	
	
	public static void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du modèle : "+e);
		      e.printStackTrace();
		   }
		}

		public static Model chargerModele(String uri) {
		   Resource resource = null;
		   EPackage pack=UMLPackage.eINSTANCE;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
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
		   return (Model) resource.getContents().get(0);
		}

}