

/* First created by JCasGen Thu Aug 15 14:47:15 CEST 2019 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * A link in the time chain
 * Updated by JCasGen Thu Aug 15 14:47:15 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyRoom.xml
 *
 * @generated
 */
public class TimeChain extends AnnotationBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TimeChain.class);
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
    protected TimeChain() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TimeChain(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TimeChain(JCas jcas) {
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
    //* Feature: next

    /**
     * getter for next - gets Next chain element
     *
     * @return value of the feature
     * @generated
     */
    public TimeChain getNext() {
        if (TimeChain_Type.featOkTst && ((TimeChain_Type) jcasType).casFeat_next == null)
            jcasType.jcas.throwFeatMissing("next", "org.texttechnologylab.annotation.Room.TimeChain");
        return (TimeChain) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeChain_Type) jcasType).casFeatCode_next)));
    }

    /**
     * setter for next - sets Next chain element
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setNext(TimeChain v) {
        if (TimeChain_Type.featOkTst && ((TimeChain_Type) jcasType).casFeat_next == null)
            jcasType.jcas.throwFeatMissing("next", "org.texttechnologylab.annotation.Room.TimeChain");
        jcasType.ll_cas.ll_setRefValue(addr, ((TimeChain_Type) jcasType).casFeatCode_next, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: prev

    /**
     * getter for prev - gets Previous chain element
     *
     * @return value of the feature
     * @generated
     */
    public TimeChain getPrev() {
        if (TimeChain_Type.featOkTst && ((TimeChain_Type) jcasType).casFeat_prev == null)
            jcasType.jcas.throwFeatMissing("prev", "org.texttechnologylab.annotation.Room.TimeChain");
        return (TimeChain) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeChain_Type) jcasType).casFeatCode_prev)));
    }

    /**
     * setter for prev - sets Previous chain element
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPrev(TimeChain v) {
        if (TimeChain_Type.featOkTst && ((TimeChain_Type) jcasType).casFeat_prev == null)
            jcasType.jcas.throwFeatMissing("prev", "org.texttechnologylab.annotation.Room.TimeChain");
        jcasType.ll_cas.ll_setRefValue(addr, ((TimeChain_Type) jcasType).casFeatCode_prev, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    