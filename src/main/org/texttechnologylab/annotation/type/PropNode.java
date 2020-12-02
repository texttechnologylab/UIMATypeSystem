

/* First created by JCasGen Wed Dec 02 17:56:00 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Dec 02 17:56:00 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyPropAnno.xml
 * @generated */
public class PropNode extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PropNode.class);
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
  protected PropNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PropNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PropNode(JCas jcas) {
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
  //* Feature: graphId

  /** getter for graphId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGraphId() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_graphId == null)
      jcasType.jcas.throwFeatMissing("graphId", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_graphId);}
    
  /** setter for graphId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGraphId(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_graphId == null)
      jcasType.jcas.throwFeatMissing("graphId", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_graphId, v);}    
   
    
  //*--------------*
  //* Feature: nodeId

  /** getter for nodeId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNodeId() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_nodeId == null)
      jcasType.jcas.throwFeatMissing("nodeId", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_nodeId);}
    
  /** setter for nodeId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodeId(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_nodeId == null)
      jcasType.jcas.throwFeatMissing("nodeId", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_nodeId, v);}    
   
    
  //*--------------*
  //* Feature: lemma

  /** getter for lemma - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLemma() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_lemma);}
    
  /** setter for lemma - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemma(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_lemma, v);}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: x

  /** getter for x - gets 
   * @generated
   * @return value of the feature 
   */
  public String getX() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_x);}
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_x, v);}    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public String getY() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_y);}
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_y, v);}    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReference() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_reference);}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_reference, v);}    
   
    
  //*--------------*
  //* Feature: x2

  /** getter for x2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getX2() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_x2 == null)
      jcasType.jcas.throwFeatMissing("x2", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_x2);}
    
  /** setter for x2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX2(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_x2 == null)
      jcasType.jcas.throwFeatMissing("x2", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_x2, v);}    
   
    
  //*--------------*
  //* Feature: y2

  /** getter for y2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getY2() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_y2 == null)
      jcasType.jcas.throwFeatMissing("y2", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_y2);}
    
  /** setter for y2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY2(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_y2 == null)
      jcasType.jcas.throwFeatMissing("y2", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_y2, v);}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBegin() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEnd() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: color

  /** getter for color - gets 
   * @generated
   * @return value of the feature 
   */
  public String getColor() {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_color == null)
      jcasType.jcas.throwFeatMissing("color", "org.texttechnologylab.annotation.type.PropNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_color);}
    
  /** setter for color - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setColor(String v) {
    if (PropNode_Type.featOkTst && ((PropNode_Type)jcasType).casFeat_color == null)
      jcasType.jcas.throwFeatMissing("color", "org.texttechnologylab.annotation.type.PropNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type)jcasType).casFeatCode_color, v);}    
  }

    