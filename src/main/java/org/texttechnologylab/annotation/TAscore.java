

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** TextAnalyzer scores.
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TAscore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TAscore.class);
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
  protected TAscore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TAscore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TAscore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TAscore(JCas jcas, int begin, int end) {
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
  //* Feature: name

  /** getter for name - gets String-based value, e.g. a topic name like "politics" or "sports".
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.TAscore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TAscore_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets String-based value, e.g. a topic name like "politics" or "sports". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.TAscore");
    jcasType.ll_cas.ll_setStringValue(addr, ((TAscore_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Score, probability or confidence value for the category set in the "value" field.
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.TAscore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TAscore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Score, probability or confidence value for the category set in the "value" field. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.TAscore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TAscore_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: group

  /** getter for group - gets Feature class, e.g. pos-b (part of speech basic), pos-a, syntactic, coherence-l (token based), coherence-s (sentence based), etc.
   * @generated
   * @return value of the feature 
   */
  public String getGroup() {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.TAscore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TAscore_Type)jcasType).casFeatCode_group);}
    
  /** setter for group - sets Feature class, e.g. pos-b (part of speech basic), pos-a, syntactic, coherence-l (token based), coherence-s (sentence based), etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroup(String v) {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.TAscore");
    jcasType.ll_cas.ll_setStringValue(addr, ((TAscore_Type)jcasType).casFeatCode_group, v);}    
   
    
  //*--------------*
  //* Feature: ref

  /** getter for ref - gets This field can reference any other annotation in the CAS, can be used to e.g. directly point to a span in the text to differentiate sentence- and paragraph-based classification results.
   * @generated
   * @return value of the feature 
   */
  public Annotation getRef() {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "org.texttechnologylab.annotation.TAscore");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TAscore_Type)jcasType).casFeatCode_ref)));}
    
  /** setter for ref - sets This field can reference any other annotation in the CAS, can be used to e.g. directly point to a span in the text to differentiate sentence- and paragraph-based classification results. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRef(Annotation v) {
    if (TAscore_Type.featOkTst && ((TAscore_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "org.texttechnologylab.annotation.TAscore");
    jcasType.ll_cas.ll_setRefValue(addr, ((TAscore_Type)jcasType).casFeatCode_ref, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    