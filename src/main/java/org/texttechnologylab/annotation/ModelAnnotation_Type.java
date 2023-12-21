
/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * @generated */
public class ModelAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ModelAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ModelAnnotation");
 
  /** @generated */
  final Feature casFeat_ModelReference;
  /** @generated */
  final int     casFeatCode_ModelReference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModelReference(int addr) {
        if (featOkTst && casFeat_ModelReference == null)
      jcas.throwFeatMissing("ModelReference", "org.texttechnologylab.annotation.ModelAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ModelReference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelReference(int addr, int v) {
        if (featOkTst && casFeat_ModelReference == null)
      jcas.throwFeatMissing("ModelReference", "org.texttechnologylab.annotation.ModelAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_ModelReference, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ModelAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ModelReference = jcas.getRequiredFeatureDE(casType, "ModelReference", "org.texttechnologylab.annotation.MetaData", featOkTst);
    casFeatCode_ModelReference  = (null == casFeat_ModelReference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelReference).getCode();

  }
}



    