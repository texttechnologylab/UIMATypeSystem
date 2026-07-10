

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** One Claim for different facts
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Claim extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Claim.class);
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
  protected Claim() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Claim(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Claim(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Claim(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets Information of Claim
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Claim_Type.featOkTst && ((Claim_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Claim");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Claim_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets Information of Claim 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Claim_Type.featOkTst && ((Claim_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Claim");
    jcasType.ll_cas.ll_setStringValue(addr, ((Claim_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: Facts

  /** getter for Facts - gets Set of Fact
   * @generated
   * @return value of the feature 
   */
  public FSArray getFacts() {
    if (Claim_Type.featOkTst && ((Claim_Type)jcasType).casFeat_Facts == null)
      jcasType.jcas.throwFeatMissing("Facts", "org.texttechnologylab.annotation.Claim");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Claim_Type)jcasType).casFeatCode_Facts)));}
    
  /** setter for Facts - sets Set of Fact 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFacts(FSArray v) {
    if (Claim_Type.featOkTst && ((Claim_Type)jcasType).casFeat_Facts == null)
      jcasType.jcas.throwFeatMissing("Facts", "org.texttechnologylab.annotation.Claim");
    jcasType.ll_cas.ll_setRefValue(addr, ((Claim_Type)jcasType).casFeatCode_Facts, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Facts - gets an indexed value - Set of Fact
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Fact getFacts(int i) {
    if (Claim_Type.featOkTst && ((Claim_Type)jcasType).casFeat_Facts == null)
      jcasType.jcas.throwFeatMissing("Facts", "org.texttechnologylab.annotation.Claim");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Claim_Type)jcasType).casFeatCode_Facts), i);
    return (Fact)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Claim_Type)jcasType).casFeatCode_Facts), i)));}

  /** indexed setter for Facts - sets an indexed value - Set of Fact
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFacts(int i, Fact v) { 
    if (Claim_Type.featOkTst && ((Claim_Type)jcasType).casFeat_Facts == null)
      jcasType.jcas.throwFeatMissing("Facts", "org.texttechnologylab.annotation.Claim");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Claim_Type)jcasType).casFeatCode_Facts), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Claim_Type)jcasType).casFeatCode_Facts), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    