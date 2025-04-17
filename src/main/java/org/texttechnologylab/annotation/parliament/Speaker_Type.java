
/* First created by JCasGen Thu Apr 17 16:49:42 CEST 2025 */
package org.texttechnologylab.annotation.parliament;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Thu Apr 17 16:49:42 CEST 2025
 *
 * @generated
 */
public class Speaker_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Speaker.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliament.Speaker");

    /**
     * @generated
     */
    final Feature casFeat_label;
    /**
     * @generated
     */
    final int casFeatCode_label;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
            jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.parliament.Speaker");
        return ll_cas.ll_getStringValue(addr, casFeatCode_label);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
            jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.parliament.Speaker");
        ll_cas.ll_setStringValue(addr, casFeatCode_label, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_firstname;
    /**
     * @generated
     */
    final int casFeatCode_firstname;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getFirstname(int addr) {
        if (featOkTst && casFeat_firstname == null)
            jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.parliament.Speaker");
        return ll_cas.ll_getStringValue(addr, casFeatCode_firstname);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setFirstname(int addr, String v) {
        if (featOkTst && casFeat_firstname == null)
            jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.parliament.Speaker");
        ll_cas.ll_setStringValue(addr, casFeatCode_firstname, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_name;
    /**
     * @generated
     */
    final int casFeatCode_name;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
            jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.parliament.Speaker");
        return ll_cas.ll_getStringValue(addr, casFeatCode_name);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
            jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.parliament.Speaker");
        ll_cas.ll_setStringValue(addr, casFeatCode_name, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Speaker_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
        casFeatCode_label = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_label).getCode();


        casFeat_firstname = jcas.getRequiredFeatureDE(casType, "firstname", "uima.cas.String", featOkTst);
        casFeatCode_firstname = (null == casFeat_firstname) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_firstname).getCode();


        casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
        casFeatCode_name = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_name).getCode();

    }
}



    