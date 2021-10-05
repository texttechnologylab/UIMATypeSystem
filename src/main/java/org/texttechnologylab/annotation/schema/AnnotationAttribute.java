

/* First created by JCasGen Tue Oct 05 17:20:02 CEST 2021 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Oct 05 17:20:02 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotationSchema.xml
 * @generated */
public class AnnotationAttribute extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationAttribute.class);
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
  protected AnnotationAttribute() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationAttribute(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationAttribute(JCas jcas) {
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public Attribute getKey() {
    if (AnnotationAttribute_Type.featOkTst && ((AnnotationAttribute_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.schema.AnnotationAttribute");
    return (Attribute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationAttribute_Type)jcasType).casFeatCode_key)));}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(Attribute v) {
    if (AnnotationAttribute_Type.featOkTst && ((AnnotationAttribute_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.schema.AnnotationAttribute");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationAttribute_Type)jcasType).casFeatCode_key, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (AnnotationAttribute_Type.featOkTst && ((AnnotationAttribute_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.schema.AnnotationAttribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationAttribute_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (AnnotationAttribute_Type.featOkTst && ((AnnotationAttribute_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.schema.AnnotationAttribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationAttribute_Type)jcasType).casFeatCode_value, v);}    
  }

    