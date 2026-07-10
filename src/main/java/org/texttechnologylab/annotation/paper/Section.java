

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Section extends TextContent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Section.class);
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
  protected Section() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Section(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Section(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Section(JCas jcas, int begin, int end) {
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
  //* Feature: level

  /** getter for level - gets Level of the section, 0 is top level
   * @generated
   * @return value of the feature 
   */
  public int getLevel() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_level == null)
      jcasType.jcas.throwFeatMissing("level", "org.texttechnologylab.annotation.paper.Section");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Section_Type)jcasType).casFeatCode_level);}
    
  /** setter for level - sets Level of the section, 0 is top level 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLevel(int v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_level == null)
      jcasType.jcas.throwFeatMissing("level", "org.texttechnologylab.annotation.paper.Section");
    jcasType.ll_cas.ll_setIntValue(addr, ((Section_Type)jcasType).casFeatCode_level, v);}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets The heading of a section
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.paper.Section");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Section_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets The heading of a section 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.paper.Section");
    jcasType.ll_cas.ll_setStringValue(addr, ((Section_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: index

  /** getter for index - gets The index of a section (1, 1.1, 1.1.1, ...)
   * @generated
   * @return value of the feature 
   */
  public String getIndex() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.paper.Section");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Section_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets The index of a section (1, 1.1, 1.1.1, ...) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(String v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.paper.Section");
    jcasType.ll_cas.ll_setStringValue(addr, ((Section_Type)jcasType).casFeatCode_index, v);}    
  }

    