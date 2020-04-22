
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Apr 07 19:23:38 CEST 2020
 * @generated */
public class Entity_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Entity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isobase.Entity");
 
  /** @generated */
  final Feature casFeat_comment;
  /** @generated */
  final int     casFeatCode_comment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComment(int addr) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mod;
  /** @generated */
  final int     casFeatCode_mod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMod(int addr) {
        if (featOkTst && casFeat_mod == null)
      jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMod(int addr, String v) {
        if (featOkTst && casFeat_mod == null)
      jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_mod, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Entity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

 
    casFeat_mod = jcas.getRequiredFeatureDE(casType, "mod", "uima.cas.String", featOkTst);
    casFeatCode_mod  = (null == casFeat_mod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mod).getCode();

  }
}



    