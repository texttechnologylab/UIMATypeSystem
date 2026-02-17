
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Document metadata.
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Document_Type extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Document_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Document.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.abbyy.Document");
 
  /** @generated */
  final Feature casFeat_documentName;
  /** @generated */
  final int     casFeatCode_documentName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentName(int addr) {
        if (featOkTst && casFeat_documentName == null)
      jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentName(int addr, String v) {
        if (featOkTst && casFeat_documentName == null)
      jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_version;
  /** @generated */
  final int     casFeatCode_version;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVersion(int addr) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */
  final Feature casFeat_producer;
  /** @generated */
  final int     casFeatCode_producer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getProducer(int addr) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_producer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProducer(int addr, String v) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_producer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pagesCount;
  /** @generated */
  final int     casFeatCode_pagesCount;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPagesCount(int addr) {
        if (featOkTst && casFeat_pagesCount == null)
      jcas.throwFeatMissing("pagesCount", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return ll_cas.ll_getIntValue(addr, casFeatCode_pagesCount);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPagesCount(int addr, int v) {
        if (featOkTst && casFeat_pagesCount == null)
      jcas.throwFeatMissing("pagesCount", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    ll_cas.ll_setIntValue(addr, casFeatCode_pagesCount, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mainLanguage;
  /** @generated */
  final int     casFeatCode_mainLanguage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMainLanguage(int addr) {
        if (featOkTst && casFeat_mainLanguage == null)
      jcas.throwFeatMissing("mainLanguage", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mainLanguage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMainLanguage(int addr, String v) {
        if (featOkTst && casFeat_mainLanguage == null)
      jcas.throwFeatMissing("mainLanguage", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_mainLanguage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_languages;
  /** @generated */
  final int     casFeatCode_languages;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLanguages(int addr) {
        if (featOkTst && casFeat_languages == null)
      jcas.throwFeatMissing("languages", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_languages);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguages(int addr, String v) {
        if (featOkTst && casFeat_languages == null)
      jcas.throwFeatMissing("languages", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_languages, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Document_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentName = jcas.getRequiredFeatureDE(casType, "documentName", "uima.cas.String", featOkTst);
    casFeatCode_documentName  = (null == casFeat_documentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentName).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_producer = jcas.getRequiredFeatureDE(casType, "producer", "uima.cas.String", featOkTst);
    casFeatCode_producer  = (null == casFeat_producer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_producer).getCode();

 
    casFeat_pagesCount = jcas.getRequiredFeatureDE(casType, "pagesCount", "uima.cas.Integer", featOkTst);
    casFeatCode_pagesCount  = (null == casFeat_pagesCount) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pagesCount).getCode();

 
    casFeat_mainLanguage = jcas.getRequiredFeatureDE(casType, "mainLanguage", "uima.cas.String", featOkTst);
    casFeatCode_mainLanguage  = (null == casFeat_mainLanguage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mainLanguage).getCode();

 
    casFeat_languages = jcas.getRequiredFeatureDE(casType, "languages", "uima.cas.String", featOkTst);
    casFeatCode_languages  = (null == casFeat_languages) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_languages).getCode();

  }
}



    