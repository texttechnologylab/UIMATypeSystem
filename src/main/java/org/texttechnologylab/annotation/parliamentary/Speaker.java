

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation.parliamentary;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Speaker extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.parliamentary.Speaker";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Speaker.class);
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
   
  public final static String _FeatName_id = "id";
  public final static String _FeatName_firstName = "firstName";
  public final static String _FeatName_lastName = "lastName";
  public final static String _FeatName_group = "group";
  public final static String _FeatName_role = "role";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(Speaker.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_firstName = TypeSystemImpl.createCallSite(Speaker.class, "firstName");
  private final static MethodHandle _FH_firstName = _FC_firstName.dynamicInvoker();
  private final static CallSite _FC_lastName = TypeSystemImpl.createCallSite(Speaker.class, "lastName");
  private final static MethodHandle _FH_lastName = _FC_lastName.dynamicInvoker();
  private final static CallSite _FC_group = TypeSystemImpl.createCallSite(Speaker.class, "group");
  private final static MethodHandle _FH_group = _FC_group.dynamicInvoker();
  private final static CallSite _FC_role = TypeSystemImpl.createCallSite(Speaker.class, "role");
  private final static MethodHandle _FH_role = _FC_role.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Speaker() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Speaker(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Speaker(JCas jcas) {
    super(jcas);
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_id));
  }
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: firstName

  /** getter for firstName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_firstName));
  }
    
  /** setter for firstName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_firstName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lastName

  /** getter for lastName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLastName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_lastName));
  }
    
  /** setter for lastName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_lastName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: group

  /** getter for group - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGroup() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_group));
  }
    
  /** setter for group - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroup(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_group), v);
  }    
    
   
    
  //*--------------*
  //* Feature: role

  /** getter for role - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRole() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_role));
  }
    
  /** setter for role - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_role), v);
  }    
    
  }

    