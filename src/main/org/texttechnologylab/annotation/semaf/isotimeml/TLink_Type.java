
/* First created by JCasGen Wed Dec 02 17:54:51 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * @generated */
public class TLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.TLink");
 
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
      jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_syntax);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSyntax(int addr, String v) {
        if (featOkTst && casFeat_syntax == null)
      jcas.throwFeatMissing("syntax", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_syntax, v);}
    
  
 
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
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_origin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigin(int addr, String v) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.semaf.isotimeml.TLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_origin, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_syntax = jcas.getRequiredFeatureDE(casType, "syntax", "uima.cas.String", featOkTst);
    casFeatCode_syntax  = (null == casFeat_syntax) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_syntax).getCode();

 
    casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "uima.cas.String", featOkTst);
    casFeatCode_origin  = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origin).getCode();

  }
}



    