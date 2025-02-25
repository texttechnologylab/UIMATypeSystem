

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 12:41:26 CET 2025 */

package org.texttechnologylab.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Tue Feb 25 12:41:26 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DocumentAnnotation extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.DocumentAnnotation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentAnnotation.class);
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
   
  public final static String _FeatName_author = "author";
  public final static String _FeatName_publisher = "publisher";
  public final static String _FeatName_dateDay = "dateDay";
  public final static String _FeatName_subtitle = "subtitle";
  public final static String _FeatName_dateMonth = "dateMonth";
  public final static String _FeatName_dateYear = "dateYear";
  public final static String _FeatName_timestamp = "timestamp";
  public final static String _FeatName_place = "place";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_author = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "author");
  private final static MethodHandle _FH_author = _FC_author.dynamicInvoker();
  private final static CallSite _FC_publisher = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "publisher");
  private final static MethodHandle _FH_publisher = _FC_publisher.dynamicInvoker();
  private final static CallSite _FC_dateDay = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "dateDay");
  private final static MethodHandle _FH_dateDay = _FC_dateDay.dynamicInvoker();
  private final static CallSite _FC_subtitle = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "subtitle");
  private final static MethodHandle _FH_subtitle = _FC_subtitle.dynamicInvoker();
  private final static CallSite _FC_dateMonth = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "dateMonth");
  private final static MethodHandle _FH_dateMonth = _FC_dateMonth.dynamicInvoker();
  private final static CallSite _FC_dateYear = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "dateYear");
  private final static MethodHandle _FH_dateYear = _FC_dateYear.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();
  private final static CallSite _FC_place = TypeSystemImpl.createCallSite(DocumentAnnotation.class, "place");
  private final static MethodHandle _FH_place = _FC_place.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected DocumentAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DocumentAnnotation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocumentAnnotation(JCas jcas) {
    super(jcas);
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
  //* Feature: author

  /** getter for author - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_author));
  }
    
  /** setter for author - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_author), v);
  }    
    
   
    
  //*--------------*
  //* Feature: publisher

  /** getter for publisher - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPublisher() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_publisher));
  }
    
  /** setter for publisher - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPublisher(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_publisher), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dateDay

  /** getter for dateDay - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDateDay() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_dateDay));
  }
    
  /** setter for dateDay - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateDay(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_dateDay), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subtitle

  /** getter for subtitle - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubtitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subtitle));
  }
    
  /** setter for subtitle - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subtitle), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dateMonth

  /** getter for dateMonth - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDateMonth() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_dateMonth));
  }
    
  /** setter for dateMonth - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateMonth(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_dateMonth), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dateYear

  /** getter for dateYear - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDateYear() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_dateYear));
  }
    
  /** setter for dateYear - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateYear(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_dateYear), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public long getTimestamp() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
   
    
  //*--------------*
  //* Feature: place

  /** getter for place - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPlace() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_place));
  }
    
  /** setter for place - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPlace(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_place), v);
  }    
    
  }

    