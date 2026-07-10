

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationRelation extends AnnotationAttribute {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationRelation.class);
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
  protected AnnotationRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationRelation(JCas jcas) {
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
  //* Feature: attributes

  /** getter for attributes - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getAttributes() {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationRelation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_attributes)));}
    
  /** setter for attributes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributes(FSArray v) {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_attributes, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for attributes - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getAttributes(int i) {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationRelation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_attributes), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_attributes), i)));}

  /** indexed setter for attributes - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAttributes(int i, TOP v) { 
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationRelation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_attributes), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_attributes), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    