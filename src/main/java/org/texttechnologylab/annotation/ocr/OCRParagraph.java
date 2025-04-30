

   
/* Apache UIMA v3 - First created by JCasGen Wed Apr 30 10:59:11 CEST 2025 */

package org.texttechnologylab.annotation.ocr;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Wed Apr 30 10:59:11 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OCRParagraph extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.OCRParagraph";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OCRParagraph.class);
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
   
  public final static String _FeatName_leftIndent = "leftIndent";
  public final static String _FeatName_rightIndent = "rightIndent";
  public final static String _FeatName_startIndent = "startIndent";
  public final static String _FeatName_lineSpacing = "lineSpacing";
  public final static String _FeatName_align = "align";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_leftIndent = TypeSystemImpl.createCallSite(OCRParagraph.class, "leftIndent");
  private final static MethodHandle _FH_leftIndent = _FC_leftIndent.dynamicInvoker();
  private final static CallSite _FC_rightIndent = TypeSystemImpl.createCallSite(OCRParagraph.class, "rightIndent");
  private final static MethodHandle _FH_rightIndent = _FC_rightIndent.dynamicInvoker();
  private final static CallSite _FC_startIndent = TypeSystemImpl.createCallSite(OCRParagraph.class, "startIndent");
  private final static MethodHandle _FH_startIndent = _FC_startIndent.dynamicInvoker();
  private final static CallSite _FC_lineSpacing = TypeSystemImpl.createCallSite(OCRParagraph.class, "lineSpacing");
  private final static MethodHandle _FH_lineSpacing = _FC_lineSpacing.dynamicInvoker();
  private final static CallSite _FC_align = TypeSystemImpl.createCallSite(OCRParagraph.class, "align");
  private final static MethodHandle _FH_align = _FC_align.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OCRParagraph() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OCRParagraph(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OCRParagraph(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OCRParagraph(JCas jcas, int begin, int end) {
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
  //* Feature: leftIndent

  /** getter for leftIndent - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLeftIndent() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_leftIndent));
  }
    
  /** setter for leftIndent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLeftIndent(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_leftIndent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rightIndent

  /** getter for rightIndent - gets 
   * @generated
   * @return value of the feature 
   */
  public int getRightIndent() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_rightIndent));
  }
    
  /** setter for rightIndent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRightIndent(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_rightIndent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: startIndent

  /** getter for startIndent - gets 
   * @generated
   * @return value of the feature 
   */
  public int getStartIndent() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_startIndent));
  }
    
  /** setter for startIndent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartIndent(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_startIndent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lineSpacing

  /** getter for lineSpacing - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLineSpacing() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_lineSpacing));
  }
    
  /** setter for lineSpacing - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLineSpacing(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_lineSpacing), v);
  }    
    
   
    
  //*--------------*
  //* Feature: align

  /** getter for align - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAlign() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_align));
  }
    
  /** setter for align - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlign(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_align), v);
  }    
    
  }

    