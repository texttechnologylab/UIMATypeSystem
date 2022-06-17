

/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Fri Jun 17 14:38:29 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class TreeNode extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TreeNode.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TreeNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TreeNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
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

  /** getter for children - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getChildren() {
    if (TreeNode_Type.featOkTst && ((TreeNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.texttechnologylab.annotation.type.TreeNode");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_children)));}
    
  /** setter for children - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChildren(FSArray v) {
    if (TreeNode_Type.featOkTst && ((TreeNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.texttechnologylab.annotation.type.TreeNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_children, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for children - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Node getChildren(int i) {
    if (TreeNode_Type.featOkTst && ((TreeNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.texttechnologylab.annotation.type.TreeNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_children), i);
    return (Node)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_children), i)));}

  /** indexed setter for children - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setChildren(int i, Node v) { 
    if (TreeNode_Type.featOkTst && ((TreeNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.texttechnologylab.annotation.type.TreeNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_children), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_children), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: parent

  /** getter for parent - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getParent() {
    if (TreeNode_Type.featOkTst && ((TreeNode_Type)jcasType).casFeat_parent == null)
      jcasType.jcas.throwFeatMissing("parent", "org.texttechnologylab.annotation.type.TreeNode");
    return (Node)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_parent)));}
    
  /** setter for parent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParent(Node v) {
    if (TreeNode_Type.featOkTst && ((TreeNode_Type)jcasType).casFeat_parent == null)
      jcasType.jcas.throwFeatMissing("parent", "org.texttechnologylab.annotation.type.TreeNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TreeNode_Type)jcasType).casFeatCode_parent, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    