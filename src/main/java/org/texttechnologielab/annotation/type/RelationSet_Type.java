
/* First created by JCasGen Fri Jul 20 13:34:02 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 *
 * @generated
 */
public class RelationSet_Type extends AnnotationBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = RelationSet.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.RelationSet");

    /**
     * @generated
     */
    final Feature casFeat_relations;
    /**
     * @generated
     */
    final int casFeatCode_relations;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getRelations(int addr) {
        if (featOkTst && casFeat_relations == null)
            jcas.throwFeatMissing("relations", "org.texttechnologielab.annotation.type.RelationSet");
        return ll_cas.ll_getRefValue(addr, casFeatCode_relations);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setRelations(int addr, int v) {
        if (featOkTst && casFeat_relations == null)
            jcas.throwFeatMissing("relations", "org.texttechnologielab.annotation.type.RelationSet");
        ll_cas.ll_setRefValue(addr, casFeatCode_relations, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getRelations(int addr, int i) {
        if (featOkTst && casFeat_relations == null)
            jcas.throwFeatMissing("relations", "org.texttechnologielab.annotation.type.RelationSet");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_relations), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_relations), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_relations), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setRelations(int addr, int i, int v) {
        if (featOkTst && casFeat_relations == null)
            jcas.throwFeatMissing("relations", "org.texttechnologielab.annotation.type.RelationSet");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_relations), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_relations), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_relations), i, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public RelationSet_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_relations = jcas.getRequiredFeatureDE(casType, "relations", "uima.cas.FSArray", featOkTst);
        casFeatCode_relations = (null == casFeat_relations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_relations).getCode();

    }
}



    