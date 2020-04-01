
/* First created by JCasGen Fri Mar 20 09:14:16 CET 2020 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Apr 01 09:57:01 CEST 2020
 * @generated */
public class AgreementContainer_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AgreementContainer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.iaa.AgreementContainer");
 
  /** @generated */
  final Feature casFeat_overallAgreementValue;
  /** @generated */
  final int     casFeatCode_overallAgreementValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getOverallAgreementValue(int addr) {
        if (featOkTst && casFeat_overallAgreementValue == null)
      jcas.throwFeatMissing("overallAgreementValue", "org.texttechnologylab.iaa.AgreementContainer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_overallAgreementValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOverallAgreementValue(int addr, double v) {
        if (featOkTst && casFeat_overallAgreementValue == null)
      jcas.throwFeatMissing("overallAgreementValue", "org.texttechnologylab.iaa.AgreementContainer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_overallAgreementValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_agreementMeasure;
  /** @generated */
  final int     casFeatCode_agreementMeasure;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAgreementMeasure(int addr) {
        if (featOkTst && casFeat_agreementMeasure == null)
      jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.AgreementContainer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_agreementMeasure);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAgreementMeasure(int addr, String v) {
        if (featOkTst && casFeat_agreementMeasure == null)
      jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.AgreementContainer");
    ll_cas.ll_setStringValue(addr, casFeatCode_agreementMeasure, v);}
    
  
 
  /** @generated */
  final Feature casFeat_categoryNames;
  /** @generated */
  final int     casFeatCode_categoryNames;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCategoryNames(int addr) {
        if (featOkTst && casFeat_categoryNames == null)
      jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategoryNames(int addr, int v) {
        if (featOkTst && casFeat_categoryNames == null)
      jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    ll_cas.ll_setRefValue(addr, casFeatCode_categoryNames, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getCategoryNames(int addr, int i) {
        if (featOkTst && casFeat_categoryNames == null)
      jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCategoryNames(int addr, int i, String v) {
        if (featOkTst && casFeat_categoryNames == null)
      jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryNames), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_categoryAgreementValues;
  /** @generated */
  final int     casFeatCode_categoryAgreementValues;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCategoryAgreementValues(int addr) {
        if (featOkTst && casFeat_categoryAgreementValues == null)
      jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategoryAgreementValues(int addr, int v) {
        if (featOkTst && casFeat_categoryAgreementValues == null)
      jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    ll_cas.ll_setRefValue(addr, casFeatCode_categoryAgreementValues, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getCategoryAgreementValues(int addr, int i) {
        if (featOkTst && casFeat_categoryAgreementValues == null)
      jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCategoryAgreementValues(int addr, int i, double v) {
        if (featOkTst && casFeat_categoryAgreementValues == null)
      jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryAgreementValues), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_categoryCounts;
  /** @generated */
  final int     casFeatCode_categoryCounts;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCategoryCounts(int addr) {
        if (featOkTst && casFeat_categoryCounts == null)
      jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategoryCounts(int addr, int v) {
        if (featOkTst && casFeat_categoryCounts == null)
      jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    ll_cas.ll_setRefValue(addr, casFeatCode_categoryCounts, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public long getCategoryCounts(int addr, int i) {
        if (featOkTst && casFeat_categoryCounts == null)
      jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts), i);
  return ll_cas.ll_getLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCategoryCounts(int addr, int i, long v) {
        if (featOkTst && casFeat_categoryCounts == null)
      jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts), i);
    ll_cas.ll_setLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categoryCounts), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_categorySpecificAgreementValues;
  /** @generated */
  final int     casFeatCode_categorySpecificAgreementValues;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCategorySpecificAgreementValues(int addr) {
        if (featOkTst && casFeat_categorySpecificAgreementValues == null)
      jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCategorySpecificAgreementValues(int addr, int v) {
        if (featOkTst && casFeat_categorySpecificAgreementValues == null)
      jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    ll_cas.ll_setRefValue(addr, casFeatCode_categorySpecificAgreementValues, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getCategorySpecificAgreementValues(int addr, int i) {
        if (featOkTst && casFeat_categorySpecificAgreementValues == null)
      jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCategorySpecificAgreementValues(int addr, int i, String v) {
        if (featOkTst && casFeat_categorySpecificAgreementValues == null)
      jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_categorySpecificAgreementValues), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AgreementContainer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_overallAgreementValue = jcas.getRequiredFeatureDE(casType, "overallAgreementValue", "uima.cas.Double", featOkTst);
    casFeatCode_overallAgreementValue  = (null == casFeat_overallAgreementValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_overallAgreementValue).getCode();

 
    casFeat_agreementMeasure = jcas.getRequiredFeatureDE(casType, "agreementMeasure", "uima.cas.String", featOkTst);
    casFeatCode_agreementMeasure  = (null == casFeat_agreementMeasure) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_agreementMeasure).getCode();

 
    casFeat_categoryNames = jcas.getRequiredFeatureDE(casType, "categoryNames", "uima.cas.StringArray", featOkTst);
    casFeatCode_categoryNames  = (null == casFeat_categoryNames) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_categoryNames).getCode();

 
    casFeat_categoryAgreementValues = jcas.getRequiredFeatureDE(casType, "categoryAgreementValues", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_categoryAgreementValues  = (null == casFeat_categoryAgreementValues) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_categoryAgreementValues).getCode();

 
    casFeat_categoryCounts = jcas.getRequiredFeatureDE(casType, "categoryCounts", "uima.cas.LongArray", featOkTst);
    casFeatCode_categoryCounts  = (null == casFeat_categoryCounts) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_categoryCounts).getCode();

 
    casFeat_categorySpecificAgreementValues = jcas.getRequiredFeatureDE(casType, "categorySpecificAgreementValues", "uima.cas.StringArray", featOkTst);
    casFeatCode_categorySpecificAgreementValues  = (null == casFeat_categorySpecificAgreementValues) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_categorySpecificAgreementValues).getCode();

  }
}



    