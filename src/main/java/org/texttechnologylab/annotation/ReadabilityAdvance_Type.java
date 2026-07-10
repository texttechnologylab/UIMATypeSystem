
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Readability Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class ReadabilityAdvance_Type extends Readability_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ReadabilityAdvance.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ReadabilityAdvance");
 
  /** @generated */
  final Feature casFeat_GroupName;
  /** @generated */
  final int     casFeatCode_GroupName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGroupName(int addr) {
        if (featOkTst && casFeat_GroupName == null)
      jcas.throwFeatMissing("GroupName", "org.texttechnologylab.annotation.ReadabilityAdvance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GroupName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGroupName(int addr, String v) {
        if (featOkTst && casFeat_GroupName == null)
      jcas.throwFeatMissing("GroupName", "org.texttechnologylab.annotation.ReadabilityAdvance");
    ll_cas.ll_setStringValue(addr, casFeatCode_GroupName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ReadabilityAdvance_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GroupName = jcas.getRequiredFeatureDE(casType, "GroupName", "uima.cas.String", featOkTst);
    casFeatCode_GroupName  = (null == casFeat_GroupName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GroupName).getCode();

  }
}



    