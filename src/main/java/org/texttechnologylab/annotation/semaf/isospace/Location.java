

/* First created by JCasGen Mon Aug 23 15:33:08 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Oct 12 19:32:08 CEST 2021
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoBaseTypeSystem.xml
 * @generated */
public class Location extends SpatialEntity {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Location.class);
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
  protected Location() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Location(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Location(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Location(JCas jcas, int begin, int end) {
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
  //* Feature: gazref

  /** getter for gazref - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGazref() {
    if (Location_Type.featOkTst && ((Location_Type)jcasType).casFeat_gazref == null)
      jcasType.jcas.throwFeatMissing("gazref", "org.texttechnologylab.annotation.semaf.isospace.Location");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Location_Type)jcasType).casFeatCode_gazref);}
    
  /** setter for gazref - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGazref(String v) {
    if (Location_Type.featOkTst && ((Location_Type)jcasType).casFeat_gazref == null)
      jcasType.jcas.throwFeatMissing("gazref", "org.texttechnologylab.annotation.semaf.isospace.Location");
    jcasType.ll_cas.ll_setStringValue(addr, ((Location_Type)jcasType).casFeatCode_gazref, v);}    
  }

    