

/* First created by JCasGen Tue Apr 07 19:23:28 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Thu Apr 23 09:56:12 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class TLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TLink.class);
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
  protected TLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TLink(JCas jcas) {
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
  //* Feature: syntax

  /** getter for syntax - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSyntax() {
    if (TLink_Type.featOkTst && ((TLink_Type)jcasType).casFeat_syntax == null)
      jcasType.jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TLink_Type)jcasType).casFeatCode_syntax);}
    
  /** setter for syntax - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSyntax(String v) {
    if (TLink_Type.featOkTst && ((TLink_Type)jcasType).casFeat_syntax == null)
      jcasType.jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TLink_Type)jcasType).casFeatCode_syntax, v);}    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() {
    if (TLink_Type.featOkTst && ((TLink_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TLink_Type)jcasType).casFeatCode_origin);}
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    if (TLink_Type.featOkTst && ((TLink_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TLink_Type)jcasType).casFeatCode_origin, v);}    
  }

    