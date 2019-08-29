

/* First created by JCasGen Wed Feb 14 16:42:04 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class TextElement extends Attribute {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TextElement.class);
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
    protected TextElement() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TextElement(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TextElement(JCas jcas) {
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
    public Annotation getValue() {
        if (TextElement_Type.featOkTst && ((TextElement_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.hucompute.services.type.TextElement");
        return (Annotation) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextElement_Type) jcasType).casFeatCode_value)));
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(Annotation v) {
        if (TextElement_Type.featOkTst && ((TextElement_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.hucompute.services.type.TextElement");
        jcasType.ll_cas.ll_setRefValue(addr, ((TextElement_Type) jcasType).casFeatCode_value, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    