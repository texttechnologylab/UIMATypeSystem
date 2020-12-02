
/* First created by JCasGen Wed Dec 02 18:39:57 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:57 CET 2020
 * @generated */
public class ALink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ALink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.ALink");
 
  /** @generated */
  final Feature casFeat_syntax;
  /** @generated */
  final int     casFeatCode_syntax;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSyntax(int addr) {
        if (featOkTst && casFeat_syntax == null)
      jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.ALink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_syntax);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSyntax(int addr, String v) {
        if (featOkTst && casFeat_syntax == null)
      jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.ALink");
    ll_cas.ll_setStringValue(addr, casFeatCode_syntax, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ALink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_syntax = jcas.getRequiredFeatureDE(casType, "syntax", "uima.cas.String", featOkTst);
    casFeatCode_syntax  = (null == casFeat_syntax) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_syntax).getCode();

  }
}



    