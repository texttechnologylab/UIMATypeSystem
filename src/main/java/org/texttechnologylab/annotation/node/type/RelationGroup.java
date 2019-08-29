

/* First created by JCasGen Wed Aug 28 09:38:42 CEST 2019 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologielab.annotation.type.Node;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class RelationGroup extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(RelationGroup.class);
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
    protected RelationGroup() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public RelationGroup(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public RelationGroup(JCas jcas) {
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
    //* Feature: relation

    /**
     * getter for relation - gets
     *
     * @return value of the feature
     * @generated
     */
    public RelationContext getRelation() {
        if (RelationGroup_Type.featOkTst && ((RelationGroup_Type) jcasType).casFeat_relation == null)
            jcasType.jcas.throwFeatMissing("relation", "org.texttechnologylab.annotation.node.type.RelationGroup");
        return (RelationContext) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RelationGroup_Type) jcasType).casFeatCode_relation)));
    }

    /**
     * setter for relation - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRelation(RelationContext v) {
        if (RelationGroup_Type.featOkTst && ((RelationGroup_Type) jcasType).casFeat_relation == null)
            jcasType.jcas.throwFeatMissing("relation", "org.texttechnologylab.annotation.node.type.RelationGroup");
        jcasType.ll_cas.ll_setRefValue(addr, ((RelationGroup_Type) jcasType).casFeatCode_relation, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: locationID

    /**
     * getter for locationID - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getLocationID() {
        if (RelationGroup_Type.featOkTst && ((RelationGroup_Type) jcasType).casFeat_locationID == null)
            jcasType.jcas.throwFeatMissing("locationID", "org.texttechnologylab.annotation.node.type.RelationGroup");
        return jcasType.ll_cas.ll_getIntValue(addr, ((RelationGroup_Type) jcasType).casFeatCode_locationID);
    }

    /**
     * setter for locationID - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLocationID(int v) {
        if (RelationGroup_Type.featOkTst && ((RelationGroup_Type) jcasType).casFeat_locationID == null)
            jcasType.jcas.throwFeatMissing("locationID", "org.texttechnologylab.annotation.node.type.RelationGroup");
        jcasType.ll_cas.ll_setIntValue(addr, ((RelationGroup_Type) jcasType).casFeatCode_locationID, v);
    }


    //*--------------*
    //* Feature: sentence

    /**
     * getter for sentence - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getSentence() {
        if (RelationGroup_Type.featOkTst && ((RelationGroup_Type) jcasType).casFeat_sentence == null)
            jcasType.jcas.throwFeatMissing("sentence", "org.texttechnologylab.annotation.node.type.RelationGroup");
        return jcasType.ll_cas.ll_getIntValue(addr, ((RelationGroup_Type) jcasType).casFeatCode_sentence);
    }

    /**
     * setter for sentence - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSentence(int v) {
        if (RelationGroup_Type.featOkTst && ((RelationGroup_Type) jcasType).casFeat_sentence == null)
            jcasType.jcas.throwFeatMissing("sentence", "org.texttechnologylab.annotation.node.type.RelationGroup");
        jcasType.ll_cas.ll_setIntValue(addr, ((RelationGroup_Type) jcasType).casFeatCode_sentence, v);
    }
}

    