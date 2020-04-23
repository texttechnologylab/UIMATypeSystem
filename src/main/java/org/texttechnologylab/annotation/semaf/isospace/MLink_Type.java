
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:56:12 CEST 2020
 * @generated */
public class MLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.MLink");
 
  /** @generated */
  final Feature casFeat_val;
  /** @generated */
  final int     casFeatCode_val;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVal(int addr) {
        if (featOkTst && casFeat_val == null)
      jcas.throwFeatMissing("val", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_val);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVal(int addr, int v) {
        if (featOkTst && casFeat_val == null)
      jcas.throwFeatMissing("val", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_val, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end_point1;
  /** @generated */
  final int     casFeatCode_end_point1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd_point1(int addr) {
        if (featOkTst && casFeat_end_point1 == null)
      jcas.throwFeatMissing("end_point1", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_end_point1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd_point1(int addr, int v) {
        if (featOkTst && casFeat_end_point1 == null)
      jcas.throwFeatMissing("end_point1", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_end_point1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end_point2;
  /** @generated */
  final int     casFeatCode_end_point2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd_point2(int addr) {
        if (featOkTst && casFeat_end_point2 == null)
      jcas.throwFeatMissing("end_point2", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_end_point2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd_point2(int addr, int v) {
        if (featOkTst && casFeat_end_point2 == null)
      jcas.throwFeatMissing("end_point2", "org.texttechnologylab.annotation.semaf.isospace.MLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_end_point2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_val = jcas.getRequiredFeatureDE(casType, "val", "org.texttechnologylab.annotation.semaf.isospace.Measure", featOkTst);
    casFeatCode_val  = (null == casFeat_val) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_val).getCode();

 
    casFeat_end_point1 = jcas.getRequiredFeatureDE(casType, "end_point1", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_end_point1  = (null == casFeat_end_point1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end_point1).getCode();

 
    casFeat_end_point2 = jcas.getRequiredFeatureDE(casType, "end_point2", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_end_point2  = (null == casFeat_end_point2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end_point2).getCode();

  }
}



    