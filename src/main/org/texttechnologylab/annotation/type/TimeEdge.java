

/* First created by JCasGen Wed Dec 02 18:28:41 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Dec 02 18:28:43 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 * @generated */
public class TimeEdge extends Edge {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeEdge.class);
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
  protected TimeEdge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeEdge(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeEdge(JCas jcas) {
    super(jcas);
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
  //* Feature: mode

  /** getter for mode - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMode() {
    if (TimeEdge_Type.featOkTst && ((TimeEdge_Type)jcasType).casFeat_mode == null)
      jcasType.jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.TimeEdge");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeEdge_Type)jcasType).casFeatCode_mode);}
    
  /** setter for mode - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMode(String v) {
    if (TimeEdge_Type.featOkTst && ((TimeEdge_Type)jcasType).casFeat_mode == null)
      jcasType.jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.TimeEdge");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeEdge_Type)jcasType).casFeatCode_mode, v);}    
  }

    