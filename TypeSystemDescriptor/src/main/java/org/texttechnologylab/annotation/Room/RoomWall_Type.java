
/* First created by JCasGen Thu Aug 15 14:47:15 CEST 2019 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/**
 * Roomwall
 * Updated by JCasGen Thu Aug 15 14:47:15 CEST 2019
 *
 * @generated
 */
public class RoomWall_Type extends AnnotationBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = RoomWall.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Room.RoomWall");

    /**
     * @generated
     */
    final Feature casFeat_vectorlist;
    /**
     * @generated
     */
    final int casFeatCode_vectorlist;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getVectorlist(int addr) {
        if (featOkTst && casFeat_vectorlist == null)
            jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
        return ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setVectorlist(int addr, int v) {
        if (featOkTst && casFeat_vectorlist == null)
            jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
        ll_cas.ll_setRefValue(addr, casFeatCode_vectorlist, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getVectorlist(int addr, int i) {
        if (featOkTst && casFeat_vectorlist == null)
            jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setVectorlist(int addr, int i, int v) {
        if (featOkTst && casFeat_vectorlist == null)
            jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_height;
    /**
     * @generated
     */
    final int casFeatCode_height;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public double getHeight(int addr) {
        if (featOkTst && casFeat_height == null)
            jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.Room.RoomWall");
        return ll_cas.ll_getDoubleValue(addr, casFeatCode_height);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setHeight(int addr, double v) {
        if (featOkTst && casFeat_height == null)
            jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.Room.RoomWall");
        ll_cas.ll_setDoubleValue(addr, casFeatCode_height, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_feature;
    /**
     * @generated
     */
    final int casFeatCode_feature;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getFeature(int addr) {
        if (featOkTst && casFeat_feature == null)
            jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
        return ll_cas.ll_getRefValue(addr, casFeatCode_feature);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setFeature(int addr, int v) {
        if (featOkTst && casFeat_feature == null)
            jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
        ll_cas.ll_setRefValue(addr, casFeatCode_feature, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getFeature(int addr, int i) {
        if (featOkTst && casFeat_feature == null)
            jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setFeature(int addr, int i, int v) {
        if (featOkTst && casFeat_feature == null)
            jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public RoomWall_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_vectorlist = jcas.getRequiredFeatureDE(casType, "vectorlist", "uima.cas.FSArray", featOkTst);
        casFeatCode_vectorlist = (null == casFeat_vectorlist) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_vectorlist).getCode();


        casFeat_height = jcas.getRequiredFeatureDE(casType, "height", "uima.cas.Double", featOkTst);
        casFeatCode_height = (null == casFeat_height) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_height).getCode();


        casFeat_feature = jcas.getRequiredFeatureDE(casType, "feature", "uima.cas.FSArray", featOkTst);
        casFeatCode_feature = (null == casFeat_feature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_feature).getCode();

    }
}



    