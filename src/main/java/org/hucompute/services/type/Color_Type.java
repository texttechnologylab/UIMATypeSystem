
/* First created by JCasGen Wed Feb 14 16:42:03 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 *
 * @generated
 */
public class Color_Type extends Attribute_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Color.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.services.type.Color");

    /**
     * @generated
     */
    final Feature casFeat_value;
    /**
     * @generated
     */
    final int casFeatCode_value;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getValue(int addr) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.hucompute.services.type.Color");
        return ll_cas.ll_getIntValue(addr, casFeatCode_value);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setValue(int addr, int v) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.hucompute.services.type.Color");
        ll_cas.ll_setIntValue(addr, casFeatCode_value, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Color_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.Integer", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();

    }
}



    