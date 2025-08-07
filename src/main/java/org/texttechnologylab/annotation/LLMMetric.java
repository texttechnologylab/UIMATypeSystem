

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation;
import org.texttechnologylab.annotation.model.MetaData;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/** L2SCA Output
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMMetric extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.LLMMetric";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMMetric.class);
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
   
  public final static String _FeatName_Value = "Value";
  public final static String _FeatName_KeyName = "KeyName";
  public final static String _FeatName_definition = "definition";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Value = TypeSystemImpl.createCallSite(LLMMetric.class, "Value");
  private final static MethodHandle _FH_Value = _FC_Value.dynamicInvoker();
  private final static CallSite _FC_KeyName = TypeSystemImpl.createCallSite(LLMMetric.class, "KeyName");
  private final static MethodHandle _FH_KeyName = _FC_KeyName.dynamicInvoker();
  private final static CallSite _FC_definition = TypeSystemImpl.createCallSite(LLMMetric.class, "definition");
  private final static MethodHandle _FH_definition = _FC_definition.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(LLMMetric.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LLMMetric() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LLMMetric(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMMetric(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMMetric(JCas jcas, int begin, int end) {
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
  //* Feature: Value

  /** getter for Value - gets Metric Feature Value
   * @generated
   * @return value of the feature 
   */
  public double getValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Value));
  }
    
  /** setter for Value - sets Metric Feature Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: KeyName

  /** getter for KeyName - gets Metric Feature KeyName
   * @generated
   * @return value of the feature 
   */
  public String getKeyName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_KeyName));
  }
    
  /** setter for KeyName - sets Metric Feature KeyName 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeyName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_KeyName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: definition

  /** getter for definition - gets LLM Metric Feature definition
   * @generated
   * @return value of the feature 
   */
  public String getDefinition() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_definition));
  }
    
  /** setter for definition - sets LLM Metric Feature definition 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDefinition(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_definition), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the LLM Metric
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets Which Model or Process was used to Compute the LLM Metric 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    