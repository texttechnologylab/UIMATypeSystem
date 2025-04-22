

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 22 17:11:16 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Apr 22 17:11:16 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Format extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Format";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Format.class);
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
   
  public final static String _FeatName_lang = "lang";
  public final static String _FeatName_ff = "ff";
  public final static String _FeatName_fs = "fs";
  public final static String _FeatName_bold = "bold";
  public final static String _FeatName_italic = "italic";
  public final static String _FeatName_subscript = "subscript";
  public final static String _FeatName_superscript = "superscript";
  public final static String _FeatName_smallcaps = "smallcaps";
  public final static String _FeatName_underline = "underline";
  public final static String _FeatName_strikeout = "strikeout";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_lang = TypeSystemImpl.createCallSite(Format.class, "lang");
  private final static MethodHandle _FH_lang = _FC_lang.dynamicInvoker();
  private final static CallSite _FC_ff = TypeSystemImpl.createCallSite(Format.class, "ff");
  private final static MethodHandle _FH_ff = _FC_ff.dynamicInvoker();
  private final static CallSite _FC_fs = TypeSystemImpl.createCallSite(Format.class, "fs");
  private final static MethodHandle _FH_fs = _FC_fs.dynamicInvoker();
  private final static CallSite _FC_bold = TypeSystemImpl.createCallSite(Format.class, "bold");
  private final static MethodHandle _FH_bold = _FC_bold.dynamicInvoker();
  private final static CallSite _FC_italic = TypeSystemImpl.createCallSite(Format.class, "italic");
  private final static MethodHandle _FH_italic = _FC_italic.dynamicInvoker();
  private final static CallSite _FC_subscript = TypeSystemImpl.createCallSite(Format.class, "subscript");
  private final static MethodHandle _FH_subscript = _FC_subscript.dynamicInvoker();
  private final static CallSite _FC_superscript = TypeSystemImpl.createCallSite(Format.class, "superscript");
  private final static MethodHandle _FH_superscript = _FC_superscript.dynamicInvoker();
  private final static CallSite _FC_smallcaps = TypeSystemImpl.createCallSite(Format.class, "smallcaps");
  private final static MethodHandle _FH_smallcaps = _FC_smallcaps.dynamicInvoker();
  private final static CallSite _FC_underline = TypeSystemImpl.createCallSite(Format.class, "underline");
  private final static MethodHandle _FH_underline = _FC_underline.dynamicInvoker();
  private final static CallSite _FC_strikeout = TypeSystemImpl.createCallSite(Format.class, "strikeout");
  private final static MethodHandle _FH_strikeout = _FC_strikeout.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Format() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Format(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Format(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Format(JCas jcas, int begin, int end) {
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
  //* Feature: lang

  /** getter for lang - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLang() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_lang));
  }
    
  /** setter for lang - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLang(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_lang), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ff

  /** getter for ff - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFf() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ff));
  }
    
  /** setter for ff - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFf(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ff), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fs

  /** getter for fs - gets 
   * @generated
   * @return value of the feature 
   */
  public float getFs() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_fs));
  }
    
  /** setter for fs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFs(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_fs), v);
  }    
    
   
    
  //*--------------*
  //* Feature: bold

  /** getter for bold - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getBold() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_bold));
  }
    
  /** setter for bold - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBold(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_bold), v);
  }    
    
   
    
  //*--------------*
  //* Feature: italic

  /** getter for italic - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getItalic() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_italic));
  }
    
  /** setter for italic - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setItalic(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_italic), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subscript

  /** getter for subscript - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSubscript() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_subscript));
  }
    
  /** setter for subscript - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubscript(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_subscript), v);
  }    
    
   
    
  //*--------------*
  //* Feature: superscript

  /** getter for superscript - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSuperscript() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_superscript));
  }
    
  /** setter for superscript - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuperscript(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_superscript), v);
  }    
    
   
    
  //*--------------*
  //* Feature: smallcaps

  /** getter for smallcaps - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSmallcaps() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_smallcaps));
  }
    
  /** setter for smallcaps - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSmallcaps(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_smallcaps), v);
  }    
    
   
    
  //*--------------*
  //* Feature: underline

  /** getter for underline - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getUnderline() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_underline));
  }
    
  /** setter for underline - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnderline(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_underline), v);
  }    
    
   
    
  //*--------------*
  //* Feature: strikeout

  /** getter for strikeout - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getStrikeout() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_strikeout));
  }
    
  /** setter for strikeout - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStrikeout(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_strikeout), v);
  }    
    
  }

    