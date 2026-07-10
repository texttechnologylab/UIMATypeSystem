
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation.luminar;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A typesystem for the Luminar AI detector, providing probabilities that a given document is AI-generated or not.
                Depending on the model, this is done on document-level only or on sequence- and document-level.
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class AIDetection_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AIDetection.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.luminar.AIDetection");
 
  /** @generated */
  final Feature casFeat_detectionScore;
  /** @generated */
  final int     casFeatCode_detectionScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getDetectionScore(int addr) {
        if (featOkTst && casFeat_detectionScore == null)
      jcas.throwFeatMissing("detectionScore", "org.texttechnologylab.annotation.luminar.AIDetection");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_detectionScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDetectionScore(int addr, double v) {
        if (featOkTst && casFeat_detectionScore == null)
      jcas.throwFeatMissing("detectionScore", "org.texttechnologylab.annotation.luminar.AIDetection");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_detectionScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_level;
  /** @generated */
  final int     casFeatCode_level;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLevel(int addr) {
        if (featOkTst && casFeat_level == null)
      jcas.throwFeatMissing("level", "org.texttechnologylab.annotation.luminar.AIDetection");
    return ll_cas.ll_getStringValue(addr, casFeatCode_level);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLevel(int addr, String v) {
        if (featOkTst && casFeat_level == null)
      jcas.throwFeatMissing("level", "org.texttechnologylab.annotation.luminar.AIDetection");
    ll_cas.ll_setStringValue(addr, casFeatCode_level, v);}
    
  
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.luminar.AIDetection");
    return ll_cas.ll_getStringValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, String v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.luminar.AIDetection");
    ll_cas.ll_setStringValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AIDetection_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_detectionScore = jcas.getRequiredFeatureDE(casType, "detectionScore", "uima.cas.Double", featOkTst);
    casFeatCode_detectionScore  = (null == casFeat_detectionScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_detectionScore).getCode();

 
    casFeat_level = jcas.getRequiredFeatureDE(casType, "level", "uima.cas.String", featOkTst);
    casFeatCode_level  = (null == casFeat_level) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_level).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "uima.cas.String", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    