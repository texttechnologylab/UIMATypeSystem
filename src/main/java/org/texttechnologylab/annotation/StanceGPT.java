

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 15:57:08 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Stance Detection
 * Updated by JCasGen Wed May 07 15:57:08 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class StanceGPT extends StanceBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.StanceGPT";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StanceGPT.class);
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
   
  public final static String _FeatName_Label = "Label";
  public final static String _FeatName_Confidence = "Confidence";
  public final static String _FeatName_Reason = "Reason";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Label = TypeSystemImpl.createCallSite(StanceGPT.class, "Label");
  private final static MethodHandle _FH_Label = _FC_Label.dynamicInvoker();
  private final static CallSite _FC_Confidence = TypeSystemImpl.createCallSite(StanceGPT.class, "Confidence");
  private final static MethodHandle _FH_Confidence = _FC_Confidence.dynamicInvoker();
  private final static CallSite _FC_Reason = TypeSystemImpl.createCallSite(StanceGPT.class, "Reason");
  private final static MethodHandle _FH_Reason = _FC_Reason.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected StanceGPT() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public StanceGPT(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public StanceGPT(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public StanceGPT(JCas jcas, int begin, int end) {
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
  //* Feature: Label

  /** getter for Label - gets Label support, oppose, neutral
   * @generated
   * @return value of the feature 
   */
  public String getLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Label));
  }
    
  /** setter for Label - sets Label support, oppose, neutral 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Label), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Confidence value
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Confidence));
  }
    
  /** setter for Confidence - sets Confidence value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Confidence), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Reason

  /** getter for Reason - gets Reason for the decision
   * @generated
   * @return value of the feature 
   */
  public String getReason() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Reason));
  }
    
  /** setter for Reason - sets Reason for the decision 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Reason), v);
  }    
    
  }

    