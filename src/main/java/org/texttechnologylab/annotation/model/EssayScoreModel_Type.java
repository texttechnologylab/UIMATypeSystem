
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Essay Score Model Meta Data
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class EssayScoreModel_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EssayScoreModel.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.EssayScoreModel");
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.model.EssayScoreModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.model.EssayScoreModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ScoreReference;
  /** @generated */
  final int     casFeatCode_ScoreReference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScoreReference(int addr) {
        if (featOkTst && casFeat_ScoreReference == null)
      jcas.throwFeatMissing("ScoreReference", "org.texttechnologylab.annotation.model.EssayScoreModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ScoreReference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScoreReference(int addr, int v) {
        if (featOkTst && casFeat_ScoreReference == null)
      jcas.throwFeatMissing("ScoreReference", "org.texttechnologylab.annotation.model.EssayScoreModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_ScoreReference, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EssayScoreModel_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

 
    casFeat_ScoreReference = jcas.getRequiredFeatureDE(casType, "ScoreReference", "org.texttechnologylab.annotation.EssayScore", featOkTst);
    casFeatCode_ScoreReference  = (null == casFeat_ScoreReference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ScoreReference).getCode();

  }
}



    