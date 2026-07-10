

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation represents a (unidirectional) Link between a Document and another Annotations
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DALink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DALink.class);
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
  protected DALink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DALink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DALink(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DALink(JCas jcas, int begin, int end) {
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

  /** getter for from - gets from (document_id) to (annotation)
   * @generated
   * @return value of the feature 
   */
  public String getFrom() {
    if (DALink_Type.featOkTst && ((DALink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.DALink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DALink_Type)jcasType).casFeatCode_from);}
    
  /** setter for from - sets from (document_id) to (annotation) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(String v) {
    if (DALink_Type.featOkTst && ((DALink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.DALink");
    jcasType.ll_cas.ll_setStringValue(addr, ((DALink_Type)jcasType).casFeatCode_from, v);}    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (document_id) to (annotation)
   * @generated
   * @return value of the feature 
   */
  public Annotation getTo() {
    if (DALink_Type.featOkTst && ((DALink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.DALink");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DALink_Type)jcasType).casFeatCode_to)));}
    
  /** setter for to - sets from (document_id) to (annotation) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(Annotation v) {
    if (DALink_Type.featOkTst && ((DALink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.DALink");
    jcasType.ll_cas.ll_setRefValue(addr, ((DALink_Type)jcasType).casFeatCode_to, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    