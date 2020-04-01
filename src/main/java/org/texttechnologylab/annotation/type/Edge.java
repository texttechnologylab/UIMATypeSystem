

/* First created by JCasGen Fri Mar 20 09:03:02 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Apr 01 10:15:13 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyOrientation.xml
 * @generated */
public class Edge extends GraphBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Edge.class);
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
  protected Edge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Edge(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Edge(JCas jcas) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getSource() {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.Edge");
    return (Node)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Edge_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Node v) {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.Edge");
    jcasType.ll_cas.ll_setRefValue(addr, ((Edge_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getTarget() {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.type.Edge");
    return (Node)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Edge_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(Node v) {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.type.Edge");
    jcasType.ll_cas.ll_setRefValue(addr, ((Edge_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: attribute

  /** getter for attribute - gets 
   * @generated
   * @return value of the feature 
   */
  public Attribute getAttribute() {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_attribute == null)
      jcasType.jcas.throwFeatMissing("attribute", "org.texttechnologylab.annotation.type.Edge");
    return (Attribute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Edge_Type)jcasType).casFeatCode_attribute)));}
    
  /** setter for attribute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttribute(Attribute v) {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_attribute == null)
      jcasType.jcas.throwFeatMissing("attribute", "org.texttechnologylab.annotation.type.Edge");
    jcasType.ll_cas.ll_setRefValue(addr, ((Edge_Type)jcasType).casFeatCode_attribute, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: edgetype

  /** getter for edgetype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEdgetype() {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_edgetype == null)
      jcasType.jcas.throwFeatMissing("edgetype", "org.texttechnologylab.annotation.type.Edge");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Edge_Type)jcasType).casFeatCode_edgetype);}
    
  /** setter for edgetype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdgetype(String v) {
    if (Edge_Type.featOkTst && ((Edge_Type)jcasType).casFeat_edgetype == null)
      jcasType.jcas.throwFeatMissing("edgetype", "org.texttechnologylab.annotation.type.Edge");
    jcasType.ll_cas.ll_setStringValue(addr, ((Edge_Type)jcasType).casFeatCode_edgetype, v);}    
  }

    