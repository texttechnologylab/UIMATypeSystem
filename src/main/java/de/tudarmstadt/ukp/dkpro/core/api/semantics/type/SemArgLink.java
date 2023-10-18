

/* First created by JCasGen Fri Jun 17 16:34:14 CEST 2022 */
package de.tudarmstadt.ukp.dkpro.core.api.semantics.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** The SemArgLink type is used to attach SemPred annotations to their respective SemArg annotations while giving each link a role.
 * Updated by JCasGen Fri Jan 20 19:11:52 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SemArgLink extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemArgLink.class);
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
  protected SemArgLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemArgLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemArgLink(JCas jcas) {
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
  //* Feature: role

  /** getter for role - gets The role which the argument takes. The value depends on the theory being used, e.g. Arg0, Arg1, etc. or Buyer, Seller, etc.
   * @generated
   * @return value of the feature 
   */
  public String getRole() {
    if (SemArgLink_Type.featOkTst && ((SemArgLink_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemArgLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemArgLink_Type)jcasType).casFeatCode_role);}
    
  /** setter for role - sets The role which the argument takes. The value depends on the theory being used, e.g. Arg0, Arg1, etc. or Buyer, Seller, etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    if (SemArgLink_Type.featOkTst && ((SemArgLink_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemArgLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemArgLink_Type)jcasType).casFeatCode_role, v);}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets The target argument.
   * @generated
   * @return value of the feature 
   */
  public SemArg getTarget() {
    if (SemArgLink_Type.featOkTst && ((SemArgLink_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemArgLink");
    return (SemArg)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemArgLink_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets The target argument. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(SemArg v) {
    if (SemArgLink_Type.featOkTst && ((SemArgLink_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemArgLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemArgLink_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    