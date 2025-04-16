

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 15 18:59:23 CEST 2025 */

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
 * Updated by JCasGen Tue Apr 15 18:59:23 CEST 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Page extends Div {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Page";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Page.class);
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
   
  public final static String _FeatName_index = "index";
  public final static String _FeatName_pageNumber = "pageNumber";
  public final static String _FeatName_uri = "uri";
  public final static String _FeatName_width = "width";
  public final static String _FeatName_height = "height";
  public final static String _FeatName_resolution = "resolution";
  public final static String _FeatName_rotation = "rotation";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_index = TypeSystemImpl.createCallSite(Page.class, "index");
  private final static MethodHandle _FH_index = _FC_index.dynamicInvoker();
  private final static CallSite _FC_pageNumber = TypeSystemImpl.createCallSite(Page.class, "pageNumber");
  private final static MethodHandle _FH_pageNumber = _FC_pageNumber.dynamicInvoker();
  private final static CallSite _FC_uri = TypeSystemImpl.createCallSite(Page.class, "uri");
  private final static MethodHandle _FH_uri = _FC_uri.dynamicInvoker();
  private final static CallSite _FC_width = TypeSystemImpl.createCallSite(Page.class, "width");
  private final static MethodHandle _FH_width = _FC_width.dynamicInvoker();
  private final static CallSite _FC_height = TypeSystemImpl.createCallSite(Page.class, "height");
  private final static MethodHandle _FH_height = _FC_height.dynamicInvoker();
  private final static CallSite _FC_resolution = TypeSystemImpl.createCallSite(Page.class, "resolution");
  private final static MethodHandle _FH_resolution = _FC_resolution.dynamicInvoker();
  private final static CallSite _FC_rotation = TypeSystemImpl.createCallSite(Page.class, "rotation");
  private final static MethodHandle _FH_rotation = _FC_rotation.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Page() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Page(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Page(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Page(JCas jcas, int begin, int end) {
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
  //* Feature: index

  /** getter for index - gets The page index, i.e. a running number assigned during the processing.
                        Usually denoted in the file name as the first part, e.g. "1" for "01_123456789.xml"
   * @generated
   * @return value of the feature 
   */
  public int getIndex() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_index));
  }
    
  /** setter for index - sets The page index, i.e. a running number assigned during the processing.
                        Usually denoted in the file name as the first part, e.g. "1" for "01_123456789.xml" 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_index), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pageNumber

  /** getter for pageNumber - gets The page number *as a String* as cover pages etc. are commonly numbered using roman numbers.
   * @generated
   * @return value of the feature 
   */
  public String getPageNumber() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pageNumber));
  }
    
  /** setter for pageNumber - sets The page number *as a String* as cover pages etc. are commonly numbered using roman numbers. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageNumber(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pageNumber), v);
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
  //* Feature: rotation

  /** getter for rotation - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRotation() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_rotation));
  }
    
  /** setter for rotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_rotation), v);
  }    
    
  }

    