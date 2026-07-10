

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An annotation that denotes an edit distance difference between two annotations.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EditDistance extends AnnotationRelation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EditDistance.class);
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
  protected EditDistance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EditDistance(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EditDistance(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EditDistance(JCas jcas, int begin, int end) {
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
  //* Feature: distance

  /** getter for distance - gets The edit distance as a 32-bit integer value.
   * @generated
   * @return value of the feature 
   */
  public int getDistance() {
    if (EditDistance_Type.featOkTst && ((EditDistance_Type)jcasType).casFeat_distance == null)
      jcasType.jcas.throwFeatMissing("distance", "org.texttechnologylab.annotation.relation.EditDistance");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EditDistance_Type)jcasType).casFeatCode_distance);}
    
  /** setter for distance - sets The edit distance as a 32-bit integer value. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDistance(int v) {
    if (EditDistance_Type.featOkTst && ((EditDistance_Type)jcasType).casFeat_distance == null)
      jcasType.jcas.throwFeatMissing("distance", "org.texttechnologylab.annotation.relation.EditDistance");
    jcasType.ll_cas.ll_setIntValue(addr, ((EditDistance_Type)jcasType).casFeatCode_distance, v);}    
   
    
  //*--------------*
  //* Feature: algorithm

  /** getter for algorithm - gets The algorithm used to calculate the edit distance.
   * @generated
   * @return value of the feature 
   */
  public String getAlgorithm() {
    if (EditDistance_Type.featOkTst && ((EditDistance_Type)jcasType).casFeat_algorithm == null)
      jcasType.jcas.throwFeatMissing("algorithm", "org.texttechnologylab.annotation.relation.EditDistance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EditDistance_Type)jcasType).casFeatCode_algorithm);}
    
  /** setter for algorithm - sets The algorithm used to calculate the edit distance. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlgorithm(String v) {
    if (EditDistance_Type.featOkTst && ((EditDistance_Type)jcasType).casFeat_algorithm == null)
      jcasType.jcas.throwFeatMissing("algorithm", "org.texttechnologylab.annotation.relation.EditDistance");
    jcasType.ll_cas.ll_setStringValue(addr, ((EditDistance_Type)jcasType).casFeatCode_algorithm, v);}    
  }

    