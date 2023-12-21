

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Dec 21 13:46:46 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelMeta.xml
 * @generated */
public class MetaData extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
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
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetaData(JCas jcas, int begin, int end) {
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
  //* Feature: Lang

  /** getter for Lang - gets Language of the method or the Model
   * @generated
   * @return value of the feature 
   */
  public String getLang() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Lang == null)
      jcasType.jcas.throwFeatMissing("Lang", "org.texttechnologylab.annotation.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_Lang);}
    
  /** setter for Lang - sets Language of the method or the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLang(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Lang == null)
      jcasType.jcas.throwFeatMissing("Lang", "org.texttechnologylab.annotation.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_Lang, v);}    
   
    
  //*--------------*
  //* Feature: Source

  /** getter for Source - gets Link of the used resource
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "org.texttechnologylab.annotation.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_Source);}
    
  /** setter for Source - sets Link of the used resource 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "org.texttechnologylab.annotation.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_Source, v);}    
  }

    