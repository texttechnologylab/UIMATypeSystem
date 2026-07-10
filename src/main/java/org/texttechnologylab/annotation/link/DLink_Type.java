
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotation represents a (unidirectional) Link between two Documents
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class DLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.link.DLink");
 
  /** @generated */
  final Feature casFeat_from;
  /** @generated */
  final int     casFeatCode_from;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrom(int addr) {
        if (featOkTst && casFeat_from == null)
      jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.DLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_from);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrom(int addr, String v) {
        if (featOkTst && casFeat_from == null)
      jcas.throwFeatMissing("from", "org.texttechnologylab.annotation.link.DLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_from, v);}
    
  
 
  /** @generated */
  final Feature casFeat_to;
  /** @generated */
  final int     casFeatCode_to;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTo(int addr) {
        if (featOkTst && casFeat_to == null)
      jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.DLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_to);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTo(int addr, String v) {
        if (featOkTst && casFeat_to == null)
      jcas.throwFeatMissing("to", "org.texttechnologylab.annotation.link.DLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_to, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_from = jcas.getRequiredFeatureDE(casType, "from", "uima.cas.String", featOkTst);
    casFeatCode_from  = (null == casFeat_from) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_from).getCode();

 
    casFeat_to = jcas.getRequiredFeatureDE(casType, "to", "uima.cas.String", featOkTst);
    casFeatCode_to  = (null == casFeat_to) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_to).getCode();

  }
}



    