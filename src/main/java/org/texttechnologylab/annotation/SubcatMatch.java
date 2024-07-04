

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:09:04 CEST 2024 */

package org.texttechnologylab.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Thu Jul 04 15:09:04 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SubcatMatch extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.SubcatMatch";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SubcatMatch.class);
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
   
  public final static String _FeatName_status = "status";
  public final static String _FeatName_context = "context";
  public final static String _FeatName_elements = "elements";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_status = TypeSystemImpl.createCallSite(SubcatMatch.class, "status");
  private final static MethodHandle _FH_status = _FC_status.dynamicInvoker();
  private final static CallSite _FC_context = TypeSystemImpl.createCallSite(SubcatMatch.class, "context");
  private final static MethodHandle _FH_context = _FC_context.dynamicInvoker();
  private final static CallSite _FC_elements = TypeSystemImpl.createCallSite(SubcatMatch.class, "elements");
  private final static MethodHandle _FH_elements = _FC_elements.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SubcatMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SubcatMatch(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SubcatMatch(JCas jcas) {
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
  //* Feature: status

  /** getter for status - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStatus() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_status));
  }
    
  /** setter for status - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_status), v);
  }    
    
   
    
  //*--------------*
  //* Feature: context

  /** getter for context - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContext() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_context));
  }
    
  /** setter for context - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_context), v);
  }    
    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<SemanticSource> getElements() { 
    return (FSArray<SemanticSource>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)));
  }
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSArray<SemanticSource> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_elements), v);
  }    
    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public SemanticSource getElements(int i) {
     return (SemanticSource)(((FSArray<SemanticSource>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)))).get(i));
  } 

  /** indexed setter for elements - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setElements(int i, SemanticSource v) {
    ((FSArray<SemanticSource>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)))).set(i, v);
  }  
  }

    