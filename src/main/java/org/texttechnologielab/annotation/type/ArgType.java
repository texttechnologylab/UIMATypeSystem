

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
public class ArgType extends ArgNode {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(ArgType.class);
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
    protected ArgType() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public ArgType(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public ArgType(JCas jcas) {
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
    //* Feature: conclusion

    /**
     * getter for conclusion - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getConclusion() {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_conclusion == null)
            jcasType.jcas.throwFeatMissing("conclusion", "org.texttechnologielab.annotation.type.ArgType");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_conclusion)));
    }

    /**
     * setter for conclusion - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setConclusion(FSArray v) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_conclusion == null)
            jcasType.jcas.throwFeatMissing("conclusion", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.ll_cas.ll_setRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_conclusion, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for conclusion - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public ArgTextSegment getConclusion(int i) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_conclusion == null)
            jcasType.jcas.throwFeatMissing("conclusion", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_conclusion), i);
        return (ArgTextSegment) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_conclusion), i)));
    }

    /**
     * indexed setter for conclusion - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setConclusion(int i, ArgTextSegment v) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_conclusion == null)
            jcasType.jcas.throwFeatMissing("conclusion", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_conclusion), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_conclusion), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: mode

    /**
     * getter for mode - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getMode() {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_mode == null)
            jcasType.jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.ArgType");
        return jcasType.ll_cas.ll_getStringValue(addr, ((ArgType_Type) jcasType).casFeatCode_mode);
    }

    /**
     * setter for mode - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setMode(String v) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_mode == null)
            jcasType.jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.ll_cas.ll_setStringValue(addr, ((ArgType_Type) jcasType).casFeatCode_mode, v);
    }


    //*--------------*
    //* Feature: data

    /**
     * getter for data - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getData() {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_data == null)
            jcasType.jcas.throwFeatMissing("data", "org.texttechnologielab.annotation.type.ArgType");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_data)));
    }

    /**
     * setter for data - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setData(FSArray v) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_data == null)
            jcasType.jcas.throwFeatMissing("data", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.ll_cas.ll_setRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_data, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for data - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public ArgTextSegment getData(int i) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_data == null)
            jcasType.jcas.throwFeatMissing("data", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_data), i);
        return (ArgTextSegment) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_data), i)));
    }

    /**
     * indexed setter for data - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setData(int i, ArgTextSegment v) {
        if (ArgType_Type.featOkTst && ((ArgType_Type) jcasType).casFeat_data == null)
            jcasType.jcas.throwFeatMissing("data", "org.texttechnologielab.annotation.type.ArgType");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_data), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgType_Type) jcasType).casFeatCode_data), i, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    