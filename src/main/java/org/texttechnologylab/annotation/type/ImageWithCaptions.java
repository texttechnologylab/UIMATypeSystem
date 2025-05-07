

   
/* Apache UIMA v3 - First created by JCasGen Mon May 05 11:13:03 CEST 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.Caption;


/** 
 * Updated by JCasGen Mon May 05 12:47:44 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/src/main/resources/desc/type/TextTechnologyMultimedia.xml
 * @generated */
public class ImageWithCaptions extends Image {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.ImageWithCaptions";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ImageWithCaptions.class);
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
   
  public final static String _FeatName_captions = "captions";
  public final static String _FeatName_captionLanguage = "captionLanguage";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_captions = TypeSystemImpl.createCallSite(ImageWithCaptions.class, "captions");
  private final static MethodHandle _FH_captions = _FC_captions.dynamicInvoker();
  private final static CallSite _FC_captionLanguage = TypeSystemImpl.createCallSite(ImageWithCaptions.class, "captionLanguage");
  private final static MethodHandle _FH_captionLanguage = _FC_captionLanguage.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ImageWithCaptions() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ImageWithCaptions(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ImageWithCaptions(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ImageWithCaptions(JCas jcas, int begin, int end) {
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
  //* Feature: captions

  /** getter for captions - gets Set of image captions
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Caption> getCaptions() { 
    return (FSArray<Caption>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_captions)));
  }
    
  /** setter for captions - sets Set of image captions 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCaptions(FSArray<Caption> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_captions), v);
  }    
    
    
  /** indexed getter for captions - gets an indexed value - Set of image captions
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Caption getCaptions(int i) {
     return (Caption)(((FSArray<Caption>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_captions)))).get(i));
  } 

  /** indexed setter for captions - sets an indexed value - Set of image captions
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setCaptions(int i, Caption v) {
    ((FSArray<Caption>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_captions)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: captionLanguage

  /** getter for captionLanguage - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCaptionLanguage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_captionLanguage));
  }
    
  /** setter for captionLanguage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCaptionLanguage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_captionLanguage), v);
  }    
    
  }

    