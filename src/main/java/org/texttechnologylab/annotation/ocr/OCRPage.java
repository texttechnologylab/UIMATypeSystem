

   
/* Apache UIMA v3 - First created by JCasGen Sun Mar 10 21:31:12 CET 2024 */

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
 * Updated by JCasGen Sun Mar 10 21:31:12 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OCRPage extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.OCRPage";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OCRPage.class);
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
   
  public final static String _FeatName_width = "width";
  public final static String _FeatName_height = "height";
  public final static String _FeatName_resolution = "resolution";
  public final static String _FeatName_pageId = "pageId";
  public final static String _FeatName_pageNumber = "pageNumber";
  public final static String _FeatName_uri = "uri";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_width = TypeSystemImpl.createCallSite(OCRPage.class, "width");
  private final static MethodHandle _FH_width = _FC_width.dynamicInvoker();
  private final static CallSite _FC_height = TypeSystemImpl.createCallSite(OCRPage.class, "height");
  private final static MethodHandle _FH_height = _FC_height.dynamicInvoker();
  private final static CallSite _FC_resolution = TypeSystemImpl.createCallSite(OCRPage.class, "resolution");
  private final static MethodHandle _FH_resolution = _FC_resolution.dynamicInvoker();
  private final static CallSite _FC_pageId = TypeSystemImpl.createCallSite(OCRPage.class, "pageId");
  private final static MethodHandle _FH_pageId = _FC_pageId.dynamicInvoker();
  private final static CallSite _FC_pageNumber = TypeSystemImpl.createCallSite(OCRPage.class, "pageNumber");
  private final static MethodHandle _FH_pageNumber = _FC_pageNumber.dynamicInvoker();
  private final static CallSite _FC_uri = TypeSystemImpl.createCallSite(OCRPage.class, "uri");
  private final static MethodHandle _FH_uri = _FC_uri.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OCRPage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OCRPage(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OCRPage(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OCRPage(JCas jcas, int begin, int end) {
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
  //* Feature: width

  /** getter for width - gets 
   * @generated
   * @return value of the feature 
   */
  public int getWidth() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_width));
  }
    
  /** setter for width - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWidth(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_width), v);
  }    
    
   
    
  //*--------------*
  //* Feature: height

  /** getter for height - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHeight() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_height));
  }
    
  /** setter for height - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeight(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_height), v);
  }    
    
   
    
  //*--------------*
  //* Feature: resolution

  /** getter for resolution - gets 
   * @generated
   * @return value of the feature 
   */
  public int getResolution() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_resolution));
  }
    
  /** setter for resolution - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setResolution(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_resolution), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pageId

  /** getter for pageId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPageId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pageId));
  }
    
  /** setter for pageId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pageId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pageNumber

  /** getter for pageNumber - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPageNumber() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_pageNumber));
  }
    
  /** setter for pageNumber - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageNumber(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_pageNumber), v);
  }    
    
   
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_uri));
  }
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_uri), v);
  }    
    
  }

    