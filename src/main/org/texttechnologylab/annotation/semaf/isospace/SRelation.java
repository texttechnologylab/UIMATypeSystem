

/* First created by JCasGen Wed Dec 02 17:54:51 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Signal;


/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class SRelation extends Signal {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SRelation.class);
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
  protected SRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SRelation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SRelation(JCas jcas, int begin, int end) {
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
  //* Feature: relation_type

  /** getter for relation_type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRelation_type() {
    if (SRelation_Type.featOkTst && ((SRelation_Type)jcasType).casFeat_relation_type == null)
      jcasType.jcas.throwFeatMissing("relation_type", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SRelation_Type)jcasType).casFeatCode_relation_type);}
    
  /** setter for relation_type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelation_type(String v) {
    if (SRelation_Type.featOkTst && ((SRelation_Type)jcasType).casFeat_relation_type == null)
      jcasType.jcas.throwFeatMissing("relation_type", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SRelation_Type)jcasType).casFeatCode_relation_type, v);}    
   
    
  //*--------------*
  //* Feature: cluster

  /** getter for cluster - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCluster() {
    if (SRelation_Type.featOkTst && ((SRelation_Type)jcasType).casFeat_cluster == null)
      jcasType.jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SRelation_Type)jcasType).casFeatCode_cluster);}
    
  /** setter for cluster - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCluster(String v) {
    if (SRelation_Type.featOkTst && ((SRelation_Type)jcasType).casFeat_cluster == null)
      jcasType.jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SRelation_Type)jcasType).casFeatCode_cluster, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (SRelation_Type.featOkTst && ((SRelation_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SRelation_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (SRelation_Type.featOkTst && ((SRelation_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SRelation_Type)jcasType).casFeatCode_value, v);}    
  }

    