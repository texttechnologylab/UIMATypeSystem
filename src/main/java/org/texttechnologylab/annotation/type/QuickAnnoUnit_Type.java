
/* First created by JCasGen Wed Dec 02 18:39:08 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Feb 08 19:39:47 CET 2024
 * @generated */
public class QuickAnnoUnit_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuickAnnoUnit.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.QuickAnnoUnit");
 
  /** @generated */
  final Feature casFeat_combined;
  /** @generated */
  final int     casFeatCode_combined;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCombined(int addr) {
        if (featOkTst && casFeat_combined == null)
      jcas.throwFeatMissing("combined", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_combined);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCombined(int addr, boolean v) {
        if (featOkTst && casFeat_combined == null)
      jcas.throwFeatMissing("combined", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_combined, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pos;
  /** @generated */
  final int     casFeatCode_pos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPos(int addr) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos(int addr, String v) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    ll_cas.ll_setStringValue(addr, casFeatCode_pos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_origin;
  /** @generated */
  final int     casFeatCode_origin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrigin(int addr) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_origin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigin(int addr, int v) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.QuickAnnoUnit");
    ll_cas.ll_setRefValue(addr, casFeatCode_origin, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuickAnnoUnit_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_combined = jcas.getRequiredFeatureDE(casType, "combined", "uima.cas.Boolean", featOkTst);
    casFeatCode_combined  = (null == casFeat_combined) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_combined).getCode();

 
    casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "uima.cas.String", featOkTst);
    casFeatCode_pos  = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pos).getCode();

 
    casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "uima.tcas.Annotation", featOkTst);
    casFeatCode_origin  = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origin).getCode();

  }
}



    