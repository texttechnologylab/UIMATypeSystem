
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Line of a paragraph.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class Line_Type extends StructuralElement_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Line.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.abbyy.Line");
 
  /** @generated */
  final Feature casFeat_baseline;
  /** @generated */
  final int     casFeatCode_baseline;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBaseline(int addr) {
        if (featOkTst && casFeat_baseline == null)
      jcas.throwFeatMissing("baseline", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    return ll_cas.ll_getIntValue(addr, casFeatCode_baseline);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseline(int addr, int v) {
        if (featOkTst && casFeat_baseline == null)
      jcas.throwFeatMissing("baseline", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    ll_cas.ll_setIntValue(addr, casFeatCode_baseline, v);}
    
  
 
  /** @generated */
  final Feature casFeat_format;
  /** @generated */
  final int     casFeatCode_format;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFormat(int addr) {
        if (featOkTst && casFeat_format == null)
      jcas.throwFeatMissing("format", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    return ll_cas.ll_getRefValue(addr, casFeatCode_format);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFormat(int addr, int v) {
        if (featOkTst && casFeat_format == null)
      jcas.throwFeatMissing("format", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    ll_cas.ll_setRefValue(addr, casFeatCode_format, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Line_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseline = jcas.getRequiredFeatureDE(casType, "baseline", "uima.cas.Integer", featOkTst);
    casFeatCode_baseline  = (null == casFeat_baseline) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseline).getCode();

 
    casFeat_format = jcas.getRequiredFeatureDE(casType, "format", "org.texttechnologylab.annotation.ocr.abbyy.Format", featOkTst);
    casFeatCode_format  = (null == casFeat_format) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_format).getCode();

  }
}



    