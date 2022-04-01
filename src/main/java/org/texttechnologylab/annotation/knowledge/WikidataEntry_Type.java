
/* First created by JCasGen Tue Feb 16 16:51:35 CET 2021 */
package org.texttechnologylab.annotation.knowledge;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Apr 01 18:13:29 CEST 2022
 * @generated */
public class WikidataEntry_Type extends KnowledgeEntry_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = WikidataEntry.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.knowledge.WikidataEntry");
 
  /** @generated */
  final Feature casFeat_P31;
  /** @generated */
  final int     casFeatCode_P31;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getP31(int addr) {
        if (featOkTst && casFeat_P31 == null)
      jcas.throwFeatMissing("P31", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    return ll_cas.ll_getRefValue(addr, casFeatCode_P31);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setP31(int addr, int v) {
        if (featOkTst && casFeat_P31 == null)
      jcas.throwFeatMissing("P31", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    ll_cas.ll_setRefValue(addr, casFeatCode_P31, v);}
    
  
 
  /** @generated */
  final Feature casFeat_P279;
  /** @generated */
  final int     casFeatCode_P279;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getP279(int addr) {
        if (featOkTst && casFeat_P279 == null)
      jcas.throwFeatMissing("P279", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    return ll_cas.ll_getRefValue(addr, casFeatCode_P279);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setP279(int addr, int v) {
        if (featOkTst && casFeat_P279 == null)
      jcas.throwFeatMissing("P279", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    ll_cas.ll_setRefValue(addr, casFeatCode_P279, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public WikidataEntry_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_P31 = jcas.getRequiredFeatureDE(casType, "P31", "uima.cas.StringList", featOkTst);
    casFeatCode_P31  = (null == casFeat_P31) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_P31).getCode();

 
    casFeat_P279 = jcas.getRequiredFeatureDE(casType, "P279", "uima.cas.StringList", featOkTst);
    casFeatCode_P279  = (null == casFeat_P279) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_P279).getCode();

  }
}



    