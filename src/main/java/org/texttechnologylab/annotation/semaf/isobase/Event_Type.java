
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Apr 23 09:56:12 CEST 2020
 * @generated */
public class Event_Type extends Entity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Event.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isobase.Event");
 
  /** @generated */
  final Feature casFeat_event_class;
  /** @generated */
  final int     casFeatCode_event_class;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEvent_class(int addr) {
        if (featOkTst && casFeat_event_class == null)
      jcas.throwFeatMissing("event_class", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_event_class);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvent_class(int addr, String v) {
        if (featOkTst && casFeat_event_class == null)
      jcas.throwFeatMissing("event_class", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_event_class, v);}
    
  
 
  /** @generated */
  final Feature casFeat_polarity;
  /** @generated */
  final int     casFeatCode_polarity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPolarity(int addr) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_polarity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPolarity(int addr, String v) {
        if (featOkTst && casFeat_polarity == null)
      jcas.throwFeatMissing("polarity", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_polarity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mood;
  /** @generated */
  final int     casFeatCode_mood;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMood(int addr) {
        if (featOkTst && casFeat_mood == null)
      jcas.throwFeatMissing("mood", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mood);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMood(int addr, String v) {
        if (featOkTst && casFeat_mood == null)
      jcas.throwFeatMissing("mood", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_mood, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pos;
  /** @generated */
  final int     casFeatCode_pos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPos(int addr) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos(int addr, String v) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_pos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tense;
  /** @generated */
  final int     casFeatCode_tense;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTense(int addr) {
        if (featOkTst && casFeat_tense == null)
      jcas.throwFeatMissing("tense", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tense);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTense(int addr, String v) {
        if (featOkTst && casFeat_tense == null)
      jcas.throwFeatMissing("tense", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_tense, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aspect;
  /** @generated */
  final int     casFeatCode_aspect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAspect(int addr) {
        if (featOkTst && casFeat_aspect == null)
      jcas.throwFeatMissing("aspect", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aspect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAspect(int addr, String v) {
        if (featOkTst && casFeat_aspect == null)
      jcas.throwFeatMissing("aspect", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_aspect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_vform;
  /** @generated */
  final int     casFeatCode_vform;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVform(int addr) {
        if (featOkTst && casFeat_vform == null)
      jcas.throwFeatMissing("vform", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_vform);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVform(int addr, String v) {
        if (featOkTst && casFeat_vform == null)
      jcas.throwFeatMissing("vform", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_vform, v);}
    
  
 
  /** @generated */
  final Feature casFeat_domain;
  /** @generated */
  final int     casFeatCode_domain;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDomain(int addr) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_domain);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDomain(int addr, String v) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_domain, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lat;
  /** @generated */
  final int     casFeatCode_lat;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLat(int addr) {
        if (featOkTst && casFeat_lat == null)
      jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lat);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLat(int addr, String v) {
        if (featOkTst && casFeat_lat == null)
      jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_lat, v);}
    
  
 
  /** @generated */
  final Feature casFeat_long;
  /** @generated */
  final int     casFeatCode_long;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLong(int addr) {
        if (featOkTst && casFeat_long == null)
      jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_long);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLong(int addr, String v) {
        if (featOkTst && casFeat_long == null)
      jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_long, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elevation;
  /** @generated */
  final int     casFeatCode_elevation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElevation(int addr) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elevation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElevation(int addr, int v) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_elevation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_countable;
  /** @generated */
  final int     casFeatCode_countable;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCountable(int addr) {
        if (featOkTst && casFeat_countable == null)
      jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_countable);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountable(int addr, boolean v) {
        if (featOkTst && casFeat_countable == null)
      jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_countable, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gquant;
  /** @generated */
  final int     casFeatCode_gquant;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGquant(int addr) {
        if (featOkTst && casFeat_gquant == null)
      jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gquant);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGquant(int addr, String v) {
        if (featOkTst && casFeat_gquant == null)
      jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_gquant, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scopes;
  /** @generated */
  final int     casFeatCode_scopes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScopes(int addr) {
        if (featOkTst && casFeat_scopes == null)
      jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scopes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScopes(int addr, int v) {
        if (featOkTst && casFeat_scopes == null)
      jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_scopes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_event_frame;
  /** @generated */
  final int     casFeatCode_event_frame;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEvent_frame(int addr) {
        if (featOkTst && casFeat_event_frame == null)
      jcas.throwFeatMissing("event_frame", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_event_frame);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvent_frame(int addr, String v) {
        if (featOkTst && casFeat_event_frame == null)
      jcas.throwFeatMissing("event_frame", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_event_frame, v);}
    
  
 
  /** @generated */
  final Feature casFeat_event_type;
  /** @generated */
  final int     casFeatCode_event_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEvent_type(int addr) {
        if (featOkTst && casFeat_event_type == null)
      jcas.throwFeatMissing("event_type", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return ll_cas.ll_getStringValue(addr, casFeatCode_event_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvent_type(int addr, String v) {
        if (featOkTst && casFeat_event_type == null)
      jcas.throwFeatMissing("event_type", "org.texttechnologylab.annotation.semaf.isobase.Event");
    ll_cas.ll_setStringValue(addr, casFeatCode_event_type, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Event_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_event_class = jcas.getRequiredFeatureDE(casType, "event_class", "uima.cas.String", featOkTst);
    casFeatCode_event_class  = (null == casFeat_event_class) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_event_class).getCode();

 
    casFeat_polarity = jcas.getRequiredFeatureDE(casType, "polarity", "uima.cas.String", featOkTst);
    casFeatCode_polarity  = (null == casFeat_polarity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_polarity).getCode();

 
    casFeat_mood = jcas.getRequiredFeatureDE(casType, "mood", "uima.cas.String", featOkTst);
    casFeatCode_mood  = (null == casFeat_mood) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mood).getCode();

 
    casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "uima.cas.String", featOkTst);
    casFeatCode_pos  = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pos).getCode();

 
    casFeat_tense = jcas.getRequiredFeatureDE(casType, "tense", "uima.cas.String", featOkTst);
    casFeatCode_tense  = (null == casFeat_tense) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tense).getCode();

 
    casFeat_aspect = jcas.getRequiredFeatureDE(casType, "aspect", "uima.cas.String", featOkTst);
    casFeatCode_aspect  = (null == casFeat_aspect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aspect).getCode();

 
    casFeat_vform = jcas.getRequiredFeatureDE(casType, "vform", "uima.cas.String", featOkTst);
    casFeatCode_vform  = (null == casFeat_vform) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vform).getCode();

 
    casFeat_domain = jcas.getRequiredFeatureDE(casType, "domain", "uima.cas.String", featOkTst);
    casFeatCode_domain  = (null == casFeat_domain) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_domain).getCode();

 
    casFeat_lat = jcas.getRequiredFeatureDE(casType, "lat", "uima.cas.String", featOkTst);
    casFeatCode_lat  = (null == casFeat_lat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lat).getCode();

 
    casFeat_long = jcas.getRequiredFeatureDE(casType, "long", "uima.cas.String", featOkTst);
    casFeatCode_long  = (null == casFeat_long) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_long).getCode();

 
    casFeat_elevation = jcas.getRequiredFeatureDE(casType, "elevation", "org.texttechnologylab.annotation.semaf.isospace.Measure", featOkTst);
    casFeatCode_elevation  = (null == casFeat_elevation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elevation).getCode();

 
    casFeat_countable = jcas.getRequiredFeatureDE(casType, "countable", "uima.cas.Boolean", featOkTst);
    casFeatCode_countable  = (null == casFeat_countable) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_countable).getCode();

 
    casFeat_gquant = jcas.getRequiredFeatureDE(casType, "gquant", "uima.cas.String", featOkTst);
    casFeatCode_gquant  = (null == casFeat_gquant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gquant).getCode();

 
    casFeat_scopes = jcas.getRequiredFeatureDE(casType, "scopes", "uima.cas.FSList", featOkTst);
    casFeatCode_scopes  = (null == casFeat_scopes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scopes).getCode();

 
    casFeat_event_frame = jcas.getRequiredFeatureDE(casType, "event_frame", "uima.cas.String", featOkTst);
    casFeatCode_event_frame  = (null == casFeat_event_frame) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_event_frame).getCode();

 
    casFeat_event_type = jcas.getRequiredFeatureDE(casType, "event_type", "uima.cas.String", featOkTst);
    casFeatCode_event_type  = (null == casFeat_event_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_event_type).getCode();

  }
}



    