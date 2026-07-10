
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.relation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Base type for annotation relations between two annotations (u, v).
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class AnnotationRelation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.relation.AnnotationRelation");
 
  /** @generated */
  final Feature casFeat_u;
  /** @generated */
  final int     casFeatCode_u;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getU(int addr) {
        if (featOkTst && casFeat_u == null)
      jcas.throwFeatMissing("u", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_u);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setU(int addr, int v) {
        if (featOkTst && casFeat_u == null)
      jcas.throwFeatMissing("u", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_u, v);}
    
  
 
  /** @generated */
  final Feature casFeat_v;
  /** @generated */
  final int     casFeatCode_v;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getV(int addr) {
        if (featOkTst && casFeat_v == null)
      jcas.throwFeatMissing("v", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_v);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setV(int addr, int v) {
        if (featOkTst && casFeat_v == null)
      jcas.throwFeatMissing("v", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_v, v);}
    
  
 
  /** @generated */
  final Feature casFeat_directed;
  /** @generated */
  final int     casFeatCode_directed;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getDirected(int addr) {
        if (featOkTst && casFeat_directed == null)
      jcas.throwFeatMissing("directed", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_directed);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDirected(int addr, boolean v) {
        if (featOkTst && casFeat_directed == null)
      jcas.throwFeatMissing("directed", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_directed, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotationRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_u = jcas.getRequiredFeatureDE(casType, "u", "uima.tcas.Annotation", featOkTst);
    casFeatCode_u  = (null == casFeat_u) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_u).getCode();

 
    casFeat_v = jcas.getRequiredFeatureDE(casType, "v", "uima.tcas.Annotation", featOkTst);
    casFeatCode_v  = (null == casFeat_v) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_v).getCode();

 
    casFeat_directed = jcas.getRequiredFeatureDE(casType, "directed", "uima.cas.Boolean", featOkTst);
    casFeatCode_directed  = (null == casFeat_directed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_directed).getCode();

  }
}



    