
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
public class Endpoint_Type extends GraphBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Endpoint.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.services.type.Endpoint");

    /**
     * @generated
     */
    final Feature casFeat_node;
    /**
     * @generated
     */
    final int casFeatCode_node;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getNode(int addr) {
        if (featOkTst && casFeat_node == null)
            jcas.throwFeatMissing("node", "org.hucompute.services.type.Endpoint");
        return ll_cas.ll_getRefValue(addr, casFeatCode_node);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setNode(int addr, int v) {
        if (featOkTst && casFeat_node == null)
            jcas.throwFeatMissing("node", "org.hucompute.services.type.Endpoint");
        ll_cas.ll_setRefValue(addr, casFeatCode_node, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Endpoint_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_node = jcas.getRequiredFeatureDE(casType, "node", "org.hucompute.services.type.Node", featOkTst);
        casFeatCode_node = (null == casFeat_node) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_node).getCode();

    }
}



    