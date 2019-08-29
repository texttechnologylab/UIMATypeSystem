
/* First created by JCasGen Fri Jul 20 13:34:22 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Fri Jul 20 13:34:22 CEST 2018
 *
 * @generated
 */
public class PropRootNode_Type extends PropNode_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = PropRootNode.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.PropRootNode");

    /**
     * @generated
     */
    final Feature casFeat_arguments;
    /**
     * @generated
     */
    final int casFeatCode_arguments;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getArguments(int addr) {
        if (featOkTst && casFeat_arguments == null)
            jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        return ll_cas.ll_getRefValue(addr, casFeatCode_arguments);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setArguments(int addr, int v) {
        if (featOkTst && casFeat_arguments == null)
            jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        ll_cas.ll_setRefValue(addr, casFeatCode_arguments, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public String getArguments(int addr, int i) {
        if (featOkTst && casFeat_arguments == null)
            jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_arguments), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_arguments), i);
        return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_arguments), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setArguments(int addr, int i, String v) {
        if (featOkTst && casFeat_arguments == null)
            jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        if (lowLevelTypeChecks)
            ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_arguments), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_arguments), i);
        ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_arguments), i, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public PropRootNode_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_arguments = jcas.getRequiredFeatureDE(casType, "arguments", "uima.cas.StringArray", featOkTst);
        casFeatCode_arguments = (null == casFeat_arguments) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_arguments).getCode();

    }
}



    