
/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * @generated */
public class SLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.SLink");
 
  /** @generated */
  final Feature casFeat_origin;
  /** @generated */
  final int     casFeatCode_origin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOrigin(int addr) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.SLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_origin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigin(int addr, String v) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.SLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_origin, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "uima.cas.String", featOkTst);
    casFeatCode_origin  = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origin).getCode();

  }
}



    