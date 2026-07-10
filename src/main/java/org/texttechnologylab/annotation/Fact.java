

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** One Fact for different claims
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Fact extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Fact.class);
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
  protected Fact() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Fact(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Fact(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Fact(JCas jcas, int begin, int end) {
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

  /** getter for value - gets Information for  the fact
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Fact_Type.featOkTst && ((Fact_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Fact");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Fact_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets Information for  the fact 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Fact_Type.featOkTst && ((Fact_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Fact");
    jcasType.ll_cas.ll_setStringValue(addr, ((Fact_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: Claims

  /** getter for Claims - gets Set of Claims
   * @generated
   * @return value of the feature 
   */
  public FSArray getClaims() {
    if (Fact_Type.featOkTst && ((Fact_Type)jcasType).casFeat_Claims == null)
      jcasType.jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Fact_Type)jcasType).casFeatCode_Claims)));}
    
  /** setter for Claims - sets Set of Claims 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClaims(FSArray v) {
    if (Fact_Type.featOkTst && ((Fact_Type)jcasType).casFeat_Claims == null)
      jcasType.jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    jcasType.ll_cas.ll_setRefValue(addr, ((Fact_Type)jcasType).casFeatCode_Claims, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Claims - gets an indexed value - Set of Claims
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Claim getClaims(int i) {
    if (Fact_Type.featOkTst && ((Fact_Type)jcasType).casFeat_Claims == null)
      jcasType.jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Fact_Type)jcasType).casFeatCode_Claims), i);
    return (Claim)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Fact_Type)jcasType).casFeatCode_Claims), i)));}

  /** indexed setter for Claims - sets an indexed value - Set of Claims
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setClaims(int i, Claim v) { 
    if (Fact_Type.featOkTst && ((Fact_Type)jcasType).casFeat_Claims == null)
      jcasType.jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Fact_Type)jcasType).casFeatCode_Claims), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Fact_Type)jcasType).casFeatCode_Claims), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    