
/* First created by JCasGen Fri Feb 08 20:23:48 CET 2019 */
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
public class TreeNode_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TreeNode.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TreeNode");

    /**
     * @generated
     */
    final Feature casFeat_children;
    /**
     * @generated
     */
    final int casFeatCode_children;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getChildren(int addr) {
        if (featOkTst && casFeat_children == null)
            jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        return ll_cas.ll_getRefValue(addr, casFeatCode_children);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setChildren(int addr, int v) {
        if (featOkTst && casFeat_children == null)
            jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        ll_cas.ll_setRefValue(addr, casFeatCode_children, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getChildren(int addr, int i) {
        if (featOkTst && casFeat_children == null)
            jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_children), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setChildren(int addr, int i, int v) {
        if (featOkTst && casFeat_children == null)
            jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_children), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_parent;
    /**
     * @generated
     */
    final int casFeatCode_parent;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getParent(int addr) {
        if (featOkTst && casFeat_parent == null)
            jcas.throwFeatMissing("parent", "org.texttechnologielab.annotation.type.TreeNode");
        return ll_cas.ll_getRefValue(addr, casFeatCode_parent);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setParent(int addr, int v) {
        if (featOkTst && casFeat_parent == null)
            jcas.throwFeatMissing("parent", "org.texttechnologielab.annotation.type.TreeNode");
        ll_cas.ll_setRefValue(addr, casFeatCode_parent, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TreeNode_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_children = jcas.getRequiredFeatureDE(casType, "children", "uima.cas.FSArray", featOkTst);
        casFeatCode_children = (null == casFeat_children) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_children).getCode();


        casFeat_parent = jcas.getRequiredFeatureDE(casType, "parent", "org.texttechnologielab.annotation.type.Node", featOkTst);
        casFeatCode_parent = (null == casFeat_parent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_parent).getCode();

    }
}



    