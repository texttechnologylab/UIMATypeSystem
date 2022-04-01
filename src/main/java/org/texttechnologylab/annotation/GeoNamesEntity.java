

/* First created by JCasGen Tue Feb 16 16:51:34 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Apr 01 18:16:00 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class GeoNamesEntity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeoNamesEntity.class);
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
  protected GeoNamesEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeoNamesEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeoNamesEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeoNamesEntity(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.GeoNamesEntity");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.GeoNamesEntity");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: mainclass

  /** getter for mainclass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMainclass() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_mainclass == null)
      jcasType.jcas.throwFeatMissing("mainclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_mainclass);}
    
  /** setter for mainclass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMainclass(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_mainclass == null)
      jcasType.jcas.throwFeatMissing("mainclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_mainclass, v);}    
   
    
  //*--------------*
  //* Feature: subclass

  /** getter for subclass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubclass() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_subclass == null)
      jcasType.jcas.throwFeatMissing("subclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_subclass);}
    
  /** setter for subclass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubclass(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_subclass == null)
      jcasType.jcas.throwFeatMissing("subclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_subclass, v);}    
  }

    