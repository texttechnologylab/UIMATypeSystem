
/* First created by JCasGen Sun Sep 23 23:34:17 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Tue Oct 30 13:23:37 CET 2018
 *
 * @generated
 */
public class TimeNode_Type extends Node_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TimeNode.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TimeNode");

    /**
     * @generated
     */
    final Feature casFeat_xPos;
    /**
     * @generated
     */
    final int casFeatCode_xPos;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getXPos(int addr) {
        if (featOkTst && casFeat_xPos == null)
            jcas.throwFeatMissing("xPos", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_xPos);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setXPos(int addr, int v) {
        if (featOkTst && casFeat_xPos == null)
            jcas.throwFeatMissing("xPos", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_xPos, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_depth;
    /**
     * @generated
     */
    final int casFeatCode_depth;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getDepth(int addr) {
        if (featOkTst && casFeat_depth == null)
            jcas.throwFeatMissing("depth", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_depth);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setDepth(int addr, int v) {
        if (featOkTst && casFeat_depth == null)
            jcas.throwFeatMissing("depth", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_depth, v);
    }


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
    public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getStringValue(addr, casFeatCode_value);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setStringValue(addr, casFeatCode_value, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_subvalue;
    /**
     * @generated
     */
    final int casFeatCode_subvalue;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getSubvalue(int addr) {
        if (featOkTst && casFeat_subvalue == null)
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getStringValue(addr, casFeatCode_subvalue);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSubvalue(int addr, String v) {
        if (featOkTst && casFeat_subvalue == null)
            jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setStringValue(addr, casFeatCode_subvalue, v);
    }


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
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
            jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_nodes;
    /**
     * @generated
     */
    final int casFeatCode_nodes;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getNodes(int addr) {
        if (featOkTst && casFeat_nodes == null)
            jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getRefValue(addr, casFeatCode_nodes);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setNodes(int addr, int v) {
        if (featOkTst && casFeat_nodes == null)
            jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setRefValue(addr, casFeatCode_nodes, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getNodes(int addr, int i) {
        if (featOkTst && casFeat_nodes == null)
            jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setNodes(int addr, int i, int v) {
        if (featOkTst && casFeat_nodes == null)
            jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nodes), i, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_edges;
    /**
     * @generated
     */
    final int casFeatCode_edges;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getEdges(int addr) {
        if (featOkTst && casFeat_edges == null)
            jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getRefValue(addr, casFeatCode_edges);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setEdges(int addr, int v) {
        if (featOkTst && casFeat_edges == null)
            jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setRefValue(addr, casFeatCode_edges, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public int getEdges(int addr, int i) {
        if (featOkTst && casFeat_edges == null)
            jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
        return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setEdges(int addr, int i, int v) {
        if (featOkTst && casFeat_edges == null)
            jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        if (lowLevelTypeChecks)
            ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i);
        ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_edges), i, v);
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
    public String getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getStringValue(addr, casFeatCode_end);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setEnd(int addr, String v) {
        if (featOkTst && casFeat_end == null)
            jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setStringValue(addr, casFeatCode_end, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_x;
    /**
     * @generated
     */
    final int casFeatCode_x;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getX(int addr) {
        if (featOkTst && casFeat_x == null)
            jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_x);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setX(int addr, int v) {
        if (featOkTst && casFeat_x == null)
            jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_x, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_y;
    /**
     * @generated
     */
    final int casFeatCode_y;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getY(int addr) {
        if (featOkTst && casFeat_y == null)
            jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getIntValue(addr, casFeatCode_y);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setY(int addr, int v) {
        if (featOkTst && casFeat_y == null)
            jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setIntValue(addr, casFeatCode_y, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_additionalvalue;
    /**
     * @generated
     */
    final int casFeatCode_additionalvalue;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getAdditionalvalue(int addr) {
        if (featOkTst && casFeat_additionalvalue == null)
            jcas.throwFeatMissing("additionalvalue", "org.texttechnologielab.annotation.type.TimeNode");
        return ll_cas.ll_getStringValue(addr, casFeatCode_additionalvalue);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setAdditionalvalue(int addr, String v) {
        if (featOkTst && casFeat_additionalvalue == null)
            jcas.throwFeatMissing("additionalvalue", "org.texttechnologielab.annotation.type.TimeNode");
        ll_cas.ll_setStringValue(addr, casFeatCode_additionalvalue, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeNode_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_xPos = jcas.getRequiredFeatureDE(casType, "xPos", "uima.cas.Integer", featOkTst);
        casFeatCode_xPos = (null == casFeat_xPos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_xPos).getCode();


        casFeat_depth = jcas.getRequiredFeatureDE(casType, "depth", "uima.cas.Integer", featOkTst);
        casFeatCode_depth = (null == casFeat_depth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_depth).getCode();


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();


        casFeat_subvalue = jcas.getRequiredFeatureDE(casType, "subvalue", "uima.cas.String", featOkTst);
        casFeatCode_subvalue = (null == casFeat_subvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_subvalue).getCode();


        casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
        casFeatCode_begin = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_begin).getCode();


        casFeat_nodes = jcas.getRequiredFeatureDE(casType, "nodes", "uima.cas.FSArray", featOkTst);
        casFeatCode_nodes = (null == casFeat_nodes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_nodes).getCode();


        casFeat_edges = jcas.getRequiredFeatureDE(casType, "edges", "uima.cas.FSArray", featOkTst);
        casFeatCode_edges = (null == casFeat_edges) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_edges).getCode();


        casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.String", featOkTst);
        casFeatCode_end = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_end).getCode();


        casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.Integer", featOkTst);
        casFeatCode_x = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_x).getCode();


        casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.Integer", featOkTst);
        casFeatCode_y = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_y).getCode();


        casFeat_additionalvalue = jcas.getRequiredFeatureDE(casType, "additionalvalue", "uima.cas.String", featOkTst);
        casFeatCode_additionalvalue = (null == casFeat_additionalvalue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_additionalvalue).getCode();

    }
}



    