/**
 */
package processus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processus.Process#getCurrentActivity <em>Current Activity</em>}</li>
 *   <li>{@link processus.Process#getActivities <em>Activities</em>}</li>
 *   <li>{@link processus.Process#getEnd <em>End</em>}</li>
 *   <li>{@link processus.Process#getBeginning <em>Beginning</em>}</li>
 * </ul>
 *
 * @see processus.ProcessusPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Activity</em>' reference.
	 * @see #setCurrentActivity(Activity)
	 * @see processus.ProcessusPackage#getProcess_CurrentActivity()
	 * @model
	 * @generated
	 */
	Activity getCurrentActivity();

	/**
	 * Sets the value of the '{@link processus.Process#getCurrentActivity <em>Current Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Activity</em>' reference.
	 * @see #getCurrentActivity()
	 * @generated
	 */
	void setCurrentActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link processus.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see processus.ProcessusPackage#getProcess_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see processus.ProcessusPackage#getProcess_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link processus.Process#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Beginning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginning</em>' containment reference.
	 * @see #setBeginning(Init)
	 * @see processus.ProcessusPackage#getProcess_Beginning()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Init getBeginning();

	/**
	 * Sets the value of the '{@link processus.Process#getBeginning <em>Beginning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginning</em>' containment reference.
	 * @see #getBeginning()
	 * @generated
	 */
	void setBeginning(Init value);

} // Process
