
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class Source_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Source.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.paper.Source");
 
  /** @generated */
  final Feature casFeat_doi;
  /** @generated */
  final int     casFeatCode_doi;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDoi(int addr) {
        if (featOkTst && casFeat_doi == null)
      jcas.throwFeatMissing("doi", "org.texttechnologylab.annotation.paper.Source");
    return ll_cas.ll_getStringValue(addr, casFeatCode_doi);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDoi(int addr, String v) {
        if (featOkTst && casFeat_doi == null)
      jcas.throwFeatMissing("doi", "org.texttechnologylab.annotation.paper.Source");
    ll_cas.ll_setStringValue(addr, casFeatCode_doi, v);}
    
  
 
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.paper.Source");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.paper.Source");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_authors;
  /** @generated */
  final int     casFeatCode_authors;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAuthors(int addr) {
        if (featOkTst && casFeat_authors == null)
      jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    return ll_cas.ll_getRefValue(addr, casFeatCode_authors);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthors(int addr, int v) {
        if (featOkTst && casFeat_authors == null)
      jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    ll_cas.ll_setRefValue(addr, casFeatCode_authors, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getAuthors(int addr, int i) {
        if (featOkTst && casFeat_authors == null)
      jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_authors), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_authors), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_authors), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAuthors(int addr, int i, String v) {
        if (featOkTst && casFeat_authors == null)
      jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_authors), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_authors), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_authors), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Source_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_doi = jcas.getRequiredFeatureDE(casType, "doi", "uima.cas.String", featOkTst);
    casFeatCode_doi  = (null == casFeat_doi) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_doi).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_authors = jcas.getRequiredFeatureDE(casType, "authors", "uima.cas.StringArray", featOkTst);
    casFeatCode_authors  = (null == casFeat_authors) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_authors).getCode();

  }
}



    