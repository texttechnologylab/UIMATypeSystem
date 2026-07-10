

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Hate Output
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Hate extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Hate.class);
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
  protected Hate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Hate(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Hate(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Hate(JCas jcas, int begin, int end) {
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
  //* Feature: Hate

  /** getter for Hate - gets Probability of Hate
   * @generated
   * @return value of the feature 
   */
  public double getHate() {
    if (Hate_Type.featOkTst && ((Hate_Type)jcasType).casFeat_Hate == null)
      jcasType.jcas.throwFeatMissing("Hate", "org.texttechnologylab.annotation.Hate");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Hate_Type)jcasType).casFeatCode_Hate);}
    
  /** setter for Hate - sets Probability of Hate 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHate(double v) {
    if (Hate_Type.featOkTst && ((Hate_Type)jcasType).casFeat_Hate == null)
      jcasType.jcas.throwFeatMissing("Hate", "org.texttechnologylab.annotation.Hate");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Hate_Type)jcasType).casFeatCode_Hate, v);}    
   
    
  //*--------------*
  //* Feature: NonHate

  /** getter for NonHate - gets Probability of not Hate
   * @generated
   * @return value of the feature 
   */
  public double getNonHate() {
    if (Hate_Type.featOkTst && ((Hate_Type)jcasType).casFeat_NonHate == null)
      jcasType.jcas.throwFeatMissing("NonHate", "org.texttechnologylab.annotation.Hate");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Hate_Type)jcasType).casFeatCode_NonHate);}
    
  /** setter for NonHate - sets Probability of not Hate 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNonHate(double v) {
    if (Hate_Type.featOkTst && ((Hate_Type)jcasType).casFeat_NonHate == null)
      jcasType.jcas.throwFeatMissing("NonHate", "org.texttechnologylab.annotation.Hate");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Hate_Type)jcasType).casFeatCode_NonHate, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Hate_Type.featOkTst && ((Hate_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Hate");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Hate_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Hate_Type.featOkTst && ((Hate_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Hate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Hate_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    