
/* First created by JCasGen Wed Feb 20 18:22:31 CET 2019 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Fri Jun 21 09:34:41 CEST 2019
 *
 * @generated
 */
public class Finish_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Finish.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.Finish");

    /**
     * @generated
     */
    final Feature casFeat_user;
    /**
     * @generated
     */
    final int casFeatCode_user;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getUser(int addr) {
        if (featOkTst && casFeat_user == null)
            jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.Finish");
        return ll_cas.ll_getStringValue(addr, casFeatCode_user);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
            jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.Finish");
        ll_cas.ll_setStringValue(addr, casFeatCode_user, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_toolview;
    /**
     * @generated
     */
    final int casFeatCode_toolview;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getToolview(int addr) {
        if (featOkTst && casFeat_toolview == null)
            jcas.throwFeatMissing("toolview", "org.texttechnologylab.annotation.administration.Finish");
        return ll_cas.ll_getStringValue(addr, casFeatCode_toolview);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setToolview(int addr, String v) {
        if (featOkTst && casFeat_toolview == null)
            jcas.throwFeatMissing("toolview", "org.texttechnologylab.annotation.administration.Finish");
        ll_cas.ll_setStringValue(addr, casFeatCode_toolview, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Finish_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
        casFeatCode_user = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_user).getCode();


        casFeat_toolview = jcas.getRequiredFeatureDE(casType, "toolview", "uima.cas.String", featOkTst);
        casFeatCode_toolview = (null == casFeat_toolview) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_toolview).getCode();

    }
}



    