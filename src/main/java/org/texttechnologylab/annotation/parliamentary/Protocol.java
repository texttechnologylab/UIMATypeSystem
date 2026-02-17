

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Protocol extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Protocol.class);
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
  protected Protocol() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Protocol(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Protocol(JCas jcas) {
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
  //* Feature: electionPeriod

  /** getter for electionPeriod - gets 
   * @generated
   * @return value of the feature 
   */
  public int getElectionPeriod() {
    if (Protocol_Type.featOkTst && ((Protocol_Type)jcasType).casFeat_electionPeriod == null)
      jcasType.jcas.throwFeatMissing("electionPeriod", "org.texttechnologylab.annotation.parliamentary.Protocol");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Protocol_Type)jcasType).casFeatCode_electionPeriod);}
    
  /** setter for electionPeriod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElectionPeriod(int v) {
    if (Protocol_Type.featOkTst && ((Protocol_Type)jcasType).casFeat_electionPeriod == null)
      jcasType.jcas.throwFeatMissing("electionPeriod", "org.texttechnologylab.annotation.parliamentary.Protocol");
    jcasType.ll_cas.ll_setIntValue(addr, ((Protocol_Type)jcasType).casFeatCode_electionPeriod, v);}    
   
    
  //*--------------*
  //* Feature: sessionNumber

  /** getter for sessionNumber - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSessionNumber() {
    if (Protocol_Type.featOkTst && ((Protocol_Type)jcasType).casFeat_sessionNumber == null)
      jcasType.jcas.throwFeatMissing("sessionNumber", "org.texttechnologylab.annotation.parliamentary.Protocol");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Protocol_Type)jcasType).casFeatCode_sessionNumber);}
    
  /** setter for sessionNumber - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSessionNumber(int v) {
    if (Protocol_Type.featOkTst && ((Protocol_Type)jcasType).casFeat_sessionNumber == null)
      jcasType.jcas.throwFeatMissing("sessionNumber", "org.texttechnologylab.annotation.parliamentary.Protocol");
    jcasType.ll_cas.ll_setIntValue(addr, ((Protocol_Type)jcasType).casFeatCode_sessionNumber, v);}    
   
    
  //*--------------*
  //* Feature: date

  /** getter for date - gets 
   * @generated
   * @return value of the feature 
   */
  public double getDate() {
    if (Protocol_Type.featOkTst && ((Protocol_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.parliamentary.Protocol");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Protocol_Type)jcasType).casFeatCode_date);}
    
  /** setter for date - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(double v) {
    if (Protocol_Type.featOkTst && ((Protocol_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.parliamentary.Protocol");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Protocol_Type)jcasType).casFeatCode_date, v);}    
  }

    