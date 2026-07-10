

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Readability Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ReadabilityAdvance extends Readability {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ReadabilityAdvance.class);
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
  protected ReadabilityAdvance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ReadabilityAdvance(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ReadabilityAdvance(JCas jcas) {
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
  //* Feature: GroupName

  /** getter for GroupName - gets Group Name for the Text Readabilities
   * @generated
   * @return value of the feature 
   */
  public String getGroupName() {
    if (ReadabilityAdvance_Type.featOkTst && ((ReadabilityAdvance_Type)jcasType).casFeat_GroupName == null)
      jcasType.jcas.throwFeatMissing("GroupName", "org.texttechnologylab.annotation.ReadabilityAdvance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReadabilityAdvance_Type)jcasType).casFeatCode_GroupName);}
    
  /** setter for GroupName - sets Group Name for the Text Readabilities 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroupName(String v) {
    if (ReadabilityAdvance_Type.featOkTst && ((ReadabilityAdvance_Type)jcasType).casFeat_GroupName == null)
      jcasType.jcas.throwFeatMissing("GroupName", "org.texttechnologylab.annotation.ReadabilityAdvance");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReadabilityAdvance_Type)jcasType).casFeatCode_GroupName, v);}    
  }

    