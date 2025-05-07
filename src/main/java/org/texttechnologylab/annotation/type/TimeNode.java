

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 18:09:54 CEST 2025 */

package org.texttechnologylab.annotation.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Wed May 07 18:09:54 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TimeNode extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TimeNode";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeNode.class);
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
   
  public final static String _FeatName_xPos = "xPos";
  public final static String _FeatName_depth = "depth";
  public final static String _FeatName_value = "value";
  public final static String _FeatName_subvalue = "subvalue";
  public final static String _FeatName_begin = "begin";
  public final static String _FeatName_nodes = "nodes";
  public final static String _FeatName_edges = "edges";
  public final static String _FeatName_end = "end";
  public final static String _FeatName_x = "x";
  public final static String _FeatName_y = "y";
  public final static String _FeatName_additionalvalue = "additionalvalue";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_xPos = TypeSystemImpl.createCallSite(TimeNode.class, "xPos");
  private final static MethodHandle _FH_xPos = _FC_xPos.dynamicInvoker();
  private final static CallSite _FC_depth = TypeSystemImpl.createCallSite(TimeNode.class, "depth");
  private final static MethodHandle _FH_depth = _FC_depth.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(TimeNode.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_subvalue = TypeSystemImpl.createCallSite(TimeNode.class, "subvalue");
  private final static MethodHandle _FH_subvalue = _FC_subvalue.dynamicInvoker();
  private final static CallSite _FC_begin = TypeSystemImpl.createCallSite(TimeNode.class, "begin");
  private final static MethodHandle _FH_begin = _FC_begin.dynamicInvoker();
  private final static CallSite _FC_nodes = TypeSystemImpl.createCallSite(TimeNode.class, "nodes");
  private final static MethodHandle _FH_nodes = _FC_nodes.dynamicInvoker();
  private final static CallSite _FC_edges = TypeSystemImpl.createCallSite(TimeNode.class, "edges");
  private final static MethodHandle _FH_edges = _FC_edges.dynamicInvoker();
  private final static CallSite _FC_end = TypeSystemImpl.createCallSite(TimeNode.class, "end");
  private final static MethodHandle _FH_end = _FC_end.dynamicInvoker();
  private final static CallSite _FC_x = TypeSystemImpl.createCallSite(TimeNode.class, "x");
  private final static MethodHandle _FH_x = _FC_x.dynamicInvoker();
  private final static CallSite _FC_y = TypeSystemImpl.createCallSite(TimeNode.class, "y");
  private final static MethodHandle _FH_y = _FC_y.dynamicInvoker();
  private final static CallSite _FC_additionalvalue = TypeSystemImpl.createCallSite(TimeNode.class, "additionalvalue");
  private final static MethodHandle _FH_additionalvalue = _FC_additionalvalue.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TimeNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TimeNode(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeNode(JCas jcas) {
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
  //* Feature: xPos

  /** getter for xPos - gets 
   * @generated
   * @return value of the feature 
   */
  public int getXPos() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_xPos));
  }
    
  /** setter for xPos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setXPos(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_xPos), v);
  }    
    
   
    
  //*--------------*
  //* Feature: depth

  /** getter for depth - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDepth() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_depth));
  }
    
  /** setter for depth - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDepth(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_depth), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subvalue

  /** getter for subvalue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubvalue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subvalue));
  }
    
  /** setter for subvalue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubvalue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subvalue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_begin));
  }
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_begin), v);
  }    
    
   
    
  //*--------------*
  //* Feature: nodes

  /** getter for nodes - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TOP> getNodes() { 
    return (FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nodes)));
  }
    
  /** setter for nodes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodes(FSArray<TOP> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_nodes), v);
  }    
    
    
  /** indexed getter for nodes - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TOP getNodes(int i) {
     return (TOP)(((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nodes)))).get(i));
  } 

  /** indexed setter for nodes - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setNodes(int i, TOP v) {
    ((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nodes)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: edges

  /** getter for edges - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TOP> getEdges() { 
    return (FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_edges)));
  }
    
  /** setter for edges - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdges(FSArray<TOP> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_edges), v);
  }    
    
    
  /** indexed getter for edges - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TOP getEdges(int i) {
     return (TOP)(((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_edges)))).get(i));
  } 

  /** indexed setter for edges - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setEdges(int i, TOP v) {
    ((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_edges)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEnd() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_end));
  }
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_end), v);
  }    
    
   
    
  //*--------------*
  //* Feature: x

  /** getter for x - gets 
   * @generated
   * @return value of the feature 
   */
  public int getX() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_x));
  }
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_x), v);
  }    
    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public int getY() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_y));
  }
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_y), v);
  }    
    
   
    
  //*--------------*
  //* Feature: additionalvalue

  /** getter for additionalvalue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAdditionalvalue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_additionalvalue));
  }
    
  /** setter for additionalvalue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdditionalvalue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_additionalvalue), v);
  }    
    
  }

    