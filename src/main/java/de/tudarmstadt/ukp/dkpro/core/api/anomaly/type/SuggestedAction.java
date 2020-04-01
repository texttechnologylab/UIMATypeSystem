

/* First created by JCasGen Fri Mar 20 09:03:24 CET 2020 */
package de.tudarmstadt.ukp.dkpro.core.api.anomaly.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 01 09:56:51 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SuggestedAction extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SuggestedAction.class);
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
  protected SuggestedAction() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SuggestedAction(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SuggestedAction(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SuggestedAction(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: replacement

  /** getter for replacement - gets The text covered by the Anomaly annotation should be replaced with the contents of this feature.
   * @generated
   * @return value of the feature 
   */
  public String getReplacement() {
    if (SuggestedAction_Type.featOkTst && ((SuggestedAction_Type)jcasType).casFeat_replacement == null)
      jcasType.jcas.throwFeatMissing("replacement", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SuggestedAction_Type)jcasType).casFeatCode_replacement);}
    
  /** setter for replacement - sets The text covered by the Anomaly annotation should be replaced with the contents of this feature. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReplacement(String v) {
    if (SuggestedAction_Type.featOkTst && ((SuggestedAction_Type)jcasType).casFeat_replacement == null)
      jcasType.jcas.throwFeatMissing("replacement", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    jcasType.ll_cas.ll_setStringValue(addr, ((SuggestedAction_Type)jcasType).casFeatCode_replacement, v);}    
   
    
  //*--------------*
  //* Feature: certainty

  /** getter for certainty - gets A score representing how certain is this suggested action.
Usually in [0,1].
   * @generated
   * @return value of the feature 
   */
  public float getCertainty() {
    if (SuggestedAction_Type.featOkTst && ((SuggestedAction_Type)jcasType).casFeat_certainty == null)
      jcasType.jcas.throwFeatMissing("certainty", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((SuggestedAction_Type)jcasType).casFeatCode_certainty);}
    
  /** setter for certainty - sets A score representing how certain is this suggested action.
Usually in [0,1]. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCertainty(float v) {
    if (SuggestedAction_Type.featOkTst && ((SuggestedAction_Type)jcasType).casFeat_certainty == null)
      jcasType.jcas.throwFeatMissing("certainty", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    jcasType.ll_cas.ll_setFloatValue(addr, ((SuggestedAction_Type)jcasType).casFeatCode_certainty, v);}    
  }

    