

/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed Dec 02 18:39:50 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyArgAnno.xml
 * @generated */
public class RelationSet extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationSet.class);
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
  protected RelationSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationSet(JCas jcas) {
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
  //* Feature: relations

  /** getter for relations - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getRelations() {
    if (RelationSet_Type.featOkTst && ((RelationSet_Type)jcasType).casFeat_relations == null)
      jcasType.jcas.throwFeatMissing("relations", "org.texttechnologylab.annotation.type.RelationSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type)jcasType).casFeatCode_relations)));}
    
  /** setter for relations - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelations(FSArray v) {
    if (RelationSet_Type.featOkTst && ((RelationSet_Type)jcasType).casFeat_relations == null)
      jcasType.jcas.throwFeatMissing("relations", "org.texttechnologylab.annotation.type.RelationSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((RelationSet_Type)jcasType).casFeatCode_relations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for relations - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public RelationDescription getRelations(int i) {
    if (RelationSet_Type.featOkTst && ((RelationSet_Type)jcasType).casFeat_relations == null)
      jcasType.jcas.throwFeatMissing("relations", "org.texttechnologylab.annotation.type.RelationSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type)jcasType).casFeatCode_relations), i);
    return (RelationDescription)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type)jcasType).casFeatCode_relations), i)));}

  /** indexed setter for relations - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setRelations(int i, RelationDescription v) { 
    if (RelationSet_Type.featOkTst && ((RelationSet_Type)jcasType).casFeat_relations == null)
      jcasType.jcas.throwFeatMissing("relations", "org.texttechnologylab.annotation.type.RelationSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type)jcasType).casFeatCode_relations), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type)jcasType).casFeatCode_relations), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    