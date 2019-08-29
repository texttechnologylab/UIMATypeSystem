
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
public class Node_Type extends GraphBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Node.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.services.type.Node");

    /**
     * @generated
     */
    final Feature casFeat_attribute;
    /**
     * @generated
     */
    final int casFeatCode_attribute;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getAttribute(int addr) {
        if (featOkTst && casFeat_attribute == null)
            jcas.throwFeatMissing("attribute", "org.hucompute.services.type.Node");
        return ll_cas.ll_getRefValue(addr, casFeatCode_attribute);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setAttribute(int addr, int v) {
        if (featOkTst && casFeat_attribute == null)
            jcas.throwFeatMissing("attribute", "org.hucompute.services.type.Node");
        ll_cas.ll_setRefValue(addr, casFeatCode_attribute, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Node_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_attribute = jcas.getRequiredFeatureDE(casType, "attribute", "org.hucompute.services.type.Attribute", featOkTst);
        casFeatCode_attribute = (null == casFeat_attribute) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_attribute).getCode();

    }
}



    