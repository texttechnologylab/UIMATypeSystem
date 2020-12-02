
/* First created by JCasGen Wed Dec 02 17:55:07 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Dec 02 18:28:43 CET 2020
 * @generated */
public class Graph_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Graph.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Graph");
 
  /** @generated */
  final Feature casFeat_nodes;
  /** @generated */
  final int     casFeatCode_nodes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNodes(int addr) {
        if (featOkTst && casFeat_nodes == null)
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nodes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNodes(int addr, int v) {
        if (featOkTst && casFeat_nodes == null)
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    ll_cas.ll_setRefValue(addr, casFeatCode_nodes, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getNodes(int addr, int i) {
        if (featOkTst && casFeat_nodes == null)
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setNodes(int addr, int i, int v) {
        if (featOkTst && casFeat_nodes == null)
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.Graph");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_edges;
  /** @generated */
  final int     casFeatCode_edges;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEdges(int addr) {
        if (featOkTst && casFeat_edges == null)
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    return ll_cas.ll_getRefValue(addr, casFeatCode_edges);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEdges(int addr, int v) {
        if (featOkTst && casFeat_edges == null)
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    ll_cas.ll_setRefValue(addr, casFeatCode_edges, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEdges(int addr, int i) {
        if (featOkTst && casFeat_edges == null)
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEdges(int addr, int i, int v) {
        if (featOkTst && casFeat_edges == null)
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.Graph");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Graph_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_nodes = jcas.getRequiredFeatureDE(casType, "nodes", "uima.cas.FSArray", featOkTst);
    casFeatCode_nodes  = (null == casFeat_nodes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nodes).getCode();

 
    casFeat_edges = jcas.getRequiredFeatureDE(casType, "edges", "uima.cas.FSArray", featOkTst);
    casFeatCode_edges  = (null == casFeat_edges) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_edges).getCode();

  }
}



    