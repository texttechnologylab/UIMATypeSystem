

/* First created by JCasGen Thu Sep 10 17:49:15 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Thu Sep 10 17:49:16 CEST 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class ALink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ALink.class);
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
  protected ALink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ALink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ALink(JCas jcas) {
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
    if (ALink_Type.featOkTst && ((ALink_Type)jcasType).casFeat_syntax == null)
      jcasType.jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.ALink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ALink_Type)jcasType).casFeatCode_syntax);}
    
  /** setter for syntax - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSyntax(String v) {
    if (ALink_Type.featOkTst && ((ALink_Type)jcasType).casFeat_syntax == null)
      jcasType.jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.ALink");
    jcasType.ll_cas.ll_setStringValue(addr, ((ALink_Type)jcasType).casFeatCode_syntax, v);}    
  }

    