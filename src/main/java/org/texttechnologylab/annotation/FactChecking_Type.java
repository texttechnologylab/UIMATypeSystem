
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Does the assertion confirm the statement
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class FactChecking_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FactChecking.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.FactChecking");
 
  /** @generated */
  final Feature casFeat_Fact;
  /** @generated */
  final int     casFeatCode_Fact;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFact(int addr) {
        if (featOkTst && casFeat_Fact == null)
      jcas.throwFeatMissing("Fact", "org.texttechnologylab.annotation.FactChecking");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Fact);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFact(int addr, int v) {
        if (featOkTst && casFeat_Fact == null)
      jcas.throwFeatMissing("Fact", "org.texttechnologylab.annotation.FactChecking");
    ll_cas.ll_setRefValue(addr, casFeatCode_Fact, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Claim;
  /** @generated */
  final int     casFeatCode_Claim;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getClaim(int addr) {
        if (featOkTst && casFeat_Claim == null)
      jcas.throwFeatMissing("Claim", "org.texttechnologylab.annotation.FactChecking");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Claim);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClaim(int addr, int v) {
        if (featOkTst && casFeat_Claim == null)
      jcas.throwFeatMissing("Claim", "org.texttechnologylab.annotation.FactChecking");
    ll_cas.ll_setRefValue(addr, casFeatCode_Claim, v);}
    
  
 
  /** @generated */
  final Feature casFeat_consistency;
  /** @generated */
  final int     casFeatCode_consistency;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConsistency(int addr) {
        if (featOkTst && casFeat_consistency == null)
      jcas.throwFeatMissing("consistency", "org.texttechnologylab.annotation.FactChecking");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_consistency);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConsistency(int addr, double v) {
        if (featOkTst && casFeat_consistency == null)
      jcas.throwFeatMissing("consistency", "org.texttechnologylab.annotation.FactChecking");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_consistency, v);}
    
  
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.FactChecking");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.FactChecking");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FactChecking_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Fact = jcas.getRequiredFeatureDE(casType, "Fact", "org.texttechnologylab.annotation.Fact", featOkTst);
    casFeatCode_Fact  = (null == casFeat_Fact) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Fact).getCode();

 
    casFeat_Claim = jcas.getRequiredFeatureDE(casType, "Claim", "org.texttechnologylab.annotation.Claim", featOkTst);
    casFeatCode_Claim  = (null == casFeat_Claim) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Claim).getCode();

 
    casFeat_consistency = jcas.getRequiredFeatureDE(casType, "consistency", "uima.cas.Double", featOkTst);
    casFeatCode_consistency  = (null == casFeat_consistency) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_consistency).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    