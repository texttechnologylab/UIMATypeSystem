

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 17 20:04:38 CET 2026 */

package org.texttechnologylab.annotation.type;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Feb 17 20:04:38 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Graph extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.Graph";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_nodes = "nodes";
  public final static String _FeatName_edges = "edges";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_nodes = TypeSystemImpl.createCallSite(Graph.class, "nodes");
  private final static MethodHandle _FH_nodes = _FC_nodes.dynamicInvoker();
  private final static CallSite _FC_edges = TypeSystemImpl.createCallSite(Graph.class, "edges");
  private final static MethodHandle _FH_edges = _FC_edges.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Graph() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Graph(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
  public FSArray getNodes() { return (FSArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nodes)));}
    
  /** setter for nodes - sets Set of Nodes 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodes(FSArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_nodes), v);
  }    
    
    
  /** indexed getter for nodes - gets an indexed value - Set of Nodes
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Node getNodes(int i) {
     return (Node)(((FSArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nodes)))).get(i));} 

  /** indexed setter for nodes - sets an indexed value - Set of Nodes
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNodes(int i, Node v) {
    ((FSArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nodes)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: edges

  /** getter for edges - gets set of edges
   * @generated
   * @return value of the feature 
   */
  public FSArray getEdges() { return (FSArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_edges)));}
    
  /** setter for edges - sets set of edges 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdges(FSArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_edges), v);
  }    
    
    
  /** indexed getter for edges - gets an indexed value - set of edges
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Edge getEdges(int i) {
     return (Edge)(((FSArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_edges)))).get(i));} 

  /** indexed setter for edges - sets an indexed value - set of edges
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEdges(int i, Edge v) {
    ((FSArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_edges)))).set(i, v);
  }  
  }

    