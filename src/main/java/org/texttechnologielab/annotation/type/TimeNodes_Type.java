
/* First created by JCasGen Sun Sep 23 23:33:56 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Sun Sep 23 23:34:03 CEST 2018
 *
 * @generated
 */
public class TimeNodes_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TimeNodes.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TimeNodes");

    /**
     * @generated
     */
    final Feature casFeat_x;
    /**
     * @generated
     */
    final int casFeatCode_x;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getX(int addr) {
        if (featOkTst && casFeat_x == null)
            jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNodes");
        return ll_cas.ll_getIntValue(addr, casFeatCode_x);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setX(int addr, int v) {
        if (featOkTst && casFeat_x == null)
            jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNodes");
        ll_cas.ll_setIntValue(addr, casFeatCode_x, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_y;
    /**
     * @generated
     */
    final int casFeatCode_y;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getY(int addr) {
        if (featOkTst && casFeat_y == null)
            jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNodes");
        return ll_cas.ll_getIntValue(addr, casFeatCode_y);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setY(int addr, int v) {
        if (featOkTst && casFeat_y == null)
            jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNodes");
        ll_cas.ll_setIntValue(addr, casFeatCode_y, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_value;
    /**
     * @generated
     */
    final int casFeatCode_value;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNodes");
        return ll_cas.ll_getStringValue(addr, casFeatCode_value);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNodes");
        ll_cas.ll_setStringValue(addr, casFeatCode_value, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_subvalue;
    /**
     * @generated
     */
    final int casFeatCode_subvalue;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getSubvalue(int addr) {
        if (featOkTst && casFeat_subvalue == null)
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNodes");
        return ll_cas.ll_getStringValue(addr, casFeatCode_subvalue);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSubvalue(int addr, String v) {
        if (featOkTst && casFeat_subvalue == null)
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNodes");
        ll_cas.ll_setStringValue(addr, casFeatCode_subvalue, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeNodes_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.Integer", featOkTst);
        casFeatCode_x = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_x).getCode();


        casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.Integer", featOkTst);
        casFeatCode_y = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_y).getCode();


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();


        casFeat_subvalue = jcas.getRequiredFeatureDE(casType, "subvalue", "uima.cas.String", featOkTst);
        casFeatCode_subvalue = (null == casFeat_subvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_subvalue).getCode();

    }
}



    