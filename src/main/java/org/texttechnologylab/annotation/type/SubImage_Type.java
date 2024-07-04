
/* First created by JCasGen Thu Jul 04 14:57:19 CEST 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Thu Jul 04 14:57:19 CEST 2024
 *
 * @generated
 */
public class SubImage_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = SubImage.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.SubImage");

    /**
     * @generated
     */
    final Feature casFeat_coordinates;
    /**
     * @generated
     */
    final int casFeatCode_coordinates;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getCoordinates(int addr) {
        if (featOkTst && casFeat_coordinates == null)
            jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
        return ll_cas.ll_getRefValue(addr, casFeatCode_coordinates);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setCoordinates(int addr, int v) {
        if (featOkTst && casFeat_coordinates == null)
            jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
        ll_cas.ll_setRefValue(addr, casFeatCode_coordinates, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getCoordinates(int addr, int i) {
        if (featOkTst && casFeat_coordinates == null)
            jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_coordinates), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_coordinates), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_coordinates), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setCoordinates(int addr, int i, int v) {
        if (featOkTst && casFeat_coordinates == null)
            jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_coordinates), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_coordinates), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_coordinates), i, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_parent;
    /**
     * @generated
     */
    final int casFeatCode_parent;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getParent(int addr) {
        if (featOkTst && casFeat_parent == null)
            jcas.throwFeatMissing("parent", "org.texttechnologylab.annotation.type.SubImage");
        return ll_cas.ll_getRefValue(addr, casFeatCode_parent);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setParent(int addr, int v) {
        if (featOkTst && casFeat_parent == null)
            jcas.throwFeatMissing("parent", "org.texttechnologylab.annotation.type.SubImage");
        ll_cas.ll_setRefValue(addr, casFeatCode_parent, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public SubImage_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_coordinates = jcas.getRequiredFeatureDE(casType, "coordinates", "uima.cas.FSArray", featOkTst);
        casFeatCode_coordinates = (null == casFeat_coordinates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_coordinates).getCode();


        casFeat_parent = jcas.getRequiredFeatureDE(casType, "parent", "org.texttechnologylab.annotation.type.Image", featOkTst);
        casFeatCode_parent = (null == casFeat_parent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_parent).getCode();

    }
}



    