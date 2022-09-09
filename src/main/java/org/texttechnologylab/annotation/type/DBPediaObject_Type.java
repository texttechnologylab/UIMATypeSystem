
/* First created by JCasGen Fri Sep 09 12:38:22 CEST 2022 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Sep 09 12:38:22 CEST 2022
 * @generated */
public class DBPediaObject_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DBPediaObject.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.DBPediaObject");
 
  /** @generated */
  final Feature casFeat_similarityScore;
  /** @generated */
  final int     casFeatCode_similarityScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSimilarityScore(int addr) {
        if (featOkTst && casFeat_similarityScore == null)
      jcas.throwFeatMissing("similarityScore", "org.texttechnologylab.annotation.type.DBPediaObject");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_similarityScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSimilarityScore(int addr, double v) {
        if (featOkTst && casFeat_similarityScore == null)
      jcas.throwFeatMissing("similarityScore", "org.texttechnologylab.annotation.type.DBPediaObject");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_similarityScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_percentageOfSecondRank;
  /** @generated */
  final int     casFeatCode_percentageOfSecondRank;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentageOfSecondRank(int addr) {
        if (featOkTst && casFeat_percentageOfSecondRank == null)
      jcas.throwFeatMissing("percentageOfSecondRank", "org.texttechnologylab.annotation.type.DBPediaObject");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_percentageOfSecondRank);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentageOfSecondRank(int addr, double v) {
        if (featOkTst && casFeat_percentageOfSecondRank == null)
      jcas.throwFeatMissing("percentageOfSecondRank", "org.texttechnologylab.annotation.type.DBPediaObject");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_percentageOfSecondRank, v);}
    
  
 
  /** @generated */
  final Feature casFeat_uri;
  /** @generated */
  final int     casFeatCode_uri;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUri(int addr) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.type.DBPediaObject");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uri);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUri(int addr, String v) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.type.DBPediaObject");
    ll_cas.ll_setStringValue(addr, casFeatCode_uri, v);}
    
  
 
  /** @generated */
  final Feature casFeat_types;
  /** @generated */
  final int     casFeatCode_types;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTypes(int addr) {
        if (featOkTst && casFeat_types == null)
      jcas.throwFeatMissing("types", "org.texttechnologylab.annotation.type.DBPediaObject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_types);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTypes(int addr, int v) {
        if (featOkTst && casFeat_types == null)
      jcas.throwFeatMissing("types", "org.texttechnologylab.annotation.type.DBPediaObject");
    ll_cas.ll_setRefValue(addr, casFeatCode_types, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DBPediaObject_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_similarityScore = jcas.getRequiredFeatureDE(casType, "similarityScore", "uima.cas.Double", featOkTst);
    casFeatCode_similarityScore  = (null == casFeat_similarityScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_similarityScore).getCode();

 
    casFeat_percentageOfSecondRank = jcas.getRequiredFeatureDE(casType, "percentageOfSecondRank", "uima.cas.Double", featOkTst);
    casFeatCode_percentageOfSecondRank  = (null == casFeat_percentageOfSecondRank) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_percentageOfSecondRank).getCode();

 
    casFeat_uri = jcas.getRequiredFeatureDE(casType, "uri", "uima.cas.String", featOkTst);
    casFeatCode_uri  = (null == casFeat_uri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uri).getCode();

 
    casFeat_types = jcas.getRequiredFeatureDE(casType, "types", "uima.cas.FSList", featOkTst);
    casFeatCode_types  = (null == casFeat_types) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_types).getCode();

  }
}



    