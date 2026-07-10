

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation represents a (unidirectional) Link between two Annotations
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
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

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ALink(JCas jcas, int begin, int end) {
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
  //* Feature: from

  /** getter for from - gets from (annotation) to (annotation)
   * @generated
   * @return value of the feature 
   */
  public Annotation getFrom() {
    if (ALink_Type.featOkTst && ((ALink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.ALink");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ALink_Type)jcasType).casFeatCode_from)));}
    
  /** setter for from - sets from (annotation) to (annotation) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(Annotation v) {
    if (ALink_Type.featOkTst && ((ALink_Type)jcasType).casFeat_from == null)
      jcasType.jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.ALink");
    jcasType.ll_cas.ll_setRefValue(addr, ((ALink_Type)jcasType).casFeatCode_from, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (annotation) to (annotation)
   * @generated
   * @return value of the feature 
   */
  public Annotation getTo() {
    if (ALink_Type.featOkTst && ((ALink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.ALink");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ALink_Type)jcasType).casFeatCode_to)));}
    
  /** setter for to - sets from (annotation) to (annotation) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(Annotation v) {
    if (ALink_Type.featOkTst && ((ALink_Type)jcasType).casFeat_to == null)
      jcasType.jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.ALink");
    jcasType.ll_cas.ll_setRefValue(addr, ((ALink_Type)jcasType).casFeatCode_to, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    