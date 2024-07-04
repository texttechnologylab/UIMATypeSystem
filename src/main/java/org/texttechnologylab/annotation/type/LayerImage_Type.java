
/* First created by JCasGen Thu Jul 04 14:57:19 CEST 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Thu Jul 04 14:57:19 CEST 2024
 *
 * @generated
 */
public class LayerImage_Type extends WebImage_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = LayerImage.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.LayerImage");

    /**
     * @generated
     */
    final Feature casFeat_index;
    /**
     * @generated
     */
    final int casFeatCode_index;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getIndex(int addr) {
        if (featOkTst && casFeat_index == null)
            jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.type.LayerImage");
        return ll_cas.ll_getIntValue(addr, casFeatCode_index);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setIndex(int addr, int v) {
        if (featOkTst && casFeat_index == null)
            jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.type.LayerImage");
        ll_cas.ll_setIntValue(addr, casFeatCode_index, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public LayerImage_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_index = jcas.getRequiredFeatureDE(casType, "index", "uima.cas.Integer", featOkTst);
        casFeatCode_index = (null == casFeat_index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_index).getCode();

    }
}



    