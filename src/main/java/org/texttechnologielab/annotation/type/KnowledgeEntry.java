

/* First created by JCasGen Fri Jul 20 13:34:09 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Mon Jul 23 22:48:49 CEST 2018
 * XML source: C:/Users/Philipp Helfrich/TextImager/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyKnowledgeEntry.xml
 *
 * @generated
 */
public class KnowledgeEntry extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(KnowledgeEntry.class);
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
    protected KnowledgeEntry() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public KnowledgeEntry(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public KnowledgeEntry(JCas jcas) {
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
    //* Feature: identifier

    /**
     * getter for identifier - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getIdentifier() {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_identifier == null)
            jcasType.jcas.throwFeatMissing("identifier", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_identifier);
    }

    /**
     * setter for identifier - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setIdentifier(String v) {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_identifier == null)
            jcasType.jcas.throwFeatMissing("identifier", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_identifier, v);
    }


    //*--------------*
    //* Feature: source

    /**
     * getter for source - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getSource() {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_source == null)
            jcasType.jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_source);
    }

    /**
     * setter for source - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSource(String v) {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_source == null)
            jcasType.jcas.throwFeatMissing("source", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_source, v);
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
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_reference);
    }

    /**
     * setter for reference - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setReference(String v) {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_reference, v);
    }


    //*--------------*
    //* Feature: parentEntity

    /**
     * getter for parentEntity - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getParentEntity() {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_parentEntity == null)
            jcasType.jcas.throwFeatMissing("parentEntity", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_parentEntity);
    }

    /**
     * setter for parentEntity - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setParentEntity(String v) {
        if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type) jcasType).casFeat_parentEntity == null)
            jcasType.jcas.throwFeatMissing("parentEntity", "org.texttechnologielab.annotation.type.KnowledgeEntry");
        jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type) jcasType).casFeatCode_parentEntity, v);
    }
}

    