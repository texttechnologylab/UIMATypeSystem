

   
/* Apache UIMA v3 - First created by JCasGen Mon May 12 10:32:10 CEST 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon May 12 10:32:10 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Image extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.Image";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Image.class);
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
   
  public final static String _FeatName_src = "src";
  public final static String _FeatName_width = "width";
  public final static String _FeatName_height = "height";
  public final static String _FeatName_mimetype = "mimetype";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_src = TypeSystemImpl.createCallSite(Image.class, "src");
  private final static MethodHandle _FH_src = _FC_src.dynamicInvoker();
  private final static CallSite _FC_width = TypeSystemImpl.createCallSite(Image.class, "width");
  private final static MethodHandle _FH_width = _FC_width.dynamicInvoker();
  private final static CallSite _FC_height = TypeSystemImpl.createCallSite(Image.class, "height");
  private final static MethodHandle _FH_height = _FC_height.dynamicInvoker();
  private final static CallSite _FC_mimetype = TypeSystemImpl.createCallSite(Image.class, "mimetype");
  private final static MethodHandle _FH_mimetype = _FC_mimetype.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Image() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Image(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Image(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Image(JCas jcas, int begin, int end) {
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
  //* Feature: src

  /** getter for src - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSrc() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_src));
  }
    
  /** setter for src - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSrc(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_src), v);
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
  //* Feature: mimetype

  /** getter for mimetype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMimetype() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_mimetype));
  }
    
  /** setter for mimetype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMimetype(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mimetype), v);
  }    
    
  }

    