
/* First created by JCasGen Thu Nov 05 17:32:23 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Signal_Type;

/** 
 * Updated by JCasGen Thu Nov 05 17:32:23 CET 2020
 * @generated */
public class SRelation_Type extends Signal_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.SRelation");
 
  /** @generated */
  final Feature casFeat_relation_type;
  /** @generated */
  final int     casFeatCode_relation_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRelation_type(int addr) {
        if (featOkTst && casFeat_relation_type == null)
      jcas.throwFeatMissing("relation_type", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relation_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelation_type(int addr, String v) {
        if (featOkTst && casFeat_relation_type == null)
      jcas.throwFeatMissing("relation_type", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    ll_cas.ll_setStringValue(addr, casFeatCode_relation_type, v);}
    
  
 
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
      jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cluster);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCluster(int addr, String v) {
        if (featOkTst && casFeat_cluster == null)
      jcas.throwFeatMissing("cluster", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    ll_cas.ll_setStringValue(addr, casFeatCode_cluster, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isospace.SRelation");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_relation_type = jcas.getRequiredFeatureDE(casType, "relation_type", "uima.cas.String", featOkTst);
    casFeatCode_relation_type  = (null == casFeat_relation_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relation_type).getCode();

 
    casFeat_cluster = jcas.getRequiredFeatureDE(casType, "cluster", "uima.cas.String", featOkTst);
    casFeatCode_cluster  = (null == casFeat_cluster) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cluster).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

  }
}



    