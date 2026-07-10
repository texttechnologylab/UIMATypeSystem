

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This represent an audio in base64
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Audio extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Audio.class);
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
  protected Audio() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Audio(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Audio(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Audio(JCas jcas, int begin, int end) {
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
  //* Feature: src

  /** getter for src - gets file path or base64 value of the audio
   * @generated
   * @return value of the feature 
   */
  public String getSrc() {
    if (Audio_Type.featOkTst && ((Audio_Type)jcasType).casFeat_src == null)
      jcasType.jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Audio");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Audio_Type)jcasType).casFeatCode_src);}
    
  /** setter for src - sets file path or base64 value of the audio 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSrc(String v) {
    if (Audio_Type.featOkTst && ((Audio_Type)jcasType).casFeat_src == null)
      jcasType.jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Audio");
    jcasType.ll_cas.ll_setStringValue(addr, ((Audio_Type)jcasType).casFeatCode_src, v);}    
   
    
  //*--------------*
  //* Feature: mimetype

  /** getter for mimetype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMimetype() {
    if (Audio_Type.featOkTst && ((Audio_Type)jcasType).casFeat_mimetype == null)
      jcasType.jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Audio");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Audio_Type)jcasType).casFeatCode_mimetype);}
    
  /** setter for mimetype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMimetype(String v) {
    if (Audio_Type.featOkTst && ((Audio_Type)jcasType).casFeat_mimetype == null)
      jcasType.jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Audio");
    jcasType.ll_cas.ll_setStringValue(addr, ((Audio_Type)jcasType).casFeatCode_mimetype, v);}    
  }

    