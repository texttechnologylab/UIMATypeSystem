

/* First created by JCasGen Fri Jul 20 13:34:04 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class AnnotationNode extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(AnnotationNode.class);
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
    protected AnnotationNode() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public AnnotationNode(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public AnnotationNode(JCas jcas) {
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
    //* Feature: begin

    /**
     * getter for begin - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getBegin() {
        if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.AnnotationNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotationNode_Type) jcasType).casFeatCode_begin);
    }

    /**
     * setter for begin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBegin(int v) {
        if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.AnnotationNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((AnnotationNode_Type) jcasType).casFeatCode_begin, v);
    }


    //*--------------*
    //* Feature: end

    /**
     * getter for end - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getEnd() {
        if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.AnnotationNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotationNode_Type) jcasType).casFeatCode_end);
    }

    /**
     * setter for end - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEnd(int v) {
        if (AnnotationNode_Type.featOkTst && ((AnnotationNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.AnnotationNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((AnnotationNode_Type) jcasType).casFeatCode_end, v);
    }
}

    