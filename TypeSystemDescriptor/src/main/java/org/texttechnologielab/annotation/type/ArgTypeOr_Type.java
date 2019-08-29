
/* First created by JCasGen Fri Jul 20 13:34:02 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Fri Jul 20 13:34:02 CEST 2018
 *
 * @generated
 */
public class ArgTypeOr_Type extends ArgType_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = ArgTypeOr.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.ArgTypeOr");

    /**
     * @generated
     */
    final Feature casFeat_data2;
    /**
     * @generated
     */
    final int casFeatCode_data2;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getData2(int addr) {
        if (featOkTst && casFeat_data2 == null)
            jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeOr");
        return ll_cas.ll_getRefValue(addr, casFeatCode_data2);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setData2(int addr, int v) {
        if (featOkTst && casFeat_data2 == null)
            jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeOr");
        ll_cas.ll_setRefValue(addr, casFeatCode_data2, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getData2(int addr, int i) {
        if (featOkTst && casFeat_data2 == null)
            jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeOr");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setData2(int addr, int i, int v) {
        if (featOkTst && casFeat_data2 == null)
            jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeOr");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public ArgTypeOr_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_data2 = jcas.getRequiredFeatureDE(casType, "data2", "uima.cas.FSArray", featOkTst);
        casFeatCode_data2 = (null == casFeat_data2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_data2).getCode();

    }
}



    