

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:09:04 CEST 2024 */

package org.texttechnologylab.annotation.ocr;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu Jul 04 15:09:04 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OCRLine extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.OCRLine";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OCRLine.class);
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
   
  public final static String _FeatName_baseline = "baseline";
  public final static String _FeatName_top = "top";
  public final static String _FeatName_bottom = "bottom";
  public final static String _FeatName_left = "left";
  public final static String _FeatName_right = "right";
  public final static String _FeatName_format = "format";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_baseline = TypeSystemImpl.createCallSite(OCRLine.class, "baseline");
  private final static MethodHandle _FH_baseline = _FC_baseline.dynamicInvoker();
  private final static CallSite _FC_top = TypeSystemImpl.createCallSite(OCRLine.class, "top");
  private final static MethodHandle _FH_top = _FC_top.dynamicInvoker();
  private final static CallSite _FC_bottom = TypeSystemImpl.createCallSite(OCRLine.class, "bottom");
  private final static MethodHandle _FH_bottom = _FC_bottom.dynamicInvoker();
  private final static CallSite _FC_left = TypeSystemImpl.createCallSite(OCRLine.class, "left");
  private final static MethodHandle _FH_left = _FC_left.dynamicInvoker();
  private final static CallSite _FC_right = TypeSystemImpl.createCallSite(OCRLine.class, "right");
  private final static MethodHandle _FH_right = _FC_right.dynamicInvoker();
  private final static CallSite _FC_format = TypeSystemImpl.createCallSite(OCRLine.class, "format");
  private final static MethodHandle _FH_format = _FC_format.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OCRLine() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OCRLine(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OCRLine(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OCRLine(JCas jcas, int begin, int end) {
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
  //* Feature: baseline

  /** getter for baseline - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBaseline() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_baseline));
  }
    
  /** setter for baseline - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseline(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_baseline), v);
  }    
    
   
    
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
    
   
    
  //*--------------*
  //* Feature: format

  /** getter for format - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFormat() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_format));
  }
    
  /** setter for format - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFormat(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_format), v);
  }    
    
  }

    