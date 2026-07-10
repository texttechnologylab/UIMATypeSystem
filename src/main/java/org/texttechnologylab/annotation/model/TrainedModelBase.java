

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Base feature structure for storing a trained model artifact without text span offsets.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TrainedModelBase extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TrainedModelBase.class);
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
  protected TrainedModelBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TrainedModelBase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TrainedModelBase(JCas jcas) {
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
  //* Feature: modelBase64

  /** getter for modelBase64 - gets Base64-encoded serialized model.
   * @generated
   * @return value of the feature 
   */
  public String getModelBase64() {
    if (TrainedModelBase_Type.featOkTst && ((TrainedModelBase_Type)jcasType).casFeat_modelBase64 == null)
      jcasType.jcas.throwFeatMissing("modelBase64", "org.texttechnologylab.annotation.model.TrainedModelBase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TrainedModelBase_Type)jcasType).casFeatCode_modelBase64);}
    
  /** setter for modelBase64 - sets Base64-encoded serialized model. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelBase64(String v) {
    if (TrainedModelBase_Type.featOkTst && ((TrainedModelBase_Type)jcasType).casFeat_modelBase64 == null)
      jcasType.jcas.throwFeatMissing("modelBase64", "org.texttechnologylab.annotation.model.TrainedModelBase");
    jcasType.ll_cas.ll_setStringValue(addr, ((TrainedModelBase_Type)jcasType).casFeatCode_modelBase64, v);}    
  }

    