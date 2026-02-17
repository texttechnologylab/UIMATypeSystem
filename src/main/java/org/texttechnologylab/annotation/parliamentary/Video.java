

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Video extends Speech {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Video.class);
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
  protected Video() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Video(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Video(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Video(JCas jcas, int begin, int end) {
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
  //* Feature: url

  /** getter for url - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.parliamentary.Video");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Video_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.parliamentary.Video");
    jcasType.ll_cas.ll_setStringValue(addr, ((Video_Type)jcasType).casFeatCode_url, v);}    
  }

    