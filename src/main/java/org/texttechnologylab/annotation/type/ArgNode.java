

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ArgNode extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.ArgNode";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgNode.class);
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
   
  public final static String _FeatName_graphId = "graphId";
  public final static String _FeatName_nodeId = "nodeId";
  public final static String _FeatName_text = "text";
  public final static String _FeatName_x = "x";
  public final static String _FeatName_y = "y";
  public final static String _FeatName_reference = "reference";
  public final static String _FeatName_begin = "begin";
  public final static String _FeatName_end = "end";
  public final static String _FeatName_color = "color";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_graphId = TypeSystemImpl.createCallSite(ArgNode.class, "graphId");
  private final static MethodHandle _FH_graphId = _FC_graphId.dynamicInvoker();
  private final static CallSite _FC_nodeId = TypeSystemImpl.createCallSite(ArgNode.class, "nodeId");
  private final static MethodHandle _FH_nodeId = _FC_nodeId.dynamicInvoker();
  private final static CallSite _FC_text = TypeSystemImpl.createCallSite(ArgNode.class, "text");
  private final static MethodHandle _FH_text = _FC_text.dynamicInvoker();
  private final static CallSite _FC_x = TypeSystemImpl.createCallSite(ArgNode.class, "x");
  private final static MethodHandle _FH_x = _FC_x.dynamicInvoker();
  private final static CallSite _FC_y = TypeSystemImpl.createCallSite(ArgNode.class, "y");
  private final static MethodHandle _FH_y = _FC_y.dynamicInvoker();
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(ArgNode.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();
  private final static CallSite _FC_begin = TypeSystemImpl.createCallSite(ArgNode.class, "begin");
  private final static MethodHandle _FH_begin = _FC_begin.dynamicInvoker();
  private final static CallSite _FC_end = TypeSystemImpl.createCallSite(ArgNode.class, "end");
  private final static MethodHandle _FH_end = _FC_end.dynamicInvoker();
  private final static CallSite _FC_color = TypeSystemImpl.createCallSite(ArgNode.class, "color");
  private final static MethodHandle _FH_color = _FC_color.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ArgNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ArgNode(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgNode(JCas jcas) {
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
  //* Feature: graphId

  /** getter for graphId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGraphId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_graphId));
  }
    
  /** setter for graphId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGraphId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_graphId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: nodeId

  /** getter for nodeId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNodeId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_nodeId));
  }
    
  /** setter for nodeId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodeId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_nodeId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_text));
  }
    
  /** setter for text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_text), v);
  }    
    
   
    
  //*--------------*
  //* Feature: x

  /** getter for x - gets 
   * @generated
   * @return value of the feature 
   */
  public String getX() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_x));
  }
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_x), v);
  }    
    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public String getY() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_y));
  }
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_y), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReference() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_reference));
  }
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_reference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBegin() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_begin));
  }
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_begin), v);
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
  //* Feature: color

  /** getter for color - gets 
   * @generated
   * @return value of the feature 
   */
  public String getColor() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_color));
  }
    
  /** setter for color - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setColor(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_color), v);
  }    
    
  }

    