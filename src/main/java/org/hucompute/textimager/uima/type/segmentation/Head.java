

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 21:43:09 CET 2024 */

package org.hucompute.textimager.uima.type.segmentation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Feb 28 21:43:09 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Head extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.segmentation.Head";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Head.class);
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
   
  public final static String _FeatName_typ = "typ";
  public final static String _FeatName_id = "id";
  public final static String _FeatName_parent = "parent";
  public final static String _FeatName_rootEntries = "rootEntries";
  public final static String _FeatName_children = "children";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_typ = TypeSystemImpl.createCallSite(Head.class, "typ");
  private final static MethodHandle _FH_typ = _FC_typ.dynamicInvoker();
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(Head.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_parent = TypeSystemImpl.createCallSite(Head.class, "parent");
  private final static MethodHandle _FH_parent = _FC_parent.dynamicInvoker();
  private final static CallSite _FC_rootEntries = TypeSystemImpl.createCallSite(Head.class, "rootEntries");
  private final static MethodHandle _FH_rootEntries = _FC_rootEntries.dynamicInvoker();
  private final static CallSite _FC_children = TypeSystemImpl.createCallSite(Head.class, "children");
  private final static MethodHandle _FH_children = _FC_children.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Head() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Head(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Head(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Head(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: typ

  /** getter for typ - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTyp() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_typ));
  }
    
  /** setter for typ - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTyp(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_typ), v);
  }    
    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_id));
  }
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: parent

  /** getter for parent - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_parent));
  }
    
  /** setter for parent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_parent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rootEntries

  /** getter for rootEntries - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRootEntries() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_rootEntries));
  }
    
  /** setter for rootEntries - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRootEntries(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_rootEntries), v);
  }    
    
   
    
  //*--------------*
  //* Feature: children

  /** getter for children - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChildren() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_children));
  }
    
  /** setter for children - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChildren(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_children), v);
  }    
    
  }

    