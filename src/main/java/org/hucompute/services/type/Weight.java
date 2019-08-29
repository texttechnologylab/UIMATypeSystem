

/* First created by JCasGen Wed Feb 14 16:42:04 CET 2018 */
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
public class Weight extends Attribute {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Weight.class);
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
    protected Weight() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Weight(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Weight(JCas jcas) {
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
    public double getValue() {
        if (Weight_Type.featOkTst && ((Weight_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.hucompute.services.type.Weight");
        return jcasType.ll_cas.ll_getDoubleValue(addr, ((Weight_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(double v) {
        if (Weight_Type.featOkTst && ((Weight_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.hucompute.services.type.Weight");
        jcasType.ll_cas.ll_setDoubleValue(addr, ((Weight_Type) jcasType).casFeatCode_value, v);
    }
}

    