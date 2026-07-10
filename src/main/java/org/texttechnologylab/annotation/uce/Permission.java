

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.uce;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Provides permission details for a document. Note that this annotation can be included multiple times to configure access to multiple users.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Permission extends Annotation {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Permission() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Permission(int addr, TOP_Type type) {
    super(addr, type);
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
    if (Permission_Type.featOkTst && ((Permission_Type)jcasType).casFeat_permissionType == null)
      jcasType.jcas.throwFeatMissing("permissionType", "org.texttechnologylab.annotation.uce.Permission");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Permission_Type)jcasType).casFeatCode_permissionType);}
    
  /** setter for permissionType - sets Permission type, e.g. on user or group level. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPermissionType(String v) {
    if (Permission_Type.featOkTst && ((Permission_Type)jcasType).casFeat_permissionType == null)
      jcasType.jcas.throwFeatMissing("permissionType", "org.texttechnologylab.annotation.uce.Permission");
    jcasType.ll_cas.ll_setStringValue(addr, ((Permission_Type)jcasType).casFeatCode_permissionType, v);}    
   
    
  //*--------------*
  //* Feature: permissionLevel

  /** getter for permissionLevel - gets Permission level.
   * @generated
   * @return value of the feature 
   */
  public String getPermissionLevel() {
    if (Permission_Type.featOkTst && ((Permission_Type)jcasType).casFeat_permissionLevel == null)
      jcasType.jcas.throwFeatMissing("permissionLevel", "org.texttechnologylab.annotation.uce.Permission");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Permission_Type)jcasType).casFeatCode_permissionLevel);}
    
  /** setter for permissionLevel - sets Permission level. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPermissionLevel(String v) {
    if (Permission_Type.featOkTst && ((Permission_Type)jcasType).casFeat_permissionLevel == null)
      jcasType.jcas.throwFeatMissing("permissionLevel", "org.texttechnologylab.annotation.uce.Permission");
    jcasType.ll_cas.ll_setStringValue(addr, ((Permission_Type)jcasType).casFeatCode_permissionLevel, v);}    
   
    
  //*--------------*
  //* Feature: user

  /** getter for user - gets User or group name.
   * @generated
   * @return value of the feature 
   */
  public String getUser() {
    if (Permission_Type.featOkTst && ((Permission_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.uce.Permission");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Permission_Type)jcasType).casFeatCode_user);}
    
  /** setter for user - sets User or group name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    if (Permission_Type.featOkTst && ((Permission_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.uce.Permission");
    jcasType.ll_cas.ll_setStringValue(addr, ((Permission_Type)jcasType).casFeatCode_user, v);}    
  }

    