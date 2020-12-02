
/* First created by JCasGen Wed Dec 02 17:54:44 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Signal_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * @generated */
public class SpatialSignal_Type extends Signal_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpatialSignal.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
 
  /** @generated */
  final Feature casFeat_cluster;
  /** @generated */
  final int     casFeatCode_cluster;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCluster(int addr) {
        if (featOkTst && casFeat_cluster == null)
      jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cluster);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCluster(int addr, String v) {
        if (featOkTst && casFeat_cluster == null)
      jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    ll_cas.ll_setStringValue(addr, casFeatCode_cluster, v);}
    
  
 
  /** @generated */
  final Feature casFeat_semantic_type;
  /** @generated */
  final int     casFeatCode_semantic_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSemantic_type(int addr) {
        if (featOkTst && casFeat_semantic_type == null)
      jcas.throwFeatMissing("semantic_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    return ll_cas.ll_getStringValue(addr, casFeatCode_semantic_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSemantic_type(int addr, String v) {
        if (featOkTst && casFeat_semantic_type == null)
      jcas.throwFeatMissing("semantic_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal");
    ll_cas.ll_setStringValue(addr, casFeatCode_semantic_type, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpatialSignal_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_cluster = jcas.getRequiredFeatureDE(casType, "cluster", "uima.cas.String", featOkTst);
    casFeatCode_cluster  = (null == casFeat_cluster) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cluster).getCode();

 
    casFeat_semantic_type = jcas.getRequiredFeatureDE(casType, "semantic_type", "uima.cas.String", featOkTst);
    casFeatCode_semantic_type  = (null == casFeat_semantic_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_semantic_type).getCode();

  }
}



    