

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Does the assertion confirm the statement
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FactChecking extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FactChecking.class);
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
  protected FactChecking() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FactChecking(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FactChecking(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FactChecking(JCas jcas, int begin, int end) {
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
  //* Feature: Fact

  /** getter for Fact - gets 
   * @generated
   * @return value of the feature 
   */
  public Fact getFact() {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_Fact == null)
      jcasType.jcas.throwFeatMissing("Fact", "org.texttechnologylab.annotation.FactChecking");
    return (Fact)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FactChecking_Type)jcasType).casFeatCode_Fact)));}
    
  /** setter for Fact - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFact(Fact v) {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_Fact == null)
      jcasType.jcas.throwFeatMissing("Fact", "org.texttechnologylab.annotation.FactChecking");
    jcasType.ll_cas.ll_setRefValue(addr, ((FactChecking_Type)jcasType).casFeatCode_Fact, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Claim

  /** getter for Claim - gets 
   * @generated
   * @return value of the feature 
   */
  public Claim getClaim() {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_Claim == null)
      jcasType.jcas.throwFeatMissing("Claim", "org.texttechnologylab.annotation.FactChecking");
    return (Claim)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FactChecking_Type)jcasType).casFeatCode_Claim)));}
    
  /** setter for Claim - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClaim(Claim v) {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_Claim == null)
      jcasType.jcas.throwFeatMissing("Claim", "org.texttechnologylab.annotation.FactChecking");
    jcasType.ll_cas.ll_setRefValue(addr, ((FactChecking_Type)jcasType).casFeatCode_Claim, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: consistency

  /** getter for consistency - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConsistency() {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_consistency == null)
      jcasType.jcas.throwFeatMissing("consistency", "org.texttechnologylab.annotation.FactChecking");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((FactChecking_Type)jcasType).casFeatCode_consistency);}
    
  /** setter for consistency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConsistency(double v) {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_consistency == null)
      jcasType.jcas.throwFeatMissing("consistency", "org.texttechnologylab.annotation.FactChecking");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((FactChecking_Type)jcasType).casFeatCode_consistency, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.FactChecking");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FactChecking_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (FactChecking_Type.featOkTst && ((FactChecking_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.FactChecking");
    jcasType.ll_cas.ll_setRefValue(addr, ((FactChecking_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    