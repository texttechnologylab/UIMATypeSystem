
/* First created by JCasGen Wed Aug 28 09:38:42 CEST 2019 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologielab.annotation.type.Node_Type;

/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 *
 * @generated
 */
public class RelationGroup_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = RelationGroup.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.node.type.RelationGroup");

    /**
     * @generated
     */
    final Feature casFeat_relation;
    /**
     * @generated
     */
    final int casFeatCode_relation;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getRelation(int addr) {
        if (featOkTst && casFeat_relation == null)
            jcas.throwFeatMissing("relation", "org.texttechnologylab.annotation.node.type.RelationGroup");
        return ll_cas.ll_getRefValue(addr, casFeatCode_relation);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setRelation(int addr, int v) {
        if (featOkTst && casFeat_relation == null)
            jcas.throwFeatMissing("relation", "org.texttechnologylab.annotation.node.type.RelationGroup");
        ll_cas.ll_setRefValue(addr, casFeatCode_relation, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_locationID;
    /**
     * @generated
     */
    final int casFeatCode_locationID;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getLocationID(int addr) {
        if (featOkTst && casFeat_locationID == null)
            jcas.throwFeatMissing("locationID", "org.texttechnologylab.annotation.node.type.RelationGroup");
        return ll_cas.ll_getIntValue(addr, casFeatCode_locationID);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setLocationID(int addr, int v) {
        if (featOkTst && casFeat_locationID == null)
            jcas.throwFeatMissing("locationID", "org.texttechnologylab.annotation.node.type.RelationGroup");
        ll_cas.ll_setIntValue(addr, casFeatCode_locationID, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_sentence;
    /**
     * @generated
     */
    final int casFeatCode_sentence;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
            jcas.throwFeatMissing("sentence", "org.texttechnologylab.annotation.node.type.RelationGroup");
        return ll_cas.ll_getIntValue(addr, casFeatCode_sentence);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
            jcas.throwFeatMissing("sentence", "org.texttechnologylab.annotation.node.type.RelationGroup");
        ll_cas.ll_setIntValue(addr, casFeatCode_sentence, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public RelationGroup_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_relation = jcas.getRequiredFeatureDE(casType, "relation", "org.texttechnologylab.annotation.node.type.RelationContext", featOkTst);
        casFeatCode_relation = (null == casFeat_relation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_relation).getCode();


        casFeat_locationID = jcas.getRequiredFeatureDE(casType, "locationID", "uima.cas.Integer", featOkTst);
        casFeatCode_locationID = (null == casFeat_locationID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_locationID).getCode();


        casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "uima.cas.Integer", featOkTst);
        casFeatCode_sentence = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_sentence).getCode();

    }
}



    