

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Toxic Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Toxic extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Toxic.class);
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
  protected Toxic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Toxic(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Toxic(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Toxic(JCas jcas, int begin, int end) {
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
  //* Feature: Toxic

  /** getter for Toxic - gets Probability of Toxic
   * @generated
   * @return value of the feature 
   */
  public double getToxic() {
    if (Toxic_Type.featOkTst && ((Toxic_Type)jcasType).casFeat_Toxic == null)
      jcasType.jcas.throwFeatMissing("Toxic", "org.texttechnologylab.annotation.Toxic");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Toxic_Type)jcasType).casFeatCode_Toxic);}
    
  /** setter for Toxic - sets Probability of Toxic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToxic(double v) {
    if (Toxic_Type.featOkTst && ((Toxic_Type)jcasType).casFeat_Toxic == null)
      jcasType.jcas.throwFeatMissing("Toxic", "org.texttechnologylab.annotation.Toxic");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Toxic_Type)jcasType).casFeatCode_Toxic, v);}    
   
    
  //*--------------*
  //* Feature: NonToxic

  /** getter for NonToxic - gets Probability of not Toxic
   * @generated
   * @return value of the feature 
   */
  public double getNonToxic() {
    if (Toxic_Type.featOkTst && ((Toxic_Type)jcasType).casFeat_NonToxic == null)
      jcasType.jcas.throwFeatMissing("NonToxic", "org.texttechnologylab.annotation.Toxic");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Toxic_Type)jcasType).casFeatCode_NonToxic);}
    
  /** setter for NonToxic - sets Probability of not Toxic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNonToxic(double v) {
    if (Toxic_Type.featOkTst && ((Toxic_Type)jcasType).casFeat_NonToxic == null)
      jcasType.jcas.throwFeatMissing("NonToxic", "org.texttechnologylab.annotation.Toxic");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Toxic_Type)jcasType).casFeatCode_NonToxic, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Toxic_Type.featOkTst && ((Toxic_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Toxic");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Toxic_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Toxic_Type.featOkTst && ((Toxic_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Toxic");
    jcasType.ll_cas.ll_setRefValue(addr, ((Toxic_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    