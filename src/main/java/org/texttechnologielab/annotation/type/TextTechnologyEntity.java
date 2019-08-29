

/* First created by JCasGen Fri Jul 20 13:34:09 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/**
 * Updated by JCasGen Fri Jul 20 13:34:09 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class TextTechnologyEntity extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TextTechnologyEntity.class);
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
    protected TextTechnologyEntity() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TextTechnologyEntity(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TextTechnologyEntity(JCas jcas) {
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
    //* Feature: value

    /**
     * getter for value - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getValue() {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(String v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_value, v);
    }


    //*--------------*
    //* Feature: subvalue

    /**
     * getter for subvalue - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getSubvalue() {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_subvalue);
    }

    /**
     * setter for subvalue - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSubvalue(String v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_subvalue, v);
    }


    //*--------------*
    //* Feature: knowledgeEntries

    /**
     * getter for knowledgeEntries - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getKnowledgeEntries() {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_knowledgeEntries)));
    }

    /**
     * setter for knowledgeEntries - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setKnowledgeEntries(FSArray v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.ll_cas.ll_setRefValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_knowledgeEntries, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for knowledgeEntries - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public KnowledgeEntry getKnowledgeEntries(int i) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_knowledgeEntries), i);
        return (KnowledgeEntry) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_knowledgeEntries), i)));
    }

    /**
     * indexed setter for knowledgeEntries - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setKnowledgeEntries(int i, KnowledgeEntry v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_knowledgeEntries), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_knowledgeEntries), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: begin

    /**
     * getter for begin - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getBegin() {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_begin);
    }

    /**
     * setter for begin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBegin(String v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_begin, v);
    }


    //*--------------*
    //* Feature: end

    /**
     * getter for end - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getEnd() {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_end);
    }

    /**
     * setter for end - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEnd(String v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_end, v);
    }


    //*--------------*
    //* Feature: pos

    /**
     * getter for pos - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getPos() {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_pos == null)
            jcasType.jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_pos);
    }

    /**
     * setter for pos - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPos(String v) {
        if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type) jcasType).casFeat_pos == null)
            jcasType.jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.TextTechnologyEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type) jcasType).casFeatCode_pos, v);
    }
}

    