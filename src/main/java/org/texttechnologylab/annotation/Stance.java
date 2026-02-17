

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Stance Detection
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Stance extends StanceBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Stance.class);
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
  protected Stance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Stance(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Stance(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Stance(JCas jcas, int begin, int end) {
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
  //* Feature: Support

  /** getter for Support - gets Probability of support
   * @generated
   * @return value of the feature 
   */
  public double getSupport() {
    if (Stance_Type.featOkTst && ((Stance_Type)jcasType).casFeat_Support == null)
      jcasType.jcas.throwFeatMissing("Support", "org.texttechnologylab.annotation.Stance");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Stance_Type)jcasType).casFeatCode_Support);}
    
  /** setter for Support - sets Probability of support 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSupport(double v) {
    if (Stance_Type.featOkTst && ((Stance_Type)jcasType).casFeat_Support == null)
      jcasType.jcas.throwFeatMissing("Support", "org.texttechnologylab.annotation.Stance");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Stance_Type)jcasType).casFeatCode_Support, v);}    
   
    
  //*--------------*
  //* Feature: Oppose

  /** getter for Oppose - gets Probability of oppose
   * @generated
   * @return value of the feature 
   */
  public double getOppose() {
    if (Stance_Type.featOkTst && ((Stance_Type)jcasType).casFeat_Oppose == null)
      jcasType.jcas.throwFeatMissing("Oppose", "org.texttechnologylab.annotation.Stance");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Stance_Type)jcasType).casFeatCode_Oppose);}
    
  /** setter for Oppose - sets Probability of oppose 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOppose(double v) {
    if (Stance_Type.featOkTst && ((Stance_Type)jcasType).casFeat_Oppose == null)
      jcasType.jcas.throwFeatMissing("Oppose", "org.texttechnologylab.annotation.Stance");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Stance_Type)jcasType).casFeatCode_Oppose, v);}    
   
    
  //*--------------*
  //* Feature: Neutral

  /** getter for Neutral - gets Probability of neutral
   * @generated
   * @return value of the feature 
   */
  public double getNeutral() {
    if (Stance_Type.featOkTst && ((Stance_Type)jcasType).casFeat_Neutral == null)
      jcasType.jcas.throwFeatMissing("Neutral", "org.texttechnologylab.annotation.Stance");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Stance_Type)jcasType).casFeatCode_Neutral);}
    
  /** setter for Neutral - sets Probability of neutral 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNeutral(double v) {
    if (Stance_Type.featOkTst && ((Stance_Type)jcasType).casFeat_Neutral == null)
      jcasType.jcas.throwFeatMissing("Neutral", "org.texttechnologylab.annotation.Stance");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Stance_Type)jcasType).casFeatCode_Neutral, v);}    
  }

    