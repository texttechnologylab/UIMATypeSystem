

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation represents a (unidirectional) Link between another Annotation and a Document
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ADLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ADLink.class);
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
  protected ADLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ADLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ADLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ADLink(JCas jcas, int begin, int end) {
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

  /** getter for from - gets from (annotation) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public Annotation getFrom() {
    if (ADLink_Type.featOkTst && ((ADLink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.ADLink");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ADLink_Type)jcasType).casFeatCode_from)));}
    
  /** setter for from - sets from (annotation) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(Annotation v) {
    if (ADLink_Type.featOkTst && ((ADLink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.ADLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((ADLink_Type)jcasType).casFeatCode_from, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (annotation) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getTo() {
    if (ADLink_Type.featOkTst && ((ADLink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.ADLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ADLink_Type)jcasType).casFeatCode_to);}
    
  /** setter for to - sets from (annotation) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(String v) {
    if (ADLink_Type.featOkTst && ((ADLink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.ADLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((ADLink_Type)jcasType).casFeatCode_to, v);}    
  }

    