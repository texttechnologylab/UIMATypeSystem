

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

package org.texttechnologylab.annotation.neglab;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;


/**
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ConditionSentence extends Sentence {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.neglab.ConditionSentence";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ConditionSentence.class);
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
   
  public final static String _FeatName_condition = "condition";
  public final static String _FeatName_target = "target";
  public final static String _FeatName_order = "order";
  public final static String _FeatName_value = "value";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_condition = TypeSystemImpl.createCallSite(ConditionSentence.class, "condition");
  private final static MethodHandle _FH_condition = _FC_condition.dynamicInvoker();
  private final static CallSite _FC_target = TypeSystemImpl.createCallSite(ConditionSentence.class, "target");
  private final static MethodHandle _FH_target = _FC_target.dynamicInvoker();
  private final static CallSite _FC_order = TypeSystemImpl.createCallSite(ConditionSentence.class, "order");
  private final static MethodHandle _FH_order = _FC_order.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(ConditionSentence.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ConditionSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ConditionSentence(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ConditionSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ConditionSentence(JCas jcas, int begin, int end) {
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
  //* Feature: condition

  /** getter for condition - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCondition() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_condition));
  }
    
  /** setter for condition - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCondition(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_condition), v);
  }    
    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTarget() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_target));
  }
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_target), v);
  }    
    
   
    
  //*--------------*
  //* Feature: order

  /** getter for order - gets 
   * @generated
   * @return value of the feature 
   */
  public int getOrder() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_order));
  }
    
  /** setter for order - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrder(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_order), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public float getValue() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
  }

    