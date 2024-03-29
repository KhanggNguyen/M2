/**
 */
package tpemf.maps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpemf.maps.Road#getName <em>Name</em>}</li>
 *   <li>{@link tpemf.maps.Road#getLength <em>Length</em>}</li>
 *   <li>{@link tpemf.maps.Road#getBorder <em>Border</em>}</li>
 *   <li>{@link tpemf.maps.Road#getMeet <em>Meet</em>}</li>
 * </ul>
 *
 * @see tpemf.maps.MapsPackage#getRoad()
 * @model abstract="true"
 * @generated
 */
public interface Road extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tpemf.maps.MapsPackage#getRoad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tpemf.maps.Road#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see tpemf.maps.MapsPackage#getRoad_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link tpemf.maps.Road#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' reference list.
	 * The list contents are of type {@link tpemf.maps.PublicSpace}.
	 * It is bidirectional and its opposite is '{@link tpemf.maps.PublicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' reference list.
	 * @see tpemf.maps.MapsPackage#getRoad_Border()
	 * @see tpemf.maps.PublicSpace#getBorderedBy
	 * @model opposite="borderedBy"
	 * @generated
	 */
	EList<PublicSpace> getBorder();

	/**
	 * Returns the value of the '<em><b>Meet</b></em>' reference list.
	 * The list contents are of type {@link tpemf.maps.Road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meet</em>' reference list.
	 * @see tpemf.maps.MapsPackage#getRoad_Meet()
	 * @model
	 * @generated
	 */
	EList<Road> getMeet();


} // Road
