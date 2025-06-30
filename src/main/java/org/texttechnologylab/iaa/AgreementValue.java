

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.iaa;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AgreementValue extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.iaa.AgreementValue";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AgreementValue.class);
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
  public final static String _FeatName_agreementLabel = "agreementLabel";
  public final static String _FeatName_agreementUnits = "agreementUnits";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_agreementValue = TypeSystemImpl.createCallSite(AgreementValue.class, "agreementValue");
  private final static MethodHandle _FH_agreementValue = _FC_agreementValue.dynamicInvoker();
  private final static CallSite _FC_agreementLabel = TypeSystemImpl.createCallSite(AgreementValue.class, "agreementLabel");
  private final static MethodHandle _FH_agreementLabel = _FC_agreementLabel.dynamicInvoker();
  private final static CallSite _FC_agreementUnits = TypeSystemImpl.createCallSite(AgreementValue.class, "agreementUnits");
  private final static MethodHandle _FH_agreementUnits = _FC_agreementUnits.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AgreementValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AgreementValue(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AgreementValue(JCas jcas) {
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
  //* Feature: agreementLabel

  /** getter for agreementLabel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAgreementLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_agreementLabel));
  }
    
  /** setter for agreementLabel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_agreementLabel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: agreementUnits

  /** getter for agreementUnits - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAgreementUnits() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_agreementUnits));
  }
    
  /** setter for agreementUnits - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementUnits(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_agreementUnits), v);
  }    
    
  }

    