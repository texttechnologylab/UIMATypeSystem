

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OddsDetails extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OddsDetails.class);
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
  protected OddsDetails() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OddsDetails(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OddsDetails(JCas jcas) {
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
  //* Feature: feature

  /** getter for feature - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFeature() {
    if (OddsDetails_Type.featOkTst && ((OddsDetails_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OddsDetails_Type)jcasType).casFeatCode_feature);}
    
  /** setter for feature - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeature(String v) {
    if (OddsDetails_Type.featOkTst && ((OddsDetails_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    jcasType.ll_cas.ll_setStringValue(addr, ((OddsDetails_Type)jcasType).casFeatCode_feature, v);}    
   
    
  //*--------------*
  //* Feature: odds

  /** getter for odds - gets 
   * @generated
   * @return value of the feature 
   */
  public float getOdds() {
    if (OddsDetails_Type.featOkTst && ((OddsDetails_Type)jcasType).casFeat_odds == null)
      jcasType.jcas.throwFeatMissing("odds", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((OddsDetails_Type)jcasType).casFeatCode_odds);}
    
  /** setter for odds - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOdds(float v) {
    if (OddsDetails_Type.featOkTst && ((OddsDetails_Type)jcasType).casFeat_odds == null)
      jcasType.jcas.throwFeatMissing("odds", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    jcasType.ll_cas.ll_setFloatValue(addr, ((OddsDetails_Type)jcasType).casFeatCode_odds, v);}    
  }

    