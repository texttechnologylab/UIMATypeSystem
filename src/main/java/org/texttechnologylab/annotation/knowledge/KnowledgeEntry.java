

/* First created by JCasGen Tue Feb 16 16:51:35 CET 2021 */
package org.texttechnologylab.annotation.knowledge;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class KnowledgeEntry extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(KnowledgeEntry.class);
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
  protected KnowledgeEntry() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public KnowledgeEntry(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public KnowledgeEntry(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public KnowledgeEntry(JCas jcas, int begin, int end) {
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
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_uri);}
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_uri, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_source, v);}    
  }

    