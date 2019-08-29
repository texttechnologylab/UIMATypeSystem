

/* First created by JCasGen Wed Feb 14 16:42:03 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class Color extends Attribute {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Color.class);
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
    protected Color() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Color(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Color(JCas jcas) {
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
    public int getValue() {
        if (Color_Type.featOkTst && ((Color_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.hucompute.services.type.Color");
        return jcasType.ll_cas.ll_getIntValue(addr, ((Color_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(int v) {
        if (Color_Type.featOkTst && ((Color_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.hucompute.services.type.Color");
        jcasType.ll_cas.ll_setIntValue(addr, ((Color_Type) jcasType).casFeatCode_value, v);
    }
}

    