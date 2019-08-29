
/* First created by JCasGen Fri Jul 20 13:34:09 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Fri Jul 20 13:34:09 CEST 2018
 *
 * @generated
 */
public class TextTechnologyEntity_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TextTechnologyEntity.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TextTechnologyEntity");

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
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_value);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
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
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_subvalue);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSubvalue(int addr, String v) {
        if (featOkTst && casFeat_subvalue == null)
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_subvalue, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_knowledgeEntries;
    /**
     * @generated
     */
    final int casFeatCode_knowledgeEntries;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getKnowledgeEntries(int addr) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setKnowledgeEntries(int addr, int v) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        ll_cas.ll_setRefValue(addr, casFeatCode_knowledgeEntries, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getKnowledgeEntries(int addr, int i) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setKnowledgeEntries(int addr, int i, int v) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i, v);
    }


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
    public String getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_begin);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBegin(int addr, String v) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_begin, v);
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
    public String getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_end);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setEnd(int addr, String v) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_end, v);
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
            jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_pos);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setPos(int addr, String v) {
        if (featOkTst && casFeat_pos == null)
            jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_pos, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TextTechnologyEntity_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();


        casFeat_subvalue = jcas.getRequiredFeatureDE(casType, "subvalue", "uima.cas.String", featOkTst);
        casFeatCode_subvalue = (null == casFeat_subvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_subvalue).getCode();


        casFeat_knowledgeEntries = jcas.getRequiredFeatureDE(casType, "knowledgeEntries", "uima.cas.FSArray", featOkTst);
        casFeatCode_knowledgeEntries = (null == casFeat_knowledgeEntries) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_knowledgeEntries).getCode();


        casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.String", featOkTst);
        casFeatCode_begin = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_begin).getCode();


        casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.String", featOkTst);
        casFeatCode_end = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_end).getCode();


        casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "uima.cas.String", featOkTst);
        casFeatCode_pos = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_pos).getCode();

    }
}



    