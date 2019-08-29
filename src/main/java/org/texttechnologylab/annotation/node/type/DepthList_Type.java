
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
public class DepthList_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = DepthList.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.node.type.DepthList");

    /**
     * @generated
     */
    final Feature casFeat_displayName;
    /**
     * @generated
     */
    final int casFeatCode_displayName;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getDisplayName(int addr) {
        if (featOkTst && casFeat_displayName == null)
            jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.DepthList");
        return ll_cas.ll_getStringValue(addr, casFeatCode_displayName);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setDisplayName(int addr, String v) {
        if (featOkTst && casFeat_displayName == null)
            jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.DepthList");
        ll_cas.ll_setStringValue(addr, casFeatCode_displayName, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_hierarchie;
    /**
     * @generated
     */
    final int casFeatCode_hierarchie;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getHierarchie(int addr) {
        if (featOkTst && casFeat_hierarchie == null)
            jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        return ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setHierarchie(int addr, int v) {
        if (featOkTst && casFeat_hierarchie == null)
            jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        ll_cas.ll_setRefValue(addr, casFeatCode_hierarchie, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getHierarchie(int addr, int i) {
        if (featOkTst && casFeat_hierarchie == null)
            jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie), i);
        return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setHierarchie(int addr, int i, int v) {
        if (featOkTst && casFeat_hierarchie == null)
            jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        if (lowLevelTypeChecks)
            ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie), i);
        ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hierarchie), i, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public DepthList_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_displayName = jcas.getRequiredFeatureDE(casType, "displayName", "uima.cas.String", featOkTst);
        casFeatCode_displayName = (null == casFeat_displayName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_displayName).getCode();


        casFeat_hierarchie = jcas.getRequiredFeatureDE(casType, "hierarchie", "uima.cas.IntegerArray", featOkTst);
        casFeatCode_hierarchie = (null == casFeat_hierarchie) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_hierarchie).getCode();

    }
}



    