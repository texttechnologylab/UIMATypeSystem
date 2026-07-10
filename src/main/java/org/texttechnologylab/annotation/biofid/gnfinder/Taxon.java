

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** Type for gnfinder-recognized taxonomic names that have not been verified.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Taxon extends org.texttechnologylab.annotation.biofid.Taxon {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Taxon.class);
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
  protected Taxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Taxon(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Taxon(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Taxon(JCas jcas, int begin, int end) {
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
  //* Feature: cardinality

  /** getter for cardinality - gets Cardinality depicts the number of elements in a name.
                        0 - Could not determine cardinality,
                        1 - Uninomial,
                        2 - Binomial,
                        3 - Trinomial.
   * @generated
   * @return value of the feature 
   */
  public short getCardinality() {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_cardinality == null)
      jcasType.jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    return jcasType.ll_cas.ll_getShortValue(addr, ((Taxon_Type)jcasType).casFeatCode_cardinality);}
    
  /** setter for cardinality - sets Cardinality depicts the number of elements in a name.
                        0 - Could not determine cardinality,
                        1 - Uninomial,
                        2 - Binomial,
                        3 - Trinomial. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCardinality(short v) {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_cardinality == null)
      jcasType.jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    jcasType.ll_cas.ll_setShortValue(addr, ((Taxon_Type)jcasType).casFeatCode_cardinality, v);}    
   
    
  //*--------------*
  //* Feature: oddsLog10

  /** getter for oddsLog10 - gets Log10 of the odds (probability) that name detection was correct.
   * @generated
   * @return value of the feature 
   */
  public float getOddsLog10() {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_oddsLog10 == null)
      jcasType.jcas.throwFeatMissing("oddsLog10", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsLog10);}
    
  /** setter for oddsLog10 - sets Log10 of the odds (probability) that name detection was correct. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOddsLog10(float v) {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_oddsLog10 == null)
      jcasType.jcas.throwFeatMissing("oddsLog10", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsLog10, v);}    
   
    
  //*--------------*
  //* Feature: oddsDetails

  /** getter for oddsDetails - gets A list of OddsDetails that describe how odds were calculated (optional).
   * @generated
   * @return value of the feature 
   */
  public FSArray getOddsDetails() {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_oddsDetails == null)
      jcasType.jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsDetails)));}
    
  /** setter for oddsDetails - sets A list of OddsDetails that describe how odds were calculated (optional). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOddsDetails(FSArray v) {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_oddsDetails == null)
      jcasType.jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    jcasType.ll_cas.ll_setRefValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsDetails, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for oddsDetails - gets an indexed value - A list of OddsDetails that describe how odds were calculated (optional).
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getOddsDetails(int i) {
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_oddsDetails == null)
      jcasType.jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsDetails), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsDetails), i)));}

  /** indexed setter for oddsDetails - sets an indexed value - A list of OddsDetails that describe how odds were calculated (optional).
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOddsDetails(int i, TOP v) { 
    if (Taxon_Type.featOkTst && ((Taxon_Type)jcasType).casFeat_oddsDetails == null)
      jcasType.jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsDetails), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Taxon_Type)jcasType).casFeatCode_oddsDetails), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    