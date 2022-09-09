

/* First created by JCasGen Fri Sep 09 12:38:22 CEST 2022 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Sep 09 12:38:22 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TexttechnologyDBPedia.xml
 * @generated */
public class DBPediaObject extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DBPediaObject.class);
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
  protected DBPediaObject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DBPediaObject(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DBPediaObject(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DBPediaObject(JCas jcas, int begin, int end) {
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
  //* Feature: similarityScore

  /** getter for similarityScore - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSimilarityScore() {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_similarityScore == null)
      jcasType.jcas.throwFeatMissing("similarityScore", "org.texttechnologylab.annotation.type.DBPediaObject");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_similarityScore);}
    
  /** setter for similarityScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSimilarityScore(double v) {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_similarityScore == null)
      jcasType.jcas.throwFeatMissing("similarityScore", "org.texttechnologylab.annotation.type.DBPediaObject");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_similarityScore, v);}    
   
    
  //*--------------*
  //* Feature: percentageOfSecondRank

  /** getter for percentageOfSecondRank - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPercentageOfSecondRank() {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_percentageOfSecondRank == null)
      jcasType.jcas.throwFeatMissing("percentageOfSecondRank", "org.texttechnologylab.annotation.type.DBPediaObject");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_percentageOfSecondRank);}
    
  /** setter for percentageOfSecondRank - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentageOfSecondRank(double v) {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_percentageOfSecondRank == null)
      jcasType.jcas.throwFeatMissing("percentageOfSecondRank", "org.texttechnologylab.annotation.type.DBPediaObject");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_percentageOfSecondRank, v);}    
   
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.type.DBPediaObject");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_uri);}
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.type.DBPediaObject");
    jcasType.ll_cas.ll_setStringValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_uri, v);}    
   
    
  //*--------------*
  //* Feature: types

  /** getter for types - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getTypes() {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.texttechnologylab.annotation.type.DBPediaObject");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_types)));}
    
  /** setter for types - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypes(FSList v) {
    if (DBPediaObject_Type.featOkTst && ((DBPediaObject_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.texttechnologylab.annotation.type.DBPediaObject");
    jcasType.ll_cas.ll_setRefValue(addr, ((DBPediaObject_Type)jcasType).casFeatCode_types, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    