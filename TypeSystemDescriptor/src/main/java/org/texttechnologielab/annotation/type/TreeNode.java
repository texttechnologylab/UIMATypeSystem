

/* First created by JCasGen Fri Feb 08 20:23:48 CET 2019 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class TreeNode extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TreeNode.class);
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
    protected TreeNode() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TreeNode(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TreeNode(JCas jcas) {
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
    //* Feature: children

    /**
     * getter for children - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getChildren() {
        if (TreeNode_Type.featOkTst && ((TreeNode_Type) jcasType).casFeat_children == null)
            jcasType.jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_children)));
    }

    /**
     * setter for children - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setChildren(FSArray v) {
        if (TreeNode_Type.featOkTst && ((TreeNode_Type) jcasType).casFeat_children == null)
            jcasType.jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        jcasType.ll_cas.ll_setRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_children, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for children - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public Node getChildren(int i) {
        if (TreeNode_Type.featOkTst && ((TreeNode_Type) jcasType).casFeat_children == null)
            jcasType.jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_children), i);
        return (Node) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_children), i)));
    }

    /**
     * indexed setter for children - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setChildren(int i, Node v) {
        if (TreeNode_Type.featOkTst && ((TreeNode_Type) jcasType).casFeat_children == null)
            jcasType.jcas.throwFeatMissing("children", "org.texttechnologielab.annotation.type.TreeNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_children), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_children), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: parent

    /**
     * getter for parent - gets
     *
     * @return value of the feature
     * @generated
     */
    public Node getParent() {
        if (TreeNode_Type.featOkTst && ((TreeNode_Type) jcasType).casFeat_parent == null)
            jcasType.jcas.throwFeatMissing("parent", "org.texttechnologielab.annotation.type.TreeNode");
        return (Node) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_parent)));
    }

    /**
     * setter for parent - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setParent(Node v) {
        if (TreeNode_Type.featOkTst && ((TreeNode_Type) jcasType).casFeat_parent == null)
            jcasType.jcas.throwFeatMissing("parent", "org.texttechnologielab.annotation.type.TreeNode");
        jcasType.ll_cas.ll_setRefValue(addr, ((TreeNode_Type) jcasType).casFeatCode_parent, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    