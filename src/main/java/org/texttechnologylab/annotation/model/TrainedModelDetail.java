

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Extended trained model structure including evaluation and training metadata.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TrainedModelDetail extends TrainedModelBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TrainedModelDetail.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TrainedModelDetail() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TrainedModelDetail(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TrainedModelDetail(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: modelName

  /** getter for modelName - gets Human-readable model name.
   * @generated
   * @return value of the feature 
   */
  public String getModelName() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_modelName == null)
      jcasType.jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_modelName);}
    
  /** setter for modelName - sets Human-readable model name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_modelName == null)
      jcasType.jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setStringValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_modelName, v);}    
   
    
  //*--------------*
  //* Feature: modelVersion

  /** getter for modelVersion - gets Version identifier of the trained model.
   * @generated
   * @return value of the feature 
   */
  public String getModelVersion() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_modelVersion == null)
      jcasType.jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_modelVersion);}
    
  /** setter for modelVersion - sets Version identifier of the trained model. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelVersion(String v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_modelVersion == null)
      jcasType.jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setStringValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_modelVersion, v);}    
   
    
  //*--------------*
  //* Feature: accuracy

  /** getter for accuracy - gets Overall accuracy score.
   * @generated
   * @return value of the feature 
   */
  public double getAccuracy() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_accuracy == null)
      jcasType.jcas.throwFeatMissing("accuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_accuracy);}
    
  /** setter for accuracy - sets Overall accuracy score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAccuracy(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_accuracy == null)
      jcasType.jcas.throwFeatMissing("accuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_accuracy, v);}    
   
    
  //*--------------*
  //* Feature: loss

  /** getter for loss - gets Final loss value.
   * @generated
   * @return value of the feature 
   */
  public double getLoss() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_loss == null)
      jcasType.jcas.throwFeatMissing("loss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_loss);}
    
  /** setter for loss - sets Final loss value. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLoss(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_loss == null)
      jcasType.jcas.throwFeatMissing("loss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_loss, v);}    
   
    
  //*--------------*
  //* Feature: f1Macro

  /** getter for f1Macro - gets Macro-averaged F1 score.
   * @generated
   * @return value of the feature 
   */
  public double getF1Macro() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_f1Macro == null)
      jcasType.jcas.throwFeatMissing("f1Macro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_f1Macro);}
    
  /** setter for f1Macro - sets Macro-averaged F1 score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setF1Macro(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_f1Macro == null)
      jcasType.jcas.throwFeatMissing("f1Macro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_f1Macro, v);}    
   
    
  //*--------------*
  //* Feature: f1Weighted

  /** getter for f1Weighted - gets Weighted F1 score.
   * @generated
   * @return value of the feature 
   */
  public double getF1Weighted() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_f1Weighted == null)
      jcasType.jcas.throwFeatMissing("f1Weighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_f1Weighted);}
    
  /** setter for f1Weighted - sets Weighted F1 score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setF1Weighted(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_f1Weighted == null)
      jcasType.jcas.throwFeatMissing("f1Weighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_f1Weighted, v);}    
   
    
  //*--------------*
  //* Feature: precisionMacro

  /** getter for precisionMacro - gets Macro-averaged precision.
   * @generated
   * @return value of the feature 
   */
  public double getPrecisionMacro() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_precisionMacro == null)
      jcasType.jcas.throwFeatMissing("precisionMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_precisionMacro);}
    
  /** setter for precisionMacro - sets Macro-averaged precision. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecisionMacro(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_precisionMacro == null)
      jcasType.jcas.throwFeatMissing("precisionMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_precisionMacro, v);}    
   
    
  //*--------------*
  //* Feature: precisionWeighted

  /** getter for precisionWeighted - gets Weighted precision.
   * @generated
   * @return value of the feature 
   */
  public double getPrecisionWeighted() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_precisionWeighted == null)
      jcasType.jcas.throwFeatMissing("precisionWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_precisionWeighted);}
    
  /** setter for precisionWeighted - sets Weighted precision. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecisionWeighted(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_precisionWeighted == null)
      jcasType.jcas.throwFeatMissing("precisionWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_precisionWeighted, v);}    
   
    
  //*--------------*
  //* Feature: recallMacro

  /** getter for recallMacro - gets Macro-averaged recall.
   * @generated
   * @return value of the feature 
   */
  public double getRecallMacro() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_recallMacro == null)
      jcasType.jcas.throwFeatMissing("recallMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_recallMacro);}
    
  /** setter for recallMacro - sets Macro-averaged recall. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecallMacro(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_recallMacro == null)
      jcasType.jcas.throwFeatMissing("recallMacro", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_recallMacro, v);}    
   
    
  //*--------------*
  //* Feature: recallWeighted

  /** getter for recallWeighted - gets Weighted recall.
   * @generated
   * @return value of the feature 
   */
  public double getRecallWeighted() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_recallWeighted == null)
      jcasType.jcas.throwFeatMissing("recallWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_recallWeighted);}
    
  /** setter for recallWeighted - sets Weighted recall. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecallWeighted(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_recallWeighted == null)
      jcasType.jcas.throwFeatMissing("recallWeighted", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_recallWeighted, v);}    
   
    
  //*--------------*
  //* Feature: valAccuracy

  /** getter for valAccuracy - gets Validation accuracy.
   * @generated
   * @return value of the feature 
   */
  public double getValAccuracy() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_valAccuracy == null)
      jcasType.jcas.throwFeatMissing("valAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_valAccuracy);}
    
  /** setter for valAccuracy - sets Validation accuracy. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValAccuracy(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_valAccuracy == null)
      jcasType.jcas.throwFeatMissing("valAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_valAccuracy, v);}    
   
    
  //*--------------*
  //* Feature: valLoss

  /** getter for valLoss - gets Validation loss.
   * @generated
   * @return value of the feature 
   */
  public double getValLoss() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_valLoss == null)
      jcasType.jcas.throwFeatMissing("valLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_valLoss);}
    
  /** setter for valLoss - sets Validation loss. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValLoss(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_valLoss == null)
      jcasType.jcas.throwFeatMissing("valLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_valLoss, v);}    
   
    
  //*--------------*
  //* Feature: testAccuracy

  /** getter for testAccuracy - gets Test accuracy.
   * @generated
   * @return value of the feature 
   */
  public double getTestAccuracy() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_testAccuracy == null)
      jcasType.jcas.throwFeatMissing("testAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_testAccuracy);}
    
  /** setter for testAccuracy - sets Test accuracy. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTestAccuracy(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_testAccuracy == null)
      jcasType.jcas.throwFeatMissing("testAccuracy", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_testAccuracy, v);}    
   
    
  //*--------------*
  //* Feature: testLoss

  /** getter for testLoss - gets Test loss.
   * @generated
   * @return value of the feature 
   */
  public double getTestLoss() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_testLoss == null)
      jcasType.jcas.throwFeatMissing("testLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_testLoss);}
    
  /** setter for testLoss - sets Test loss. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTestLoss(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_testLoss == null)
      jcasType.jcas.throwFeatMissing("testLoss", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_testLoss, v);}    
   
    
  //*--------------*
  //* Feature: epochs

  /** getter for epochs - gets Number of training epochs.
   * @generated
   * @return value of the feature 
   */
  public int getEpochs() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_epochs == null)
      jcasType.jcas.throwFeatMissing("epochs", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_epochs);}
    
  /** setter for epochs - sets Number of training epochs. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEpochs(int v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_epochs == null)
      jcasType.jcas.throwFeatMissing("epochs", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_epochs, v);}    
   
    
  //*--------------*
  //* Feature: learningRate

  /** getter for learningRate - gets Learning rate used during training.
   * @generated
   * @return value of the feature 
   */
  public double getLearningRate() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_learningRate == null)
      jcasType.jcas.throwFeatMissing("learningRate", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_learningRate);}
    
  /** setter for learningRate - sets Learning rate used during training. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLearningRate(double v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_learningRate == null)
      jcasType.jcas.throwFeatMissing("learningRate", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_learningRate, v);}    
   
    
  //*--------------*
  //* Feature: trainSamples

  /** getter for trainSamples - gets Number of training samples.
   * @generated
   * @return value of the feature 
   */
  public int getTrainSamples() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_trainSamples == null)
      jcasType.jcas.throwFeatMissing("trainSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_trainSamples);}
    
  /** setter for trainSamples - sets Number of training samples. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrainSamples(int v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_trainSamples == null)
      jcasType.jcas.throwFeatMissing("trainSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_trainSamples, v);}    
   
    
  //*--------------*
  //* Feature: valSamples

  /** getter for valSamples - gets Number of validation samples.
   * @generated
   * @return value of the feature 
   */
  public int getValSamples() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_valSamples == null)
      jcasType.jcas.throwFeatMissing("valSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_valSamples);}
    
  /** setter for valSamples - sets Number of validation samples. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValSamples(int v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_valSamples == null)
      jcasType.jcas.throwFeatMissing("valSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_valSamples, v);}    
   
    
  //*--------------*
  //* Feature: testSamples

  /** getter for testSamples - gets Number of test samples.
   * @generated
   * @return value of the feature 
   */
  public int getTestSamples() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_testSamples == null)
      jcasType.jcas.throwFeatMissing("testSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_testSamples);}
    
  /** setter for testSamples - sets Number of test samples. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTestSamples(int v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_testSamples == null)
      jcasType.jcas.throwFeatMissing("testSamples", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setIntValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_testSamples, v);}    
   
    
  //*--------------*
  //* Feature: framework

  /** getter for framework - gets Framework used for training, for example Ray Train or PyTorch.
   * @generated
   * @return value of the feature 
   */
  public String getFramework() {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_framework == null)
      jcasType.jcas.throwFeatMissing("framework", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_framework);}
    
  /** setter for framework - sets Framework used for training, for example Ray Train or PyTorch. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFramework(String v) {
    if (TrainedModelDetail_Type.featOkTst && ((TrainedModelDetail_Type)jcasType).casFeat_framework == null)
      jcasType.jcas.throwFeatMissing("framework", "org.texttechnologylab.annotation.model.TrainedModelDetail");
    jcasType.ll_cas.ll_setStringValue(addr, ((TrainedModelDetail_Type)jcasType).casFeatCode_framework, v);}    
  }

    