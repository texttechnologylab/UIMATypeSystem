

/* First created by JCasGen Wed Feb 14 16:42:03 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class Hyperedge extends GraphBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Hyperedge.class);
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
    protected Hyperedge() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Hyperedge(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Hyperedge(JCas jcas) {
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
    //* Feature: endpoints

    /**
     * getter for endpoints - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getEndpoints() {
        if (Hyperedge_Type.featOkTst && ((Hyperedge_Type) jcasType).casFeat_endpoints == null)
            jcasType.jcas.throwFeatMissing("endpoints", "org.hucompute.services.type.Hyperedge");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Hyperedge_Type) jcasType).casFeatCode_endpoints)));
    }

    /**
     * setter for endpoints - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEndpoints(FSArray v) {
        if (Hyperedge_Type.featOkTst && ((Hyperedge_Type) jcasType).casFeat_endpoints == null)
            jcasType.jcas.throwFeatMissing("endpoints", "org.hucompute.services.type.Hyperedge");
        jcasType.ll_cas.ll_setRefValue(addr, ((Hyperedge_Type) jcasType).casFeatCode_endpoints, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for endpoints - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public Endpoint getEndpoints(int i) {
        if (Hyperedge_Type.featOkTst && ((Hyperedge_Type) jcasType).casFeat_endpoints == null)
            jcasType.jcas.throwFeatMissing("endpoints", "org.hucompute.services.type.Hyperedge");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Hyperedge_Type) jcasType).casFeatCode_endpoints), i);
        return (Endpoint) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Hyperedge_Type) jcasType).casFeatCode_endpoints), i)));
    }

    /**
     * indexed setter for endpoints - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setEndpoints(int i, Endpoint v) {
        if (Hyperedge_Type.featOkTst && ((Hyperedge_Type) jcasType).casFeat_endpoints == null)
            jcasType.jcas.throwFeatMissing("endpoints", "org.hucompute.services.type.Hyperedge");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Hyperedge_Type) jcasType).casFeatCode_endpoints), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Hyperedge_Type) jcasType).casFeatCode_endpoints), i, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    