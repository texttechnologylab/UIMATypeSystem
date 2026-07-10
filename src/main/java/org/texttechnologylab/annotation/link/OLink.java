

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Annotation represents a (unidirectional) Link between a Document and another Document, linking offsets (can be in same Doc)
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OLink.class);
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
  protected OLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OLink(JCas jcas, int begin, int end) {
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
  //* Feature: from

  /** getter for from - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getFrom() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.OLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OLink_Type)jcasType).casFeatCode_from);}
    
  /** setter for from - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(String v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.OLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((OLink_Type)jcasType).casFeatCode_from, v);}    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getTo() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.OLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OLink_Type)jcasType).casFeatCode_to);}
    
  /** setter for to - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(String v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.OLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((OLink_Type)jcasType).casFeatCode_to, v);}    
   
    
  //*--------------*
  //* Feature: fromBegin

  /** getter for fromBegin - gets Offset (begin) in (from) Doc
   * @generated
   * @return value of the feature 
   */
  public int getFromBegin() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_fromBegin == null)
      jcasType.jcas.throwFeatMissing("fromBegin", "org.texttechnologylab.annotation.link.OLink");
    return jcasType.ll_cas.ll_getIntValue(addr, ((OLink_Type)jcasType).casFeatCode_fromBegin);}
    
  /** setter for fromBegin - sets Offset (begin) in (from) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromBegin(int v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_fromBegin == null)
      jcasType.jcas.throwFeatMissing("fromBegin", "org.texttechnologylab.annotation.link.OLink");
    jcasType.ll_cas.ll_setIntValue(addr, ((OLink_Type)jcasType).casFeatCode_fromBegin, v);}    
   
    
  //*--------------*
  //* Feature: fromEnd

  /** getter for fromEnd - gets Offset (end) in (from) Doc
   * @generated
   * @return value of the feature 
   */
  public int getFromEnd() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_fromEnd == null)
      jcasType.jcas.throwFeatMissing("fromEnd", "org.texttechnologylab.annotation.link.OLink");
    return jcasType.ll_cas.ll_getIntValue(addr, ((OLink_Type)jcasType).casFeatCode_fromEnd);}
    
  /** setter for fromEnd - sets Offset (end) in (from) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromEnd(int v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_fromEnd == null)
      jcasType.jcas.throwFeatMissing("fromEnd", "org.texttechnologylab.annotation.link.OLink");
    jcasType.ll_cas.ll_setIntValue(addr, ((OLink_Type)jcasType).casFeatCode_fromEnd, v);}    
   
    
  //*--------------*
  //* Feature: toBegin

  /** getter for toBegin - gets Offset (begin) in (to) Doc
   * @generated
   * @return value of the feature 
   */
  public int getToBegin() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_toBegin == null)
      jcasType.jcas.throwFeatMissing("toBegin", "org.texttechnologylab.annotation.link.OLink");
    return jcasType.ll_cas.ll_getIntValue(addr, ((OLink_Type)jcasType).casFeatCode_toBegin);}
    
  /** setter for toBegin - sets Offset (begin) in (to) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToBegin(int v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_toBegin == null)
      jcasType.jcas.throwFeatMissing("toBegin", "org.texttechnologylab.annotation.link.OLink");
    jcasType.ll_cas.ll_setIntValue(addr, ((OLink_Type)jcasType).casFeatCode_toBegin, v);}    
   
    
  //*--------------*
  //* Feature: toEnd

  /** getter for toEnd - gets Offset (end) in (to) Doc
   * @generated
   * @return value of the feature 
   */
  public int getToEnd() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_toEnd == null)
      jcasType.jcas.throwFeatMissing("toEnd", "org.texttechnologylab.annotation.link.OLink");
    return jcasType.ll_cas.ll_getIntValue(addr, ((OLink_Type)jcasType).casFeatCode_toEnd);}
    
  /** setter for toEnd - sets Offset (end) in (to) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToEnd(int v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_toEnd == null)
      jcasType.jcas.throwFeatMissing("toEnd", "org.texttechnologylab.annotation.link.OLink");
    jcasType.ll_cas.ll_setIntValue(addr, ((OLink_Type)jcasType).casFeatCode_toEnd, v);}    
  }

    