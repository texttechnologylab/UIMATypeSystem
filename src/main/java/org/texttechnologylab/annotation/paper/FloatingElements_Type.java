
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class FloatingElements_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FloatingElements.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.paper.FloatingElements");
 
  /** @generated */
  final Feature casFeat_caption;
  /** @generated */
  final int     casFeatCode_caption;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCaption(int addr) {
        if (featOkTst && casFeat_caption == null)
      jcas.throwFeatMissing("caption", "org.texttechnologylab.annotation.paper.FloatingElements");
    return ll_cas.ll_getRefValue(addr, casFeatCode_caption);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCaption(int addr, int v) {
        if (featOkTst && casFeat_caption == null)
      jcas.throwFeatMissing("caption", "org.texttechnologylab.annotation.paper.FloatingElements");
    ll_cas.ll_setRefValue(addr, casFeatCode_caption, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FloatingElements_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_caption = jcas.getRequiredFeatureDE(casType, "caption", "org.texttechnologylab.annotation.paper.Caption", featOkTst);
    casFeatCode_caption  = (null == casFeat_caption) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_caption).getCode();

  }
}



    