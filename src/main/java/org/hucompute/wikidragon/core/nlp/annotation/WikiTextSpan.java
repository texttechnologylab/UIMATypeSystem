

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.hucompute.wikidragon.core.nlp.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WikiTextSpan extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WikiTextSpan.class);
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
  protected WikiTextSpan() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public WikiTextSpan(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WikiTextSpan(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WikiTextSpan(JCas jcas, int begin, int end) {
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
  //* Feature: uid

  /** getter for uid - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUid() {
    if (WikiTextSpan_Type.featOkTst && ((WikiTextSpan_Type)jcasType).casFeat_uid == null)
      jcasType.jcas.throwFeatMissing("uid", "org.hucompute.wikidragon.core.nlp.annotation.WikiTextSpan");
    return jcasType.ll_cas.ll_getStringValue(addr, ((WikiTextSpan_Type)jcasType).casFeatCode_uid);}
    
  /** setter for uid - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUid(String v) {
    if (WikiTextSpan_Type.featOkTst && ((WikiTextSpan_Type)jcasType).casFeat_uid == null)
      jcasType.jcas.throwFeatMissing("uid", "org.hucompute.wikidragon.core.nlp.annotation.WikiTextSpan");
    jcasType.ll_cas.ll_setStringValue(addr, ((WikiTextSpan_Type)jcasType).casFeatCode_uid, v);}    
  }

    