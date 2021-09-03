

/* First created by JCasGen Mon Aug 23 15:33:08 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Mon Aug 23 15:33:08 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoBaseTypeSystem.xml
 * @generated */
public class Path extends Location {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Path.class);
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
  protected Path() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Path(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Path(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Path(JCas jcas, int begin, int end) {
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
  //* Feature: beginID

  /** getter for beginID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getBeginID() {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_beginID == null)
      jcasType.jcas.throwFeatMissing("beginID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_beginID)));}
    
  /** setter for beginID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginID(SpatialEntity v) {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_beginID == null)
      jcasType.jcas.throwFeatMissing("beginID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    jcasType.ll_cas.ll_setRefValue(addr, ((Path_Type)jcasType).casFeatCode_beginID, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endID

  /** getter for endID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getEndID() {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_endID == null)
      jcasType.jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_endID)));}
    
  /** setter for endID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndID(SpatialEntity v) {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_endID == null)
      jcasType.jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    jcasType.ll_cas.ll_setRefValue(addr, ((Path_Type)jcasType).casFeatCode_endID, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: midIDs

  /** getter for midIDs - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getMidIDs() {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_midIDs == null)
      jcasType.jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_midIDs)));}
    
  /** setter for midIDs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMidIDs(FSList v) {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_midIDs == null)
      jcasType.jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.Path");
    jcasType.ll_cas.ll_setRefValue(addr, ((Path_Type)jcasType).casFeatCode_midIDs, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: midID_array

  /** getter for midID_array - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMidID_array() {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_midID_array)));}
    
  /** setter for midID_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMidID_array(FSArray v) {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.Path");
    jcasType.ll_cas.ll_setRefValue(addr, ((Path_Type)jcasType).casFeatCode_midID_array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for midID_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public SpatialEntity getMidID_array(int i) {
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.Path");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_midID_array), i);
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_midID_array), i)));}

  /** indexed setter for midID_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMidID_array(int i, SpatialEntity v) { 
    if (Path_Type.featOkTst && ((Path_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.Path");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_midID_array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Path_Type)jcasType).casFeatCode_midID_array), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    