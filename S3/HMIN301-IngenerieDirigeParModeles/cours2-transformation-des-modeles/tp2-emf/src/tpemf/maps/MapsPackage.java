/**
 */
package tpemf.maps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tpemf.maps.MapsFactory
 * @model kind="package"
 * @generated
 */
public interface MapsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "maps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapsPackage eINSTANCE = tpemf.maps.impl.MapsPackageImpl.init();

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.RoadImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__BORDER = 2;

	/**
	 * The feature id for the '<em><b>Meet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__MEET = 3;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.PedestrianImpl <em>Pedestrian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.PedestrianImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getPedestrian()
	 * @generated
	 */
	int PEDESTRIAN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__NAME = ROAD__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__LENGTH = ROAD__LENGTH;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__BORDER = ROAD__BORDER;

	/**
	 * The feature id for the '<em><b>Meet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__MEET = ROAD__MEET;

	/**
	 * The number of structural features of the '<em>Pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.mapImpl <em>map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.mapImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getmap()
	 * @generated
	 */
	int MAP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROADS = 1;

	/**
	 * The feature id for the '<em><b>Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SPACES = 2;

	/**
	 * The number of structural features of the '<em>map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.PublicSpaceImpl <em>Public Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.PublicSpaceImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getPublicSpace()
	 * @generated
	 */
	int PUBLIC_SPACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE__BORDERED_BY = 1;

	/**
	 * The number of structural features of the '<em>Public Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Public Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.SquareImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NAME = PUBLIC_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BORDERED_BY = PUBLIC_SPACE__BORDERED_BY;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = PUBLIC_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = PUBLIC_SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.StreetImpl <em>Street</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.StreetImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getStreet()
	 * @generated
	 */
	int STREET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__NAME = ROAD__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LENGTH = ROAD__LENGTH;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__BORDER = ROAD__BORDER;

	/**
	 * The feature id for the '<em><b>Meet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__MEET = ROAD__MEET;

	/**
	 * The number of structural features of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tpemf.maps.impl.GardenImpl <em>Garden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpemf.maps.impl.GardenImpl
	 * @see tpemf.maps.impl.MapsPackageImpl#getGarden()
	 * @generated
	 */
	int GARDEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN__NAME = PUBLIC_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN__BORDERED_BY = PUBLIC_SPACE__BORDERED_BY;

	/**
	 * The number of structural features of the '<em>Garden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN_FEATURE_COUNT = PUBLIC_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Garden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN_OPERATION_COUNT = PUBLIC_SPACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tpemf.maps.Pedestrian <em>Pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian</em>'.
	 * @see tpemf.maps.Pedestrian
	 * @generated
	 */
	EClass getPedestrian();

	/**
	 * Returns the meta object for class '{@link tpemf.maps.map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>map</em>'.
	 * @see tpemf.maps.map
	 * @generated
	 */
	EClass getmap();

	/**
	 * Returns the meta object for the attribute '{@link tpemf.maps.map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tpemf.maps.map#getName()
	 * @see #getmap()
	 * @generated
	 */
	EAttribute getmap_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tpemf.maps.map#getRoads <em>Roads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roads</em>'.
	 * @see tpemf.maps.map#getRoads()
	 * @see #getmap()
	 * @generated
	 */
	EReference getmap_Roads();

	/**
	 * Returns the meta object for the containment reference list '{@link tpemf.maps.map#getSpaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spaces</em>'.
	 * @see tpemf.maps.map#getSpaces()
	 * @see #getmap()
	 * @generated
	 */
	EReference getmap_Spaces();

	/**
	 * Returns the meta object for class '{@link tpemf.maps.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see tpemf.maps.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for class '{@link tpemf.maps.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street</em>'.
	 * @see tpemf.maps.Street
	 * @generated
	 */
	EClass getStreet();

	/**
	 * Returns the meta object for class '{@link tpemf.maps.PublicSpace <em>Public Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Space</em>'.
	 * @see tpemf.maps.PublicSpace
	 * @generated
	 */
	EClass getPublicSpace();

	/**
	 * Returns the meta object for the attribute '{@link tpemf.maps.PublicSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tpemf.maps.PublicSpace#getName()
	 * @see #getPublicSpace()
	 * @generated
	 */
	EAttribute getPublicSpace_Name();

	/**
	 * Returns the meta object for the reference list '{@link tpemf.maps.PublicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bordered By</em>'.
	 * @see tpemf.maps.PublicSpace#getBorderedBy()
	 * @see #getPublicSpace()
	 * @generated
	 */
	EReference getPublicSpace_BorderedBy();

	/**
	 * Returns the meta object for class '{@link tpemf.maps.Garden <em>Garden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Garden</em>'.
	 * @see tpemf.maps.Garden
	 * @generated
	 */
	EClass getGarden();

	/**
	 * Returns the meta object for class '{@link tpemf.maps.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see tpemf.maps.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for the attribute '{@link tpemf.maps.Road#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tpemf.maps.Road#getName()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Name();

	/**
	 * Returns the meta object for the attribute '{@link tpemf.maps.Road#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see tpemf.maps.Road#getLength()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Length();

	/**
	 * Returns the meta object for the reference list '{@link tpemf.maps.Road#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Border</em>'.
	 * @see tpemf.maps.Road#getBorder()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_Border();

	/**
	 * Returns the meta object for the reference list '{@link tpemf.maps.Road#getMeet <em>Meet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meet</em>'.
	 * @see tpemf.maps.Road#getMeet()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_Meet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MapsFactory getMapsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.PedestrianImpl <em>Pedestrian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.PedestrianImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getPedestrian()
		 * @generated
		 */
		EClass PEDESTRIAN = eINSTANCE.getPedestrian();

		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.mapImpl <em>map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.mapImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getmap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getmap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__NAME = eINSTANCE.getmap_Name();

		/**
		 * The meta object literal for the '<em><b>Roads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROADS = eINSTANCE.getmap_Roads();

		/**
		 * The meta object literal for the '<em><b>Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__SPACES = eINSTANCE.getmap_Spaces();

		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.SquareImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.StreetImpl <em>Street</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.StreetImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getStreet()
		 * @generated
		 */
		EClass STREET = eINSTANCE.getStreet();

		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.PublicSpaceImpl <em>Public Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.PublicSpaceImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getPublicSpace()
		 * @generated
		 */
		EClass PUBLIC_SPACE = eINSTANCE.getPublicSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SPACE__NAME = eINSTANCE.getPublicSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Bordered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_SPACE__BORDERED_BY = eINSTANCE.getPublicSpace_BorderedBy();

		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.GardenImpl <em>Garden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.GardenImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getGarden()
		 * @generated
		 */
		EClass GARDEN = eINSTANCE.getGarden();

		/**
		 * The meta object literal for the '{@link tpemf.maps.impl.RoadImpl <em>Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpemf.maps.impl.RoadImpl
		 * @see tpemf.maps.impl.MapsPackageImpl#getRoad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getRoad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__NAME = eINSTANCE.getRoad_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__LENGTH = eINSTANCE.getRoad_Length();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__BORDER = eINSTANCE.getRoad_Border();

		/**
		 * The meta object literal for the '<em><b>Meet</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__MEET = eINSTANCE.getRoad_Meet();

	}

} //MapsPackage
