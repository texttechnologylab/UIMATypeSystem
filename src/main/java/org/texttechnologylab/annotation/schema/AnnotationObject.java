

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation.schema;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationObject extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.schema.AnnotationObject";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationObject.class);
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
   
  public final static String _FeatName_annotationType = "annotationType";
  public final static String _FeatName_comment = "comment";
  public final static String _FeatName_attributes = "attributes";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_annotationType = TypeSystemImpl.createCallSite(AnnotationObject.class, "annotationType");
  private final static MethodHandle _FH_annotationType = _FC_annotationType.dynamicInvoker();
  private final static CallSite _FC_comment = TypeSystemImpl.createCallSite(AnnotationObject.class, "comment");
  private final static MethodHandle _FH_comment = _FC_comment.dynamicInvoker();
  private final static CallSite _FC_attributes = TypeSystemImpl.createCallSite(AnnotationObject.class, "attributes");
  private final static MethodHandle _FH_attributes = _FC_attributes.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AnnotationObject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnnotationObject(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationObject(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationObject(JCas jcas, int begin, int end) {
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
  //* Feature: annotationType

  /** getter for annotationType - gets 
   * @generated
   * @return value of the feature 
   */
  public AnnotationClass getAnnotationType() { 
    return (AnnotationClass)(_getFeatureValueNc(wrapGetIntCatchException(_FH_annotationType)));
  }
    
  /** setter for annotationType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotationType(AnnotationClass v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_annotationType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_comment));
  }
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_comment), v);
  }    
    
   
    
  //*--------------*
  //* Feature: attributes

  /** getter for attributes - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<AnnotationAttribute> getAttributes() { 
    return (FSList<AnnotationAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_attributes)));
  }
    
  /** setter for attributes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributes(FSList<AnnotationAttribute> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_attributes), v);
  }    
    
  }

    