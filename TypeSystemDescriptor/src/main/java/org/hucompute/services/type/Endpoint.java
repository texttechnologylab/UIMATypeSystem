

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
public class Endpoint extends GraphBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Endpoint.class);
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
    protected Endpoint() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Endpoint(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Endpoint(JCas jcas) {
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
    //* Feature: node

    /**
     * getter for node - gets
     *
     * @return value of the feature
     * @generated
     */
    public Node getNode() {
        if (Endpoint_Type.featOkTst && ((Endpoint_Type) jcasType).casFeat_node == null)
            jcasType.jcas.throwFeatMissing("node", "org.hucompute.services.type.Endpoint");
        return (Node) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Endpoint_Type) jcasType).casFeatCode_node)));
    }

    /**
     * setter for node - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setNode(Node v) {
        if (Endpoint_Type.featOkTst && ((Endpoint_Type) jcasType).casFeat_node == null)
            jcasType.jcas.throwFeatMissing("node", "org.hucompute.services.type.Endpoint");
        jcasType.ll_cas.ll_setRefValue(addr, ((Endpoint_Type) jcasType).casFeatCode_node, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    