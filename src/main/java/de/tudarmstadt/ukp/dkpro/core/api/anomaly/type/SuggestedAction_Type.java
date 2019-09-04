
/* First created by JCasGen Fri Jun 21 09:34:41 CEST 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.anomaly.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 04 14:12:24 CEST 2019
 * @generated */
public class SuggestedAction_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = SuggestedAction.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");

    /**
     * @generated
     */
    final Feature casFeat_replacement;
    /**
     * @generated
     */
    final int casFeatCode_replacement;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getReplacement(int addr) {
        if (featOkTst && casFeat_replacement == null)
      jcas.throwFeatMissing("replacement", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    return ll_cas.ll_getStringValue(addr, casFeatCode_replacement);
  }
    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setReplacement(int addr, String v) {
        if (featOkTst && casFeat_replacement == null)
      jcas.throwFeatMissing("replacement", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    ll_cas.ll_setStringValue(addr, casFeatCode_replacement, v);}
    
  
 
    /**
     * @generated
     */
    final Feature casFeat_certainty;
    /**
     * @generated
     */
    final int casFeatCode_certainty;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public float getCertainty(int addr) {
        if (featOkTst && casFeat_certainty == null)
      jcas.throwFeatMissing("certainty", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_certainty);
  }
    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setCertainty(int addr, float v) {
        if (featOkTst && casFeat_certainty == null)
      jcas.throwFeatMissing("certainty", "de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SuggestedAction");
    ll_cas.ll_setFloatValue(addr, casFeatCode_certainty, v);}
    
  



    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public SuggestedAction_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_replacement = jcas.getRequiredFeatureDE(casType, "replacement", "uima.cas.String", featOkTst);
    casFeatCode_replacement  = (null == casFeat_replacement) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_replacement).getCode();

 
    casFeat_certainty = jcas.getRequiredFeatureDE(casType, "certainty", "uima.cas.Float", featOkTst);
    casFeatCode_certainty  = (null == casFeat_certainty) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_certainty).getCode();

  }
}



    