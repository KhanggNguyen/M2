package test;

import tpemf.maps.MapsPackage;
import tpemf.maps.Pedestrian;
import tpemf.maps.Road;
import tpemf.maps.Street;
import tpemf.maps.map;

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;


	
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
		Resource resource = chargerModele("model/map.xmi", MapsPackage.eINSTANCE);
		if (resource == null) System.err.println(" Erreur de chargement du modèle");
		
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "map"
		map maMap = (map) resource.getContents().get(0);
						
		System.out.println(maMap.getName());
		System.out.print("\n");
		System.out.println("Tous les rues de la carte");
		//Tous les rues d'une carte donné
		maMap.printRoads();
		
		System.out.print("\n");
		
		System.out.println("Tous les rues piétons avec la longueur dépasse 1000m");
		maMap.printPedestrianSup1000();
		
		System.out.print("\n");
		
		System.out.println("Pour une rue donné, trouver tous les rues adjecents");
		System.out.print("Tous les rues adjecents de ");
		maMap.printRoadByName("A");
		
		System.out.print("\n");
		
		System.out.println("Pour une espace publique donné, trouver tous les rues bordants");
		maMap.printRoadBySquareName("GardenBorderedByStreetA");
		
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
}
