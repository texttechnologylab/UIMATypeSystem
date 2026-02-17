
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.metadata;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** View Reference
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class ViewReference_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ViewReference.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.metadata.ViewReference");
 
  /** @generated */
  final Feature casFeat_SourceViewName;
  /** @generated */
  final int     casFeatCode_SourceViewName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSourceViewName(int addr) {
        if (featOkTst && casFeat_SourceViewName == null)
      jcas.throwFeatMissing("SourceViewName", "org.texttechnologylab.annotation.metadata.ViewReference");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceViewName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceViewName(int addr, String v) {
        if (featOkTst && casFeat_SourceViewName == null)
      jcas.throwFeatMissing("SourceViewName", "org.texttechnologylab.annotation.metadata.ViewReference");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceViewName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceBegin;
  /** @generated */
  final int     casFeatCode_SourceBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSourceBegin(int addr) {
        if (featOkTst && casFeat_SourceBegin == null)
      jcas.throwFeatMissing("SourceBegin", "org.texttechnologylab.annotation.metadata.ViewReference");
    return ll_cas.ll_getIntValue(addr, casFeatCode_SourceBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceBegin(int addr, int v) {
        if (featOkTst && casFeat_SourceBegin == null)
      jcas.throwFeatMissing("SourceBegin", "org.texttechnologylab.annotation.metadata.ViewReference");
    ll_cas.ll_setIntValue(addr, casFeatCode_SourceBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceEnd;
  /** @generated */
  final int     casFeatCode_SourceEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSourceEnd(int addr) {
        if (featOkTst && casFeat_SourceEnd == null)
      jcas.throwFeatMissing("SourceEnd", "org.texttechnologylab.annotation.metadata.ViewReference");
    return ll_cas.ll_getIntValue(addr, casFeatCode_SourceEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceEnd(int addr, int v) {
        if (featOkTst && casFeat_SourceEnd == null)
      jcas.throwFeatMissing("SourceEnd", "org.texttechnologylab.annotation.metadata.ViewReference");
    ll_cas.ll_setIntValue(addr, casFeatCode_SourceEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceType;
  /** @generated */
  final int     casFeatCode_SourceType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSourceType(int addr) {
        if (featOkTst && casFeat_SourceType == null)
      jcas.throwFeatMissing("SourceType", "org.texttechnologylab.annotation.metadata.ViewReference");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceType(int addr, String v) {
        if (featOkTst && casFeat_SourceType == null)
      jcas.throwFeatMissing("SourceType", "org.texttechnologylab.annotation.metadata.ViewReference");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ViewReference_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SourceViewName = jcas.getRequiredFeatureDE(casType, "SourceViewName", "uima.cas.String", featOkTst);
    casFeatCode_SourceViewName  = (null == casFeat_SourceViewName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceViewName).getCode();

 
    casFeat_SourceBegin = jcas.getRequiredFeatureDE(casType, "SourceBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_SourceBegin  = (null == casFeat_SourceBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceBegin).getCode();

 
    casFeat_SourceEnd = jcas.getRequiredFeatureDE(casType, "SourceEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_SourceEnd  = (null == casFeat_SourceEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceEnd).getCode();

 
    casFeat_SourceType = jcas.getRequiredFeatureDE(casType, "SourceType", "uima.cas.String", featOkTst);
    casFeatCode_SourceType  = (null == casFeat_SourceType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceType).getCode();

  }
}



    