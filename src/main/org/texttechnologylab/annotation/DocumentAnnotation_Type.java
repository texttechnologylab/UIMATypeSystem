
/* First created by JCasGen Wed Dec 02 17:52:07 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:55:25 CET 2020
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
  final Feature casFeat_dateDay;
  /** @generated */
  final int     casFeatCode_dateDay;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDateDay(int addr) {
        if (featOkTst && casFeat_dateDay == null)
      jcas.throwFeatMissing("dateDay", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dateDay);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDateDay(int addr, int v) {
        if (featOkTst && casFeat_dateDay == null)
      jcas.throwFeatMissing("dateDay", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_dateDay, v);}
    
  
 
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
  final Feature casFeat_dataMonth;
  /** @generated */
  final int     casFeatCode_dataMonth;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDataMonth(int addr) {
        if (featOkTst && casFeat_dataMonth == null)
      jcas.throwFeatMissing("dataMonth", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dataMonth);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDataMonth(int addr, int v) {
        if (featOkTst && casFeat_dataMonth == null)
      jcas.throwFeatMissing("dataMonth", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_dataMonth, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dataYear;
  /** @generated */
  final int     casFeatCode_dataYear;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDataYear(int addr) {
        if (featOkTst && casFeat_dataYear == null)
      jcas.throwFeatMissing("dataYear", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dataYear);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDataYear(int addr, int v) {
        if (featOkTst && casFeat_dataYear == null)
      jcas.throwFeatMissing("dataYear", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_dataYear, v);}
    
  
 
  /** @generated */
  final Feature casFeat_timestamp;
  /** @generated */
  final int     casFeatCode_timestamp;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getTimestamp(int addr) {
        if (featOkTst && casFeat_timestamp == null)
      jcas.throwFeatMissing("timestamp", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getLongValue(addr, casFeatCode_timestamp);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTimestamp(int addr, long v) {
        if (featOkTst && casFeat_timestamp == null)
      jcas.throwFeatMissing("timestamp", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setLongValue(addr, casFeatCode_timestamp, v);}
    
  
 
  /** @generated */
  final Feature casFeat_place;
  /** @generated */
  final int     casFeatCode_place;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPlace(int addr) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "org.texttechnologylab.annotation.DocumentAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_place);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPlace(int addr, String v) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "org.texttechnologylab.annotation.DocumentAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_place, v);}
    
  



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

 
    casFeat_dateDay = jcas.getRequiredFeatureDE(casType, "dateDay", "uima.cas.Integer", featOkTst);
    casFeatCode_dateDay  = (null == casFeat_dateDay) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dateDay).getCode();

 
    casFeat_subtitle = jcas.getRequiredFeatureDE(casType, "subtitle", "uima.cas.String", featOkTst);
    casFeatCode_subtitle  = (null == casFeat_subtitle) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subtitle).getCode();

 
    casFeat_dataMonth = jcas.getRequiredFeatureDE(casType, "dataMonth", "uima.cas.Integer", featOkTst);
    casFeatCode_dataMonth  = (null == casFeat_dataMonth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dataMonth).getCode();

 
    casFeat_dataYear = jcas.getRequiredFeatureDE(casType, "dataYear", "uima.cas.Integer", featOkTst);
    casFeatCode_dataYear  = (null == casFeat_dataYear) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dataYear).getCode();

 
    casFeat_timestamp = jcas.getRequiredFeatureDE(casType, "timestamp", "uima.cas.Long", featOkTst);
    casFeatCode_timestamp  = (null == casFeat_timestamp) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timestamp).getCode();

 
    casFeat_place = jcas.getRequiredFeatureDE(casType, "place", "uima.cas.String", featOkTst);
    casFeatCode_place  = (null == casFeat_place) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_place).getCode();

  }
}



    