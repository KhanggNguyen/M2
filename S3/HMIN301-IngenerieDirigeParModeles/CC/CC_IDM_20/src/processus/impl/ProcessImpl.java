/**
 */
package processus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import processus.Activity;
import processus.End;
import processus.Init;
import processus.ProcessusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processus.impl.ProcessImpl#getCurrentActivity <em>Current Activity</em>}</li>
 *   <li>{@link processus.impl.ProcessImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link processus.impl.ProcessImpl#getEnd <em>End</em>}</li>
 *   <li>{@link processus.impl.ProcessImpl#getBeginning <em>Beginning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements processus.Process {
	/**
	 * The cached value of the '{@link #getCurrentActivity() <em>Current Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity currentActivity;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * The cached value of the '{@link #getBeginning() <em>Beginning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginning()
	 * @generated
	 * @ordered
	 */
	protected Init beginning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessusPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getCurrentActivity() {
		if (currentActivity != null && currentActivity.eIsProxy()) {
			InternalEObject oldCurrentActivity = (InternalEObject)currentActivity;
			currentActivity = (Activity)eResolveProxy(oldCurrentActivity);
			if (currentActivity != oldCurrentActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessusPackage.PROCESS__CURRENT_ACTIVITY, oldCurrentActivity, currentActivity));
			}
		}
		return currentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetCurrentActivity() {
		return currentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentActivity(Activity newCurrentActivity) {
		Activity oldCurrentActivity = currentActivity;
		currentActivity = newCurrentActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessusPackage.PROCESS__CURRENT_ACTIVITY, oldCurrentActivity, currentActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, ProcessusPackage.PROCESS__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessusPackage.PROCESS__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessusPackage.PROCESS__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessusPackage.PROCESS__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessusPackage.PROCESS__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init getBeginning() {
		return beginning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeginning(Init newBeginning, NotificationChain msgs) {
		Init oldBeginning = beginning;
		beginning = newBeginning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessusPackage.PROCESS__BEGINNING, oldBeginning, newBeginning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginning(Init newBeginning) {
		if (newBeginning != beginning) {
			NotificationChain msgs = null;
			if (beginning != null)
				msgs = ((InternalEObject)beginning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessusPackage.PROCESS__BEGINNING, null, msgs);
			if (newBeginning != null)
				msgs = ((InternalEObject)newBeginning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessusPackage.PROCESS__BEGINNING, null, msgs);
			msgs = basicSetBeginning(newBeginning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessusPackage.PROCESS__BEGINNING, newBeginning, newBeginning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessusPackage.PROCESS__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case ProcessusPackage.PROCESS__END:
				return basicSetEnd(null, msgs);
			case ProcessusPackage.PROCESS__BEGINNING:
				return basicSetBeginning(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessusPackage.PROCESS__CURRENT_ACTIVITY:
				if (resolve) return getCurrentActivity();
				return basicGetCurrentActivity();
			case ProcessusPackage.PROCESS__ACTIVITIES:
				return getActivities();
			case ProcessusPackage.PROCESS__END:
				return getEnd();
			case ProcessusPackage.PROCESS__BEGINNING:
				return getBeginning();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessusPackage.PROCESS__CURRENT_ACTIVITY:
				setCurrentActivity((Activity)newValue);
				return;
			case ProcessusPackage.PROCESS__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case ProcessusPackage.PROCESS__END:
				setEnd((End)newValue);
				return;
			case ProcessusPackage.PROCESS__BEGINNING:
				setBeginning((Init)newValue);
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
			case ProcessusPackage.PROCESS__CURRENT_ACTIVITY:
				setCurrentActivity((Activity)null);
				return;
			case ProcessusPackage.PROCESS__ACTIVITIES:
				getActivities().clear();
				return;
			case ProcessusPackage.PROCESS__END:
				setEnd((End)null);
				return;
			case ProcessusPackage.PROCESS__BEGINNING:
				setBeginning((Init)null);
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
			case ProcessusPackage.PROCESS__CURRENT_ACTIVITY:
				return currentActivity != null;
			case ProcessusPackage.PROCESS__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case ProcessusPackage.PROCESS__END:
				return end != null;
			case ProcessusPackage.PROCESS__BEGINNING:
				return beginning != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
