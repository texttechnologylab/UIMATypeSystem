

/* First created by JCasGen Wed Oct 18 12:33:44 CEST 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly;


/** 
 * Updated by JCasGen Wed Oct 18 12:33:44 CEST 2023
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/AnomlySpellingTypeSystem.xml
 * @generated */
public class AnomlySpelling extends Anomaly {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnomlySpelling.class);
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
  protected AnomlySpelling() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnomlySpelling(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnomlySpelling(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnomlySpelling(JCas jcas, int begin, int end) {
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
  //* Feature: SpellingType

  /** getter for SpellingType - gets Output Type of the Spelling like wrong, skipped or unkown
   * @generated
   * @return value of the feature 
   */
  public String getSpellingType() {
    if (AnomlySpelling_Type.featOkTst && ((AnomlySpelling_Type)jcasType).casFeat_SpellingType == null)
      jcasType.jcas.throwFeatMissing("SpellingType", "org.texttechnologylab.annotation.AnomlySpelling");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnomlySpelling_Type)jcasType).casFeatCode_SpellingType);}
    
  /** setter for SpellingType - sets Output Type of the Spelling like wrong, skipped or unkown 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpellingType(String v) {
    if (AnomlySpelling_Type.featOkTst && ((AnomlySpelling_Type)jcasType).casFeat_SpellingType == null)
      jcasType.jcas.throwFeatMissing("SpellingType", "org.texttechnologylab.annotation.AnomlySpelling");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnomlySpelling_Type)jcasType).casFeatCode_SpellingType, v);}    
   
    
  //*--------------*
  //* Feature: ModelName

  /** getter for ModelName - gets The name of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelName() {
    if (AnomlySpelling_Type.featOkTst && ((AnomlySpelling_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomlySpelling");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnomlySpelling_Type)jcasType).casFeatCode_ModelName);}
    
  /** setter for ModelName - sets The name of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    if (AnomlySpelling_Type.featOkTst && ((AnomlySpelling_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomlySpelling");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnomlySpelling_Type)jcasType).casFeatCode_ModelName, v);}    
  }

    