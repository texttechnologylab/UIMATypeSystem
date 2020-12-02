
/* First created by JCasGen Wed Dec 02 18:39:09 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:09 CET 2020
 * @generated */
public class PropEdge_Type extends Edge_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PropEdge.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.PropEdge");
 
  /** @generated */
  final Feature casFeat_mode;
  /** @generated */
  final int     casFeatCode_mode;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMode(int addr) {
        if (featOkTst && casFeat_mode == null)
      jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.PropEdge");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mode);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMode(int addr, String v) {
        if (featOkTst && casFeat_mode == null)
      jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.PropEdge");
    ll_cas.ll_setStringValue(addr, casFeatCode_mode, v);}
    
  
 
  /** @generated */
  final Feature casFeat_graphSource;
  /** @generated */
  final int     casFeatCode_graphSource;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGraphSource(int addr) {
        if (featOkTst && casFeat_graphSource == null)
      jcas.throwFeatMissing("graphSource", "org.texttechnologylab.annotation.type.PropEdge");
    return ll_cas.ll_getStringValue(addr, casFeatCode_graphSource);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGraphSource(int addr, String v) {
        if (featOkTst && casFeat_graphSource == null)
      jcas.throwFeatMissing("graphSource", "org.texttechnologylab.annotation.type.PropEdge");
    ll_cas.ll_setStringValue(addr, casFeatCode_graphSource, v);}
    
  
 
  /** @generated */
  final Feature casFeat_graphTarget;
  /** @generated */
  final int     casFeatCode_graphTarget;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGraphTarget(int addr) {
        if (featOkTst && casFeat_graphTarget == null)
      jcas.throwFeatMissing("graphTarget", "org.texttechnologylab.annotation.type.PropEdge");
    return ll_cas.ll_getStringValue(addr, casFeatCode_graphTarget);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGraphTarget(int addr, String v) {
        if (featOkTst && casFeat_graphTarget == null)
      jcas.throwFeatMissing("graphTarget", "org.texttechnologylab.annotation.type.PropEdge");
    ll_cas.ll_setStringValue(addr, casFeatCode_graphTarget, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PropEdge_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_mode = jcas.getRequiredFeatureDE(casType, "mode", "uima.cas.String", featOkTst);
    casFeatCode_mode  = (null == casFeat_mode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mode).getCode();

 
    casFeat_graphSource = jcas.getRequiredFeatureDE(casType, "graphSource", "uima.cas.String", featOkTst);
    casFeatCode_graphSource  = (null == casFeat_graphSource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_graphSource).getCode();

 
    casFeat_graphTarget = jcas.getRequiredFeatureDE(casType, "graphTarget", "uima.cas.String", featOkTst);
    casFeatCode_graphTarget  = (null == casFeat_graphTarget) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_graphTarget).getCode();

  }
}



    