
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Essay Score Output
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class EssayScore_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EssayScore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.EssayScore");
 
  /** @generated */
  final Feature casFeat_Value;
  /** @generated */
  final int     casFeatCode_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getValue(int addr) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.EssayScore");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, double v) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.EssayScore");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Name;
  /** @generated */
  final int     casFeatCode_Name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_Name == null)
      jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.EssayScore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_Name == null)
      jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.EssayScore");
    ll_cas.ll_setStringValue(addr, casFeatCode_Name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Reason;
  /** @generated */
  final int     casFeatCode_Reason;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReason(int addr) {
        if (featOkTst && casFeat_Reason == null)
      jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EssayScore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Reason);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReason(int addr, String v) {
        if (featOkTst && casFeat_Reason == null)
      jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EssayScore");
    ll_cas.ll_setStringValue(addr, casFeatCode_Reason, v);}
    
  
 
  /** @generated */
  final Feature casFeat_InputQuestion;
  /** @generated */
  final int     casFeatCode_InputQuestion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInputQuestion(int addr) {
        if (featOkTst && casFeat_InputQuestion == null)
      jcas.throwFeatMissing("InputQuestion", "org.texttechnologylab.annotation.EssayScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_InputQuestion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInputQuestion(int addr, int v) {
        if (featOkTst && casFeat_InputQuestion == null)
      jcas.throwFeatMissing("InputQuestion", "org.texttechnologylab.annotation.EssayScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_InputQuestion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_InputAnswer;
  /** @generated */
  final int     casFeatCode_InputAnswer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInputAnswer(int addr) {
        if (featOkTst && casFeat_InputAnswer == null)
      jcas.throwFeatMissing("InputAnswer", "org.texttechnologylab.annotation.EssayScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_InputAnswer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInputAnswer(int addr, int v) {
        if (featOkTst && casFeat_InputAnswer == null)
      jcas.throwFeatMissing("InputAnswer", "org.texttechnologylab.annotation.EssayScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_InputAnswer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_InputScene;
  /** @generated */
  final int     casFeatCode_InputScene;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInputScene(int addr) {
        if (featOkTst && casFeat_InputScene == null)
      jcas.throwFeatMissing("InputScene", "org.texttechnologylab.annotation.EssayScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_InputScene);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInputScene(int addr, int v) {
        if (featOkTst && casFeat_InputScene == null)
      jcas.throwFeatMissing("InputScene", "org.texttechnologylab.annotation.EssayScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_InputScene, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EssayScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Value = jcas.getRequiredFeatureDE(casType, "Value", "uima.cas.Double", featOkTst);
    casFeatCode_Value  = (null == casFeat_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value).getCode();

 
    casFeat_Name = jcas.getRequiredFeatureDE(casType, "Name", "uima.cas.String", featOkTst);
    casFeatCode_Name  = (null == casFeat_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Name).getCode();

 
    casFeat_Reason = jcas.getRequiredFeatureDE(casType, "Reason", "uima.cas.String", featOkTst);
    casFeatCode_Reason  = (null == casFeat_Reason) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Reason).getCode();

 
    casFeat_InputQuestion = jcas.getRequiredFeatureDE(casType, "InputQuestion", "org.texttechnologylab.annotation.AnnotationComment", featOkTst);
    casFeatCode_InputQuestion  = (null == casFeat_InputQuestion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_InputQuestion).getCode();

 
    casFeat_InputAnswer = jcas.getRequiredFeatureDE(casType, "InputAnswer", "org.texttechnologylab.annotation.AnnotationComment", featOkTst);
    casFeatCode_InputAnswer  = (null == casFeat_InputAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_InputAnswer).getCode();

 
    casFeat_InputScene = jcas.getRequiredFeatureDE(casType, "InputScene", "org.texttechnologylab.annotation.AnnotationComment", featOkTst);
    casFeatCode_InputScene  = (null == casFeat_InputScene) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_InputScene).getCode();

  }
}



    