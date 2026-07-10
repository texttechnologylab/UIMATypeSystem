
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotation represents a (unidirectional) Link between a Document and another Document, linking offsets (can be in same Doc)
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class OLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.link.OLink");
 
  /** @generated */
  final Feature casFeat_from;
  /** @generated */
  final int     casFeatCode_from;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrom(int addr) {
        if (featOkTst && casFeat_from == null)
      jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.OLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_from);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrom(int addr, String v) {
        if (featOkTst && casFeat_from == null)
      jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.OLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_from, v);}
    
  
 
  /** @generated */
  final Feature casFeat_to;
  /** @generated */
  final int     casFeatCode_to;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTo(int addr) {
        if (featOkTst && casFeat_to == null)
      jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.OLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_to);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTo(int addr, String v) {
        if (featOkTst && casFeat_to == null)
      jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.OLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_to, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fromBegin;
  /** @generated */
  final int     casFeatCode_fromBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFromBegin(int addr) {
        if (featOkTst && casFeat_fromBegin == null)
      jcas.throwFeatMissing("fromBegin", "org.texttechnologylab.annotation.link.OLink");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fromBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFromBegin(int addr, int v) {
        if (featOkTst && casFeat_fromBegin == null)
      jcas.throwFeatMissing("fromBegin", "org.texttechnologylab.annotation.link.OLink");
    ll_cas.ll_setIntValue(addr, casFeatCode_fromBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fromEnd;
  /** @generated */
  final int     casFeatCode_fromEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFromEnd(int addr) {
        if (featOkTst && casFeat_fromEnd == null)
      jcas.throwFeatMissing("fromEnd", "org.texttechnologylab.annotation.link.OLink");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fromEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFromEnd(int addr, int v) {
        if (featOkTst && casFeat_fromEnd == null)
      jcas.throwFeatMissing("fromEnd", "org.texttechnologylab.annotation.link.OLink");
    ll_cas.ll_setIntValue(addr, casFeatCode_fromEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_toBegin;
  /** @generated */
  final int     casFeatCode_toBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getToBegin(int addr) {
        if (featOkTst && casFeat_toBegin == null)
      jcas.throwFeatMissing("toBegin", "org.texttechnologylab.annotation.link.OLink");
    return ll_cas.ll_getIntValue(addr, casFeatCode_toBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setToBegin(int addr, int v) {
        if (featOkTst && casFeat_toBegin == null)
      jcas.throwFeatMissing("toBegin", "org.texttechnologylab.annotation.link.OLink");
    ll_cas.ll_setIntValue(addr, casFeatCode_toBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_toEnd;
  /** @generated */
  final int     casFeatCode_toEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getToEnd(int addr) {
        if (featOkTst && casFeat_toEnd == null)
      jcas.throwFeatMissing("toEnd", "org.texttechnologylab.annotation.link.OLink");
    return ll_cas.ll_getIntValue(addr, casFeatCode_toEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setToEnd(int addr, int v) {
        if (featOkTst && casFeat_toEnd == null)
      jcas.throwFeatMissing("toEnd", "org.texttechnologylab.annotation.link.OLink");
    ll_cas.ll_setIntValue(addr, casFeatCode_toEnd, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_from = jcas.getRequiredFeatureDE(casType, "from", "uima.cas.String", featOkTst);
    casFeatCode_from  = (null == casFeat_from) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_from).getCode();

 
    casFeat_to = jcas.getRequiredFeatureDE(casType, "to", "uima.cas.String", featOkTst);
    casFeatCode_to  = (null == casFeat_to) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_to).getCode();

 
    casFeat_fromBegin = jcas.getRequiredFeatureDE(casType, "fromBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_fromBegin  = (null == casFeat_fromBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fromBegin).getCode();

 
    casFeat_fromEnd = jcas.getRequiredFeatureDE(casType, "fromEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_fromEnd  = (null == casFeat_fromEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fromEnd).getCode();

 
    casFeat_toBegin = jcas.getRequiredFeatureDE(casType, "toBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_toBegin  = (null == casFeat_toBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_toBegin).getCode();

 
    casFeat_toEnd = jcas.getRequiredFeatureDE(casType, "toEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_toEnd  = (null == casFeat_toEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_toEnd).getCode();

  }
}



    