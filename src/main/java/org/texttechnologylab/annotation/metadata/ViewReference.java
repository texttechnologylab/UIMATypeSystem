

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation.metadata;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** View Reference
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ViewReference extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ViewReference.class);
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
  protected ViewReference() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ViewReference(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ViewReference(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ViewReference(JCas jcas, int begin, int end) {
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
  //* Feature: SourceViewName

  /** getter for SourceViewName - gets The name of the view from source
   * @generated
   * @return value of the feature 
   */
  public String getSourceViewName() {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceViewName == null)
      jcasType.jcas.throwFeatMissing("SourceViewName", "org.texttechnologylab.annotation.metadata.ViewReference");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceViewName);}
    
  /** setter for SourceViewName - sets The name of the view from source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceViewName(String v) {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceViewName == null)
      jcasType.jcas.throwFeatMissing("SourceViewName", "org.texttechnologylab.annotation.metadata.ViewReference");
    jcasType.ll_cas.ll_setStringValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceViewName, v);}    
   
    
  //*--------------*
  //* Feature: SourceBegin

  /** getter for SourceBegin - gets Begin of the source
   * @generated
   * @return value of the feature 
   */
  public int getSourceBegin() {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceBegin == null)
      jcasType.jcas.throwFeatMissing("SourceBegin", "org.texttechnologylab.annotation.metadata.ViewReference");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceBegin);}
    
  /** setter for SourceBegin - sets Begin of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceBegin(int v) {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceBegin == null)
      jcasType.jcas.throwFeatMissing("SourceBegin", "org.texttechnologylab.annotation.metadata.ViewReference");
    jcasType.ll_cas.ll_setIntValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceBegin, v);}    
   
    
  //*--------------*
  //* Feature: SourceEnd

  /** getter for SourceEnd - gets End of the source
   * @generated
   * @return value of the feature 
   */
  public int getSourceEnd() {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceEnd == null)
      jcasType.jcas.throwFeatMissing("SourceEnd", "org.texttechnologylab.annotation.metadata.ViewReference");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceEnd);}
    
  /** setter for SourceEnd - sets End of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceEnd(int v) {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceEnd == null)
      jcasType.jcas.throwFeatMissing("SourceEnd", "org.texttechnologylab.annotation.metadata.ViewReference");
    jcasType.ll_cas.ll_setIntValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceEnd, v);}    
   
    
  //*--------------*
  //* Feature: SourceType

  /** getter for SourceType - gets Type of the source
   * @generated
   * @return value of the feature 
   */
  public String getSourceType() {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceType == null)
      jcasType.jcas.throwFeatMissing("SourceType", "org.texttechnologylab.annotation.metadata.ViewReference");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceType);}
    
  /** setter for SourceType - sets Type of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceType(String v) {
    if (ViewReference_Type.featOkTst && ((ViewReference_Type)jcasType).casFeat_SourceType == null)
      jcasType.jcas.throwFeatMissing("SourceType", "org.texttechnologylab.annotation.metadata.ViewReference");
    jcasType.ll_cas.ll_setStringValue(addr, ((ViewReference_Type)jcasType).casFeatCode_SourceType, v);}    
  }

    