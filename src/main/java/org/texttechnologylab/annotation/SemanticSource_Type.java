
/* First created by JCasGen Tue Jan 12 18:59:27 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.semantics.type.WordSense_Type;

/** 
 * Updated by JCasGen Fri Jan 22 17:54:52 CET 2021
 * @generated */
public class SemanticSource_Type extends WordSense_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SemanticSource.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.SemanticSource");
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.SemanticSource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.SemanticSource");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_searchResult;
  /** @generated */
  final int     casFeatCode_searchResult;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSearchResult(int addr) {
        if (featOkTst && casFeat_searchResult == null)
      jcas.throwFeatMissing("searchResult", "org.texttechnologylab.annotation.SemanticSource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_searchResult);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSearchResult(int addr, String v) {
        if (featOkTst && casFeat_searchResult == null)
      jcas.throwFeatMissing("searchResult", "org.texttechnologylab.annotation.SemanticSource");
    ll_cas.ll_setStringValue(addr, casFeatCode_searchResult, v);}
    
  
 
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
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.SemanticSource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.SemanticSource");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SemanticSource_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_searchResult = jcas.getRequiredFeatureDE(casType, "searchResult", "uima.cas.String", featOkTst);
    casFeatCode_searchResult  = (null == casFeat_searchResult) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_searchResult).getCode();

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

  }
}



    