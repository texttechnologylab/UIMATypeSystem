
/* First created by JCasGen Thu Feb 28 20:07:00 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.segmentation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Thu Feb 28 20:08:17 CET 2019
 *
 * @generated
 */
public class NGram_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = NGram.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram");

    /**
     * @generated
     */
    final Feature casFeat_text;
    /**
     * @generated
     */
    final int casFeatCode_text;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
            jcas.throwFeatMissing("text", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram");
        return ll_cas.ll_getStringValue(addr, casFeatCode_text);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
            jcas.throwFeatMissing("text", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram");
        ll_cas.ll_setStringValue(addr, casFeatCode_text, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public NGram_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
        casFeatCode_text = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_text).getCode();

    }
}



    