
/* First created by JCasGen Sun Sep 23 23:33:56 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Tue Oct 30 13:23:36 CET 2018
 *
 * @generated
 */
public class TimeEdge_Type extends Edge_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TimeEdge.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TimeEdge");

    /**
     * @generated
     */
    final Feature casFeat_mode;
    /**
     * @generated
     */
    final int casFeatCode_mode;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getMode(int addr) {
        if (featOkTst && casFeat_mode == null)
            jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.TimeEdge");
        return ll_cas.ll_getStringValue(addr, casFeatCode_mode);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setMode(int addr, String v) {
        if (featOkTst && casFeat_mode == null)
            jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.TimeEdge");
        ll_cas.ll_setStringValue(addr, casFeatCode_mode, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeEdge_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_mode = jcas.getRequiredFeatureDE(casType, "mode", "uima.cas.String", featOkTst);
        casFeatCode_mode = (null == casFeat_mode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_mode).getCode();

    }
}



    