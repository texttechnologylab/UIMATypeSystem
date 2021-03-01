

/* First created by JCasGen Mon Mar 01 15:53:28 CET 2021 */
package de.tudarmstadt.ukp.dkpro.core.api.anomaly.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Mar 01 15:55:48 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class Anomaly extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Anomaly.class);
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
  protected Anomaly() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Anomaly(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Anomaly(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Anomaly(JCas jcas, int begin, int end) {
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
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Anomaly_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    jcasType.ll_cas.ll_setStringValue(addr, ((Anomaly_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: suggestions

  /** getter for suggestions - gets An array of the suggested actions to be taken for this anomaly.
   * @generated
   * @return value of the feature 
   */
  public FSArray getSuggestions() {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_suggestions == null)
      jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type)jcasType).casFeatCode_suggestions)));}
    
  /** setter for suggestions - sets An array of the suggested actions to be taken for this anomaly. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuggestions(FSArray v) {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_suggestions == null)
      jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    jcasType.ll_cas.ll_setRefValue(addr, ((Anomaly_Type)jcasType).casFeatCode_suggestions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for suggestions - gets an indexed value - An array of the suggested actions to be taken for this anomaly.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public SuggestedAction getSuggestions(int i) {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_suggestions == null)
      jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type)jcasType).casFeatCode_suggestions), i);
    return (SuggestedAction)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type)jcasType).casFeatCode_suggestions), i)));}

  /** indexed setter for suggestions - sets an indexed value - An array of the suggested actions to be taken for this anomaly.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSuggestions(int i, SuggestedAction v) { 
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_suggestions == null)
      jcasType.jcas.throwFeatMissing("suggestions", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type)jcasType).casFeatCode_suggestions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Anomaly_Type)jcasType).casFeatCode_suggestions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCategory() {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Anomaly_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategory(String v) {
    if (Anomaly_Type.featOkTst && ((Anomaly_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly");
    jcasType.ll_cas.ll_setStringValue(addr, ((Anomaly_Type)jcasType).casFeatCode_category, v);}    
  }

    