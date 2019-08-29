

/* First created by JCasGen Tue Oct 09 10:02:50 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


import org.apache.uima.jcas.cas.TOP;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class Comment extends AnnotationNode {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Comment.class);
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
    protected Comment() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Comment(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Comment(JCas jcas) {
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
    //* Feature: reference

    /**
     * getter for reference - gets
     *
     * @return value of the feature
     * @generated
     */
    public AnnotationBase getReference() {
        if (Comment_Type.featOkTst && ((Comment_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.Comment");
        return (AnnotationBase) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Comment_Type) jcasType).casFeatCode_reference)));
    }

    /**
     * setter for reference - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setReference(AnnotationBase v) {
        if (Comment_Type.featOkTst && ((Comment_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.Comment");
        jcasType.ll_cas.ll_setRefValue(addr, ((Comment_Type) jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    