/**
 */
package processus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import processus.Activity;
import processus.ProcessusPackage;
import processus.PseudoState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processus.impl.PseudoStateImpl#getReferencedActivity <em>Referenced Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PseudoStateImpl extends MinimalEObjectImpl.Container implements PseudoState {
	/**
	 * The cached value of the '{@link #getReferencedActivity() <em>Referenced Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity referencedActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudoStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessusPackage.Literals.PSEUDO_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getReferencedActivity() {
		if (referencedActivity != null && referencedActivity.eIsProxy()) {
			InternalEObject oldReferencedActivity = (InternalEObject)referencedActivity;
			referencedActivity = (Activity)eResolveProxy(oldReferencedActivity);
			if (referencedActivity != oldReferencedActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessusPackage.PSEUDO_STATE__REFERENCED_ACTIVITY, oldReferencedActivity, referencedActivity));
			}
		}
		return referencedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetReferencedActivity() {
		return referencedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedActivity(Activity newReferencedActivity) {
		Activity oldReferencedActivity = referencedActivity;
		referencedActivity = newReferencedActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessusPackage.PSEUDO_STATE__REFERENCED_ACTIVITY, oldReferencedActivity, referencedActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessusPackage.PSEUDO_STATE__REFERENCED_ACTIVITY:
				if (resolve) return getReferencedActivity();
				return basicGetReferencedActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessusPackage.PSEUDO_STATE__REFERENCED_ACTIVITY:
				setReferencedActivity((Activity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessusPackage.PSEUDO_STATE__REFERENCED_ACTIVITY:
				setReferencedActivity((Activity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessusPackage.PSEUDO_STATE__REFERENCED_ACTIVITY:
				return referencedActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //PseudoStateImpl
