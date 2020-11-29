/**
 */
package processus;

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
 * @see processus.ProcessusFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/processus";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessusPackage eINSTANCE = processus.impl.ProcessusPackageImpl.init();

	/**
	 * The meta object id for the '{@link processus.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processus.impl.ProcessImpl
	 * @see processus.impl.ProcessusPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Current Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CURRENT_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITIES = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__END = 2;

	/**
	 * The feature id for the '<em><b>Beginning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BEGINNING = 3;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processus.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processus.impl.ActivityImpl
	 * @see processus.impl.ProcessusPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NOM = 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREVIOUS = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NEXT = 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processus.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processus.impl.PseudoStateImpl
	 * @see processus.impl.ProcessusPackageImpl#getPseudoState()
	 * @generated
	 */
	int PSEUDO_STATE = 2;

	/**
	 * The feature id for the '<em><b>Referenced Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE__REFERENCED_ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pseudo State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processus.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processus.impl.InitImpl
	 * @see processus.impl.ProcessusPackageImpl#getInit()
	 * @generated
	 */
	int INIT = 3;

	/**
	 * The feature id for the '<em><b>Referenced Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__REFERENCED_ACTIVITY = PSEUDO_STATE__REFERENCED_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processus.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processus.impl.EndImpl
	 * @see processus.impl.ProcessusPackageImpl#getEnd()
	 * @generated
	 */
	int END = 4;

	/**
	 * The feature id for the '<em><b>Referenced Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__REFERENCED_ACTIVITY = PSEUDO_STATE__REFERENCED_ACTIVITY;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = PSEUDO_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = PSEUDO_STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link processus.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see processus.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link processus.Process#getCurrentActivity <em>Current Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Activity</em>'.
	 * @see processus.Process#getCurrentActivity()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CurrentActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link processus.Process#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see processus.Process#getActivities()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activities();

	/**
	 * Returns the meta object for the containment reference '{@link processus.Process#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see processus.Process#getEnd()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_End();

	/**
	 * Returns the meta object for the containment reference '{@link processus.Process#getBeginning <em>Beginning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beginning</em>'.
	 * @see processus.Process#getBeginning()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Beginning();

	/**
	 * Returns the meta object for class '{@link processus.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see processus.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link processus.Activity#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see processus.Activity#getNom()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Nom();

	/**
	 * Returns the meta object for the reference '{@link processus.Activity#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see processus.Activity#getPrevious()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Previous();

	/**
	 * Returns the meta object for the reference '{@link processus.Activity#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see processus.Activity#getNext()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Next();

	/**
	 * Returns the meta object for class '{@link processus.PseudoState <em>Pseudo State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo State</em>'.
	 * @see processus.PseudoState
	 * @generated
	 */
	EClass getPseudoState();

	/**
	 * Returns the meta object for the reference '{@link processus.PseudoState#getReferencedActivity <em>Referenced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Activity</em>'.
	 * @see processus.PseudoState#getReferencedActivity()
	 * @see #getPseudoState()
	 * @generated
	 */
	EReference getPseudoState_ReferencedActivity();

	/**
	 * Returns the meta object for class '{@link processus.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see processus.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for class '{@link processus.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see processus.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessusFactory getProcessusFactory();

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
		 * The meta object literal for the '{@link processus.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processus.impl.ProcessImpl
		 * @see processus.impl.ProcessusPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Current Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CURRENT_ACTIVITY = eINSTANCE.getProcess_CurrentActivity();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTIVITIES = eINSTANCE.getProcess_Activities();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__END = eINSTANCE.getProcess_End();

		/**
		 * The meta object literal for the '<em><b>Beginning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__BEGINNING = eINSTANCE.getProcess_Beginning();

		/**
		 * The meta object literal for the '{@link processus.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processus.impl.ActivityImpl
		 * @see processus.impl.ProcessusPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NOM = eINSTANCE.getActivity_Nom();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PREVIOUS = eINSTANCE.getActivity_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NEXT = eINSTANCE.getActivity_Next();

		/**
		 * The meta object literal for the '{@link processus.impl.PseudoStateImpl <em>Pseudo State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processus.impl.PseudoStateImpl
		 * @see processus.impl.ProcessusPackageImpl#getPseudoState()
		 * @generated
		 */
		EClass PSEUDO_STATE = eINSTANCE.getPseudoState();

		/**
		 * The meta object literal for the '<em><b>Referenced Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDO_STATE__REFERENCED_ACTIVITY = eINSTANCE.getPseudoState_ReferencedActivity();

		/**
		 * The meta object literal for the '{@link processus.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processus.impl.InitImpl
		 * @see processus.impl.ProcessusPackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '{@link processus.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processus.impl.EndImpl
		 * @see processus.impl.ProcessusPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

	}

} //ProcessusPackage
