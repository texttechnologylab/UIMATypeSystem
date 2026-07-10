
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class Speaker_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Speaker.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliamentary.Speaker");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.parliamentary.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_firstName;
  /** @generated */
  final int     casFeatCode_firstName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFirstName(int addr) {
        if (featOkTst && casFeat_firstName == null)
      jcas.throwFeatMissing("firstName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_firstName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFirstName(int addr, String v) {
        if (featOkTst && casFeat_firstName == null)
      jcas.throwFeatMissing("firstName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_firstName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lastName;
  /** @generated */
  final int     casFeatCode_lastName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLastName(int addr) {
        if (featOkTst && casFeat_lastName == null)
      jcas.throwFeatMissing("lastName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lastName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLastName(int addr, String v) {
        if (featOkTst && casFeat_lastName == null)
      jcas.throwFeatMissing("lastName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_lastName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_group;
  /** @generated */
  final int     casFeatCode_group;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_group);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGroup(int addr, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.parliamentary.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_group, v);}
    
  
 
  /** @generated */
  final Feature casFeat_role;
  /** @generated */
  final int     casFeatCode_role;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRole(int addr) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_role);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRole(int addr, String v) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliamentary.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_role, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Speaker_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_firstName = jcas.getRequiredFeatureDE(casType, "firstName", "uima.cas.String", featOkTst);
    casFeatCode_firstName  = (null == casFeat_firstName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_firstName).getCode();

 
    casFeat_lastName = jcas.getRequiredFeatureDE(casType, "lastName", "uima.cas.String", featOkTst);
    casFeatCode_lastName  = (null == casFeat_lastName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lastName).getCode();

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.String", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_role = jcas.getRequiredFeatureDE(casType, "role", "uima.cas.String", featOkTst);
    casFeatCode_role  = (null == casFeat_role) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_role).getCode();

  }
}



    