
/* First created by JCasGen Wed Feb 14 16:42:03 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 *
 * @generated
 */
public class GraphBase_Type extends AnnotationBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = GraphBase.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.services.type.GraphBase");

    /**
     * @generated
     */
    final Feature casFeat_Id;
    /**
     * @generated
     */
    final int casFeatCode_Id;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getId(int addr) {
        if (featOkTst && casFeat_Id == null)
            jcas.throwFeatMissing("Id", "org.hucompute.services.type.GraphBase");
        return ll_cas.ll_getStringValue(addr, casFeatCode_Id);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setId(int addr, String v) {
        if (featOkTst && casFeat_Id == null)
            jcas.throwFeatMissing("Id", "org.hucompute.services.type.GraphBase");
        ll_cas.ll_setStringValue(addr, casFeatCode_Id, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_label;
    /**
     * @generated
     */
    final int casFeatCode_label;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
            jcas.throwFeatMissing("label", "org.hucompute.services.type.GraphBase");
        return ll_cas.ll_getStringValue(addr, casFeatCode_label);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
            jcas.throwFeatMissing("label", "org.hucompute.services.type.GraphBase");
        ll_cas.ll_setStringValue(addr, casFeatCode_label, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public GraphBase_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_Id = jcas.getRequiredFeatureDE(casType, "Id", "uima.cas.String", featOkTst);
        casFeatCode_Id = (null == casFeat_Id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_Id).getCode();


        casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
        casFeatCode_label = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_label).getCode();

    }
}



    