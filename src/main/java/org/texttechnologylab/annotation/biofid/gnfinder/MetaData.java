

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MetaData extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
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
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaData(JCas jcas) {
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
  //* Feature: date

  /** getter for date - gets The date of running a GNfinder query.
   * @generated
   * @return value of the feature 
   */
  public String getDate() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_date);}
    
  /** setter for date - sets The date of running a GNfinder query. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_date, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets The version of GNfinder.
   * @generated
   * @return value of the feature 
   */
  public String getVersion() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets The version of GNfinder. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_version, v);}    
   
    
  //*--------------*
  //* Feature: language

  /** getter for language - gets Indicates the language that was used for calculation of Bayes' odds.
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets Indicates the language that was used for calculation of Bayes' odds. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: other

  /** getter for other - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getOther() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_other == null)
      jcasType.jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_other)));}
    
  /** setter for other - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOther(FSArray v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_other == null)
      jcasType.jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.ll_cas.ll_setRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_other, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for other - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getOther(int i) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_other == null)
      jcasType.jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_other), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_other), i)));}

  /** indexed setter for other - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOther(int i, TOP v) { 
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_other == null)
      jcasType.jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_other), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_other), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: references

  /** getter for references - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getReferences() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_references == null)
      jcasType.jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_references)));}
    
  /** setter for references - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferences(FSArray v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_references == null)
      jcasType.jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.ll_cas.ll_setRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_references, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for references - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getReferences(int i) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_references == null)
      jcasType.jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_references), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_references), i)));}

  /** indexed setter for references - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setReferences(int i, TOP v) { 
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_references == null)
      jcasType.jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_references), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MetaData_Type)jcasType).casFeatCode_references), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    