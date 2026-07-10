

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.hucompute.textimager.uima.type.category;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Generic "category" type that can be used for e.g. classification results and other categorical data.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class CategoryCoveredTagged extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CategoryCoveredTagged.class);
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
  protected CategoryCoveredTagged() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CategoryCoveredTagged(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CategoryCoveredTagged(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CategoryCoveredTagged(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets String-based value, e.g. a topic name like "politics" or "sports".
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets String-based value, e.g. a topic name like "politics" or "sports". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    jcasType.ll_cas.ll_setStringValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Score, probability or confidence value for the category set in the "value" field.
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Score, probability or confidence value for the category set in the "value" field. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: tags

  /** getter for tags - gets Free-form field for tags, has internally often been used to store model name and version.
   * @generated
   * @return value of the feature 
   */
  public String getTags() {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_tags == null)
      jcasType.jcas.throwFeatMissing("tags", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_tags);}
    
  /** setter for tags - sets Free-form field for tags, has internally often been used to store model name and version. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTags(String v) {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_tags == null)
      jcasType.jcas.throwFeatMissing("tags", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    jcasType.ll_cas.ll_setStringValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_tags, v);}    
   
    
  //*--------------*
  //* Feature: ref

  /** getter for ref - gets This field can reference any other annotation in the CAS, can be used to e.g. directly point to a span in the text to differentiate sentence- and paragraph-based classification results.
   * @generated
   * @return value of the feature 
   */
  public Annotation getRef() {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_ref)));}
    
  /** setter for ref - sets This field can reference any other annotation in the CAS, can be used to e.g. directly point to a span in the text to differentiate sentence- and paragraph-based classification results. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRef(Annotation v) {
    if (CategoryCoveredTagged_Type.featOkTst && ((CategoryCoveredTagged_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged");
    jcasType.ll_cas.ll_setRefValue(addr, ((CategoryCoveredTagged_Type)jcasType).casFeatCode_ref, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    