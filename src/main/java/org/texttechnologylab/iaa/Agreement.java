

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 22 17:11:16 CEST 2025 */

package org.texttechnologylab.iaa;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Apr 22 17:11:16 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Agreement extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.iaa.Agreement";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Agreement.class);
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
   
  public final static String _FeatName_agreementValue = "agreementValue";
  public final static String _FeatName_agreementMeasure = "agreementMeasure";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_agreementValue = TypeSystemImpl.createCallSite(Agreement.class, "agreementValue");
  private final static MethodHandle _FH_agreementValue = _FC_agreementValue.dynamicInvoker();
  private final static CallSite _FC_agreementMeasure = TypeSystemImpl.createCallSite(Agreement.class, "agreementMeasure");
  private final static MethodHandle _FH_agreementMeasure = _FC_agreementMeasure.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Agreement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Agreement(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Agreement(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Agreement(JCas jcas, int begin, int end) {
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
  //* Feature: agreementValue

  /** getter for agreementValue - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAgreementValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_agreementValue));
  }
    
  /** setter for agreementValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_agreementValue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: agreementMeasure

  /** getter for agreementMeasure - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAgreementMeasure() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_agreementMeasure));
  }
    
  /** setter for agreementMeasure - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementMeasure(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_agreementMeasure), v);
  }    
    
  }

    