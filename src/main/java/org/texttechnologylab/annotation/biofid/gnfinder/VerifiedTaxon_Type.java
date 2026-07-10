
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Type for verified gnfinder-recognized taxonomic names.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class VerifiedTaxon_Type extends Taxon_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = VerifiedTaxon.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
 
  /** @generated */
  final Feature casFeat_dataSourceId;
  /** @generated */
  final int     casFeatCode_dataSourceId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public short getDataSourceId(int addr) {
        if (featOkTst && casFeat_dataSourceId == null)
      jcas.throwFeatMissing("dataSourceId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getShortValue(addr, casFeatCode_dataSourceId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDataSourceId(int addr, short v) {
        if (featOkTst && casFeat_dataSourceId == null)
      jcas.throwFeatMissing("dataSourceId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setShortValue(addr, casFeatCode_dataSourceId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_recordId;
  /** @generated */
  final int     casFeatCode_recordId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRecordId(int addr) {
        if (featOkTst && casFeat_recordId == null)
      jcas.throwFeatMissing("recordId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_recordId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecordId(int addr, String v) {
        if (featOkTst && casFeat_recordId == null)
      jcas.throwFeatMissing("recordId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_recordId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_globalId;
  /** @generated */
  final int     casFeatCode_globalId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGlobalId(int addr) {
        if (featOkTst && casFeat_globalId == null)
      jcas.throwFeatMissing("globalId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_globalId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGlobalId(int addr, String v) {
        if (featOkTst && casFeat_globalId == null)
      jcas.throwFeatMissing("globalId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_globalId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_localId;
  /** @generated */
  final int     casFeatCode_localId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLocalId(int addr) {
        if (featOkTst && casFeat_localId == null)
      jcas.throwFeatMissing("localId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_localId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocalId(int addr, String v) {
        if (featOkTst && casFeat_localId == null)
      jcas.throwFeatMissing("localId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_localId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_outlink;
  /** @generated */
  final int     casFeatCode_outlink;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOutlink(int addr) {
        if (featOkTst && casFeat_outlink == null)
      jcas.throwFeatMissing("outlink", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_outlink);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOutlink(int addr, String v) {
        if (featOkTst && casFeat_outlink == null)
      jcas.throwFeatMissing("outlink", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_outlink, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sortScore;
  /** @generated */
  final int     casFeatCode_sortScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getSortScore(int addr) {
        if (featOkTst && casFeat_sortScore == null)
      jcas.throwFeatMissing("sortScore", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_sortScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSortScore(int addr, float v) {
        if (featOkTst && casFeat_sortScore == null)
      jcas.throwFeatMissing("sortScore", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setFloatValue(addr, casFeatCode_sortScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_matchedName;
  /** @generated */
  final int     casFeatCode_matchedName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMatchedName(int addr) {
        if (featOkTst && casFeat_matchedName == null)
      jcas.throwFeatMissing("matchedName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_matchedName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatchedName(int addr, String v) {
        if (featOkTst && casFeat_matchedName == null)
      jcas.throwFeatMissing("matchedName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_matchedName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_matchedCanonicalSimple;
  /** @generated */
  final int     casFeatCode_matchedCanonicalSimple;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMatchedCanonicalSimple(int addr) {
        if (featOkTst && casFeat_matchedCanonicalSimple == null)
      jcas.throwFeatMissing("matchedCanonicalSimple", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_matchedCanonicalSimple);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatchedCanonicalSimple(int addr, String v) {
        if (featOkTst && casFeat_matchedCanonicalSimple == null)
      jcas.throwFeatMissing("matchedCanonicalSimple", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_matchedCanonicalSimple, v);}
    
  
 
  /** @generated */
  final Feature casFeat_matchedCanonicalFull;
  /** @generated */
  final int     casFeatCode_matchedCanonicalFull;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMatchedCanonicalFull(int addr) {
        if (featOkTst && casFeat_matchedCanonicalFull == null)
      jcas.throwFeatMissing("matchedCanonicalFull", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_matchedCanonicalFull);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatchedCanonicalFull(int addr, String v) {
        if (featOkTst && casFeat_matchedCanonicalFull == null)
      jcas.throwFeatMissing("matchedCanonicalFull", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_matchedCanonicalFull, v);}
    
  
 
  /** @generated */
  final Feature casFeat_taxonomicStatus;
  /** @generated */
  final int     casFeatCode_taxonomicStatus;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTaxonomicStatus(int addr) {
        if (featOkTst && casFeat_taxonomicStatus == null)
      jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_taxonomicStatus);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTaxonomicStatus(int addr, String v) {
        if (featOkTst && casFeat_taxonomicStatus == null)
      jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_taxonomicStatus, v);}
    
  
 
  /** @generated */
  final Feature casFeat_currentName;
  /** @generated */
  final int     casFeatCode_currentName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCurrentName(int addr) {
        if (featOkTst && casFeat_currentName == null)
      jcas.throwFeatMissing("currentName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_currentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCurrentName(int addr, String v) {
        if (featOkTst && casFeat_currentName == null)
      jcas.throwFeatMissing("currentName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_currentName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_matchType;
  /** @generated */
  final int     casFeatCode_matchType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMatchType(int addr) {
        if (featOkTst && casFeat_matchType == null)
      jcas.throwFeatMissing("matchType", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_matchType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMatchType(int addr, String v) {
        if (featOkTst && casFeat_matchType == null)
      jcas.throwFeatMissing("matchType", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_matchType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_editDistance;
  /** @generated */
  final int     casFeatCode_editDistance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public short getEditDistance(int addr) {
        if (featOkTst && casFeat_editDistance == null)
      jcas.throwFeatMissing("editDistance", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return ll_cas.ll_getShortValue(addr, casFeatCode_editDistance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEditDistance(int addr, short v) {
        if (featOkTst && casFeat_editDistance == null)
      jcas.throwFeatMissing("editDistance", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    ll_cas.ll_setShortValue(addr, casFeatCode_editDistance, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public VerifiedTaxon_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_dataSourceId = jcas.getRequiredFeatureDE(casType, "dataSourceId", "uima.cas.Short", featOkTst);
    casFeatCode_dataSourceId  = (null == casFeat_dataSourceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dataSourceId).getCode();

 
    casFeat_recordId = jcas.getRequiredFeatureDE(casType, "recordId", "uima.cas.String", featOkTst);
    casFeatCode_recordId  = (null == casFeat_recordId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_recordId).getCode();

 
    casFeat_globalId = jcas.getRequiredFeatureDE(casType, "globalId", "uima.cas.String", featOkTst);
    casFeatCode_globalId  = (null == casFeat_globalId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_globalId).getCode();

 
    casFeat_localId = jcas.getRequiredFeatureDE(casType, "localId", "uima.cas.String", featOkTst);
    casFeatCode_localId  = (null == casFeat_localId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_localId).getCode();

 
    casFeat_outlink = jcas.getRequiredFeatureDE(casType, "outlink", "uima.cas.String", featOkTst);
    casFeatCode_outlink  = (null == casFeat_outlink) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_outlink).getCode();

 
    casFeat_sortScore = jcas.getRequiredFeatureDE(casType, "sortScore", "uima.cas.Float", featOkTst);
    casFeatCode_sortScore  = (null == casFeat_sortScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sortScore).getCode();

 
    casFeat_matchedName = jcas.getRequiredFeatureDE(casType, "matchedName", "uima.cas.String", featOkTst);
    casFeatCode_matchedName  = (null == casFeat_matchedName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchedName).getCode();

 
    casFeat_matchedCanonicalSimple = jcas.getRequiredFeatureDE(casType, "matchedCanonicalSimple", "uima.cas.String", featOkTst);
    casFeatCode_matchedCanonicalSimple  = (null == casFeat_matchedCanonicalSimple) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchedCanonicalSimple).getCode();

 
    casFeat_matchedCanonicalFull = jcas.getRequiredFeatureDE(casType, "matchedCanonicalFull", "uima.cas.String", featOkTst);
    casFeatCode_matchedCanonicalFull  = (null == casFeat_matchedCanonicalFull) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchedCanonicalFull).getCode();

 
    casFeat_taxonomicStatus = jcas.getRequiredFeatureDE(casType, "taxonomicStatus", "org.texttechnologylab.annotation.biofid.gnfinder.TaxonomicStatus", featOkTst);
    casFeatCode_taxonomicStatus  = (null == casFeat_taxonomicStatus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_taxonomicStatus).getCode();

 
    casFeat_currentName = jcas.getRequiredFeatureDE(casType, "currentName", "uima.cas.String", featOkTst);
    casFeatCode_currentName  = (null == casFeat_currentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_currentName).getCode();

 
    casFeat_matchType = jcas.getRequiredFeatureDE(casType, "matchType", "org.texttechnologylab.annotation.biofid.gnfinder.MatchType", featOkTst);
    casFeatCode_matchType  = (null == casFeat_matchType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchType).getCode();

 
    casFeat_editDistance = jcas.getRequiredFeatureDE(casType, "editDistance", "uima.cas.Short", featOkTst);
    casFeatCode_editDistance  = (null == casFeat_editDistance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_editDistance).getCode();

  }
}



    