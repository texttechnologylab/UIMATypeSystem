

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TreeNode extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TreeNode";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_children = "children";
  public final static String _FeatName_parent = "parent";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_children = TypeSystemImpl.createCallSite(TreeNode.class, "children");
  private final static MethodHandle _FH_children = _FC_children.dynamicInvoker();
  private final static CallSite _FC_parent = TypeSystemImpl.createCallSite(TreeNode.class, "parent");
  private final static MethodHandle _FH_parent = _FC_parent.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TreeNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TreeNode(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
  @SuppressWarnings("unchecked")
  public FSArray<Node> getChildren() { 
    return (FSArray<Node>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_children)));
  }
    
  /** setter for children - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChildren(FSArray<Node> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_children), v);
  }    
    
    
  /** indexed getter for children - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Node getChildren(int i) {
     return (Node)(((FSArray<Node>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_children)))).get(i));
  } 

  /** indexed setter for children - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setChildren(int i, Node v) {
    ((FSArray<Node>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_children)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: parent

  /** getter for parent - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getParent() { 
    return (Node)(_getFeatureValueNc(wrapGetIntCatchException(_FH_parent)));
  }
    
  /** setter for parent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParent(Node v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_parent), v);
  }    
    
  }

    