/**
 * generated by Xtext 2.23.0
 */
package org.example.melangeurmodel.melangeurmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.melangeurmodel.melangeurmodel.Cup;
import org.example.melangeurmodel.melangeurmodel.MelangeurmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.melangeurmodel.melangeurmodel.impl.CupImpl#getNr <em>Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CupImpl extends MinimalEObjectImpl.Container implements Cup
{
  /**
   * The default value of the '{@link #getNr() <em>Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNr()
   * @generated
   * @ordered
   */
  protected static final int NR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNr()
   * @generated
   * @ordered
   */
  protected int nr = NR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CupImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MelangeurmodelPackage.Literals.CUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNr()
  {
    return nr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNr(int newNr)
  {
    int oldNr = nr;
    nr = newNr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MelangeurmodelPackage.CUP__NR, oldNr, nr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MelangeurmodelPackage.CUP__NR:
        return getNr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MelangeurmodelPackage.CUP__NR:
        setNr((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MelangeurmodelPackage.CUP__NR:
        setNr(NR_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MelangeurmodelPackage.CUP__NR:
        return nr != NR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nr: ");
    result.append(nr);
    result.append(')');
    return result.toString();
  }

} //CupImpl