
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.relation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** An annotation that denotes an edit distance difference between two annotations.
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class EditDistance_Type extends AnnotationRelation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EditDistance.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.relation.EditDistance");
 
  /** @generated */
  final Feature casFeat_distance;
  /** @generated */
  final int     casFeatCode_distance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDistance(int addr) {
        if (featOkTst && casFeat_distance == null)
      jcas.throwFeatMissing("distance", "org.texttechnologylab.annotation.relation.EditDistance");
    return ll_cas.ll_getIntValue(addr, casFeatCode_distance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDistance(int addr, int v) {
        if (featOkTst && casFeat_distance == null)
      jcas.throwFeatMissing("distance", "org.texttechnologylab.annotation.relation.EditDistance");
    ll_cas.ll_setIntValue(addr, casFeatCode_distance, v);}
    
  
 
  /** @generated */
  final Feature casFeat_algorithm;
  /** @generated */
  final int     casFeatCode_algorithm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAlgorithm(int addr) {
        if (featOkTst && casFeat_algorithm == null)
      jcas.throwFeatMissing("algorithm", "org.texttechnologylab.annotation.relation.EditDistance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_algorithm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAlgorithm(int addr, String v) {
        if (featOkTst && casFeat_algorithm == null)
      jcas.throwFeatMissing("algorithm", "org.texttechnologylab.annotation.relation.EditDistance");
    ll_cas.ll_setStringValue(addr, casFeatCode_algorithm, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EditDistance_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_distance = jcas.getRequiredFeatureDE(casType, "distance", "uima.cas.Integer", featOkTst);
    casFeatCode_distance  = (null == casFeat_distance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_distance).getCode();

 
    casFeat_algorithm = jcas.getRequiredFeatureDE(casType, "algorithm", "uima.cas.String", featOkTst);
    casFeatCode_algorithm  = (null == casFeat_algorithm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_algorithm).getCode();

  }
}



    