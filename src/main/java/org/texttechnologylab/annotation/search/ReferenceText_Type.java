
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.search;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Reference Text of TextSearch. Result of the search. It can be a list of text or a single text or a summary of the text or a label of the text.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class ReferenceText_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ReferenceText.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.search.ReferenceText");
 
  /** @generated */
  final Feature casFeat_methods;
  /** @generated */
  final int     casFeatCode_methods;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMethods(int addr) {
        if (featOkTst && casFeat_methods == null)
      jcas.throwFeatMissing("methods", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_methods);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMethods(int addr, String v) {
        if (featOkTst && casFeat_methods == null)
      jcas.throwFeatMissing("methods", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_methods, v);}
    
  
 
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
      jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_group);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGroup(int addr, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_group, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_url;
  /** @generated */
  final int     casFeatCode_url;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUrl(int addr) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_url);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUrl(int addr, String v) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_url, v);}
    
  
 
  /** @generated */
  final Feature casFeat_success;
  /** @generated */
  final int     casFeatCode_success;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getSuccess(int addr) {
        if (featOkTst && casFeat_success == null)
      jcas.throwFeatMissing("success", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_success);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuccess(int addr, boolean v) {
        if (featOkTst && casFeat_success == null)
      jcas.throwFeatMissing("success", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_success, v);}
    
  
 
  /** @generated */
  final Feature casFeat_priority;
  /** @generated */
  final int     casFeatCode_priority;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPriority(int addr) {
        if (featOkTst && casFeat_priority == null)
      jcas.throwFeatMissing("priority", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getIntValue(addr, casFeatCode_priority);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPriority(int addr, int v) {
        if (featOkTst && casFeat_priority == null)
      jcas.throwFeatMissing("priority", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setIntValue(addr, casFeatCode_priority, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dateTime;
  /** @generated */
  final int     casFeatCode_dateTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDateTime(int addr) {
        if (featOkTst && casFeat_dateTime == null)
      jcas.throwFeatMissing("dateTime", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_dateTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDateTime(int addr, String v) {
        if (featOkTst && casFeat_dateTime == null)
      jcas.throwFeatMissing("dateTime", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_dateTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_summary;
  /** @generated */
  final int     casFeatCode_summary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSummary(int addr) {
        if (featOkTst && casFeat_summary == null)
      jcas.throwFeatMissing("summary", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_summary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSummary(int addr, String v) {
        if (featOkTst && casFeat_summary == null)
      jcas.throwFeatMissing("summary", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_summary, v);}
    
  
 
  /** @generated */
  final Feature casFeat_infos;
  /** @generated */
  final int     casFeatCode_infos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInfos(int addr) {
        if (featOkTst && casFeat_infos == null)
      jcas.throwFeatMissing("infos", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_infos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInfos(int addr, String v) {
        if (featOkTst && casFeat_infos == null)
      jcas.throwFeatMissing("infos", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_infos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reference;
  /** @generated */
  final int     casFeatCode_reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.search.ReferenceText");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.search.ReferenceText");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ReferenceText_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_methods = jcas.getRequiredFeatureDE(casType, "methods", "uima.cas.String", featOkTst);
    casFeatCode_methods  = (null == casFeat_methods) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_methods).getCode();

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.String", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_url = jcas.getRequiredFeatureDE(casType, "url", "uima.cas.String", featOkTst);
    casFeatCode_url  = (null == casFeat_url) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_url).getCode();

 
    casFeat_success = jcas.getRequiredFeatureDE(casType, "success", "uima.cas.Boolean", featOkTst);
    casFeatCode_success  = (null == casFeat_success) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_success).getCode();

 
    casFeat_priority = jcas.getRequiredFeatureDE(casType, "priority", "uima.cas.Integer", featOkTst);
    casFeatCode_priority  = (null == casFeat_priority) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_priority).getCode();

 
    casFeat_dateTime = jcas.getRequiredFeatureDE(casType, "dateTime", "uima.cas.String", featOkTst);
    casFeatCode_dateTime  = (null == casFeat_dateTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dateTime).getCode();

 
    casFeat_summary = jcas.getRequiredFeatureDE(casType, "summary", "uima.cas.String", featOkTst);
    casFeatCode_summary  = (null == casFeat_summary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_summary).getCode();

 
    casFeat_infos = jcas.getRequiredFeatureDE(casType, "infos", "uima.cas.String", featOkTst);
    casFeatCode_infos  = (null == casFeat_infos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_infos).getCode();

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "org.texttechnologylab.type.search.TextSearch", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

  }
}



    