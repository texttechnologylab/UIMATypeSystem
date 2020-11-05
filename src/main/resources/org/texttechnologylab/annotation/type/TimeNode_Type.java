
/* First created by JCasGen Thu Nov 05 17:32:55 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Nov 05 17:32:55 CET 2020
 * @generated */
public class TimeNode_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeNode.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.TimeNode");
 
  /** @generated */
  final Feature casFeat_xPos;
  /** @generated */
  final int     casFeatCode_xPos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getXPos(int addr) {
        if (featOkTst && casFeat_xPos == null)
      jcas.throwFeatMissing("xPos", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_xPos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setXPos(int addr, int v) {
        if (featOkTst && casFeat_xPos == null)
      jcas.throwFeatMissing("xPos", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_xPos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_depth;
  /** @generated */
  final int     casFeatCode_depth;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDepth(int addr) {
        if (featOkTst && casFeat_depth == null)
      jcas.throwFeatMissing("depth", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_depth);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDepth(int addr, int v) {
        if (featOkTst && casFeat_depth == null)
      jcas.throwFeatMissing("depth", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_depth, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subvalue;
  /** @generated */
  final int     casFeatCode_subvalue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubvalue(int addr) {
        if (featOkTst && casFeat_subvalue == null)
      jcas.throwFeatMissing("subvalue", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subvalue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubvalue(int addr, String v) {
        if (featOkTst && casFeat_subvalue == null)
      jcas.throwFeatMissing("subvalue", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_subvalue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
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
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nodes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNodes(int addr, int v) {
        if (featOkTst && casFeat_nodes == null)
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setRefValue(addr, casFeatCode_nodes, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getNodes(int addr, int i) {
        if (featOkTst && casFeat_nodes == null)
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeNode");
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
      jcas.throwFeatMissing("nodes", "org.texttechnologylab.annotation.type.TimeNode");
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
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getRefValue(addr, casFeatCode_edges);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEdges(int addr, int v) {
        if (featOkTst && casFeat_edges == null)
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setRefValue(addr, casFeatCode_edges, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEdges(int addr, int i) {
        if (featOkTst && casFeat_edges == null)
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeNode");
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
      jcas.throwFeatMissing("edges", "org.texttechnologylab.annotation.type.TimeNode");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_end);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, String v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_x;
  /** @generated */
  final int     casFeatCode_x;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getX(int addr) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_x);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setX(int addr, int v) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_x, v);}
    
  
 
  /** @generated */
  final Feature casFeat_y;
  /** @generated */
  final int     casFeatCode_y;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getY(int addr) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getIntValue(addr, casFeatCode_y);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setY(int addr, int v) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setIntValue(addr, casFeatCode_y, v);}
    
  
 
  /** @generated */
  final Feature casFeat_additionalvalue;
  /** @generated */
  final int     casFeatCode_additionalvalue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAdditionalvalue(int addr) {
        if (featOkTst && casFeat_additionalvalue == null)
      jcas.throwFeatMissing("additionalvalue", "org.texttechnologylab.annotation.type.TimeNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_additionalvalue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdditionalvalue(int addr, String v) {
        if (featOkTst && casFeat_additionalvalue == null)
      jcas.throwFeatMissing("additionalvalue", "org.texttechnologylab.annotation.type.TimeNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_additionalvalue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeNode_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_xPos = jcas.getRequiredFeatureDE(casType, "xPos", "uima.cas.Integer", featOkTst);
    casFeatCode_xPos  = (null == casFeat_xPos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_xPos).getCode();

 
    casFeat_depth = jcas.getRequiredFeatureDE(casType, "depth", "uima.cas.Integer", featOkTst);
    casFeatCode_depth  = (null == casFeat_depth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_depth).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_subvalue = jcas.getRequiredFeatureDE(casType, "subvalue", "uima.cas.String", featOkTst);
    casFeatCode_subvalue  = (null == casFeat_subvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subvalue).getCode();

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_nodes = jcas.getRequiredFeatureDE(casType, "nodes", "uima.cas.FSArray", featOkTst);
    casFeatCode_nodes  = (null == casFeat_nodes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nodes).getCode();

 
    casFeat_edges = jcas.getRequiredFeatureDE(casType, "edges", "uima.cas.FSArray", featOkTst);
    casFeatCode_edges  = (null == casFeat_edges) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_edges).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.String", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.Integer", featOkTst);
    casFeatCode_x  = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_x).getCode();

 
    casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.Integer", featOkTst);
    casFeatCode_y  = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_y).getCode();

 
    casFeat_additionalvalue = jcas.getRequiredFeatureDE(casType, "additionalvalue", "uima.cas.String", featOkTst);
    casFeatCode_additionalvalue  = (null == casFeat_additionalvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_additionalvalue).getCode();

  }
}



    