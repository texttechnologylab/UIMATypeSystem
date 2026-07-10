

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Agenda extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Agenda.class);
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
  protected Agenda() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Agenda(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Agenda(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Agenda(JCas jcas, int begin, int end) {
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
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Agenda_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliamentary.Agenda");
    jcasType.ll_cas.ll_setStringValue(addr, ((Agenda_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: index

  /** getter for index - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIndex() {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Agenda_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.parliamentary.Agenda");
    jcasType.ll_cas.ll_setIntValue(addr, ((Agenda_Type)jcasType).casFeatCode_index, v);}    
   
    
  //*--------------*
  //* Feature: speeches

  /** getter for speeches - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getSpeeches() {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_speeches == null)
      jcasType.jcas.throwFeatMissing("speeches", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Agenda_Type)jcasType).casFeatCode_speeches)));}
    
  /** setter for speeches - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeeches(FSList v) {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_speeches == null)
      jcasType.jcas.throwFeatMissing("speeches", "org.texttechnologylab.annotation.parliamentary.Agenda");
    jcasType.ll_cas.ll_setRefValue(addr, ((Agenda_Type)jcasType).casFeatCode_speeches, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: protocol

  /** getter for protocol - gets 
   * @generated
   * @return value of the feature 
   */
  public Protocol getProtocol() {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_protocol == null)
      jcasType.jcas.throwFeatMissing("protocol", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return (Protocol)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Agenda_Type)jcasType).casFeatCode_protocol)));}
    
  /** setter for protocol - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProtocol(Protocol v) {
    if (Agenda_Type.featOkTst && ((Agenda_Type)jcasType).casFeat_protocol == null)
      jcasType.jcas.throwFeatMissing("protocol", "org.texttechnologylab.annotation.parliamentary.Agenda");
    jcasType.ll_cas.ll_setRefValue(addr, ((Agenda_Type)jcasType).casFeatCode_protocol, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    