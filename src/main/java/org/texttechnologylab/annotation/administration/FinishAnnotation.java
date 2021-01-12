

/* First created by JCasGen Tue Jan 12 18:42:49 CET 2021 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;


/** 
 * Updated by JCasGen Tue Jan 12 18:42:49 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class FinishAnnotation extends DocumentMetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FinishAnnotation.class);
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
  protected FinishAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FinishAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FinishAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FinishAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: user

  /** getter for user - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUser() {
    if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FinishAnnotation_Type)jcasType).casFeatCode_user);}
    
  /** setter for user - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((FinishAnnotation_Type)jcasType).casFeatCode_user, v);}    
   
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FinishAnnotation_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((FinishAnnotation_Type)jcasType).casFeatCode_comment, v);}    
   
    
  //*--------------*
  //* Feature: tool

  /** getter for tool - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTool() {
    if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type)jcasType).casFeat_tool == null)
      jcasType.jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FinishAnnotation_Type)jcasType).casFeatCode_tool);}
    
  /** setter for tool - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTool(String v) {
    if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type)jcasType).casFeat_tool == null)
      jcasType.jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((FinishAnnotation_Type)jcasType).casFeatCode_tool, v);}    
  }

    