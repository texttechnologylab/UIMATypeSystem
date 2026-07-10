

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.type.search;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Text, which is used for searching in the web, for Reference Text or for other purposes.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TextSearch extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextSearch.class);
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
  protected TextSearch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TextSearch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextSearch(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TextSearch(JCas jcas, int begin, int end) {
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
  //* Feature: text

  /** getter for text - gets Can be Same as covered text or a summary, topic, etc. of this text
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (TextSearch_Type.featOkTst && ((TextSearch_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.type.search.TextSearch");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextSearch_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets Can be Same as covered text or a summary, topic, etc. of this text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (TextSearch_Type.featOkTst && ((TextSearch_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.type.search.TextSearch");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextSearch_Type)jcasType).casFeatCode_text, v);}    
  }

    