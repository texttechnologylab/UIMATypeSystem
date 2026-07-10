

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Complexity Output
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Complexity extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Complexity.class);
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
  protected Complexity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Complexity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Complexity(JCas jcas) {
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
  //* Feature: Kind

  /** getter for Kind - gets Kind of Complexity
   * @generated
   * @return value of the feature 
   */
  public String getKind() {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_Kind == null)
      jcasType.jcas.throwFeatMissing("Kind", "org.texttechnologylab.annotation.Complexity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Complexity_Type)jcasType).casFeatCode_Kind);}
    
  /** setter for Kind - sets Kind of Complexity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKind(String v) {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_Kind == null)
      jcasType.jcas.throwFeatMissing("Kind", "org.texttechnologylab.annotation.Complexity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Complexity_Type)jcasType).casFeatCode_Kind, v);}    
   
    
  //*--------------*
  //* Feature: Output

  /** getter for Output - gets Output of Complexity
   * @generated
   * @return value of the feature 
   */
  public double getOutput() {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_Output == null)
      jcasType.jcas.throwFeatMissing("Output", "org.texttechnologylab.annotation.Complexity");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Complexity_Type)jcasType).casFeatCode_Output);}
    
  /** setter for Output - sets Output of Complexity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutput(double v) {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_Output == null)
      jcasType.jcas.throwFeatMissing("Output", "org.texttechnologylab.annotation.Complexity");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Complexity_Type)jcasType).casFeatCode_Output, v);}    
   
    
  //*--------------*
  //* Feature: SentenceI

  /** getter for SentenceI - gets Reference to SentenceI
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceI() {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_SentenceI == null)
      jcasType.jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.Complexity");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Complexity_Type)jcasType).casFeatCode_SentenceI)));}
    
  /** setter for SentenceI - sets Reference to SentenceI 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceI(Annotation v) {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_SentenceI == null)
      jcasType.jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.Complexity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Complexity_Type)jcasType).casFeatCode_SentenceI, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: SentenceJ

  /** getter for SentenceJ - gets Reference to SentenceJ
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceJ() {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_SentenceJ == null)
      jcasType.jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.Complexity");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Complexity_Type)jcasType).casFeatCode_SentenceJ)));}
    
  /** setter for SentenceJ - sets Reference to SentenceJ 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceJ(Annotation v) {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_SentenceJ == null)
      jcasType.jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.Complexity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Complexity_Type)jcasType).casFeatCode_SentenceJ, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Complexity");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Complexity_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Complexity_Type.featOkTst && ((Complexity_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Complexity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Complexity_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    