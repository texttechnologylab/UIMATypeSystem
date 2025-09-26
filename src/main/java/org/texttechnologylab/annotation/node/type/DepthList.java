

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:15 CEST 2025 */

package org.texttechnologylab.annotation.node.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.type.Node;
import org.apache.uima.jcas.cas.IntegerArray;


/** 
 * Updated by JCasGen Fri Sep 26 15:44:15 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DepthList extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.node.type.DepthList";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DepthList.class);
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
   
  public final static String _FeatName_displayName = "displayName";
  public final static String _FeatName_hierarchie = "hierarchie";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_displayName = TypeSystemImpl.createCallSite(DepthList.class, "displayName");
  private final static MethodHandle _FH_displayName = _FC_displayName.dynamicInvoker();
  private final static CallSite _FC_hierarchie = TypeSystemImpl.createCallSite(DepthList.class, "hierarchie");
  private final static MethodHandle _FH_hierarchie = _FC_hierarchie.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected DepthList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DepthList(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
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

  /** getter for displayName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDisplayName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_displayName));
  }
    
  /** setter for displayName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisplayName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_displayName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: hierarchie

  /** getter for hierarchie - gets 
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getHierarchie() { 
    return (IntegerArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hierarchie)));
  }
    
  /** setter for hierarchie - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHierarchie(IntegerArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_hierarchie), v);
  }    
    
    
  /** indexed getter for hierarchie - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getHierarchie(int i) {
     return ((IntegerArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hierarchie)))).get(i);
  } 

  /** indexed setter for hierarchie - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setHierarchie(int i, int v) {
    ((IntegerArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hierarchie)))).set(i, v);
  }  
  }

    