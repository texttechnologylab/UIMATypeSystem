
/* First created by JCasGen Wed Oct 18 12:33:44 CEST 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly_Type;

/** 
 * Updated by JCasGen Wed Oct 18 12:33:44 CEST 2023
 * @generated */
public class AnomlySpelling_Type extends Anomaly_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnomlySpelling.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.AnomlySpelling");
 
  /** @generated */
  final Feature casFeat_SpellingType;
  /** @generated */
  final int     casFeatCode_SpellingType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpellingType(int addr) {
        if (featOkTst && casFeat_SpellingType == null)
      jcas.throwFeatMissing("SpellingType", "org.texttechnologylab.annotation.AnomlySpelling");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SpellingType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpellingType(int addr, String v) {
        if (featOkTst && casFeat_SpellingType == null)
      jcas.throwFeatMissing("SpellingType", "org.texttechnologylab.annotation.AnomlySpelling");
    ll_cas.ll_setStringValue(addr, casFeatCode_SpellingType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ModelName;
  /** @generated */
  final int     casFeatCode_ModelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelName(int addr) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomlySpelling");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ModelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelName(int addr, String v) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomlySpelling");
    ll_cas.ll_setStringValue(addr, casFeatCode_ModelName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnomlySpelling_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SpellingType = jcas.getRequiredFeatureDE(casType, "SpellingType", "uima.cas.String", featOkTst);
    casFeatCode_SpellingType  = (null == casFeat_SpellingType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SpellingType).getCode();

 
    casFeat_ModelName = jcas.getRequiredFeatureDE(casType, "ModelName", "uima.cas.String", featOkTst);
    casFeatCode_ModelName  = (null == casFeat_ModelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelName).getCode();

  }
}



    