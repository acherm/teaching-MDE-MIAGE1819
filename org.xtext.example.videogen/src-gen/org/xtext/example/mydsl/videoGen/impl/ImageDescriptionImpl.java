/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.videoGen.ImageDescription;
import org.xtext.example.mydsl.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.ImageDescriptionImpl#getImageid <em>Imageid</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.ImageDescriptionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.ImageDescriptionImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.videoGen.impl.ImageDescriptionImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageDescriptionImpl extends MinimalEObjectImpl.Container implements ImageDescription
{
  /**
   * The default value of the '{@link #getImageid() <em>Imageid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageid()
   * @generated
   * @ordered
   */
  protected static final String IMAGEID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImageid() <em>Imageid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageid()
   * @generated
   * @ordered
   */
  protected String imageid = IMAGEID_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected static final String TOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected String top = TOP_EDEFAULT;

  /**
   * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected static final String BOTTOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected String bottom = BOTTOM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageDescriptionImpl()
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
    return VideoGenPackage.Literals.IMAGE_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImageid()
  {
    return imageid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageid(String newImageid)
  {
    String oldImageid = imageid;
    imageid = newImageid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.IMAGE_DESCRIPTION__IMAGEID, oldImageid, imageid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.IMAGE_DESCRIPTION__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(String newTop)
  {
    String oldTop = top;
    top = newTop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.IMAGE_DESCRIPTION__TOP, oldTop, top));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBottom()
  {
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBottom(String newBottom)
  {
    String oldBottom = bottom;
    bottom = newBottom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.IMAGE_DESCRIPTION__BOTTOM, oldBottom, bottom));
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
      case VideoGenPackage.IMAGE_DESCRIPTION__IMAGEID:
        return getImageid();
      case VideoGenPackage.IMAGE_DESCRIPTION__LOCATION:
        return getLocation();
      case VideoGenPackage.IMAGE_DESCRIPTION__TOP:
        return getTop();
      case VideoGenPackage.IMAGE_DESCRIPTION__BOTTOM:
        return getBottom();
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
      case VideoGenPackage.IMAGE_DESCRIPTION__IMAGEID:
        setImageid((String)newValue);
        return;
      case VideoGenPackage.IMAGE_DESCRIPTION__LOCATION:
        setLocation((String)newValue);
        return;
      case VideoGenPackage.IMAGE_DESCRIPTION__TOP:
        setTop((String)newValue);
        return;
      case VideoGenPackage.IMAGE_DESCRIPTION__BOTTOM:
        setBottom((String)newValue);
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
      case VideoGenPackage.IMAGE_DESCRIPTION__IMAGEID:
        setImageid(IMAGEID_EDEFAULT);
        return;
      case VideoGenPackage.IMAGE_DESCRIPTION__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case VideoGenPackage.IMAGE_DESCRIPTION__TOP:
        setTop(TOP_EDEFAULT);
        return;
      case VideoGenPackage.IMAGE_DESCRIPTION__BOTTOM:
        setBottom(BOTTOM_EDEFAULT);
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
      case VideoGenPackage.IMAGE_DESCRIPTION__IMAGEID:
        return IMAGEID_EDEFAULT == null ? imageid != null : !IMAGEID_EDEFAULT.equals(imageid);
      case VideoGenPackage.IMAGE_DESCRIPTION__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case VideoGenPackage.IMAGE_DESCRIPTION__TOP:
        return TOP_EDEFAULT == null ? top != null : !TOP_EDEFAULT.equals(top);
      case VideoGenPackage.IMAGE_DESCRIPTION__BOTTOM:
        return BOTTOM_EDEFAULT == null ? bottom != null : !BOTTOM_EDEFAULT.equals(bottom);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (imageid: ");
    result.append(imageid);
    result.append(", location: ");
    result.append(location);
    result.append(", top: ");
    result.append(top);
    result.append(", bottom: ");
    result.append(bottom);
    result.append(')');
    return result.toString();
  }

} //ImageDescriptionImpl