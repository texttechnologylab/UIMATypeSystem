

/* First created by JCasGen Fri Jul 20 13:34:17 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Jul 20 13:34:17 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TexttechnologyNamedEntity.xml
 *
 * @generated
 */
public class TexttechnologyNamedEntity extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TexttechnologyNamedEntity.class);
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
    protected TexttechnologyNamedEntity() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TexttechnologyNamedEntity(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TexttechnologyNamedEntity(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public TexttechnologyNamedEntity(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
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
    //* Feature: subvalue

    /**
     * getter for subvalue - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getSubvalue() {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_subvalue);
    }

    /**
     * setter for subvalue - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSubvalue(String v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_subvalue, v);
    }


    //*--------------*
    //* Feature: belongsTo

    /**
     * getter for belongsTo - gets
     *
     * @return value of the feature
     * @generated
     */
    public TexttechnologyNamedEntity getBelongsTo() {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_belongsTo == null)
            jcasType.jcas.throwFeatMissing("belongsTo", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return (TexttechnologyNamedEntity) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_belongsTo)));
    }

    /**
     * setter for belongsTo - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBelongsTo(TexttechnologyNamedEntity v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_belongsTo == null)
            jcasType.jcas.throwFeatMissing("belongsTo", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.ll_cas.ll_setRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_belongsTo, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: value

    /**
     * getter for value - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getValue() {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(String v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_value, v);
    }


    //*--------------*
    //* Feature: knowledgeEntries

    /**
     * getter for knowledgeEntries - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringArray getKnowledgeEntries() {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return (StringArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_knowledgeEntries)));
    }

    /**
     * setter for knowledgeEntries - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setKnowledgeEntries(StringArray v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.ll_cas.ll_setRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_knowledgeEntries, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for knowledgeEntries - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public String getKnowledgeEntries(int i) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_knowledgeEntries), i);
        return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_knowledgeEntries), i);
    }

    /**
     * indexed setter for knowledgeEntries - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setKnowledgeEntries(int i, String v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_knowledgeEntries == null)
            jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_knowledgeEntries), i);
        jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_knowledgeEntries), i, v);
    }


    //*--------------*
    //* Feature: wikipediaID

    /**
     * getter for wikipediaID - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getWikipediaID() {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_wikipediaID == null)
            jcasType.jcas.throwFeatMissing("wikipediaID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_wikipediaID);
    }

    /**
     * setter for wikipediaID - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setWikipediaID(String v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_wikipediaID == null)
            jcasType.jcas.throwFeatMissing("wikipediaID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_wikipediaID, v);
    }


    //*--------------*
    //* Feature: wikidataID

    /**
     * getter for wikidataID - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getWikidataID() {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_wikidataID == null)
            jcasType.jcas.throwFeatMissing("wikidataID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_wikidataID);
    }

    /**
     * setter for wikidataID - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setWikidataID(String v) {
        if (TexttechnologyNamedEntity_Type.featOkTst && ((TexttechnologyNamedEntity_Type) jcasType).casFeat_wikidataID == null)
            jcasType.jcas.throwFeatMissing("wikidataID", "org.texttechnologielab.annotation.type.TexttechnologyNamedEntity");
        jcasType.ll_cas.ll_setStringValue(addr, ((TexttechnologyNamedEntity_Type) jcasType).casFeatCode_wikidataID, v);
    }
}

    