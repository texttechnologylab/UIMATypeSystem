
/* First created by JCasGen Wed Dec 02 18:39:22 CET 2020 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.node.type.Context_Type;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:22 CET 2020
 * @generated */
public class OrganisationContext_Type extends Context_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OrganisationContext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.context.type.OrganisationContext");
 
  /** @generated */
  final Feature casFeat_foundingDate;
  /** @generated */
  final int     casFeatCode_foundingDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFoundingDate(int addr) {
        if (featOkTst && casFeat_foundingDate == null)
      jcas.throwFeatMissing("foundingDate", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_foundingDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFoundingDate(int addr, String v) {
        if (featOkTst && casFeat_foundingDate == null)
      jcas.throwFeatMissing("foundingDate", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_foundingDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_contextInf;
  /** @generated */
  final int     casFeatCode_contextInf;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContextInf(int addr) {
        if (featOkTst && casFeat_contextInf == null)
      jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_contextInf);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContextInf(int addr, String v) {
        if (featOkTst && casFeat_contextInf == null)
      jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_contextInf, v);}
    
  
 
  /** @generated */
  final Feature casFeat_website;
  /** @generated */
  final int     casFeatCode_website;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWebsite(int addr) {
        if (featOkTst && casFeat_website == null)
      jcas.throwFeatMissing("website", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_website);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWebsite(int addr, String v) {
        if (featOkTst && casFeat_website == null)
      jcas.throwFeatMissing("website", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_website, v);}
    
  
 
  /** @generated */
  final Feature casFeat_headquarter;
  /** @generated */
  final int     casFeatCode_headquarter;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHeadquarter(int addr) {
        if (featOkTst && casFeat_headquarter == null)
      jcas.throwFeatMissing("headquarter", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_headquarter);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHeadquarter(int addr, String v) {
        if (featOkTst && casFeat_headquarter == null)
      jcas.throwFeatMissing("headquarter", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_headquarter, v);}
    
  
 
  /** @generated */
  final Feature casFeat_chiefExecutiveOfficer;
  /** @generated */
  final int     casFeatCode_chiefExecutiveOfficer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChiefExecutiveOfficer(int addr) {
        if (featOkTst && casFeat_chiefExecutiveOfficer == null)
      jcas.throwFeatMissing("chiefExecutiveOfficer", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_chiefExecutiveOfficer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChiefExecutiveOfficer(int addr, String v) {
        if (featOkTst && casFeat_chiefExecutiveOfficer == null)
      jcas.throwFeatMissing("chiefExecutiveOfficer", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_chiefExecutiveOfficer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_setLabel;
  /** @generated */
  final int     casFeatCode_setLabel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSetLabel(int addr) {
        if (featOkTst && casFeat_setLabel == null)
      jcas.throwFeatMissing("setLabel", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_setLabel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSetLabel(int addr, String v) {
        if (featOkTst && casFeat_setLabel == null)
      jcas.throwFeatMissing("setLabel", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_setLabel, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OrganisationContext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_foundingDate = jcas.getRequiredFeatureDE(casType, "foundingDate", "uima.cas.String", featOkTst);
    casFeatCode_foundingDate  = (null == casFeat_foundingDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_foundingDate).getCode();

 
    casFeat_contextInf = jcas.getRequiredFeatureDE(casType, "contextInf", "uima.cas.String", featOkTst);
    casFeatCode_contextInf  = (null == casFeat_contextInf) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contextInf).getCode();

 
    casFeat_website = jcas.getRequiredFeatureDE(casType, "website", "uima.cas.String", featOkTst);
    casFeatCode_website  = (null == casFeat_website) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_website).getCode();

 
    casFeat_headquarter = jcas.getRequiredFeatureDE(casType, "headquarter", "uima.cas.String", featOkTst);
    casFeatCode_headquarter  = (null == casFeat_headquarter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_headquarter).getCode();

 
    casFeat_chiefExecutiveOfficer = jcas.getRequiredFeatureDE(casType, "chiefExecutiveOfficer", "uima.cas.String", featOkTst);
    casFeatCode_chiefExecutiveOfficer  = (null == casFeat_chiefExecutiveOfficer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_chiefExecutiveOfficer).getCode();

 
    casFeat_setLabel = jcas.getRequiredFeatureDE(casType, "setLabel", "uima.cas.String", featOkTst);
    casFeatCode_setLabel  = (null == casFeat_setLabel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_setLabel).getCode();

  }
}



    