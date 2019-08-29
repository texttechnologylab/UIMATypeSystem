

/* First created by JCasGen Fri Jul 20 13:34:22 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Fri Jul 20 13:34:22 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TexttechnologyPropAnno.xml
 *
 * @generated
 */
public class PropNode extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(PropNode.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected PropNode() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public PropNode(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public PropNode(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: graphId

    /**
     * getter for graphId - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getGraphId() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_graphId == null)
            jcasType.jcas.throwFeatMissing("graphId", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_graphId);
    }

    /**
     * setter for graphId - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setGraphId(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_graphId == null)
            jcasType.jcas.throwFeatMissing("graphId", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_graphId, v);
    }


    //*--------------*
    //* Feature: nodeId

    /**
     * getter for nodeId - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getNodeId() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_nodeId == null)
            jcasType.jcas.throwFeatMissing("nodeId", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_nodeId);
    }

    /**
     * setter for nodeId - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setNodeId(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_nodeId == null)
            jcasType.jcas.throwFeatMissing("nodeId", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_nodeId, v);
    }


    //*--------------*
    //* Feature: lemma

    /**
     * getter for lemma - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getLemma() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_lemma == null)
            jcasType.jcas.throwFeatMissing("lemma", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_lemma);
    }

    /**
     * setter for lemma - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLemma(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_lemma == null)
            jcasType.jcas.throwFeatMissing("lemma", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_lemma, v);
    }


    //*--------------*
    //* Feature: pos

    /**
     * getter for pos - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getPos() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_pos == null)
            jcasType.jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_pos);
    }

    /**
     * setter for pos - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPos(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_pos == null)
            jcasType.jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_pos, v);
    }


    //*--------------*
    //* Feature: text

    /**
     * getter for text - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getText() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_text == null)
            jcasType.jcas.throwFeatMissing("text", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_text);
    }

    /**
     * setter for text - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setText(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_text == null)
            jcasType.jcas.throwFeatMissing("text", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_text, v);
    }


    //*--------------*
    //* Feature: x

    /**
     * getter for x - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getX() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_x);
    }

    /**
     * setter for x - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_x, v);
    }


    //*--------------*
    //* Feature: y

    /**
     * getter for y - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getY() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_y);
    }

    /**
     * setter for y - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setY(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_y, v);
    }


    //*--------------*
    //* Feature: reference

    /**
     * getter for reference - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getReference() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_reference);
    }

    /**
     * setter for reference - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setReference(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_reference, v);
    }


    //*--------------*
    //* Feature: x2

    /**
     * getter for x2 - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getX2() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_x2 == null)
            jcasType.jcas.throwFeatMissing("x2", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_x2);
    }

    /**
     * setter for x2 - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX2(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_x2 == null)
            jcasType.jcas.throwFeatMissing("x2", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_x2, v);
    }


    //*--------------*
    //* Feature: y2

    /**
     * getter for y2 - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getY2() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_y2 == null)
            jcasType.jcas.throwFeatMissing("y2", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_y2);
    }

    /**
     * setter for y2 - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setY2(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_y2 == null)
            jcasType.jcas.throwFeatMissing("y2", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_y2, v);
    }


    //*--------------*
    //* Feature: begin

    /**
     * getter for begin - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getBegin() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_begin);
    }

    /**
     * setter for begin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBegin(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_begin, v);
    }


    //*--------------*
    //* Feature: end

    /**
     * getter for end - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getEnd() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_end);
    }

    /**
     * setter for end - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEnd(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_end, v);
    }


    //*--------------*
    //* Feature: color

    /**
     * getter for color - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getColor() {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_color == null)
            jcasType.jcas.throwFeatMissing("color", "org.texttechnologielab.annotation.type.PropNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_color);
    }

    /**
     * setter for color - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setColor(String v) {
        if (PropNode_Type.featOkTst && ((PropNode_Type) jcasType).casFeat_color == null)
            jcasType.jcas.throwFeatMissing("color", "org.texttechnologielab.annotation.type.PropNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropNode_Type) jcasType).casFeatCode_color, v);
    }
}

    