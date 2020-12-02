
/* First created by JCasGen Wed Dec 02 17:54:44 CET 2020 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * @generated */
public class Link_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Link.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isobase.Link");
 
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
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Link");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_figure;
  /** @generated */
  final int     casFeatCode_figure;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFigure(int addr) {
        if (featOkTst && casFeat_figure == null)
      jcas.throwFeatMissing("figure", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return ll_cas.ll_getRefValue(addr, casFeatCode_figure);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFigure(int addr, int v) {
        if (featOkTst && casFeat_figure == null)
      jcas.throwFeatMissing("figure", "org.texttechnologylab.annotation.semaf.isobase.Link");
    ll_cas.ll_setRefValue(addr, casFeatCode_figure, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ground;
  /** @generated */
  final int     casFeatCode_ground;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGround(int addr) {
        if (featOkTst && casFeat_ground == null)
      jcas.throwFeatMissing("ground", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ground);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGround(int addr, int v) {
        if (featOkTst && casFeat_ground == null)
      jcas.throwFeatMissing("ground", "org.texttechnologylab.annotation.semaf.isobase.Link");
    ll_cas.ll_setRefValue(addr, casFeatCode_ground, v);}
    
  
 
  /** @generated */
  final Feature casFeat_trigger;
  /** @generated */
  final int     casFeatCode_trigger;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTrigger(int addr) {
        if (featOkTst && casFeat_trigger == null)
      jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigger);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTrigger(int addr, int v) {
        if (featOkTst && casFeat_trigger == null)
      jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isobase.Link");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rel_type;
  /** @generated */
  final int     casFeatCode_rel_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRel_type(int addr) {
        if (featOkTst && casFeat_rel_type == null)
      jcas.throwFeatMissing("rel_type", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rel_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRel_type(int addr, String v) {
        if (featOkTst && casFeat_rel_type == null)
      jcas.throwFeatMissing("rel_type", "org.texttechnologylab.annotation.semaf.isobase.Link");
    ll_cas.ll_setStringValue(addr, casFeatCode_rel_type, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Link_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

 
    casFeat_figure = jcas.getRequiredFeatureDE(casType, "figure", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_figure  = (null == casFeat_figure) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_figure).getCode();

 
    casFeat_ground = jcas.getRequiredFeatureDE(casType, "ground", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_ground  = (null == casFeat_ground) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ground).getCode();

 
    casFeat_trigger = jcas.getRequiredFeatureDE(casType, "trigger", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_trigger  = (null == casFeat_trigger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigger).getCode();

 
    casFeat_rel_type = jcas.getRequiredFeatureDE(casType, "rel_type", "uima.cas.String", featOkTst);
    casFeatCode_rel_type  = (null == casFeat_rel_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rel_type).getCode();

  }
}



    