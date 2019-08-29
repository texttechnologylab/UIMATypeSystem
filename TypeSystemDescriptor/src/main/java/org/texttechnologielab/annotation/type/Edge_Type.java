
/* First created by JCasGen Fri Jul 20 13:34:02 CEST 2018 */
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
public class Edge_Type extends GraphBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Edge.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.Edge");

    /**
     * @generated
     */
    final Feature casFeat_source;
    /**
     * @generated
     */
    final int casFeatCode_source;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getSource(int addr) {
        if (featOkTst && casFeat_source == null)
            jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.Edge");
        return ll_cas.ll_getRefValue(addr, casFeatCode_source);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSource(int addr, int v) {
        if (featOkTst && casFeat_source == null)
            jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.Edge");
        ll_cas.ll_setRefValue(addr, casFeatCode_source, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_target;
    /**
     * @generated
     */
    final int casFeatCode_target;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getTarget(int addr) {
        if (featOkTst && casFeat_target == null)
            jcas.throwFeatMissing("target", "org.texttechnologielab.annotation.type.Edge");
        return ll_cas.ll_getRefValue(addr, casFeatCode_target);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setTarget(int addr, int v) {
        if (featOkTst && casFeat_target == null)
            jcas.throwFeatMissing("target", "org.texttechnologielab.annotation.type.Edge");
        ll_cas.ll_setRefValue(addr, casFeatCode_target, v);
    }


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
            jcas.throwFeatMissing("attribute", "org.texttechnologielab.annotation.type.Edge");
        return ll_cas.ll_getRefValue(addr, casFeatCode_attribute);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setAttribute(int addr, int v) {
        if (featOkTst && casFeat_attribute == null)
            jcas.throwFeatMissing("attribute", "org.texttechnologielab.annotation.type.Edge");
        ll_cas.ll_setRefValue(addr, casFeatCode_attribute, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_edgetype;
    /**
     * @generated
     */
    final int casFeatCode_edgetype;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getEdgetype(int addr) {
        if (featOkTst && casFeat_edgetype == null)
            jcas.throwFeatMissing("edgetype", "org.texttechnologielab.annotation.type.Edge");
        return ll_cas.ll_getStringValue(addr, casFeatCode_edgetype);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setEdgetype(int addr, String v) {
        if (featOkTst && casFeat_edgetype == null)
            jcas.throwFeatMissing("edgetype", "org.texttechnologielab.annotation.type.Edge");
        ll_cas.ll_setStringValue(addr, casFeatCode_edgetype, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Edge_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "org.texttechnologielab.annotation.type.Node", featOkTst);
        casFeatCode_source = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_source).getCode();


        casFeat_target = jcas.getRequiredFeatureDE(casType, "target", "org.texttechnologielab.annotation.type.Node", featOkTst);
        casFeatCode_target = (null == casFeat_target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_target).getCode();


        casFeat_attribute = jcas.getRequiredFeatureDE(casType, "attribute", "org.texttechnologielab.annotation.type.Attribute", featOkTst);
        casFeatCode_attribute = (null == casFeat_attribute) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_attribute).getCode();


        casFeat_edgetype = jcas.getRequiredFeatureDE(casType, "edgetype", "uima.cas.String", featOkTst);
        casFeatCode_edgetype = (null == casFeat_edgetype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_edgetype).getCode();

    }
}



    