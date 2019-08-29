
/* First created by JCasGen Fri Jul 20 13:34:04 CEST 2018 */
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
public class AnnotationNode_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = AnnotationNode.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.AnnotationNode");

    /**
     * @generated
     */
    final Feature casFeat_begin;
    /**
     * @generated
     */
    final int casFeatCode_begin;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.AnnotationNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.AnnotationNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_end;
    /**
     * @generated
     */
    final int casFeatCode_end;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.AnnotationNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_end);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.AnnotationNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_end, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public AnnotationNode_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
        casFeatCode_begin = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_begin).getCode();


        casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
        casFeatCode_end = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_end).getCode();

    }
}



    