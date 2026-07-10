

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Sarcasm Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Sarcasm extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sarcasm.class);
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
  protected Sarcasm() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sarcasm(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sarcasm(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Sarcasm(JCas jcas, int begin, int end) {
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
  //* Feature: Sarcasm

  /** getter for Sarcasm - gets Probability of Sarcasm
   * @generated
   * @return value of the feature 
   */
  public double getSarcasm() {
    if (Sarcasm_Type.featOkTst && ((Sarcasm_Type)jcasType).casFeat_Sarcasm == null)
      jcasType.jcas.throwFeatMissing("Sarcasm", "org.texttechnologylab.annotation.Sarcasm");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Sarcasm_Type)jcasType).casFeatCode_Sarcasm);}
    
  /** setter for Sarcasm - sets Probability of Sarcasm 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSarcasm(double v) {
    if (Sarcasm_Type.featOkTst && ((Sarcasm_Type)jcasType).casFeat_Sarcasm == null)
      jcasType.jcas.throwFeatMissing("Sarcasm", "org.texttechnologylab.annotation.Sarcasm");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Sarcasm_Type)jcasType).casFeatCode_Sarcasm, v);}    
   
    
  //*--------------*
  //* Feature: NonSarcasm

  /** getter for NonSarcasm - gets Probability of not Sarcasm
   * @generated
   * @return value of the feature 
   */
  public double getNonSarcasm() {
    if (Sarcasm_Type.featOkTst && ((Sarcasm_Type)jcasType).casFeat_NonSarcasm == null)
      jcasType.jcas.throwFeatMissing("NonSarcasm", "org.texttechnologylab.annotation.Sarcasm");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Sarcasm_Type)jcasType).casFeatCode_NonSarcasm);}
    
  /** setter for NonSarcasm - sets Probability of not Sarcasm 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNonSarcasm(double v) {
    if (Sarcasm_Type.featOkTst && ((Sarcasm_Type)jcasType).casFeat_NonSarcasm == null)
      jcasType.jcas.throwFeatMissing("NonSarcasm", "org.texttechnologylab.annotation.Sarcasm");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Sarcasm_Type)jcasType).casFeatCode_NonSarcasm, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Sarcasm_Type.featOkTst && ((Sarcasm_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Sarcasm");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sarcasm_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Sarcasm_Type.featOkTst && ((Sarcasm_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Sarcasm");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sarcasm_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    