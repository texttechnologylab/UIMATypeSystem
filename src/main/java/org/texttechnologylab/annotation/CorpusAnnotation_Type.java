
/* First created by JCasGen Thu Dec 17 12:26:07 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jan 13 15:18:14 CET 2023
 * @generated */
public class CorpusAnnotation_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CorpusAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.CorpusAnnotation");
 
  /** @generated */
  final Feature casFeat_license;
  /** @generated */
  final int     casFeatCode_license;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLicense(int addr) {
        if (featOkTst && casFeat_license == null)
      jcas.throwFeatMissing("license", "org.texttechnologylab.annotation.CorpusAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_license);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLicense(int addr, String v) {
        if (featOkTst && casFeat_license == null)
      jcas.throwFeatMissing("license", "org.texttechnologylab.annotation.CorpusAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_license, v);}
    
  
 
  /** @generated */
  final Feature casFeat_corpusUrl;
  /** @generated */
  final int     casFeatCode_corpusUrl;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCorpusUrl(int addr) {
        if (featOkTst && casFeat_corpusUrl == null)
      jcas.throwFeatMissing("corpusUrl", "org.texttechnologylab.annotation.CorpusAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_corpusUrl);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCorpusUrl(int addr, String v) {
        if (featOkTst && casFeat_corpusUrl == null)
      jcas.throwFeatMissing("corpusUrl", "org.texttechnologylab.annotation.CorpusAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_corpusUrl, v);}
    
  
 
  /** @generated */
  final Feature casFeat_corpusName;
  /** @generated */
  final int     casFeatCode_corpusName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCorpusName(int addr) {
        if (featOkTst && casFeat_corpusName == null)
      jcas.throwFeatMissing("corpusName", "org.texttechnologylab.annotation.CorpusAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_corpusName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCorpusName(int addr, String v) {
        if (featOkTst && casFeat_corpusName == null)
      jcas.throwFeatMissing("corpusName", "org.texttechnologylab.annotation.CorpusAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_corpusName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_author;
  /** @generated */
  final int     casFeatCode_author;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAuthor(int addr) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.CorpusAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.CorpusAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */
  final Feature casFeat_comment;
  /** @generated */
  final int     casFeatCode_comment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComment(int addr) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.CorpusAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.CorpusAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CorpusAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_license = jcas.getRequiredFeatureDE(casType, "license", "uima.cas.String", featOkTst);
    casFeatCode_license  = (null == casFeat_license) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_license).getCode();

 
    casFeat_corpusUrl = jcas.getRequiredFeatureDE(casType, "corpusUrl", "uima.cas.String", featOkTst);
    casFeatCode_corpusUrl  = (null == casFeat_corpusUrl) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_corpusUrl).getCode();

 
    casFeat_corpusName = jcas.getRequiredFeatureDE(casType, "corpusName", "uima.cas.String", featOkTst);
    casFeatCode_corpusName  = (null == casFeat_corpusName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_corpusName).getCode();

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

  }
}



    