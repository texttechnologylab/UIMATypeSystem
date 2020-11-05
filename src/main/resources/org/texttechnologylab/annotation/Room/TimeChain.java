

/* First created by JCasGen Thu Nov 05 17:33:03 CET 2020 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** A link in the time chain
 * Updated by JCasGen Thu Nov 05 17:33:03 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyRoom.xml
 * @generated */
public class TimeChain extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeChain.class);
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
  protected TimeChain() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeChain(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeChain(JCas jcas) {
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
  //* Feature: next

  /** getter for next - gets Next chain element
   * @generated
   * @return value of the feature 
   */
  public TimeChain getNext() {
    if (TimeChain_Type.featOkTst && ((TimeChain_Type)jcasType).casFeat_next == null)
      jcasType.jcas.throwFeatMissing("next", "org.texttechnologylab.annotation.Room.TimeChain");
    return (TimeChain)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeChain_Type)jcasType).casFeatCode_next)));}
    
  /** setter for next - sets Next chain element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNext(TimeChain v) {
    if (TimeChain_Type.featOkTst && ((TimeChain_Type)jcasType).casFeat_next == null)
      jcasType.jcas.throwFeatMissing("next", "org.texttechnologylab.annotation.Room.TimeChain");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeChain_Type)jcasType).casFeatCode_next, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: prev

  /** getter for prev - gets Previous chain element
   * @generated
   * @return value of the feature 
   */
  public TimeChain getPrev() {
    if (TimeChain_Type.featOkTst && ((TimeChain_Type)jcasType).casFeat_prev == null)
      jcasType.jcas.throwFeatMissing("prev", "org.texttechnologylab.annotation.Room.TimeChain");
    return (TimeChain)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeChain_Type)jcasType).casFeatCode_prev)));}
    
  /** setter for prev - sets Previous chain element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrev(TimeChain v) {
    if (TimeChain_Type.featOkTst && ((TimeChain_Type)jcasType).casFeat_prev == null)
      jcasType.jcas.throwFeatMissing("prev", "org.texttechnologylab.annotation.Room.TimeChain");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeChain_Type)jcasType).casFeatCode_prev, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    