
/* First created by JCasGen Fri Jul 20 13:34:17 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Fri Jul 20 13:34:17 CEST 2018
 *
 * @generated
 */
public class TexttechnologyNamedEntity_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TexttechnologyNamedEntity.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");

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
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_subvalue);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSubvalue(int addr, String v) {
        if (featOkTst && casFeat_subvalue == null)
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_subvalue, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_belongsTo;
    /**
     * @generated
     */
    final int casFeatCode_belongsTo;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getBelongsTo(int addr) {
        if (featOkTst && casFeat_belongsTo == null)
            jcas.throwFeatMissing("belongsTo", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return ll_cas.ll_getRefValue(addr, casFeatCode_belongsTo);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBelongsTo(int addr, int v) {
        if (featOkTst && casFeat_belongsTo == null)
            jcas.throwFeatMissing("belongsTo", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        ll_cas.ll_setRefValue(addr, casFeatCode_belongsTo, v);
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
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_value);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_value, v);
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
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setKnowledgeEntries(int addr, int v) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        ll_cas.ll_setRefValue(addr, casFeatCode_knowledgeEntries, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public String getKnowledgeEntries(int addr, int i) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i);
        return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setKnowledgeEntries(int addr, int i, String v) {
        if (featOkTst && casFeat_knowledgeEntries == null)
            jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        if (lowLevelTypeChecks)
            ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i);
        ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_knowledgeEntries), i, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_wikipediaID;
    /**
     * @generated
     */
    final int casFeatCode_wikipediaID;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getWikipediaID(int addr) {
        if (featOkTst && casFeat_wikipediaID == null)
            jcas.throwFeatMissing("wikipediaID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_wikipediaID);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setWikipediaID(int addr, String v) {
        if (featOkTst && casFeat_wikipediaID == null)
            jcas.throwFeatMissing("wikipediaID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_wikipediaID, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_wikidataID;
    /**
     * @generated
     */
    final int casFeatCode_wikidataID;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getWikidataID(int addr) {
        if (featOkTst && casFeat_wikidataID == null)
            jcas.throwFeatMissing("wikidataID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return ll_cas.ll_getStringValue(addr, casFeatCode_wikidataID);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setWikidataID(int addr, String v) {
        if (featOkTst && casFeat_wikidataID == null)
            jcas.throwFeatMissing("wikidataID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        ll_cas.ll_setStringValue(addr, casFeatCode_wikidataID, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TexttechnologyNamedEntity_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_subvalue = jcas.getRequiredFeatureDE(casType, "subvalue", "uima.cas.String", featOkTst);
        casFeatCode_subvalue = (null == casFeat_subvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_subvalue).getCode();


        casFeat_belongsTo = jcas.getRequiredFeatureDE(casType, "belongsTo", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity", featOkTst);
        casFeatCode_belongsTo = (null == casFeat_belongsTo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_belongsTo).getCode();


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();


        casFeat_knowledgeEntries = jcas.getRequiredFeatureDE(casType, "knowledgeEntries", "uima.cas.StringArray", featOkTst);
        casFeatCode_knowledgeEntries = (null == casFeat_knowledgeEntries) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_knowledgeEntries).getCode();


        casFeat_wikipediaID = jcas.getRequiredFeatureDE(casType, "wikipediaID", "uima.cas.String", featOkTst);
        casFeatCode_wikipediaID = (null == casFeat_wikipediaID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_wikipediaID).getCode();


        casFeat_wikidataID = jcas.getRequiredFeatureDE(casType, "wikidataID", "uima.cas.String", featOkTst);
        casFeatCode_wikidataID = (null == casFeat_wikidataID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_wikidataID).getCode();

    }
}



    