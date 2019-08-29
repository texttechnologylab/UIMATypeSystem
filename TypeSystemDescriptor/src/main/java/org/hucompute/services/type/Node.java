

/* First created by JCasGen Wed Feb 14 16:42:03 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
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
            jcasType.jcas.throwFeatMissing("attribute", "org.hucompute.services.type.Node");
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
            jcasType.jcas.throwFeatMissing("attribute", "org.hucompute.services.type.Node");
        jcasType.ll_cas.ll_setRefValue(addr, ((Node_Type) jcasType).casFeatCode_attribute, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    