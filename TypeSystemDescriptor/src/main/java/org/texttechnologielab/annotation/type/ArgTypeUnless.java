

/* First created by JCasGen Fri Jul 20 13:34:02 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/**
 * Updated by JCasGen Fri Jul 20 13:34:02 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyArgAnno.xml
 *
 * @generated
 */
public class ArgTypeUnless extends ArgType {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(ArgTypeUnless.class);
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
    protected ArgTypeUnless() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public ArgTypeUnless(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public ArgTypeUnless(JCas jcas) {
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
    //* Feature: counterRebuttal

    /**
     * getter for counterRebuttal - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getCounterRebuttal() {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_counterRebuttal == null)
            jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_counterRebuttal)));
    }

    /**
     * setter for counterRebuttal - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setCounterRebuttal(FSArray v) {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_counterRebuttal == null)
            jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        jcasType.ll_cas.ll_setRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_counterRebuttal, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for counterRebuttal - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public ArgTextSegment getCounterRebuttal(int i) {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_counterRebuttal == null)
            jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_counterRebuttal), i);
        return (ArgTextSegment) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_counterRebuttal), i)));
    }

    /**
     * indexed setter for counterRebuttal - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setCounterRebuttal(int i, ArgTextSegment v) {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_counterRebuttal == null)
            jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_counterRebuttal), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_counterRebuttal), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: rebuttal

    /**
     * getter for rebuttal - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getRebuttal() {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_rebuttal == null)
            jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_rebuttal)));
    }

    /**
     * setter for rebuttal - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRebuttal(FSArray v) {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_rebuttal == null)
            jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        jcasType.ll_cas.ll_setRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_rebuttal, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for rebuttal - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public ArgTextSegment getRebuttal(int i) {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_rebuttal == null)
            jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_rebuttal), i);
        return (ArgTextSegment) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_rebuttal), i)));
    }

    /**
     * indexed setter for rebuttal - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setRebuttal(int i, ArgTextSegment v) {
        if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type) jcasType).casFeat_rebuttal == null)
            jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologielab.annotation.type.ArgTypeUnless");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_rebuttal), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type) jcasType).casFeatCode_rebuttal), i, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    