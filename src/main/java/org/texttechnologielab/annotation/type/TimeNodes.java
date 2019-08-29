

/* First created by JCasGen Sun Sep 23 23:33:56 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Sun Sep 23 23:34:03 CEST 2018
 * XML source: C:/Users/Philipp Helfrich/TextImager/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 *
 * @generated
 */
public class TimeNodes extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TimeNodes.class);
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
    protected TimeNodes() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TimeNodes(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TimeNodes(JCas jcas) {
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
    //* Feature: x

    /**
     * getter for x - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getX() {
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNodes");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_x);
    }

    /**
     * setter for x - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX(int v) {
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNodes");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_x, v);
    }


    //*--------------*
    //* Feature: y

    /**
     * getter for y - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getY() {
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNodes");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_y);
    }

    /**
     * setter for y - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setY(int v) {
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNodes");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_y, v);
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
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNodes");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(String v) {
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNodes");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_value, v);
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
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNodes");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_subvalue);
    }

    /**
     * setter for subvalue - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSubvalue(String v) {
        if (TimeNodes_Type.featOkTst && ((TimeNodes_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNodes");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeNodes_Type) jcasType).casFeatCode_subvalue, v);
    }
}

    