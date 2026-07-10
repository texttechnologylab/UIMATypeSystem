

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SpeechText extends SpeechSection {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpeechText.class);
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
  protected SpeechText() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SpeechText(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpeechText(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpeechText(JCas jcas, int begin, int end) {
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
  //* Feature: speaker

  /** getter for speaker - gets 
   * @generated
   * @return value of the feature 
   */
  public Speaker getSpeaker() {
    if (SpeechText_Type.featOkTst && ((SpeechText_Type)jcasType).casFeat_speaker == null)
      jcasType.jcas.throwFeatMissing("speaker", "org.texttechnologylab.annotation.parliamentary.SpeechText");
    return (Speaker)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpeechText_Type)jcasType).casFeatCode_speaker)));}
    
  /** setter for speaker - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeaker(Speaker v) {
    if (SpeechText_Type.featOkTst && ((SpeechText_Type)jcasType).casFeat_speaker == null)
      jcasType.jcas.throwFeatMissing("speaker", "org.texttechnologylab.annotation.parliamentary.SpeechText");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpeechText_Type)jcasType).casFeatCode_speaker, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    