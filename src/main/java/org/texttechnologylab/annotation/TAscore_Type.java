
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** TextAnalyzer scores.
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class TAscore_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TAscore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.TAscore");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.TAscore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.TAscore");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.TAscore");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.TAscore");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_group;
  /** @generated */
  final int     casFeatCode_group;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.TAscore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_group);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGroup(int addr, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.TAscore");
    ll_cas.ll_setStringValue(addr, casFeatCode_group, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ref;
  /** @generated */
  final int     casFeatCode_ref;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRef(int addr) {
        if (featOkTst && casFeat_ref == null)
      jcas.throwFeatMissing("ref", "org.texttechnologylab.annotation.TAscore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ref);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRef(int addr, int v) {
        if (featOkTst && casFeat_ref == null)
      jcas.throwFeatMissing("ref", "org.texttechnologylab.annotation.TAscore");
    ll_cas.ll_setRefValue(addr, casFeatCode_ref, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TAscore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.String", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_ref = jcas.getRequiredFeatureDE(casType, "ref", "uima.tcas.Annotation", featOkTst);
    casFeatCode_ref  = (null == casFeat_ref) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ref).getCode();

  }
}



    