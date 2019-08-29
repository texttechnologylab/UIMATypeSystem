
/* First created by JCasGen Thu Aug 30 01:52:35 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Mon May 06 17:11:48 CEST 2019
 *
 * @generated
 */
public class QuickAnnoUnit_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = QuickAnnoUnit.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.QuickAnnoUnit");

    /**
     * @generated
     */
    final Feature casFeat_begin;
    /**
     * @generated
     */
    final int casFeatCode_begin;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_end;
    /**
     * @generated
     */
    final int casFeatCode_end;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return ll_cas.ll_getIntValue(addr, casFeatCode_end);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        ll_cas.ll_setIntValue(addr, casFeatCode_end, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_combined;
    /**
     * @generated
     */
    final int casFeatCode_combined;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public boolean getCombined(int addr) {
        if (featOkTst && casFeat_combined == null)
            jcas.throwFeatMissing("combined", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return ll_cas.ll_getBooleanValue(addr, casFeatCode_combined);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setCombined(int addr, boolean v) {
        if (featOkTst && casFeat_combined == null)
            jcas.throwFeatMissing("combined", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        ll_cas.ll_setBooleanValue(addr, casFeatCode_combined, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_pos;
    /**
     * @generated
     */
    final int casFeatCode_pos;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getPos(int addr) {
        if (featOkTst && casFeat_pos == null)
            jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return ll_cas.ll_getStringValue(addr, casFeatCode_pos);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setPos(int addr, String v) {
        if (featOkTst && casFeat_pos == null)
            jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        ll_cas.ll_setStringValue(addr, casFeatCode_pos, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_origin;
    /**
     * @generated
     */
    final int casFeatCode_origin;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getOrigin(int addr) {
        if (featOkTst && casFeat_origin == null)
            jcas.throwFeatMissing("origin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return ll_cas.ll_getRefValue(addr, casFeatCode_origin);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setOrigin(int addr, int v) {
        if (featOkTst && casFeat_origin == null)
            jcas.throwFeatMissing("origin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        ll_cas.ll_setRefValue(addr, casFeatCode_origin, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public QuickAnnoUnit_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
        casFeatCode_begin = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_begin).getCode();


        casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
        casFeatCode_end = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_end).getCode();


        casFeat_combined = jcas.getRequiredFeatureDE(casType, "combined", "uima.cas.Boolean", featOkTst);
        casFeatCode_combined = (null == casFeat_combined) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_combined).getCode();


        casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "uima.cas.String", featOkTst);
        casFeatCode_pos = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_pos).getCode();


        casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "uima.tcas.Annotation", featOkTst);
        casFeatCode_origin = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_origin).getCode();

    }
}



    