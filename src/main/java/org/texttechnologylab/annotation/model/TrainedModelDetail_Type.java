
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Extended trained model structure including evaluation and training metadata.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class TrainedModelDetail_Type extends TrainedModelBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TrainedModelDetail.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.TrainedModelDetail");
 
  /** @generated */
  final Feature casFeat_modelName;
  /** @generated */
  final int     casFeatCode_modelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelName(int addr) {
        if (featOkTst && casFeat_modelName == null)
      jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelName(int addr, String v) {
        if (featOkTst && casFeat_modelName == null)
      jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modelVersion;
  /** @generated */
  final int     casFeatCode_modelVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelVersion(int addr) {
        if (featOkTst && casFeat_modelVersion == null)
      jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelVersion(int addr, String v) {
        if (featOkTst && casFeat_modelVersion == null)
      jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelVersion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_accuracy;
  /** @generated */
  final int     casFeatCode_accuracy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getAccuracy(int addr) {
        if (featOkTst && casFeat_accuracy == null)
      jcas.throwFeatMissing("accuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_accuracy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAccuracy(int addr, double v) {
        if (featOkTst && casFeat_accuracy == null)
      jcas.throwFeatMissing("accuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_accuracy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_loss;
  /** @generated */
  final int     casFeatCode_loss;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLoss(int addr) {
        if (featOkTst && casFeat_loss == null)
      jcas.throwFeatMissing("loss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_loss);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLoss(int addr, double v) {
        if (featOkTst && casFeat_loss == null)
      jcas.throwFeatMissing("loss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_loss, v);}
    
  
 
  /** @generated */
  final Feature casFeat_f1Macro;
  /** @generated */
  final int     casFeatCode_f1Macro;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getF1Macro(int addr) {
        if (featOkTst && casFeat_f1Macro == null)
      jcas.throwFeatMissing("f1Macro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_f1Macro);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setF1Macro(int addr, double v) {
        if (featOkTst && casFeat_f1Macro == null)
      jcas.throwFeatMissing("f1Macro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_f1Macro, v);}
    
  
 
  /** @generated */
  final Feature casFeat_f1Weighted;
  /** @generated */
  final int     casFeatCode_f1Weighted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getF1Weighted(int addr) {
        if (featOkTst && casFeat_f1Weighted == null)
      jcas.throwFeatMissing("f1Weighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_f1Weighted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setF1Weighted(int addr, double v) {
        if (featOkTst && casFeat_f1Weighted == null)
      jcas.throwFeatMissing("f1Weighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_f1Weighted, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precisionMacro;
  /** @generated */
  final int     casFeatCode_precisionMacro;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPrecisionMacro(int addr) {
        if (featOkTst && casFeat_precisionMacro == null)
      jcas.throwFeatMissing("precisionMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precisionMacro);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecisionMacro(int addr, double v) {
        if (featOkTst && casFeat_precisionMacro == null)
      jcas.throwFeatMissing("precisionMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precisionMacro, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precisionWeighted;
  /** @generated */
  final int     casFeatCode_precisionWeighted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPrecisionWeighted(int addr) {
        if (featOkTst && casFeat_precisionWeighted == null)
      jcas.throwFeatMissing("precisionWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precisionWeighted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecisionWeighted(int addr, double v) {
        if (featOkTst && casFeat_precisionWeighted == null)
      jcas.throwFeatMissing("precisionWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precisionWeighted, v);}
    
  
 
  /** @generated */
  final Feature casFeat_recallMacro;
  /** @generated */
  final int     casFeatCode_recallMacro;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRecallMacro(int addr) {
        if (featOkTst && casFeat_recallMacro == null)
      jcas.throwFeatMissing("recallMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_recallMacro);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecallMacro(int addr, double v) {
        if (featOkTst && casFeat_recallMacro == null)
      jcas.throwFeatMissing("recallMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_recallMacro, v);}
    
  
 
  /** @generated */
  final Feature casFeat_recallWeighted;
  /** @generated */
  final int     casFeatCode_recallWeighted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRecallWeighted(int addr) {
        if (featOkTst && casFeat_recallWeighted == null)
      jcas.throwFeatMissing("recallWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_recallWeighted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecallWeighted(int addr, double v) {
        if (featOkTst && casFeat_recallWeighted == null)
      jcas.throwFeatMissing("recallWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_recallWeighted, v);}
    
  
 
  /** @generated */
  final Feature casFeat_valAccuracy;
  /** @generated */
  final int     casFeatCode_valAccuracy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getValAccuracy(int addr) {
        if (featOkTst && casFeat_valAccuracy == null)
      jcas.throwFeatMissing("valAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_valAccuracy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValAccuracy(int addr, double v) {
        if (featOkTst && casFeat_valAccuracy == null)
      jcas.throwFeatMissing("valAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_valAccuracy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_valLoss;
  /** @generated */
  final int     casFeatCode_valLoss;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getValLoss(int addr) {
        if (featOkTst && casFeat_valLoss == null)
      jcas.throwFeatMissing("valLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_valLoss);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValLoss(int addr, double v) {
        if (featOkTst && casFeat_valLoss == null)
      jcas.throwFeatMissing("valLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_valLoss, v);}
    
  
 
  /** @generated */
  final Feature casFeat_testAccuracy;
  /** @generated */
  final int     casFeatCode_testAccuracy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTestAccuracy(int addr) {
        if (featOkTst && casFeat_testAccuracy == null)
      jcas.throwFeatMissing("testAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_testAccuracy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTestAccuracy(int addr, double v) {
        if (featOkTst && casFeat_testAccuracy == null)
      jcas.throwFeatMissing("testAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_testAccuracy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_testLoss;
  /** @generated */
  final int     casFeatCode_testLoss;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTestLoss(int addr) {
        if (featOkTst && casFeat_testLoss == null)
      jcas.throwFeatMissing("testLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_testLoss);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTestLoss(int addr, double v) {
        if (featOkTst && casFeat_testLoss == null)
      jcas.throwFeatMissing("testLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_testLoss, v);}
    
  
 
  /** @generated */
  final Feature casFeat_epochs;
  /** @generated */
  final int     casFeatCode_epochs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEpochs(int addr) {
        if (featOkTst && casFeat_epochs == null)
      jcas.throwFeatMissing("epochs", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getIntValue(addr, casFeatCode_epochs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEpochs(int addr, int v) {
        if (featOkTst && casFeat_epochs == null)
      jcas.throwFeatMissing("epochs", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setIntValue(addr, casFeatCode_epochs, v);}
    
  
 
  /** @generated */
  final Feature casFeat_learningRate;
  /** @generated */
  final int     casFeatCode_learningRate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLearningRate(int addr) {
        if (featOkTst && casFeat_learningRate == null)
      jcas.throwFeatMissing("learningRate", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_learningRate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLearningRate(int addr, double v) {
        if (featOkTst && casFeat_learningRate == null)
      jcas.throwFeatMissing("learningRate", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_learningRate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_trainSamples;
  /** @generated */
  final int     casFeatCode_trainSamples;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTrainSamples(int addr) {
        if (featOkTst && casFeat_trainSamples == null)
      jcas.throwFeatMissing("trainSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getIntValue(addr, casFeatCode_trainSamples);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTrainSamples(int addr, int v) {
        if (featOkTst && casFeat_trainSamples == null)
      jcas.throwFeatMissing("trainSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setIntValue(addr, casFeatCode_trainSamples, v);}
    
  
 
  /** @generated */
  final Feature casFeat_valSamples;
  /** @generated */
  final int     casFeatCode_valSamples;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getValSamples(int addr) {
        if (featOkTst && casFeat_valSamples == null)
      jcas.throwFeatMissing("valSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getIntValue(addr, casFeatCode_valSamples);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValSamples(int addr, int v) {
        if (featOkTst && casFeat_valSamples == null)
      jcas.throwFeatMissing("valSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setIntValue(addr, casFeatCode_valSamples, v);}
    
  
 
  /** @generated */
  final Feature casFeat_testSamples;
  /** @generated */
  final int     casFeatCode_testSamples;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTestSamples(int addr) {
        if (featOkTst && casFeat_testSamples == null)
      jcas.throwFeatMissing("testSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getIntValue(addr, casFeatCode_testSamples);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTestSamples(int addr, int v) {
        if (featOkTst && casFeat_testSamples == null)
      jcas.throwFeatMissing("testSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setIntValue(addr, casFeatCode_testSamples, v);}
    
  
 
  /** @generated */
  final Feature casFeat_framework;
  /** @generated */
  final int     casFeatCode_framework;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFramework(int addr) {
        if (featOkTst && casFeat_framework == null)
      jcas.throwFeatMissing("framework", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return ll_cas.ll_getStringValue(addr, casFeatCode_framework);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFramework(int addr, String v) {
        if (featOkTst && casFeat_framework == null)
      jcas.throwFeatMissing("framework", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    ll_cas.ll_setStringValue(addr, casFeatCode_framework, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TrainedModelDetail_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_modelName = jcas.getRequiredFeatureDE(casType, "modelName", "uima.cas.String", featOkTst);
    casFeatCode_modelName  = (null == casFeat_modelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelName).getCode();

 
    casFeat_modelVersion = jcas.getRequiredFeatureDE(casType, "modelVersion", "uima.cas.String", featOkTst);
    casFeatCode_modelVersion  = (null == casFeat_modelVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelVersion).getCode();

 
    casFeat_accuracy = jcas.getRequiredFeatureDE(casType, "accuracy", "uima.cas.Double", featOkTst);
    casFeatCode_accuracy  = (null == casFeat_accuracy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_accuracy).getCode();

 
    casFeat_loss = jcas.getRequiredFeatureDE(casType, "loss", "uima.cas.Double", featOkTst);
    casFeatCode_loss  = (null == casFeat_loss) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_loss).getCode();

 
    casFeat_f1Macro = jcas.getRequiredFeatureDE(casType, "f1Macro", "uima.cas.Double", featOkTst);
    casFeatCode_f1Macro  = (null == casFeat_f1Macro) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_f1Macro).getCode();

 
    casFeat_f1Weighted = jcas.getRequiredFeatureDE(casType, "f1Weighted", "uima.cas.Double", featOkTst);
    casFeatCode_f1Weighted  = (null == casFeat_f1Weighted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_f1Weighted).getCode();

 
    casFeat_precisionMacro = jcas.getRequiredFeatureDE(casType, "precisionMacro", "uima.cas.Double", featOkTst);
    casFeatCode_precisionMacro  = (null == casFeat_precisionMacro) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precisionMacro).getCode();

 
    casFeat_precisionWeighted = jcas.getRequiredFeatureDE(casType, "precisionWeighted", "uima.cas.Double", featOkTst);
    casFeatCode_precisionWeighted  = (null == casFeat_precisionWeighted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precisionWeighted).getCode();

 
    casFeat_recallMacro = jcas.getRequiredFeatureDE(casType, "recallMacro", "uima.cas.Double", featOkTst);
    casFeatCode_recallMacro  = (null == casFeat_recallMacro) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_recallMacro).getCode();

 
    casFeat_recallWeighted = jcas.getRequiredFeatureDE(casType, "recallWeighted", "uima.cas.Double", featOkTst);
    casFeatCode_recallWeighted  = (null == casFeat_recallWeighted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_recallWeighted).getCode();

 
    casFeat_valAccuracy = jcas.getRequiredFeatureDE(casType, "valAccuracy", "uima.cas.Double", featOkTst);
    casFeatCode_valAccuracy  = (null == casFeat_valAccuracy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_valAccuracy).getCode();

 
    casFeat_valLoss = jcas.getRequiredFeatureDE(casType, "valLoss", "uima.cas.Double", featOkTst);
    casFeatCode_valLoss  = (null == casFeat_valLoss) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_valLoss).getCode();

 
    casFeat_testAccuracy = jcas.getRequiredFeatureDE(casType, "testAccuracy", "uima.cas.Double", featOkTst);
    casFeatCode_testAccuracy  = (null == casFeat_testAccuracy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_testAccuracy).getCode();

 
    casFeat_testLoss = jcas.getRequiredFeatureDE(casType, "testLoss", "uima.cas.Double", featOkTst);
    casFeatCode_testLoss  = (null == casFeat_testLoss) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_testLoss).getCode();

 
    casFeat_epochs = jcas.getRequiredFeatureDE(casType, "epochs", "uima.cas.Integer", featOkTst);
    casFeatCode_epochs  = (null == casFeat_epochs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_epochs).getCode();

 
    casFeat_learningRate = jcas.getRequiredFeatureDE(casType, "learningRate", "uima.cas.Double", featOkTst);
    casFeatCode_learningRate  = (null == casFeat_learningRate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_learningRate).getCode();

 
    casFeat_trainSamples = jcas.getRequiredFeatureDE(casType, "trainSamples", "uima.cas.Integer", featOkTst);
    casFeatCode_trainSamples  = (null == casFeat_trainSamples) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trainSamples).getCode();

 
    casFeat_valSamples = jcas.getRequiredFeatureDE(casType, "valSamples", "uima.cas.Integer", featOkTst);
    casFeatCode_valSamples  = (null == casFeat_valSamples) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_valSamples).getCode();

 
    casFeat_testSamples = jcas.getRequiredFeatureDE(casType, "testSamples", "uima.cas.Integer", featOkTst);
    casFeatCode_testSamples  = (null == casFeat_testSamples) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_testSamples).getCode();

 
    casFeat_framework = jcas.getRequiredFeatureDE(casType, "framework", "uima.cas.String", featOkTst);
    casFeatCode_framework  = (null == casFeat_framework) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_framework).getCode();

  }
}



    