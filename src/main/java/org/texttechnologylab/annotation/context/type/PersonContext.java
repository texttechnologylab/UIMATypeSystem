

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 11:15:15 CEST 2024 */

package org.texttechnologylab.annotation.context.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.node.type.Context;


/** 
 * Updated by JCasGen Thu May 16 11:15:15 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class PersonContext extends Context {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.context.type.PersonContext";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PersonContext.class);
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
   
  public final static String _FeatName_birthDate = "birthDate";
  public final static String _FeatName_Name = "Name";
  public final static String _FeatName_contextInf = "contextInf";
  public final static String _FeatName_gender = "gender";
  public final static String _FeatName_birthPlace = "birthPlace";
  public final static String _FeatName_fieldOfWork = "fieldOfWork";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_birthDate = TypeSystemImpl.createCallSite(PersonContext.class, "birthDate");
  private final static MethodHandle _FH_birthDate = _FC_birthDate.dynamicInvoker();
  private final static CallSite _FC_Name = TypeSystemImpl.createCallSite(PersonContext.class, "Name");
  private final static MethodHandle _FH_Name = _FC_Name.dynamicInvoker();
  private final static CallSite _FC_contextInf = TypeSystemImpl.createCallSite(PersonContext.class, "contextInf");
  private final static MethodHandle _FH_contextInf = _FC_contextInf.dynamicInvoker();
  private final static CallSite _FC_gender = TypeSystemImpl.createCallSite(PersonContext.class, "gender");
  private final static MethodHandle _FH_gender = _FC_gender.dynamicInvoker();
  private final static CallSite _FC_birthPlace = TypeSystemImpl.createCallSite(PersonContext.class, "birthPlace");
  private final static MethodHandle _FH_birthPlace = _FC_birthPlace.dynamicInvoker();
  private final static CallSite _FC_fieldOfWork = TypeSystemImpl.createCallSite(PersonContext.class, "fieldOfWork");
  private final static MethodHandle _FH_fieldOfWork = _FC_fieldOfWork.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected PersonContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public PersonContext(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PersonContext(JCas jcas) {
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
  //* Feature: birthDate

  /** getter for birthDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBirthDate() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_birthDate));
  }
    
  /** setter for birthDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBirthDate(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_birthDate), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Name));
  }
    
  /** setter for Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: contextInf

  /** getter for contextInf - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextInf() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_contextInf));
  }
    
  /** setter for contextInf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextInf(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_contextInf), v);
  }    
    
   
    
  //*--------------*
  //* Feature: gender

  /** getter for gender - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGender() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_gender));
  }
    
  /** setter for gender - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGender(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_gender), v);
  }    
    
   
    
  //*--------------*
  //* Feature: birthPlace

  /** getter for birthPlace - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBirthPlace() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_birthPlace));
  }
    
  /** setter for birthPlace - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBirthPlace(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_birthPlace), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fieldOfWork

  /** getter for fieldOfWork - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFieldOfWork() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_fieldOfWork));
  }
    
  /** setter for fieldOfWork - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFieldOfWork(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_fieldOfWork), v);
  }    
    
  }

    