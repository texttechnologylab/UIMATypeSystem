

   
/* Apache UIMA v3 - First created by JCasGen Mon May 05 11:13:03 CEST 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Mon May 05 11:13:03 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Edge extends GraphBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.Edge";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Edge.class);
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
   
  public final static String _FeatName_source = "source";
  public final static String _FeatName_target = "target";
  public final static String _FeatName_attribute = "attribute";
  public final static String _FeatName_edgetype = "edgetype";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(Edge.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();
  private final static CallSite _FC_target = TypeSystemImpl.createCallSite(Edge.class, "target");
  private final static MethodHandle _FH_target = _FC_target.dynamicInvoker();
  private final static CallSite _FC_attribute = TypeSystemImpl.createCallSite(Edge.class, "attribute");
  private final static MethodHandle _FH_attribute = _FC_attribute.dynamicInvoker();
  private final static CallSite _FC_edgetype = TypeSystemImpl.createCallSite(Edge.class, "edgetype");
  private final static MethodHandle _FH_edgetype = _FC_edgetype.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Edge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Edge(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Edge(JCas jcas) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getSource() { 
    return (Node)(_getFeatureValueNc(wrapGetIntCatchException(_FH_source)));
  }
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Node v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_source), v);
  }    
    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getTarget() { 
    return (Node)(_getFeatureValueNc(wrapGetIntCatchException(_FH_target)));
  }
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(Node v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_target), v);
  }    
    
   
    
  //*--------------*
  //* Feature: attribute

  /** getter for attribute - gets 
   * @generated
   * @return value of the feature 
   */
  public Attribute getAttribute() { 
    return (Attribute)(_getFeatureValueNc(wrapGetIntCatchException(_FH_attribute)));
  }
    
  /** setter for attribute - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttribute(Attribute v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_attribute), v);
  }    
    
   
    
  //*--------------*
  //* Feature: edgetype

  /** getter for edgetype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEdgetype() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_edgetype));
  }
    
  /** setter for edgetype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEdgetype(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_edgetype), v);
  }    
    
  }

    