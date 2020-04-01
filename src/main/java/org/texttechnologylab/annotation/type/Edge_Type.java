
/* First created by JCasGen Fri Mar 20 09:03:02 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Apr 01 10:00:20 CEST 2020
 * @generated */
public class Edge_Type extends GraphBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Edge.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Edge");
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.Edge");
    return ll_cas.ll_getRefValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, int v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.Edge");
    ll_cas.ll_setRefValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_target;
  /** @generated */
  final int     casFeatCode_target;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTarget(int addr) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.type.Edge");
    return ll_cas.ll_getRefValue(addr, casFeatCode_target);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTarget(int addr, int v) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.type.Edge");
    ll_cas.ll_setRefValue(addr, casFeatCode_target, v);}
    
  
 
  /** @generated */
  final Feature casFeat_attribute;
  /** @generated */
  final int     casFeatCode_attribute;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAttribute(int addr) {
        if (featOkTst && casFeat_attribute == null)
      jcas.throwFeatMissing("attribute", "org.texttechnologylab.annotation.type.Edge");
    return ll_cas.ll_getRefValue(addr, casFeatCode_attribute);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttribute(int addr, int v) {
        if (featOkTst && casFeat_attribute == null)
      jcas.throwFeatMissing("attribute", "org.texttechnologylab.annotation.type.Edge");
    ll_cas.ll_setRefValue(addr, casFeatCode_attribute, v);}
    
  
 
  /** @generated */
  final Feature casFeat_edgetype;
  /** @generated */
  final int     casFeatCode_edgetype;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEdgetype(int addr) {
        if (featOkTst && casFeat_edgetype == null)
      jcas.throwFeatMissing("edgetype", "org.texttechnologylab.annotation.type.Edge");
    return ll_cas.ll_getStringValue(addr, casFeatCode_edgetype);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEdgetype(int addr, String v) {
        if (featOkTst && casFeat_edgetype == null)
      jcas.throwFeatMissing("edgetype", "org.texttechnologylab.annotation.type.Edge");
    ll_cas.ll_setStringValue(addr, casFeatCode_edgetype, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Edge_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "org.texttechnologylab.annotation.type.Node", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_target = jcas.getRequiredFeatureDE(casType, "target", "org.texttechnologylab.annotation.type.Node", featOkTst);
    casFeatCode_target  = (null == casFeat_target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_target).getCode();

 
    casFeat_attribute = jcas.getRequiredFeatureDE(casType, "attribute", "org.texttechnologylab.annotation.type.Attribute", featOkTst);
    casFeatCode_attribute  = (null == casFeat_attribute) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attribute).getCode();

 
    casFeat_edgetype = jcas.getRequiredFeatureDE(casType, "edgetype", "uima.cas.String", featOkTst);
    casFeatCode_edgetype  = (null == casFeat_edgetype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_edgetype).getCode();

  }
}



    