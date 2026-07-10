

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Author extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Author.class);
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
  protected Author() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Author(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Author(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Author(JCas jcas, int begin, int end) {
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
  //* Feature: firstname

  /** getter for firstname - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstname() {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_firstname == null)
      jcasType.jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.paper.Author");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Author_Type)jcasType).casFeatCode_firstname);}
    
  /** setter for firstname - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstname(String v) {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_firstname == null)
      jcasType.jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.paper.Author");
    jcasType.ll_cas.ll_setStringValue(addr, ((Author_Type)jcasType).casFeatCode_firstname, v);}    
   
    
  //*--------------*
  //* Feature: lastname

  /** getter for lastname - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLastname() {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_lastname == null)
      jcasType.jcas.throwFeatMissing("lastname", "org.texttechnologylab.annotation.paper.Author");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Author_Type)jcasType).casFeatCode_lastname);}
    
  /** setter for lastname - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastname(String v) {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_lastname == null)
      jcasType.jcas.throwFeatMissing("lastname", "org.texttechnologylab.annotation.paper.Author");
    jcasType.ll_cas.ll_setStringValue(addr, ((Author_Type)jcasType).casFeatCode_lastname, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.paper.Author");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Author_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.paper.Author");
    jcasType.ll_cas.ll_setStringValue(addr, ((Author_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: email

  /** getter for email - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEmail() {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "org.texttechnologylab.annotation.paper.Author");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Author_Type)jcasType).casFeatCode_email);}
    
  /** setter for email - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmail(String v) {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "org.texttechnologylab.annotation.paper.Author");
    jcasType.ll_cas.ll_setStringValue(addr, ((Author_Type)jcasType).casFeatCode_email, v);}    
   
    
  //*--------------*
  //* Feature: location

  /** getter for location - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLocation() {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.paper.Author");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Author_Type)jcasType).casFeatCode_location);}
    
  /** setter for location - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocation(String v) {
    if (Author_Type.featOkTst && ((Author_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.paper.Author");
    jcasType.ll_cas.ll_setStringValue(addr, ((Author_Type)jcasType).casFeatCode_location, v);}    
  }

    