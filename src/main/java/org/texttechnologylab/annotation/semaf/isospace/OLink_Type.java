
/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Wed Apr 01 09:53:21 CEST 2020
 * @generated */
public class OLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.OLink");
 
  /** @generated */
  final Feature casFeat_projective;
  /** @generated */
  final int     casFeatCode_projective;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getProjective(int addr) {
        if (featOkTst && casFeat_projective == null)
      jcas.throwFeatMissing("projective", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_projective);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProjective(int addr, boolean v) {
        if (featOkTst && casFeat_projective == null)
      jcas.throwFeatMissing("projective", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_projective, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frame_type;
  /** @generated */
  final int     casFeatCode_frame_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrame_type(int addr) {
        if (featOkTst && casFeat_frame_type == null)
      jcas.throwFeatMissing("frame_type", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_frame_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrame_type(int addr, String v) {
        if (featOkTst && casFeat_frame_type == null)
      jcas.throwFeatMissing("frame_type", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_frame_type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reference_pt;
  /** @generated */
  final int     casFeatCode_reference_pt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReference_pt(int addr) {
        if (featOkTst && casFeat_reference_pt == null)
      jcas.throwFeatMissing("reference_pt", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference_pt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference_pt(int addr, int v) {
        if (featOkTst && casFeat_reference_pt == null)
      jcas.throwFeatMissing("reference_pt", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference_pt, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_projective = jcas.getRequiredFeatureDE(casType, "projective", "uima.cas.Boolean", featOkTst);
    casFeatCode_projective  = (null == casFeat_projective) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_projective).getCode();

 
    casFeat_frame_type = jcas.getRequiredFeatureDE(casType, "frame_type", "uima.cas.String", featOkTst);
    casFeatCode_frame_type  = (null == casFeat_frame_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frame_type).getCode();

 
    casFeat_reference_pt = jcas.getRequiredFeatureDE(casType, "reference_pt", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_reference_pt  = (null == casFeat_reference_pt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference_pt).getCode();

  }
}



    