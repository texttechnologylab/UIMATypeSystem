

/* First created by JCasGen Wed Aug 28 09:38:42 CEST 2019 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologielab.annotation.type.Node;
import org.apache.uima.jcas.cas.IntegerArray;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class DepthList extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(DepthList.class);
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
    protected DepthList() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public DepthList(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public DepthList(JCas jcas) {
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
    //* Feature: displayName

    /**
     * getter for displayName - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getDisplayName() {
        if (DepthList_Type.featOkTst && ((DepthList_Type) jcasType).casFeat_displayName == null)
            jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.DepthList");
        return jcasType.ll_cas.ll_getStringValue(addr, ((DepthList_Type) jcasType).casFeatCode_displayName);
    }

    /**
     * setter for displayName - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setDisplayName(String v) {
        if (DepthList_Type.featOkTst && ((DepthList_Type) jcasType).casFeat_displayName == null)
            jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.DepthList");
        jcasType.ll_cas.ll_setStringValue(addr, ((DepthList_Type) jcasType).casFeatCode_displayName, v);
    }


    //*--------------*
    //* Feature: hierarchie

    /**
     * getter for hierarchie - gets
     *
     * @return value of the feature
     * @generated
     */
    public IntegerArray getHierarchie() {
        if (DepthList_Type.featOkTst && ((DepthList_Type) jcasType).casFeat_hierarchie == null)
            jcasType.jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        return (IntegerArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DepthList_Type) jcasType).casFeatCode_hierarchie)));
    }

    /**
     * setter for hierarchie - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setHierarchie(IntegerArray v) {
        if (DepthList_Type.featOkTst && ((DepthList_Type) jcasType).casFeat_hierarchie == null)
            jcasType.jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        jcasType.ll_cas.ll_setRefValue(addr, ((DepthList_Type) jcasType).casFeatCode_hierarchie, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for hierarchie - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public int getHierarchie(int i) {
        if (DepthList_Type.featOkTst && ((DepthList_Type) jcasType).casFeat_hierarchie == null)
            jcasType.jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DepthList_Type) jcasType).casFeatCode_hierarchie), i);
        return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DepthList_Type) jcasType).casFeatCode_hierarchie), i);
    }

    /**
     * indexed setter for hierarchie - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setHierarchie(int i, int v) {
        if (DepthList_Type.featOkTst && ((DepthList_Type) jcasType).casFeat_hierarchie == null)
            jcasType.jcas.throwFeatMissing("hierarchie", "org.texttechnologylab.annotation.node.type.DepthList");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DepthList_Type) jcasType).casFeatCode_hierarchie), i);
        jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DepthList_Type) jcasType).casFeatCode_hierarchie), i, v);
    }
}

    