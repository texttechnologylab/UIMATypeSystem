

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

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
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Video extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.Video";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Video.class);
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
  public final static String _FeatName_length = "length";
  public final static String _FeatName_fps = "fps";
  public final static String _FeatName_mimetype = "mimetype";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_src = TypeSystemImpl.createCallSite(Video.class, "src");
  private final static MethodHandle _FH_src = _FC_src.dynamicInvoker();
  private final static CallSite _FC_length = TypeSystemImpl.createCallSite(Video.class, "length");
  private final static MethodHandle _FH_length = _FC_length.dynamicInvoker();
  private final static CallSite _FC_fps = TypeSystemImpl.createCallSite(Video.class, "fps");
  private final static MethodHandle _FH_fps = _FC_fps.dynamicInvoker();
  private final static CallSite _FC_mimetype = TypeSystemImpl.createCallSite(Video.class, "mimetype");
  private final static MethodHandle _FH_mimetype = _FC_mimetype.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Video() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Video(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Video(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Video(JCas jcas, int begin, int end) {
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

  /** getter for src - gets path to the video or base64 value
   * @generated
   * @return value of the feature 
   */
  public String getSrc() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_src));
  }
    
  /** setter for src - sets path to the video or base64 value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSrc(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_src), v);
  }    
    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets Length of the video in seconds
   * @generated
   * @return value of the feature 
   */
  public double getLength() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_length));
  }
    
  /** setter for length - sets Length of the video in seconds 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLength(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_length), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fps

  /** getter for fps - gets Video fps
   * @generated
   * @return value of the feature 
   */
  public double getFps() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_fps));
  }
    
  /** setter for fps - sets Video fps 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFps(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_fps), v);
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

    