/**
 */
package processus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processus.PseudoState#getReferencedActivity <em>Referenced Activity</em>}</li>
 * </ul>
 *
 * @see processus.ProcessusPackage#getPseudoState()
 * @model abstract="true"
 * @generated
 */
public interface PseudoState extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Activity</em>' reference.
	 * @see #setReferencedActivity(Activity)
	 * @see processus.ProcessusPackage#getPseudoState_ReferencedActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getReferencedActivity();

	/**
	 * Sets the value of the '{@link processus.PseudoState#getReferencedActivity <em>Referenced Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Activity</em>' reference.
	 * @see #getReferencedActivity()
	 * @generated
	 */
	void setReferencedActivity(Activity value);

} // PseudoState
