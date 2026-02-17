
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Author_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Author.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.paper.Author");
 
  /** @generated */
  final Feature casFeat_firstname;
  /** @generated */
  final int     casFeatCode_firstname;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFirstname(int addr) {
        if (featOkTst && casFeat_firstname == null)
      jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.paper.Author");
    return ll_cas.ll_getStringValue(addr, casFeatCode_firstname);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFirstname(int addr, String v) {
        if (featOkTst && casFeat_firstname == null)
      jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.paper.Author");
    ll_cas.ll_setStringValue(addr, casFeatCode_firstname, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lastname;
  /** @generated */
  final int     casFeatCode_lastname;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLastname(int addr) {
        if (featOkTst && casFeat_lastname == null)
      jcas.throwFeatMissing("lastname", "org.texttechnologylab.annotation.paper.Author");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lastname);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLastname(int addr, String v) {
        if (featOkTst && casFeat_lastname == null)
      jcas.throwFeatMissing("lastname", "org.texttechnologylab.annotation.paper.Author");
    ll_cas.ll_setStringValue(addr, casFeatCode_lastname, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.paper.Author");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.paper.Author");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_email;
  /** @generated */
  final int     casFeatCode_email;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEmail(int addr) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "org.texttechnologylab.annotation.paper.Author");
    return ll_cas.ll_getStringValue(addr, casFeatCode_email);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEmail(int addr, String v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "org.texttechnologylab.annotation.paper.Author");
    ll_cas.ll_setStringValue(addr, casFeatCode_email, v);}
    
  
 
  /** @generated */
  final Feature casFeat_location;
  /** @generated */
  final int     casFeatCode_location;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLocation(int addr) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.paper.Author");
    return ll_cas.ll_getStringValue(addr, casFeatCode_location);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocation(int addr, String v) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.paper.Author");
    ll_cas.ll_setStringValue(addr, casFeatCode_location, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Author_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_firstname = jcas.getRequiredFeatureDE(casType, "firstname", "uima.cas.String", featOkTst);
    casFeatCode_firstname  = (null == casFeat_firstname) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_firstname).getCode();

 
    casFeat_lastname = jcas.getRequiredFeatureDE(casType, "lastname", "uima.cas.String", featOkTst);
    casFeatCode_lastname  = (null == casFeat_lastname) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lastname).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_email = jcas.getRequiredFeatureDE(casType, "email", "uima.cas.String", featOkTst);
    casFeatCode_email  = (null == casFeat_email) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_email).getCode();

 
    casFeat_location = jcas.getRequiredFeatureDE(casType, "location", "uima.cas.String", featOkTst);
    casFeatCode_location  = (null == casFeat_location) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_location).getCode();

  }
}



    