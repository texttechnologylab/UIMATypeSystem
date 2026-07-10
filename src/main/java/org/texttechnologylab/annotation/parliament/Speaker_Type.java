
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.parliament;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class Speaker_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Speaker.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliament.Speaker");
 
  /** @generated */
  final Feature casFeat_label;
  /** @generated */
  final int     casFeatCode_label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_label, v);}
    
  
 
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
      jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_firstname);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFirstname(int addr, String v) {
        if (featOkTst && casFeat_firstname == null)
      jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_firstname, v);}
    
  
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fullname_deducted;
  /** @generated */
  final int     casFeatCode_fullname_deducted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFullname_deducted(int addr) {
        if (featOkTst && casFeat_fullname_deducted == null)
      jcas.throwFeatMissing("fullname_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fullname_deducted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFullname_deducted(int addr, String v) {
        if (featOkTst && casFeat_fullname_deducted == null)
      jcas.throwFeatMissing("fullname_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_fullname_deducted, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nobility;
  /** @generated */
  final int     casFeatCode_nobility;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNobility(int addr) {
        if (featOkTst && casFeat_nobility == null)
      jcas.throwFeatMissing("nobility", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nobility);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNobility(int addr, String v) {
        if (featOkTst && casFeat_nobility == null)
      jcas.throwFeatMissing("nobility", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_nobility, v);}
    
  
 
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
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
      jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_role);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRole(int addr, String v) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_role, v);}
    
  
 
  /** @generated */
  final Feature casFeat_party;
  /** @generated */
  final int     casFeatCode_party;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getParty(int addr) {
        if (featOkTst && casFeat_party == null)
      jcas.throwFeatMissing("party", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_party);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParty(int addr, String v) {
        if (featOkTst && casFeat_party == null)
      jcas.throwFeatMissing("party", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_party, v);}
    
  
 
  /** @generated */
  final Feature casFeat_party_deducted;
  /** @generated */
  final int     casFeatCode_party_deducted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getParty_deducted(int addr) {
        if (featOkTst && casFeat_party_deducted == null)
      jcas.throwFeatMissing("party_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_party_deducted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParty_deducted(int addr, String v) {
        if (featOkTst && casFeat_party_deducted == null)
      jcas.throwFeatMissing("party_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_party_deducted, v);}
    
  
 
  /** @generated */
  final Feature casFeat_electoral_county;
  /** @generated */
  final int     casFeatCode_electoral_county;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getElectoral_county(int addr) {
        if (featOkTst && casFeat_electoral_county == null)
      jcas.throwFeatMissing("electoral_county", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_electoral_county);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElectoral_county(int addr, String v) {
        if (featOkTst && casFeat_electoral_county == null)
      jcas.throwFeatMissing("electoral_county", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_electoral_county, v);}
    
  
 
  /** @generated */
  final Feature casFeat_electoral_county_deducted;
  /** @generated */
  final int     casFeatCode_electoral_county_deducted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getElectoral_county_deducted(int addr) {
        if (featOkTst && casFeat_electoral_county_deducted == null)
      jcas.throwFeatMissing("electoral_county_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_electoral_county_deducted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElectoral_county_deducted(int addr, String v) {
        if (featOkTst && casFeat_electoral_county_deducted == null)
      jcas.throwFeatMissing("electoral_county_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    ll_cas.ll_setStringValue(addr, casFeatCode_electoral_county_deducted, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Speaker_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
    casFeatCode_label  = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_label).getCode();

 
    casFeat_firstname = jcas.getRequiredFeatureDE(casType, "firstname", "uima.cas.String", featOkTst);
    casFeatCode_firstname  = (null == casFeat_firstname) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_firstname).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_fullname_deducted = jcas.getRequiredFeatureDE(casType, "fullname_deducted", "uima.cas.String", featOkTst);
    casFeatCode_fullname_deducted  = (null == casFeat_fullname_deducted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fullname_deducted).getCode();

 
    casFeat_nobility = jcas.getRequiredFeatureDE(casType, "nobility", "uima.cas.String", featOkTst);
    casFeatCode_nobility  = (null == casFeat_nobility) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nobility).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_role = jcas.getRequiredFeatureDE(casType, "role", "uima.cas.String", featOkTst);
    casFeatCode_role  = (null == casFeat_role) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_role).getCode();

 
    casFeat_party = jcas.getRequiredFeatureDE(casType, "party", "uima.cas.String", featOkTst);
    casFeatCode_party  = (null == casFeat_party) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_party).getCode();

 
    casFeat_party_deducted = jcas.getRequiredFeatureDE(casType, "party_deducted", "uima.cas.String", featOkTst);
    casFeatCode_party_deducted  = (null == casFeat_party_deducted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_party_deducted).getCode();

 
    casFeat_electoral_county = jcas.getRequiredFeatureDE(casType, "electoral_county", "uima.cas.String", featOkTst);
    casFeatCode_electoral_county  = (null == casFeat_electoral_county) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_electoral_county).getCode();

 
    casFeat_electoral_county_deducted = jcas.getRequiredFeatureDE(casType, "electoral_county_deducted", "uima.cas.String", featOkTst);
    casFeatCode_electoral_county_deducted  = (null == casFeat_electoral_county_deducted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_electoral_county_deducted).getCode();

  }
}



    