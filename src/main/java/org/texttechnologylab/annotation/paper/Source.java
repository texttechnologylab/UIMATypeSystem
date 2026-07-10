

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Source extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Source.class);
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
  protected Source() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Source(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Source(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Source(JCas jcas, int begin, int end) {
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
  //* Feature: doi

  /** getter for doi - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDoi() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_doi == null)
      jcasType.jcas.throwFeatMissing("doi", "org.texttechnologylab.annotation.paper.Source");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Source_Type)jcasType).casFeatCode_doi);}
    
  /** setter for doi - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDoi(String v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_doi == null)
      jcasType.jcas.throwFeatMissing("doi", "org.texttechnologylab.annotation.paper.Source");
    jcasType.ll_cas.ll_setStringValue(addr, ((Source_Type)jcasType).casFeatCode_doi, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.paper.Source");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Source_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.paper.Source");
    jcasType.ll_cas.ll_setStringValue(addr, ((Source_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: authors

  /** getter for authors - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getAuthors() {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_authors == null)
      jcasType.jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_authors)));}
    
  /** setter for authors - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthors(StringArray v) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_authors == null)
      jcasType.jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    jcasType.ll_cas.ll_setRefValue(addr, ((Source_Type)jcasType).casFeatCode_authors, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for authors - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getAuthors(int i) {
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_authors == null)
      jcasType.jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_authors), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_authors), i);}

  /** indexed setter for authors - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAuthors(int i, String v) { 
    if (Source_Type.featOkTst && ((Source_Type)jcasType).casFeat_authors == null)
      jcasType.jcas.throwFeatMissing("authors", "org.texttechnologylab.annotation.paper.Source");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_authors), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Source_Type)jcasType).casFeatCode_authors), i, v);}
  }

    