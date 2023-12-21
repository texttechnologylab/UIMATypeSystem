

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.uima.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.ModelAnnotation;
import org.apache.uima.jcas.cas.FloatArray;


/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelAnnotation.xml
 * @generated */
public class Embedding extends ModelAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Embedding.class);
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
  protected Embedding() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Embedding(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Embedding(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Embedding(JCas jcas, int begin, int end) {
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
  //* Feature: embedding

  /** getter for embedding - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getEmbedding() {
    if (Embedding_Type.featOkTst && ((Embedding_Type)jcasType).casFeat_embedding == null)
      jcasType.jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Embedding_Type)jcasType).casFeatCode_embedding)));}
    
  /** setter for embedding - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmbedding(FloatArray v) {
    if (Embedding_Type.featOkTst && ((Embedding_Type)jcasType).casFeat_embedding == null)
      jcasType.jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    jcasType.ll_cas.ll_setRefValue(addr, ((Embedding_Type)jcasType).casFeatCode_embedding, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for embedding - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getEmbedding(int i) {
    if (Embedding_Type.featOkTst && ((Embedding_Type)jcasType).casFeat_embedding == null)
      jcasType.jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Embedding_Type)jcasType).casFeatCode_embedding), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Embedding_Type)jcasType).casFeatCode_embedding), i);}

  /** indexed setter for embedding - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEmbedding(int i, float v) { 
    if (Embedding_Type.featOkTst && ((Embedding_Type)jcasType).casFeat_embedding == null)
      jcasType.jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Embedding_Type)jcasType).casFeatCode_embedding), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Embedding_Type)jcasType).casFeatCode_embedding), i, v);}
  }

    