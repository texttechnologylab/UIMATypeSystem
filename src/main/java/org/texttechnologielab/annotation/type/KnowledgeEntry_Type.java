
/* First created by JCasGen Fri Jul 20 13:34:09 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Mon Jul 23 22:48:49 CEST 2018
 *
 * @generated
 */
public class KnowledgeEntry_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = KnowledgeEntry.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.KnowledgeEntry");

    /**
     * @generated
     */
    final Feature casFeat_identifier;
    /**
     * @generated
     */
    final int casFeatCode_identifier;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getIdentifier(int addr) {
        if (featOkTst && casFeat_identifier == null)
            jcas.throwFeatMissing("identifier", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return ll_cas.ll_getStringValue(addr, casFeatCode_identifier);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setIdentifier(int addr, String v) {
        if (featOkTst && casFeat_identifier == null)
            jcas.throwFeatMissing("identifier", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        ll_cas.ll_setStringValue(addr, casFeatCode_identifier, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_source;
    /**
     * @generated
     */
    final int casFeatCode_source;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
            jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return ll_cas.ll_getStringValue(addr, casFeatCode_source);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
            jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        ll_cas.ll_setStringValue(addr, casFeatCode_source, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_reference;
    /**
     * @generated
     */
    final int casFeatCode_reference;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
            jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return ll_cas.ll_getStringValue(addr, casFeatCode_reference);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setReference(int addr, String v) {
        if (featOkTst && casFeat_reference == null)
            jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        ll_cas.ll_setStringValue(addr, casFeatCode_reference, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_parentEntity;
    /**
     * @generated
     */
    final int casFeatCode_parentEntity;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getParentEntity(int addr) {
        if (featOkTst && casFeat_parentEntity == null)
            jcas.throwFeatMissing("parentEntity", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return ll_cas.ll_getStringValue(addr, casFeatCode_parentEntity);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setParentEntity(int addr, String v) {
        if (featOkTst && casFeat_parentEntity == null)
            jcas.throwFeatMissing("parentEntity", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        ll_cas.ll_setStringValue(addr, casFeatCode_parentEntity, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public KnowledgeEntry_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_identifier = jcas.getRequiredFeatureDE(casType, "identifier", "uima.cas.String", featOkTst);
        casFeatCode_identifier = (null == casFeat_identifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_identifier).getCode();


        casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
        casFeatCode_source = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_source).getCode();


        casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.String", featOkTst);
        casFeatCode_reference = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_reference).getCode();


        casFeat_parentEntity = jcas.getRequiredFeatureDE(casType, "parentEntity", "uima.cas.String", featOkTst);
        casFeatCode_parentEntity = (null == casFeat_parentEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_parentEntity).getCode();

    }
}



    