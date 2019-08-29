

/* First created by JCasGen Fri Jul 20 13:34:02 CEST 2018 */
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
public class Node extends GraphBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Node.class);
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
    protected Node() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Node(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Node(JCas jcas) {
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
    //* Feature: attribute

    /**
     * getter for attribute - gets
     *
     * @return value of the feature
     * @generated
     */
    public Attribute getAttribute() {
        if (Node_Type.featOkTst && ((Node_Type) jcasType).casFeat_attribute == null)
            jcasType.jcas.throwFeatMissing("attribute", "org.texttechnologielab.annotation.type.Node");
        return (Attribute) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Node_Type) jcasType).casFeatCode_attribute)));
    }

    /**
     * setter for attribute - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setAttribute(Attribute v) {
        if (Node_Type.featOkTst && ((Node_Type) jcasType).casFeat_attribute == null)
            jcasType.jcas.throwFeatMissing("attribute", "org.texttechnologielab.annotation.type.Node");
        jcasType.ll_cas.ll_setRefValue(addr, ((Node_Type) jcasType).casFeatCode_attribute, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    