
/* First created by JCasGen Tue Oct 09 10:02:50 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 *
 * @generated
 */
public class Comment_Type extends AnnotationNode_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Comment.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.Comment");


    /**
     * @generated
     */
    final Feature casFeat_reference;
    /**
     * @generated
     */
    final int casFeatCode_reference;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
            jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.Comment");
        return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
            jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.Comment");
        ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Comment_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.AnnotationBase", featOkTst);
        casFeatCode_reference = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_reference).getCode();

    }
}



    