

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:59 CEST 2025 */

package org.texttechnologylab.uima.type.cohmetrix;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Coh-Metrix Index
 * Updated by JCasGen Tue Sep 23 14:56:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Index extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.uima.type.cohmetrix.Index";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Index.class);
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
   
  public final static String _FeatName_index = "index";
  public final static String _FeatName_typeName = "typeName";
  public final static String _FeatName_labelV3 = "labelV3";
  public final static String _FeatName_labelV2 = "labelV2";
  public final static String _FeatName_description = "description";
  public final static String _FeatName_value = "value";
  public final static String _FeatName_error = "error";
  public final static String _FeatName_labelTTLab = "labelTTLab";
  public final static String _FeatName_version = "version";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_index = TypeSystemImpl.createCallSite(Index.class, "index");
  private final static MethodHandle _FH_index = _FC_index.dynamicInvoker();
  private final static CallSite _FC_typeName = TypeSystemImpl.createCallSite(Index.class, "typeName");
  private final static MethodHandle _FH_typeName = _FC_typeName.dynamicInvoker();
  private final static CallSite _FC_labelV3 = TypeSystemImpl.createCallSite(Index.class, "labelV3");
  private final static MethodHandle _FH_labelV3 = _FC_labelV3.dynamicInvoker();
  private final static CallSite _FC_labelV2 = TypeSystemImpl.createCallSite(Index.class, "labelV2");
  private final static MethodHandle _FH_labelV2 = _FC_labelV2.dynamicInvoker();
  private final static CallSite _FC_description = TypeSystemImpl.createCallSite(Index.class, "description");
  private final static MethodHandle _FH_description = _FC_description.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(Index.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_error = TypeSystemImpl.createCallSite(Index.class, "error");
  private final static MethodHandle _FH_error = _FC_error.dynamicInvoker();
  private final static CallSite _FC_labelTTLab = TypeSystemImpl.createCallSite(Index.class, "labelTTLab");
  private final static MethodHandle _FH_labelTTLab = _FC_labelTTLab.dynamicInvoker();
  private final static CallSite _FC_version = TypeSystemImpl.createCallSite(Index.class, "version");
  private final static MethodHandle _FH_version = _FC_version.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Index() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Index(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Index(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Index(JCas jcas, int begin, int end) {
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
  //* Feature: index

  /** getter for index - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIndex() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_index));
  }
    
  /** setter for index - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_index), v);
  }    
    
   
    
  //*--------------*
  //* Feature: typeName

  /** getter for typeName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTypeName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_typeName));
  }
    
  /** setter for typeName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_typeName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: labelV3

  /** getter for labelV3 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabelV3() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_labelV3));
  }
    
  /** setter for labelV3 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelV3(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_labelV3), v);
  }    
    
   
    
  //*--------------*
  //* Feature: labelV2

  /** getter for labelV2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabelV2() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_labelV2));
  }
    
  /** setter for labelV2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelV2(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_labelV2), v);
  }    
    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_description));
  }
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_description), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public double getValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: error

  /** getter for error - gets Optional error message
   * @generated
   * @return value of the feature 
   */
  public String getError() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_error));
  }
    
  /** setter for error - sets Optional error message 
   * @generated
   * @param v value to set into the feature 
   */
  public void setError(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_error), v);
  }    
    
   
    
  //*--------------*
  //* Feature: labelTTLab

  /** getter for labelTTLab - gets New index added by the TTLab or significantly modified V3 index.
   * @generated
   * @return value of the feature 
   */
  public String getLabelTTLab() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_labelTTLab));
  }
    
  /** setter for labelTTLab - sets New index added by the TTLab or significantly modified V3 index. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelTTLab(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_labelTTLab), v);
  }    
    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_version));
  }
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_version), v);
  }    
    
  }

    