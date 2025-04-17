
/* First created by JCasGen Thu Apr 17 16:49:42 CEST 2025 */
package org.texttechnologylab.annotation.parliament;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Thu Apr 17 16:49:42 CEST 2025
 *
 * @generated
 */
public class Speech_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Speech.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliament.Speech");

    /**
     * @generated
     */
    final Feature casFeat_speaker;
    /**
     * @generated
     */
    final int casFeatCode_speaker;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getSpeaker(int addr) {
        if (featOkTst && casFeat_speaker == null)
            jcas.throwFeatMissing("speaker", "org.texttechnologylab.annotation.parliament.Speech");
        return ll_cas.ll_getRefValue(addr, casFeatCode_speaker);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSpeaker(int addr, int v) {
        if (featOkTst && casFeat_speaker == null)
            jcas.throwFeatMissing("speaker", "org.texttechnologylab.annotation.parliament.Speech");
        ll_cas.ll_setRefValue(addr, casFeatCode_speaker, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Speech_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_speaker = jcas.getRequiredFeatureDE(casType, "speaker", "org.texttechnologylab.annotation.parliament.Speaker", featOkTst);
        casFeatCode_speaker = (null == casFeat_speaker) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_speaker).getCode();

    }
}



    