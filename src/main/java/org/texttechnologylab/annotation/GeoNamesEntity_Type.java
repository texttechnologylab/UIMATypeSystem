
/* First created by JCasGen Tue Feb 16 16:51:34 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jun 17 16:34:14 CEST 2022
 * @generated */
public class GeoNamesEntity_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeoNamesEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.GeoNamesEntity");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.GeoNamesEntity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.GeoNamesEntity");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mainclass;
  /** @generated */
  final int     casFeatCode_mainclass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMainclass(int addr) {
        if (featOkTst && casFeat_mainclass == null)
      jcas.throwFeatMissing("mainclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mainclass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMainclass(int addr, String v) {
        if (featOkTst && casFeat_mainclass == null)
      jcas.throwFeatMissing("mainclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_mainclass, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subclass;
  /** @generated */
  final int     casFeatCode_subclass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubclass(int addr) {
        if (featOkTst && casFeat_subclass == null)
      jcas.throwFeatMissing("subclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subclass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubclass(int addr, String v) {
        if (featOkTst && casFeat_subclass == null)
      jcas.throwFeatMissing("subclass", "org.texttechnologylab.annotation.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_subclass, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeoNamesEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_mainclass = jcas.getRequiredFeatureDE(casType, "mainclass", "uima.cas.String", featOkTst);
    casFeatCode_mainclass  = (null == casFeat_mainclass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mainclass).getCode();

 
    casFeat_subclass = jcas.getRequiredFeatureDE(casType, "subclass", "uima.cas.String", featOkTst);
    casFeatCode_subclass  = (null == casFeat_subclass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subclass).getCode();

  }
}



    