

/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Thu Sep 03 10:03:40 CEST 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoSpaceV2TypeSystem.xml
 * @generated */
public class MLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MLink.class);
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
  protected MLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MLink(JCas jcas) {
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
  //* Feature: val

  /** getter for val - gets 
   * @generated
   * @return value of the feature 
   */
  public Measure getVal() {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_val == null)
      jcasType.jcas.throwFeatMissing("val", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return (Measure)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MLink_Type)jcasType).casFeatCode_val)));}
    
  /** setter for val - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVal(Measure v) {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_val == null)
      jcasType.jcas.throwFeatMissing("val", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MLink_Type)jcasType).casFeatCode_val, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: end_point1

  /** getter for end_point1 - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getEnd_point1() {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_end_point1 == null)
      jcasType.jcas.throwFeatMissing("end_point1", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MLink_Type)jcasType).casFeatCode_end_point1)));}
    
  /** setter for end_point1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd_point1(Entity v) {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_end_point1 == null)
      jcasType.jcas.throwFeatMissing("end_point1", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MLink_Type)jcasType).casFeatCode_end_point1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: end_point2

  /** getter for end_point2 - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getEnd_point2() {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_end_point2 == null)
      jcasType.jcas.throwFeatMissing("end_point2", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MLink_Type)jcasType).casFeatCode_end_point2)));}
    
  /** setter for end_point2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd_point2(Entity v) {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_end_point2 == null)
      jcasType.jcas.throwFeatMissing("end_point2", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MLink_Type)jcasType).casFeatCode_end_point2, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bounds

  /** getter for bounds - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getBounds() {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_bounds == null)
      jcasType.jcas.throwFeatMissing("bounds", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MLink_Type)jcasType).casFeatCode_bounds)));}
    
  /** setter for bounds - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBounds(FSList v) {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_bounds == null)
      jcasType.jcas.throwFeatMissing("bounds", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MLink_Type)jcasType).casFeatCode_bounds, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    