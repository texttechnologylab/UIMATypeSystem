

   
/* Apache UIMA v3 - First created by JCasGen Thu Apr 02 16:27:24 CEST 2026 */

package org.texttechnologylab.annotation.model;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.TOP;


/** Base feature structure for storing a trained model artifact without text span offsets.
 * Updated by JCasGen Thu Apr 02 16:27:24 CEST 2026
 * XML source: D:/UniCode/Java/UIMATypeSystem/src/main/resources/desc/type/TrainedModel.xml
 * @generated */
public class TrainedModelBase extends TOP {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.model.TrainedModelBase";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TrainedModelBase.class);
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
   
  public final static String _FeatName_modelBase64 = "modelBase64";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_modelBase64 = TypeSystemImpl.createCallSite(TrainedModelBase.class, "modelBase64");
  private final static MethodHandle _FH_modelBase64 = _FC_modelBase64.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TrainedModelBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TrainedModelBase(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TrainedModelBase(JCas jcas) {
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
  //* Feature: modelBase64

  /** getter for modelBase64 - gets Base64-encoded serialized model.
   * @generated
   * @return value of the feature 
   */
  public String getModelBase64() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_modelBase64));
  }
    
  /** setter for modelBase64 - sets Base64-encoded serialized model. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelBase64(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modelBase64), v);
  }    
    
  }

    