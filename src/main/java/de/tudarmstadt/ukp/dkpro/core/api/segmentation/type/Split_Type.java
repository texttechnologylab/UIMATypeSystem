
/* First created by JCasGen Thu Feb 28 20:07:01 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.segmentation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * This type represents a part of a decompounding word. A Split can be either a CompoundPart or a LinkingMorpheme.
 * Updated by JCasGen Thu Feb 28 20:08:17 CET 2019
 *
 * @generated
 */
public class Split_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Split.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");

    /**
     * @generated
     */
    final Feature casFeat_splits;
    /**
     * @generated
     */
    final int casFeatCode_splits;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getSplits(int addr) {
        if (featOkTst && casFeat_splits == null)
            jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        return ll_cas.ll_getRefValue(addr, casFeatCode_splits);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSplits(int addr, int v) {
        if (featOkTst && casFeat_splits == null)
            jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        ll_cas.ll_setRefValue(addr, casFeatCode_splits, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getSplits(int addr, int i) {
        if (featOkTst && casFeat_splits == null)
            jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_splits), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_splits), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_splits), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setSplits(int addr, int i, int v) {
        if (featOkTst && casFeat_splits == null)
            jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_splits), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_splits), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_splits), i, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Split_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_splits = jcas.getRequiredFeatureDE(casType, "splits", "uima.cas.FSArray", featOkTst);
        casFeatCode_splits = (null == casFeat_splits) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_splits).getCode();

    }
}



    