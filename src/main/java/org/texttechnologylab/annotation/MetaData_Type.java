
/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Dec 21 13:46:46 CET 2023
 * @generated */
public class MetaData_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.MetaData");
 
  /** @generated */
  final Feature casFeat_Lang;
  /** @generated */
  final int     casFeatCode_Lang;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLang(int addr) {
        if (featOkTst && casFeat_Lang == null)
      jcas.throwFeatMissing("Lang", "org.texttechnologylab.annotation.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Lang);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLang(int addr, String v) {
        if (featOkTst && casFeat_Lang == null)
      jcas.throwFeatMissing("Lang", "org.texttechnologylab.annotation.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_Lang, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Source;
  /** @generated */
  final int     casFeatCode_Source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_Source == null)
      jcas.throwFeatMissing("Source", "org.texttechnologylab.annotation.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_Source == null)
      jcas.throwFeatMissing("Source", "org.texttechnologylab.annotation.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_Source, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Lang = jcas.getRequiredFeatureDE(casType, "Lang", "uima.cas.String", featOkTst);
    casFeatCode_Lang  = (null == casFeat_Lang) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Lang).getCode();

 
    casFeat_Source = jcas.getRequiredFeatureDE(casType, "Source", "uima.cas.String", featOkTst);
    casFeatCode_Source  = (null == casFeat_Source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Source).getCode();

  }
}



    