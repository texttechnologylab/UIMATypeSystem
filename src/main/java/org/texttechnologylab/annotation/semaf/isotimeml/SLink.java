

/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class SLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SLink.class);
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
  protected SLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SLink(JCas jcas) {
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
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() {
    if (SLink_Type.featOkTst && ((SLink_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.SLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SLink_Type)jcasType).casFeatCode_origin);}
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    if (SLink_Type.featOkTst && ((SLink_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.SLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((SLink_Type)jcasType).casFeatCode_origin, v);}    
  }

    