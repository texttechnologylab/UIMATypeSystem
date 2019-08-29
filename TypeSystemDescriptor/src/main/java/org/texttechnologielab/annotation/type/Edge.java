

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
public class Edge extends GraphBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Edge.class);
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
    protected Edge() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Edge(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Edge(JCas jcas) {
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
    //* Feature: source

    /**
     * getter for source - gets
     *
     * @return value of the feature
     * @generated
     */
    public Node getSource() {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_source == null)
            jcasType.jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.Edge");
        return (Node) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Edge_Type) jcasType).casFeatCode_source)));
    }

    /**
     * setter for source - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSource(Node v) {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_source == null)
            jcasType.jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.Edge");
        jcasType.ll_cas.ll_setRefValue(addr, ((Edge_Type) jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: target

    /**
     * getter for target - gets
     *
     * @return value of the feature
     * @generated
     */
    public Node getTarget() {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_target == null)
            jcasType.jcas.throwFeatMissing("target", "org.texttechnologielab.annotation.type.Edge");
        return (Node) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Edge_Type) jcasType).casFeatCode_target)));
    }

    /**
     * setter for target - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setTarget(Node v) {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_target == null)
            jcasType.jcas.throwFeatMissing("target", "org.texttechnologielab.annotation.type.Edge");
        jcasType.ll_cas.ll_setRefValue(addr, ((Edge_Type) jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: attribute

    /**
     * getter for attribute - gets
     *
     * @return value of the feature
     * @generated
     */
    public Attribute getAttribute() {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_attribute == null)
            jcasType.jcas.throwFeatMissing("attribute", "org.texttechnologielab.annotation.type.Edge");
        return (Attribute) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Edge_Type) jcasType).casFeatCode_attribute)));
    }

    /**
     * setter for attribute - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setAttribute(Attribute v) {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_attribute == null)
            jcasType.jcas.throwFeatMissing("attribute", "org.texttechnologielab.annotation.type.Edge");
        jcasType.ll_cas.ll_setRefValue(addr, ((Edge_Type) jcasType).casFeatCode_attribute, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: edgetype

    /**
     * getter for edgetype - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getEdgetype() {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_edgetype == null)
            jcasType.jcas.throwFeatMissing("edgetype", "org.texttechnologielab.annotation.type.Edge");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Edge_Type) jcasType).casFeatCode_edgetype);
    }

    /**
     * setter for edgetype - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEdgetype(String v) {
        if (Edge_Type.featOkTst && ((Edge_Type) jcasType).casFeat_edgetype == null)
            jcasType.jcas.throwFeatMissing("edgetype", "org.texttechnologielab.annotation.type.Edge");
        jcasType.ll_cas.ll_setStringValue(addr, ((Edge_Type) jcasType).casFeatCode_edgetype, v);
    }
}

    