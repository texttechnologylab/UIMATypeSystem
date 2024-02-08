

/* First created by JCasGen Wed Dec 02 18:39:08 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Feb 08 19:39:47 CET 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyQuickAnno.xml
 * @generated */
public class QuickAnnoUnit extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuickAnnoUnit.class);
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
  protected QuickAnnoUnit() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuickAnnoUnit(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuickAnnoUnit(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuickAnnoUnit(JCas jcas, int begin, int end) {
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
  //* Feature: combined

  /** getter for combined - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCombined() {
    if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type)jcasType).casFeat_combined == null)
      jcasType.jcas.throwFeatMissing("combined", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((QuickAnnoUnit_Type)jcasType).casFeatCode_combined);}
    
  /** setter for combined - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCombined(boolean v) {
    if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type)jcasType).casFeat_combined == null)
      jcasType.jcas.throwFeatMissing("combined", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((QuickAnnoUnit_Type)jcasType).casFeatCode_combined, v);}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() {
    if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuickAnnoUnit_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuickAnnoUnit_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getOrigin() {
    if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuickAnnoUnit_Type)jcasType).casFeatCode_origin)));}
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(Annotation v) {
    if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    jcasType.ll_cas.ll_setRefValue(addr, ((QuickAnnoUnit_Type)jcasType).casFeatCode_origin, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    