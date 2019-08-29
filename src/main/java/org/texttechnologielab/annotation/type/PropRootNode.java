

/* First created by JCasGen Fri Jul 20 13:34:22 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/**
 * Updated by JCasGen Fri Jul 20 13:34:22 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TexttechnologyPropAnno.xml
 *
 * @generated
 */
public class PropRootNode extends PropNode {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(PropRootNode.class);
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
    protected PropRootNode() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public PropRootNode(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public PropRootNode(JCas jcas) {
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
    //* Feature: arguments

    /**
     * getter for arguments - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringArray getArguments() {
        if (PropRootNode_Type.featOkTst && ((PropRootNode_Type) jcasType).casFeat_arguments == null)
            jcasType.jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        return (StringArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PropRootNode_Type) jcasType).casFeatCode_arguments)));
    }

    /**
     * setter for arguments - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setArguments(StringArray v) {
        if (PropRootNode_Type.featOkTst && ((PropRootNode_Type) jcasType).casFeat_arguments == null)
            jcasType.jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        jcasType.ll_cas.ll_setRefValue(addr, ((PropRootNode_Type) jcasType).casFeatCode_arguments, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for arguments - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public String getArguments(int i) {
        if (PropRootNode_Type.featOkTst && ((PropRootNode_Type) jcasType).casFeat_arguments == null)
            jcasType.jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PropRootNode_Type) jcasType).casFeatCode_arguments), i);
        return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PropRootNode_Type) jcasType).casFeatCode_arguments), i);
    }

    /**
     * indexed setter for arguments - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setArguments(int i, String v) {
        if (PropRootNode_Type.featOkTst && ((PropRootNode_Type) jcasType).casFeat_arguments == null)
            jcasType.jcas.throwFeatMissing("arguments", "org.texttechnologielab.annotation.type.PropRootNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PropRootNode_Type) jcasType).casFeatCode_arguments), i);
        jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PropRootNode_Type) jcasType).casFeatCode_arguments), i, v);
    }
}

    