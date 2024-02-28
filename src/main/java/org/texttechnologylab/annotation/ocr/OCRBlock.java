

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

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
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OCRBlock extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.OCRBlock";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OCRBlock.class);
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
  public final static String _FeatName_blockType = "blockType";
  public final static String _FeatName_blockName = "blockName";
  public final static String _FeatName_valid = "valid";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_top = TypeSystemImpl.createCallSite(OCRBlock.class, "top");
  private final static MethodHandle _FH_top = _FC_top.dynamicInvoker();
  private final static CallSite _FC_bottom = TypeSystemImpl.createCallSite(OCRBlock.class, "bottom");
  private final static MethodHandle _FH_bottom = _FC_bottom.dynamicInvoker();
  private final static CallSite _FC_left = TypeSystemImpl.createCallSite(OCRBlock.class, "left");
  private final static MethodHandle _FH_left = _FC_left.dynamicInvoker();
  private final static CallSite _FC_right = TypeSystemImpl.createCallSite(OCRBlock.class, "right");
  private final static MethodHandle _FH_right = _FC_right.dynamicInvoker();
  private final static CallSite _FC_blockType = TypeSystemImpl.createCallSite(OCRBlock.class, "blockType");
  private final static MethodHandle _FH_blockType = _FC_blockType.dynamicInvoker();
  private final static CallSite _FC_blockName = TypeSystemImpl.createCallSite(OCRBlock.class, "blockName");
  private final static MethodHandle _FH_blockName = _FC_blockName.dynamicInvoker();
  private final static CallSite _FC_valid = TypeSystemImpl.createCallSite(OCRBlock.class, "valid");
  private final static MethodHandle _FH_valid = _FC_valid.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OCRBlock() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OCRBlock(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OCRBlock(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OCRBlock(JCas jcas, int begin, int end) {
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
    
   
    
  //*--------------*
  //* Feature: blockType

  /** getter for blockType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBlockType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_blockType));
  }
    
  /** setter for blockType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlockType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_blockType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: blockName

  /** getter for blockName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBlockName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_blockName));
  }
    
  /** setter for blockName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlockName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_blockName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valid

  /** getter for valid - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getValid() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_valid));
  }
    
  /** setter for valid - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValid(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_valid), v);
  }    
    
  }

    