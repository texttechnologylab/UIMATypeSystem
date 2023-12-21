

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelAnnotation.xml
 * @generated */
public class ModelAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ModelAnnotation.class);
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
  protected ModelAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ModelAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ModelAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ModelAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: ModelReference

  /** getter for ModelReference - gets Reference to the Model
   * @generated
   * @return value of the feature 
   */
  public MetaData getModelReference() {
    if (ModelAnnotation_Type.featOkTst && ((ModelAnnotation_Type)jcasType).casFeat_ModelReference == null)
      jcasType.jcas.throwFeatMissing("ModelReference", "org.texttechnologylab.annotation.ModelAnnotation");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ModelAnnotation_Type)jcasType).casFeatCode_ModelReference)));}
    
  /** setter for ModelReference - sets Reference to the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelReference(MetaData v) {
    if (ModelAnnotation_Type.featOkTst && ((ModelAnnotation_Type)jcasType).casFeat_ModelReference == null)
      jcasType.jcas.throwFeatMissing("ModelReference", "org.texttechnologylab.annotation.ModelAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((ModelAnnotation_Type)jcasType).casFeatCode_ModelReference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    