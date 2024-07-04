
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
public class MultimediaElement_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = MultimediaElement.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.MultimediaElement");

    /**
     * @generated
     */
    final Feature casFeat_timeStart;
    /**
     * @generated
     */
    final int casFeatCode_timeStart;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public float getTimeStart(int addr) {
        if (featOkTst && casFeat_timeStart == null)
            jcas.throwFeatMissing("timeStart", "org.texttechnologylab.annotation.type.MultimediaElement");
        return ll_cas.ll_getFloatValue(addr, casFeatCode_timeStart);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setTimeStart(int addr, float v) {
        if (featOkTst && casFeat_timeStart == null)
            jcas.throwFeatMissing("timeStart", "org.texttechnologylab.annotation.type.MultimediaElement");
        ll_cas.ll_setFloatValue(addr, casFeatCode_timeStart, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_timeEnd;
    /**
     * @generated
     */
    final int casFeatCode_timeEnd;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public float getTimeEnd(int addr) {
        if (featOkTst && casFeat_timeEnd == null)
            jcas.throwFeatMissing("timeEnd", "org.texttechnologylab.annotation.type.MultimediaElement");
        return ll_cas.ll_getFloatValue(addr, casFeatCode_timeEnd);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setTimeEnd(int addr, float v) {
        if (featOkTst && casFeat_timeEnd == null)
            jcas.throwFeatMissing("timeEnd", "org.texttechnologylab.annotation.type.MultimediaElement");
        ll_cas.ll_setFloatValue(addr, casFeatCode_timeEnd, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public MultimediaElement_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_timeStart = jcas.getRequiredFeatureDE(casType, "timeStart", "uima.cas.Float", featOkTst);
        casFeatCode_timeStart = (null == casFeat_timeStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_timeStart).getCode();


        casFeat_timeEnd = jcas.getRequiredFeatureDE(casType, "timeEnd", "uima.cas.Float", featOkTst);
        casFeatCode_timeEnd = (null == casFeat_timeEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_timeEnd).getCode();

    }
}



    