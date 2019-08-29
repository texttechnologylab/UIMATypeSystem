

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
public class ArgTypeAnd extends ArgType {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(ArgTypeAnd.class);
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
    protected ArgTypeAnd() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public ArgTypeAnd(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public ArgTypeAnd(JCas jcas) {
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
    //* Feature: data2

    /**
     * getter for data2 - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getData2() {
        if (ArgTypeAnd_Type.featOkTst && ((ArgTypeAnd_Type) jcasType).casFeat_data2 == null)
            jcasType.jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeAnd");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeAnd_Type) jcasType).casFeatCode_data2)));
    }

    /**
     * setter for data2 - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setData2(FSArray v) {
        if (ArgTypeAnd_Type.featOkTst && ((ArgTypeAnd_Type) jcasType).casFeat_data2 == null)
            jcasType.jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeAnd");
        jcasType.ll_cas.ll_setRefValue(addr, ((ArgTypeAnd_Type) jcasType).casFeatCode_data2, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for data2 - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public ArgTextSegment getData2(int i) {
        if (ArgTypeAnd_Type.featOkTst && ((ArgTypeAnd_Type) jcasType).casFeat_data2 == null)
            jcasType.jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeAnd");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeAnd_Type) jcasType).casFeatCode_data2), i);
        return (ArgTextSegment) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeAnd_Type) jcasType).casFeatCode_data2), i)));
    }

    /**
     * indexed setter for data2 - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setData2(int i, ArgTextSegment v) {
        if (ArgTypeAnd_Type.featOkTst && ((ArgTypeAnd_Type) jcasType).casFeat_data2 == null)
            jcasType.jcas.throwFeatMissing("data2", "org.texttechnologielab.annotation.type.ArgTypeAnd");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeAnd_Type) jcasType).casFeatCode_data2), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeAnd_Type) jcasType).casFeatCode_data2), i, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    