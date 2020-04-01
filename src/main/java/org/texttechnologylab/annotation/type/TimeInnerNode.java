

/* First created by JCasGen Fri Mar 20 09:15:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Mar 20 09:15:03 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 * @generated */
public class TimeInnerNode extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeInnerNode.class);
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
  protected TimeInnerNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeInnerNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeInnerNode(JCas jcas) {
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
  //* Feature: xPos

  /** getter for xPos - gets 
   * @generated
   * @return value of the feature 
   */
  public int getXPos() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_xPos == null)
      jcasType.jcas.throwFeatMissing("xPos", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_xPos);}
    
  /** setter for xPos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setXPos(int v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_xPos == null)
      jcasType.jcas.throwFeatMissing("xPos", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_xPos, v);}    
   
    
  //*--------------*
  //* Feature: depth

  /** getter for depth - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDepth() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_depth == null)
      jcasType.jcas.throwFeatMissing("depth", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_depth);}
    
  /** setter for depth - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDepth(int v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_depth == null)
      jcasType.jcas.throwFeatMissing("depth", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_depth, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: subvalue

  /** getter for subvalue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubvalue() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_subvalue == null)
      jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_subvalue);}
    
  /** setter for subvalue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubvalue(String v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_subvalue == null)
      jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_subvalue, v);}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEnd() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(String v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: nodes

  /** getter for nodes - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getNodes() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_nodes)));}
    
  /** setter for nodes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodes(FSArray v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_nodes, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nodes - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getNodes(int i) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_nodes), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_nodes), i)));}

  /** indexed setter for nodes - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNodes(int i, TOP v) { 
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_nodes), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_nodes), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: edges

  /** getter for edges - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getEdges() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_edges)));}
    
  /** setter for edges - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdges(FSArray v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_edges, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for edges - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getEdges(int i) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_edges), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_edges), i)));}

  /** indexed setter for edges - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEdges(int i, TOP v) { 
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_edges), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_edges), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: x

  /** getter for x - gets 
   * @generated
   * @return value of the feature 
   */
  public int getX() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_x);}
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(int v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_x, v);}    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public int getY() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_y);}
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(int v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_y, v);}    
   
    
  //*--------------*
  //* Feature: additionalvalue

  /** getter for additionalvalue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAdditionalvalue() {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_additionalvalue == null)
      jcasType.jcas.throwFeatMissing("additionalvalue", "org.texttechnologylab.annotation.type.TimeInnerNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_additionalvalue);}
    
  /** setter for additionalvalue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdditionalvalue(String v) {
    if (TimeInnerNode_Type.featOkTst && ((TimeInnerNode_Type)jcasType).casFeat_additionalvalue == null)
      jcasType.jcas.throwFeatMissing("additionalvalue", "org.texttechnologylab.annotation.type.TimeInnerNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeInnerNode_Type)jcasType).casFeatCode_additionalvalue, v);}    
  }

    