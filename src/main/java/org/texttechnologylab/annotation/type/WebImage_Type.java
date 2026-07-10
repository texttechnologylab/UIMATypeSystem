
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class WebImage_Type extends Image_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = WebImage.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.WebImage");
 
  /** @generated */
  final Feature casFeat_posX;
  /** @generated */
  final int     casFeatCode_posX;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPosX(int addr) {
        if (featOkTst && casFeat_posX == null)
      jcas.throwFeatMissing("posX", "org.texttechnologylab.annotation.type.WebImage");
    return ll_cas.ll_getIntValue(addr, casFeatCode_posX);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPosX(int addr, int v) {
        if (featOkTst && casFeat_posX == null)
      jcas.throwFeatMissing("posX", "org.texttechnologylab.annotation.type.WebImage");
    ll_cas.ll_setIntValue(addr, casFeatCode_posX, v);}
    
  
 
  /** @generated */
  final Feature casFeat_posY;
  /** @generated */
  final int     casFeatCode_posY;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPosY(int addr) {
        if (featOkTst && casFeat_posY == null)
      jcas.throwFeatMissing("posY", "org.texttechnologylab.annotation.type.WebImage");
    return ll_cas.ll_getIntValue(addr, casFeatCode_posY);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPosY(int addr, int v) {
        if (featOkTst && casFeat_posY == null)
      jcas.throwFeatMissing("posY", "org.texttechnologylab.annotation.type.WebImage");
    ll_cas.ll_setIntValue(addr, casFeatCode_posY, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public WebImage_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_posX = jcas.getRequiredFeatureDE(casType, "posX", "uima.cas.Integer", featOkTst);
    casFeatCode_posX  = (null == casFeat_posX) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_posX).getCode();

 
    casFeat_posY = jcas.getRequiredFeatureDE(casType, "posY", "uima.cas.Integer", featOkTst);
    casFeatCode_posY  = (null == casFeat_posY) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_posY).getCode();

  }
}



    