
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Sentence i and Sentence j which will be compared
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class SentenceComparison_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SentenceComparison.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.SentenceComparison");
 
  /** @generated */
  final Feature casFeat_SentenceI;
  /** @generated */
  final int     casFeatCode_SentenceI;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceI(int addr) {
        if (featOkTst && casFeat_SentenceI == null)
      jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.SentenceComparison");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SentenceI);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceI(int addr, int v) {
        if (featOkTst && casFeat_SentenceI == null)
      jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.SentenceComparison");
    ll_cas.ll_setRefValue(addr, casFeatCode_SentenceI, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SentenceJ;
  /** @generated */
  final int     casFeatCode_SentenceJ;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceJ(int addr) {
        if (featOkTst && casFeat_SentenceJ == null)
      jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.SentenceComparison");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SentenceJ);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceJ(int addr, int v) {
        if (featOkTst && casFeat_SentenceJ == null)
      jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.SentenceComparison");
    ll_cas.ll_setRefValue(addr, casFeatCode_SentenceJ, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SentenceComparison_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceI = jcas.getRequiredFeatureDE(casType, "SentenceI", "uima.tcas.Annotation", featOkTst);
    casFeatCode_SentenceI  = (null == casFeat_SentenceI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceI).getCode();

 
    casFeat_SentenceJ = jcas.getRequiredFeatureDE(casType, "SentenceJ", "uima.tcas.Annotation", featOkTst);
    casFeatCode_SentenceJ  = (null == casFeat_SentenceJ) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceJ).getCode();

  }
}



    