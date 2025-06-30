

   
/* Apache UIMA v3 - First created by JCasGen Mon Jun 30 13:13:31 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;


/** Readability Output
 * Updated by JCasGen Mon Jun 30 13:13:31 CEST 2025
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ReadabilityAdvance extends Readability {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ReadabilityAdvance";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ReadabilityAdvance.class);
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
   
  public final static String _FeatName_GroupName = "GroupName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_GroupName = TypeSystemImpl.createCallSite(ReadabilityAdvance.class, "GroupName");
  private final static MethodHandle _FH_GroupName = _FC_GroupName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ReadabilityAdvance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ReadabilityAdvance(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ReadabilityAdvance(JCas jcas) {
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
  //* Feature: GroupName

  /** getter for GroupName - gets Group Name for the Text Readabilities
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<AnnotationComment> getGroupName() { 
    return (FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_GroupName)));
  }
    
  /** setter for GroupName - sets Group Name for the Text Readabilities 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroupName(FSArray<AnnotationComment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_GroupName), v);
  }    
    
    
  /** indexed getter for GroupName - gets an indexed value - Group Name for the Text Readabilities
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public AnnotationComment getGroupName(int i) {
     return (AnnotationComment)(((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_GroupName)))).get(i));
  } 

  /** indexed setter for GroupName - sets an indexed value - Group Name for the Text Readabilities
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setGroupName(int i, AnnotationComment v) {
    ((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_GroupName)))).set(i, v);
  }  
  }

    