

   
/* Apache UIMA v3 - First created by JCasGen Wed Sep 03 18:00:13 CEST 2025 */

package org.texttechnologylab.annotation.uce;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Provides permission details for a document. Note that this annotation can be included multiple times to configure access to multiple users.
 * Updated by JCasGen Wed Sep 03 18:00:16 CEST 2025
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/UceDynamicMetadata.xml
 * @generated */
public class Permission extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.uce.Permission";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Permission.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_permissionType = "permissionType";
  public final static String _FeatName_permissionLevel = "permissionLevel";
  public final static String _FeatName_user = "user";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_permissionType = TypeSystemImpl.createCallSite(Permission.class, "permissionType");
  private final static MethodHandle _FH_permissionType = _FC_permissionType.dynamicInvoker();
  private final static CallSite _FC_permissionLevel = TypeSystemImpl.createCallSite(Permission.class, "permissionLevel");
  private final static MethodHandle _FH_permissionLevel = _FC_permissionLevel.dynamicInvoker();
  private final static CallSite _FC_user = TypeSystemImpl.createCallSite(Permission.class, "user");
  private final static MethodHandle _FH_user = _FC_user.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Permission() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Permission(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Permission(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Permission(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: permissionType

  /** getter for permissionType - gets Permission type, e.g. on user or group level.
   * @generated
   * @return value of the feature 
   */
  public String getPermissionType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_permissionType));
  }
    
  /** setter for permissionType - sets Permission type, e.g. on user or group level. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPermissionType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_permissionType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: permissionLevel

  /** getter for permissionLevel - gets Permission level.
   * @generated
   * @return value of the feature 
   */
  public String getPermissionLevel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_permissionLevel));
  }
    
  /** setter for permissionLevel - sets Permission level. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPermissionLevel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_permissionLevel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: user

  /** getter for user - gets User or group name.
   * @generated
   * @return value of the feature 
   */
  public String getUser() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_user));
  }
    
  /** setter for user - sets User or group name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_user), v);
  }    
    
  }

    