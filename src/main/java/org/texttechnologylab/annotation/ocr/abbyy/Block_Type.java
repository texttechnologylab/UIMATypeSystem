
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A recognized block.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class Block_Type extends StructuralElement_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Block.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.abbyy.Block");
 
  /** @generated */
  final Feature casFeat_blockType;
  /** @generated */
  final int     casFeatCode_blockType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getBlockType(int addr) {
        if (featOkTst && casFeat_blockType == null)
      jcas.throwFeatMissing("blockType", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    return ll_cas.ll_getStringValue(addr, casFeatCode_blockType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBlockType(int addr, String v) {
        if (featOkTst && casFeat_blockType == null)
      jcas.throwFeatMissing("blockType", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    ll_cas.ll_setStringValue(addr, casFeatCode_blockType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_blockName;
  /** @generated */
  final int     casFeatCode_blockName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getBlockName(int addr) {
        if (featOkTst && casFeat_blockName == null)
      jcas.throwFeatMissing("blockName", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    return ll_cas.ll_getStringValue(addr, casFeatCode_blockName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBlockName(int addr, String v) {
        if (featOkTst && casFeat_blockName == null)
      jcas.throwFeatMissing("blockName", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    ll_cas.ll_setStringValue(addr, casFeatCode_blockName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Block_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_blockType = jcas.getRequiredFeatureDE(casType, "blockType", "org.texttechnologylab.annotation.ocr.abbyy.BlockType", featOkTst);
    casFeatCode_blockType  = (null == casFeat_blockType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_blockType).getCode();

 
    casFeat_blockName = jcas.getRequiredFeatureDE(casType, "blockName", "uima.cas.String", featOkTst);
    casFeatCode_blockName  = (null == casFeat_blockName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_blockName).getCode();

  }
}



    