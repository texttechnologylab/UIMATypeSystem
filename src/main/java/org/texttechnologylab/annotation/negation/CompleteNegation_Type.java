
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.negation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class CompleteNegation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CompleteNegation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.negation.CompleteNegation");
 
  /** @generated */
  final Feature casFeat_negType;
  /** @generated */
  final int     casFeatCode_negType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegType(int addr) {
        if (featOkTst && casFeat_negType == null)
      jcas.throwFeatMissing("negType", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_negType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegType(int addr, String v) {
        if (featOkTst && casFeat_negType == null)
      jcas.throwFeatMissing("negType", "org.texttechnologylab.annotation.negation.CompleteNegation");
    ll_cas.ll_setStringValue(addr, casFeatCode_negType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_cue;
  /** @generated */
  final int     casFeatCode_cue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCue(int addr) {
        if (featOkTst && casFeat_cue == null)
      jcas.throwFeatMissing("cue", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_cue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCue(int addr, int v) {
        if (featOkTst && casFeat_cue == null)
      jcas.throwFeatMissing("cue", "org.texttechnologylab.annotation.negation.CompleteNegation");
    ll_cas.ll_setRefValue(addr, casFeatCode_cue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_event;
  /** @generated */
  final int     casFeatCode_event;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEvent(int addr) {
        if (featOkTst && casFeat_event == null)
      jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_event);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvent(int addr, int v) {
        if (featOkTst && casFeat_event == null)
      jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    ll_cas.ll_setRefValue(addr, casFeatCode_event, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEvent(int addr, int i) {
        if (featOkTst && casFeat_event == null)
      jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_event), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_event), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_event), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEvent(int addr, int i, int v) {
        if (featOkTst && casFeat_event == null)
      jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_event), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_event), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_event), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_focus;
  /** @generated */
  final int     casFeatCode_focus;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFocus(int addr) {
        if (featOkTst && casFeat_focus == null)
      jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_focus);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFocus(int addr, int v) {
        if (featOkTst && casFeat_focus == null)
      jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    ll_cas.ll_setRefValue(addr, casFeatCode_focus, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getFocus(int addr, int i) {
        if (featOkTst && casFeat_focus == null)
      jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_focus), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_focus), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_focus), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setFocus(int addr, int i, int v) {
        if (featOkTst && casFeat_focus == null)
      jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_focus), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_focus), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_focus), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_scope;
  /** @generated */
  final int     casFeatCode_scope;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScope(int addr) {
        if (featOkTst && casFeat_scope == null)
      jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scope);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScope(int addr, int v) {
        if (featOkTst && casFeat_scope == null)
      jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    ll_cas.ll_setRefValue(addr, casFeatCode_scope, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getScope(int addr, int i) {
        if (featOkTst && casFeat_scope == null)
      jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scope), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scope), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scope), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setScope(int addr, int i, int v) {
        if (featOkTst && casFeat_scope == null)
      jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scope), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scope), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scope), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_xscope;
  /** @generated */
  final int     casFeatCode_xscope;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getXscope(int addr) {
        if (featOkTst && casFeat_xscope == null)
      jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_xscope);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setXscope(int addr, int v) {
        if (featOkTst && casFeat_xscope == null)
      jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    ll_cas.ll_setRefValue(addr, casFeatCode_xscope, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getXscope(int addr, int i) {
        if (featOkTst && casFeat_xscope == null)
      jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xscope), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_xscope), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xscope), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setXscope(int addr, int i, int v) {
        if (featOkTst && casFeat_xscope == null)
      jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xscope), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_xscope), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xscope), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CompleteNegation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_negType = jcas.getRequiredFeatureDE(casType, "negType", "uima.cas.String", featOkTst);
    casFeatCode_negType  = (null == casFeat_negType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negType).getCode();

 
    casFeat_cue = jcas.getRequiredFeatureDE(casType, "cue", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token", featOkTst);
    casFeatCode_cue  = (null == casFeat_cue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cue).getCode();

 
    casFeat_event = jcas.getRequiredFeatureDE(casType, "event", "uima.cas.FSArray", featOkTst);
    casFeatCode_event  = (null == casFeat_event) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_event).getCode();

 
    casFeat_focus = jcas.getRequiredFeatureDE(casType, "focus", "uima.cas.FSArray", featOkTst);
    casFeatCode_focus  = (null == casFeat_focus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_focus).getCode();

 
    casFeat_scope = jcas.getRequiredFeatureDE(casType, "scope", "uima.cas.FSArray", featOkTst);
    casFeatCode_scope  = (null == casFeat_scope) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scope).getCode();

 
    casFeat_xscope = jcas.getRequiredFeatureDE(casType, "xscope", "uima.cas.FSArray", featOkTst);
    casFeatCode_xscope  = (null == casFeat_xscope) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_xscope).getCode();

  }
}



    