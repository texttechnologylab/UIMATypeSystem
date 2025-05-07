

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 15:57:08 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div;


/** 
 * Updated by JCasGen Wed May 07 15:57:08 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class StructuralElement extends Div {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StructuralElement.class);
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
   
  public final static String _FeatName_top = "top";
  public final static String _FeatName_bottom = "bottom";
  public final static String _FeatName_left = "left";
  public final static String _FeatName_right = "right";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_top = TypeSystemImpl.createCallSite(StructuralElement.class, "top");
  private final static MethodHandle _FH_top = _FC_top.dynamicInvoker();
  private final static CallSite _FC_bottom = TypeSystemImpl.createCallSite(StructuralElement.class, "bottom");
  private final static MethodHandle _FH_bottom = _FC_bottom.dynamicInvoker();
  private final static CallSite _FC_left = TypeSystemImpl.createCallSite(StructuralElement.class, "left");
  private final static MethodHandle _FH_left = _FC_left.dynamicInvoker();
  private final static CallSite _FC_right = TypeSystemImpl.createCallSite(StructuralElement.class, "right");
  private final static MethodHandle _FH_right = _FC_right.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected StructuralElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public StructuralElement(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public StructuralElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public StructuralElement(JCas jcas, int begin, int end) {
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
  //* Feature: top

  /** getter for top - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTop() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_top));
  }
    
  /** setter for top - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTop(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_top), v);
  }    
    
   
    
  //*--------------*
  //* Feature: bottom

  /** getter for bottom - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBottom() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_bottom));
  }
    
  /** setter for bottom - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBottom(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_bottom), v);
  }    
    
   
    
  //*--------------*
  //* Feature: left

  /** getter for left - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLeft() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_left));
  }
    
  /** setter for left - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLeft(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_left), v);
  }    
    
   
    
  //*--------------*
  //* Feature: right

  /** getter for right - gets 
   * @generated
   * @return value of the feature 
   */
  public int getRight() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_right));
  }
    
  /** setter for right - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRight(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_right), v);
  }    
    
  }

    