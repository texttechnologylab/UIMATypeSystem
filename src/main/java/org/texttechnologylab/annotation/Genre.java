

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Genre Output
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Genre extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Genre.class);
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
  protected Genre() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Genre(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Genre(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Genre(JCas jcas, int begin, int end) {
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
  //* Feature: Genres

  /** getter for Genres - gets Set of Genre with key and Value
   * @generated
   * @return value of the feature 
   */
  public FSArray getGenres() {
    if (Genre_Type.featOkTst && ((Genre_Type)jcasType).casFeat_Genres == null)
      jcasType.jcas.throwFeatMissing("Genres", "org.texttechnologylab.annotation.Genre");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Genre_Type)jcasType).casFeatCode_Genres)));}
    
  /** setter for Genres - sets Set of Genre with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGenres(FSArray v) {
    if (Genre_Type.featOkTst && ((Genre_Type)jcasType).casFeat_Genres == null)
      jcasType.jcas.throwFeatMissing("Genres", "org.texttechnologylab.annotation.Genre");
    jcasType.ll_cas.ll_setRefValue(addr, ((Genre_Type)jcasType).casFeatCode_Genres, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Genres - gets an indexed value - Set of Genre with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationComment getGenres(int i) {
    if (Genre_Type.featOkTst && ((Genre_Type)jcasType).casFeat_Genres == null)
      jcasType.jcas.throwFeatMissing("Genres", "org.texttechnologylab.annotation.Genre");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Genre_Type)jcasType).casFeatCode_Genres), i);
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Genre_Type)jcasType).casFeatCode_Genres), i)));}

  /** indexed setter for Genres - sets an indexed value - Set of Genre with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setGenres(int i, AnnotationComment v) { 
    if (Genre_Type.featOkTst && ((Genre_Type)jcasType).casFeat_Genres == null)
      jcasType.jcas.throwFeatMissing("Genres", "org.texttechnologylab.annotation.Genre");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Genre_Type)jcasType).casFeatCode_Genres), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Genre_Type)jcasType).casFeatCode_Genres), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Genre_Type.featOkTst && ((Genre_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Genre");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Genre_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Genre_Type.featOkTst && ((Genre_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Genre");
    jcasType.ll_cas.ll_setRefValue(addr, ((Genre_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    