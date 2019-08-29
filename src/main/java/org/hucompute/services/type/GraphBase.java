

/* First created by JCasGen Wed Feb 14 16:42:03 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class GraphBase extends AnnotationBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(GraphBase.class);
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
    protected GraphBase() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public GraphBase(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public GraphBase(JCas jcas) {
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
    //* Feature: Id

    /**
     * getter for Id - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getId() {
        if (GraphBase_Type.featOkTst && ((GraphBase_Type) jcasType).casFeat_Id == null)
            jcasType.jcas.throwFeatMissing("Id", "org.hucompute.services.type.GraphBase");
        return jcasType.ll_cas.ll_getStringValue(addr, ((GraphBase_Type) jcasType).casFeatCode_Id);
    }

    /**
     * setter for Id - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setId(String v) {
        if (GraphBase_Type.featOkTst && ((GraphBase_Type) jcasType).casFeat_Id == null)
            jcasType.jcas.throwFeatMissing("Id", "org.hucompute.services.type.GraphBase");
        jcasType.ll_cas.ll_setStringValue(addr, ((GraphBase_Type) jcasType).casFeatCode_Id, v);
    }


    //*--------------*
    //* Feature: label

    /**
     * getter for label - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getLabel() {
        if (GraphBase_Type.featOkTst && ((GraphBase_Type) jcasType).casFeat_label == null)
            jcasType.jcas.throwFeatMissing("label", "org.hucompute.services.type.GraphBase");
        return jcasType.ll_cas.ll_getStringValue(addr, ((GraphBase_Type) jcasType).casFeatCode_label);
    }

    /**
     * setter for label - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLabel(String v) {
        if (GraphBase_Type.featOkTst && ((GraphBase_Type) jcasType).casFeat_label == null)
            jcasType.jcas.throwFeatMissing("label", "org.hucompute.services.type.GraphBase");
        jcasType.ll_cas.ll_setStringValue(addr, ((GraphBase_Type) jcasType).casFeatCode_label, v);
    }
}

    