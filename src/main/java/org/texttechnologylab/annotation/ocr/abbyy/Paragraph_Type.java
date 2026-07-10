
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Paragraph of a recognized text.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class Paragraph_Type extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Paragraph_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Paragraph.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
 
  /** @generated */
  final Feature casFeat_leftIndent;
  /** @generated */
  final int     casFeatCode_leftIndent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLeftIndent(int addr) {
        if (featOkTst && casFeat_leftIndent == null)
      jcas.throwFeatMissing("leftIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return ll_cas.ll_getIntValue(addr, casFeatCode_leftIndent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLeftIndent(int addr, int v) {
        if (featOkTst && casFeat_leftIndent == null)
      jcas.throwFeatMissing("leftIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    ll_cas.ll_setIntValue(addr, casFeatCode_leftIndent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rightIndent;
  /** @generated */
  final int     casFeatCode_rightIndent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRightIndent(int addr) {
        if (featOkTst && casFeat_rightIndent == null)
      jcas.throwFeatMissing("rightIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return ll_cas.ll_getIntValue(addr, casFeatCode_rightIndent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRightIndent(int addr, int v) {
        if (featOkTst && casFeat_rightIndent == null)
      jcas.throwFeatMissing("rightIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    ll_cas.ll_setIntValue(addr, casFeatCode_rightIndent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startIndent;
  /** @generated */
  final int     casFeatCode_startIndent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartIndent(int addr) {
        if (featOkTst && casFeat_startIndent == null)
      jcas.throwFeatMissing("startIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return ll_cas.ll_getIntValue(addr, casFeatCode_startIndent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartIndent(int addr, int v) {
        if (featOkTst && casFeat_startIndent == null)
      jcas.throwFeatMissing("startIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    ll_cas.ll_setIntValue(addr, casFeatCode_startIndent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lineSpacing;
  /** @generated */
  final int     casFeatCode_lineSpacing;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLineSpacing(int addr) {
        if (featOkTst && casFeat_lineSpacing == null)
      jcas.throwFeatMissing("lineSpacing", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return ll_cas.ll_getIntValue(addr, casFeatCode_lineSpacing);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLineSpacing(int addr, int v) {
        if (featOkTst && casFeat_lineSpacing == null)
      jcas.throwFeatMissing("lineSpacing", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    ll_cas.ll_setIntValue(addr, casFeatCode_lineSpacing, v);}
    
  
 
  /** @generated */
  final Feature casFeat_alignment;
  /** @generated */
  final int     casFeatCode_alignment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAlignment(int addr) {
        if (featOkTst && casFeat_alignment == null)
      jcas.throwFeatMissing("alignment", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return ll_cas.ll_getStringValue(addr, casFeatCode_alignment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAlignment(int addr, String v) {
        if (featOkTst && casFeat_alignment == null)
      jcas.throwFeatMissing("alignment", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    ll_cas.ll_setStringValue(addr, casFeatCode_alignment, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Paragraph_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_leftIndent = jcas.getRequiredFeatureDE(casType, "leftIndent", "uima.cas.Integer", featOkTst);
    casFeatCode_leftIndent  = (null == casFeat_leftIndent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_leftIndent).getCode();

 
    casFeat_rightIndent = jcas.getRequiredFeatureDE(casType, "rightIndent", "uima.cas.Integer", featOkTst);
    casFeatCode_rightIndent  = (null == casFeat_rightIndent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rightIndent).getCode();

 
    casFeat_startIndent = jcas.getRequiredFeatureDE(casType, "startIndent", "uima.cas.Integer", featOkTst);
    casFeatCode_startIndent  = (null == casFeat_startIndent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startIndent).getCode();

 
    casFeat_lineSpacing = jcas.getRequiredFeatureDE(casType, "lineSpacing", "uima.cas.Integer", featOkTst);
    casFeatCode_lineSpacing  = (null == casFeat_lineSpacing) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lineSpacing).getCode();

 
    casFeat_alignment = jcas.getRequiredFeatureDE(casType, "alignment", "org.texttechnologylab.annotation.ocr.abbyy.ParagraphAlignment", featOkTst);
    casFeatCode_alignment  = (null == casFeat_alignment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_alignment).getCode();

  }
}



    