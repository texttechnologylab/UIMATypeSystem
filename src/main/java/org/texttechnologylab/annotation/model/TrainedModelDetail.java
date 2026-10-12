

   
/* Apache UIMA v3 - First created by JCasGen Thu Apr 02 16:27:24 CEST 2026 */

package org.texttechnologylab.annotation.model;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Extended trained model structure including evaluation and training metadata.
 * Updated by JCasGen Thu Apr 02 16:27:24 CEST 2026
 * XML source: D:/UniCode/Java/UIMATypeSystem/src/main/resources/desc/type/TrainedModel.xml
 * @generated */
public class TrainedModelDetail extends TrainedModelBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.model.TrainedModelDetail";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_modelName = "modelName";
  public final static String _FeatName_modelVersion = "modelVersion";
  public final static String _FeatName_accuracy = "accuracy";
  public final static String _FeatName_loss = "loss";
  public final static String _FeatName_f1Macro = "f1Macro";
  public final static String _FeatName_f1Weighted = "f1Weighted";
  public final static String _FeatName_precisionMacro = "precisionMacro";
  public final static String _FeatName_precisionWeighted = "precisionWeighted";
  public final static String _FeatName_recallMacro = "recallMacro";
  public final static String _FeatName_recallWeighted = "recallWeighted";
  public final static String _FeatName_valAccuracy = "valAccuracy";
  public final static String _FeatName_valLoss = "valLoss";
  public final static String _FeatName_testAccuracy = "testAccuracy";
  public final static String _FeatName_testLoss = "testLoss";
  public final static String _FeatName_epochs = "epochs";
  public final static String _FeatName_learningRate = "learningRate";
  public final static String _FeatName_trainSamples = "trainSamples";
  public final static String _FeatName_valSamples = "valSamples";
  public final static String _FeatName_testSamples = "testSamples";
  public final static String _FeatName_framework = "framework";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_modelName = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "modelName");
  private final static MethodHandle _FH_modelName = _FC_modelName.dynamicInvoker();
  private final static CallSite _FC_modelVersion = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "modelVersion");
  private final static MethodHandle _FH_modelVersion = _FC_modelVersion.dynamicInvoker();
  private final static CallSite _FC_accuracy = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "accuracy");
  private final static MethodHandle _FH_accuracy = _FC_accuracy.dynamicInvoker();
  private final static CallSite _FC_loss = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "loss");
  private final static MethodHandle _FH_loss = _FC_loss.dynamicInvoker();
  private final static CallSite _FC_f1Macro = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "f1Macro");
  private final static MethodHandle _FH_f1Macro = _FC_f1Macro.dynamicInvoker();
  private final static CallSite _FC_f1Weighted = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "f1Weighted");
  private final static MethodHandle _FH_f1Weighted = _FC_f1Weighted.dynamicInvoker();
  private final static CallSite _FC_precisionMacro = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "precisionMacro");
  private final static MethodHandle _FH_precisionMacro = _FC_precisionMacro.dynamicInvoker();
  private final static CallSite _FC_precisionWeighted = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "precisionWeighted");
  private final static MethodHandle _FH_precisionWeighted = _FC_precisionWeighted.dynamicInvoker();
  private final static CallSite _FC_recallMacro = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "recallMacro");
  private final static MethodHandle _FH_recallMacro = _FC_recallMacro.dynamicInvoker();
  private final static CallSite _FC_recallWeighted = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "recallWeighted");
  private final static MethodHandle _FH_recallWeighted = _FC_recallWeighted.dynamicInvoker();
  private final static CallSite _FC_valAccuracy = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "valAccuracy");
  private final static MethodHandle _FH_valAccuracy = _FC_valAccuracy.dynamicInvoker();
  private final static CallSite _FC_valLoss = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "valLoss");
  private final static MethodHandle _FH_valLoss = _FC_valLoss.dynamicInvoker();
  private final static CallSite _FC_testAccuracy = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "testAccuracy");
  private final static MethodHandle _FH_testAccuracy = _FC_testAccuracy.dynamicInvoker();
  private final static CallSite _FC_testLoss = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "testLoss");
  private final static MethodHandle _FH_testLoss = _FC_testLoss.dynamicInvoker();
  private final static CallSite _FC_epochs = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "epochs");
  private final static MethodHandle _FH_epochs = _FC_epochs.dynamicInvoker();
  private final static CallSite _FC_learningRate = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "learningRate");
  private final static MethodHandle _FH_learningRate = _FC_learningRate.dynamicInvoker();
  private final static CallSite _FC_trainSamples = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "trainSamples");
  private final static MethodHandle _FH_trainSamples = _FC_trainSamples.dynamicInvoker();
  private final static CallSite _FC_valSamples = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "valSamples");
  private final static MethodHandle _FH_valSamples = _FC_valSamples.dynamicInvoker();
  private final static CallSite _FC_testSamples = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "testSamples");
  private final static MethodHandle _FH_testSamples = _FC_testSamples.dynamicInvoker();
  private final static CallSite _FC_framework = TypeSystemImpl.createCallSite(TrainedModelDetail.class, "framework");
  private final static MethodHandle _FH_framework = _FC_framework.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TrainedModelDetail() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TrainedModelDetail(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_modelName));
  }
    
  /** setter for modelName - sets Human-readable model name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modelName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: modelVersion

  /** getter for modelVersion - gets Version identifier of the trained model.
   * @generated
   * @return value of the feature 
   */
  public String getModelVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_modelVersion));
  }
    
  /** setter for modelVersion - sets Version identifier of the trained model. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modelVersion), v);
  }    
    
   
    
  //*--------------*
  //* Feature: accuracy

  /** getter for accuracy - gets Overall accuracy score.
   * @generated
   * @return value of the feature 
   */
  public double getAccuracy() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_accuracy));
  }
    
  /** setter for accuracy - sets Overall accuracy score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAccuracy(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_accuracy), v);
  }    
    
   
    
  //*--------------*
  //* Feature: loss

  /** getter for loss - gets Final loss value.
   * @generated
   * @return value of the feature 
   */
  public double getLoss() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_loss));
  }
    
  /** setter for loss - sets Final loss value. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLoss(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_loss), v);
  }    
    
   
    
  //*--------------*
  //* Feature: f1Macro

  /** getter for f1Macro - gets Macro-averaged F1 score.
   * @generated
   * @return value of the feature 
   */
  public double getF1Macro() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_f1Macro));
  }
    
  /** setter for f1Macro - sets Macro-averaged F1 score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setF1Macro(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_f1Macro), v);
  }    
    
   
    
  //*--------------*
  //* Feature: f1Weighted

  /** getter for f1Weighted - gets Weighted F1 score.
   * @generated
   * @return value of the feature 
   */
  public double getF1Weighted() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_f1Weighted));
  }
    
  /** setter for f1Weighted - sets Weighted F1 score. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setF1Weighted(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_f1Weighted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: precisionMacro

  /** getter for precisionMacro - gets Macro-averaged precision.
   * @generated
   * @return value of the feature 
   */
  public double getPrecisionMacro() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_precisionMacro));
  }
    
  /** setter for precisionMacro - sets Macro-averaged precision. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecisionMacro(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_precisionMacro), v);
  }    
    
   
    
  //*--------------*
  //* Feature: precisionWeighted

  /** getter for precisionWeighted - gets Weighted precision.
   * @generated
   * @return value of the feature 
   */
  public double getPrecisionWeighted() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_precisionWeighted));
  }
    
  /** setter for precisionWeighted - sets Weighted precision. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecisionWeighted(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_precisionWeighted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: recallMacro

  /** getter for recallMacro - gets Macro-averaged recall.
   * @generated
   * @return value of the feature 
   */
  public double getRecallMacro() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_recallMacro));
  }
    
  /** setter for recallMacro - sets Macro-averaged recall. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecallMacro(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_recallMacro), v);
  }    
    
   
    
  //*--------------*
  //* Feature: recallWeighted

  /** getter for recallWeighted - gets Weighted recall.
   * @generated
   * @return value of the feature 
   */
  public double getRecallWeighted() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_recallWeighted));
  }
    
  /** setter for recallWeighted - sets Weighted recall. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecallWeighted(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_recallWeighted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valAccuracy

  /** getter for valAccuracy - gets Validation accuracy.
   * @generated
   * @return value of the feature 
   */
  public double getValAccuracy() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_valAccuracy));
  }
    
  /** setter for valAccuracy - sets Validation accuracy. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValAccuracy(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_valAccuracy), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valLoss

  /** getter for valLoss - gets Validation loss.
   * @generated
   * @return value of the feature 
   */
  public double getValLoss() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_valLoss));
  }
    
  /** setter for valLoss - sets Validation loss. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValLoss(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_valLoss), v);
  }    
    
   
    
  //*--------------*
  //* Feature: testAccuracy

  /** getter for testAccuracy - gets Test accuracy.
   * @generated
   * @return value of the feature 
   */
  public double getTestAccuracy() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_testAccuracy));
  }
    
  /** setter for testAccuracy - sets Test accuracy. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTestAccuracy(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_testAccuracy), v);
  }    
    
   
    
  //*--------------*
  //* Feature: testLoss

  /** getter for testLoss - gets Test loss.
   * @generated
   * @return value of the feature 
   */
  public double getTestLoss() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_testLoss));
  }
    
  /** setter for testLoss - sets Test loss. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTestLoss(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_testLoss), v);
  }    
    
   
    
  //*--------------*
  //* Feature: epochs

  /** getter for epochs - gets Number of training epochs.
   * @generated
   * @return value of the feature 
   */
  public int getEpochs() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_epochs));
  }
    
  /** setter for epochs - sets Number of training epochs. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEpochs(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_epochs), v);
  }    
    
   
    
  //*--------------*
  //* Feature: learningRate

  /** getter for learningRate - gets Learning rate used during training.
   * @generated
   * @return value of the feature 
   */
  public double getLearningRate() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_learningRate));
  }
    
  /** setter for learningRate - sets Learning rate used during training. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLearningRate(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_learningRate), v);
  }    
    
   
    
  //*--------------*
  //* Feature: trainSamples

  /** getter for trainSamples - gets Number of training samples.
   * @generated
   * @return value of the feature 
   */
  public int getTrainSamples() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_trainSamples));
  }
    
  /** setter for trainSamples - sets Number of training samples. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrainSamples(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_trainSamples), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valSamples

  /** getter for valSamples - gets Number of validation samples.
   * @generated
   * @return value of the feature 
   */
  public int getValSamples() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_valSamples));
  }
    
  /** setter for valSamples - sets Number of validation samples. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValSamples(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_valSamples), v);
  }    
    
   
    
  //*--------------*
  //* Feature: testSamples

  /** getter for testSamples - gets Number of test samples.
   * @generated
   * @return value of the feature 
   */
  public int getTestSamples() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_testSamples));
  }
    
  /** setter for testSamples - sets Number of test samples. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTestSamples(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_testSamples), v);
  }    
    
   
    
  //*--------------*
  //* Feature: framework

  /** getter for framework - gets Framework used for training, for example Ray Train or PyTorch.
   * @generated
   * @return value of the feature 
   */
  public String getFramework() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_framework));
  }
    
  /** setter for framework - sets Framework used for training, for example Ray Train or PyTorch. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFramework(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_framework), v);
  }    
    
  }

    