

/* First created by JCasGen Fri Jul 20 13:34:02 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Fri Jul 20 13:34:02 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyArgAnno.xml
 *
 * @generated
 */
public class ArgNode extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(ArgNode.class);
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
    protected ArgNode() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public ArgNode(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public ArgNode(JCas jcas) {
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_graphId == null)
            jcasType.jcas.throwFeatMissing("graphId", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_graphId);
    }

    /**
     * setter for graphId - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setGraphId(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_graphId == null)
            jcasType.jcas.throwFeatMissing("graphId", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_graphId, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_nodeId == null)
            jcasType.jcas.throwFeatMissing("nodeId", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_nodeId);
    }

    /**
     * setter for nodeId - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setNodeId(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_nodeId == null)
            jcasType.jcas.throwFeatMissing("nodeId", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_nodeId, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_text == null)
            jcasType.jcas.throwFeatMissing("text", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_text);
    }

    /**
     * setter for text - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setText(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_text == null)
            jcasType.jcas.throwFeatMissing("text", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_text, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_x);
    }

    /**
     * setter for x - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_x, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_y);
    }

    /**
     * setter for y - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setY(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_y, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_reference);
    }

    /**
     * setter for reference - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setReference(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_reference, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_begin);
    }

    /**
     * setter for begin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBegin(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_begin, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_end);
    }

    /**
     * setter for end - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEnd(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_end, v);
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
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_color == null)
            jcasType.jcas.throwFeatMissing("color", "org.texttechnologielab.annotation.type.ArgNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_color);
    }

    /**
     * setter for color - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setColor(String v) {
        if (ArgNode_Type.featOkTst && ((ArgNode_Type) jcasType).casFeat_color == null)
            jcasType.jcas.throwFeatMissing("color", "org.texttechnologielab.annotation.type.ArgNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgNode_Type) jcasType).casFeatCode_color, v);
    }
}

    