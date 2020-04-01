
/* First created by JCasGen Fri Mar 20 09:14:01 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData_Type;

/** 
 * Updated by JCasGen Wed Apr 01 09:57:20 CEST 2020
 * @generated */
public class DocumentAnnotation_Type extends DocumentMetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.DocumentAnnotation");
 
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
      jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */
  final Feature casFeat_publisher;
  /** @generated */
  final int     casFeatCode_publisher;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPublisher(int addr) {
        if (featOkTst && casFeat_publisher == null)
      jcas.throwFeatMissing("publisher", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_publisher);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPublisher(int addr, String v) {
        if (featOkTst && casFeat_publisher == null)
      jcas.throwFeatMissing("publisher", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_publisher, v);}
    
  
 
  /** @generated */
  final Feature casFeat_year;
  /** @generated */
  final int     casFeatCode_year;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getYear(int addr) {
        if (featOkTst && casFeat_year == null)
      jcas.throwFeatMissing("year", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_year);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setYear(int addr, int v) {
        if (featOkTst && casFeat_year == null)
      jcas.throwFeatMissing("year", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_year, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subtitle;
  /** @generated */
  final int     casFeatCode_subtitle;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubtitle(int addr) {
        if (featOkTst && casFeat_subtitle == null)
      jcas.throwFeatMissing("subtitle", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subtitle);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubtitle(int addr, String v) {
        if (featOkTst && casFeat_subtitle == null)
      jcas.throwFeatMissing("subtitle", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_subtitle, v);}
    
  
 
  /** @generated */
  final Feature casFeat_metadata;
  /** @generated */
  final int     casFeatCode_metadata;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMetadata(int addr) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_metadata);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMetadata(int addr, int v) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_metadata, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getMetadata(int addr, int i) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_metadata), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_metadata), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_metadata), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMetadata(int addr, int i, String v) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_metadata), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_metadata), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_metadata), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_publisher = jcas.getRequiredFeatureDE(casType, "publisher", "uima.cas.String", featOkTst);
    casFeatCode_publisher  = (null == casFeat_publisher) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_publisher).getCode();

 
    casFeat_year = jcas.getRequiredFeatureDE(casType, "year", "uima.cas.Integer", featOkTst);
    casFeatCode_year  = (null == casFeat_year) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_year).getCode();

 
    casFeat_subtitle = jcas.getRequiredFeatureDE(casType, "subtitle", "uima.cas.String", featOkTst);
    casFeatCode_subtitle  = (null == casFeat_subtitle) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subtitle).getCode();

 
    casFeat_metadata = jcas.getRequiredFeatureDE(casType, "metadata", "uima.cas.StringArray", featOkTst);
    casFeatCode_metadata  = (null == casFeat_metadata) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_metadata).getCode();

  }
}



    