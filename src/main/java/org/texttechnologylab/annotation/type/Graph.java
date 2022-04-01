

/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Fri Apr 01 18:16:00 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class Graph extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Graph.class);
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
  protected Graph() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Graph(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Graph(JCas jcas) {
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
  //* Feature: nodes

  /** getter for nodes - gets Set of Nodes
   * @generated
   * @return value of the feature 
   */
  public FSArray getNodes() {
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_nodes)));}
    
  /** setter for nodes - sets Set of Nodes 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodes(FSArray v) {
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    jcasType.ll_cas.ll_setRefValue(addr, ((Graph_Type)jcasType).casFeatCode_nodes, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nodes - gets an indexed value - Set of Nodes
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Node getNodes(int i) {
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_nodes), i);
    return (Node)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_nodes), i)));}

  /** indexed setter for nodes - sets an indexed value - Set of Nodes
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNodes(int i, Node v) { 
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_nodes == null)
      jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_nodes), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_nodes), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: edges

  /** getter for edges - gets set of edges
   * @generated
   * @return value of the feature 
   */
  public FSArray getEdges() {
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_edges)));}
    
  /** setter for edges - sets set of edges 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdges(FSArray v) {
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    jcasType.ll_cas.ll_setRefValue(addr, ((Graph_Type)jcasType).casFeatCode_edges, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for edges - gets an indexed value - set of edges
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Edge getEdges(int i) {
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_edges), i);
    return (Edge)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_edges), i)));}

  /** indexed setter for edges - sets an indexed value - set of edges
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEdges(int i, Edge v) { 
    if (Graph_Type.featOkTst && ((Graph_Type)jcasType).casFeat_edges == null)
      jcasType.jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_edges), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Graph_Type)jcasType).casFeatCode_edges), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    