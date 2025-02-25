

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 13:16:03 CET 2025 */

package org.hucompute.textimager.uima.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Tue Feb 25 13:16:03 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Wikify extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.Wikify";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Wikify.class);
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
   
  public final static String _FeatName_title = "title";
  public final static String _FeatName_link = "link";
  public final static String _FeatName_elements = "elements";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Wikify.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_link = TypeSystemImpl.createCallSite(Wikify.class, "link");
  private final static MethodHandle _FH_link = _FC_link.dynamicInvoker();
  private final static CallSite _FC_elements = TypeSystemImpl.createCallSite(Wikify.class, "elements");
  private final static MethodHandle _FH_elements = _FC_elements.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Wikify() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Wikify(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Wikify(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Wikify(JCas jcas, int begin, int end) {
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
  //* Feature: title

  /** getter for title - gets start and end of the objects
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets start and end of the objects 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: link

  /** getter for link - gets start and end of the objects
   * @generated
   * @return value of the feature 
   */
  public String getLink() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_link));
  }
    
  /** setter for link - sets start and end of the objects 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLink(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_link), v);
  }    
    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Annotation> getElements() { 
    return (FSArray<Annotation>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)));
  }
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSArray<Annotation> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_elements), v);
  }    
    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Annotation getElements(int i) {
     return (Annotation)(((FSArray<Annotation>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)))).get(i));
  } 

  /** indexed setter for elements - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setElements(int i, Annotation v) {
    ((FSArray<Annotation>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)))).set(i, v);
  }  
  }

    