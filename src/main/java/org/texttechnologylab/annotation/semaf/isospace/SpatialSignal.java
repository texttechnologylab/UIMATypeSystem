

/* First created by JCasGen Mon Aug 23 15:33:08 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Signal;


/** 
 * Updated by JCasGen Tue Oct 12 19:32:08 CEST 2021
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoBaseTypeSystem.xml
 * @generated */
public class SpatialSignal extends Signal {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpatialSignal.class);
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
  protected SpatialSignal() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SpatialSignal(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpatialSignal(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpatialSignal(JCas jcas, int begin, int end) {
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
  //* Feature: cluster

  /** getter for cluster - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCluster() {
    if (SpatialSignal_Type.featOkTst && ((SpatialSignal_Type)jcasType).casFeat_cluster == null)
      jcasType.jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialSignal_Type)jcasType).casFeatCode_cluster);}
    
  /** setter for cluster - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCluster(String v) {
    if (SpatialSignal_Type.featOkTst && ((SpatialSignal_Type)jcasType).casFeat_cluster == null)
      jcasType.jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialSignal_Type)jcasType).casFeatCode_cluster, v);}    
   
    
  //*--------------*
  //* Feature: semantic_type

  /** getter for semantic_type - gets ( DIRECTIONAL | TOPOLOGICAL | DIR_TOP )
   * @generated
   * @return value of the feature 
   */
  public String getSemantic_type() {
    if (SpatialSignal_Type.featOkTst && ((SpatialSignal_Type)jcasType).casFeat_semantic_type == null)
      jcasType.jcas.throwFeatMissing("semantic_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialSignal_Type)jcasType).casFeatCode_semantic_type);}
    
  /** setter for semantic_type - sets ( DIRECTIONAL | TOPOLOGICAL | DIR_TOP ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSemantic_type(String v) {
    if (SpatialSignal_Type.featOkTst && ((SpatialSignal_Type)jcasType).casFeat_semantic_type == null)
      jcasType.jcas.throwFeatMissing("semantic_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialSignal_Type)jcasType).casFeatCode_semantic_type, v);}    
  }

    