

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Annotation represents a (unidirectional) Link between two Documents
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DLink.class);
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
  protected DLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DLink(JCas jcas, int begin, int end) {
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
    if (DLink_Type.featOkTst && ((DLink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.DLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DLink_Type)jcasType).casFeatCode_from);}
    
  /** setter for from - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(String v) {
    if (DLink_Type.featOkTst && ((DLink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.DLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((DLink_Type)jcasType).casFeatCode_from, v);}    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getTo() {
    if (DLink_Type.featOkTst && ((DLink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.DLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DLink_Type)jcasType).casFeatCode_to);}
    
  /** setter for to - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(String v) {
    if (DLink_Type.featOkTst && ((DLink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.DLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((DLink_Type)jcasType).casFeatCode_to, v);}    
  }

    