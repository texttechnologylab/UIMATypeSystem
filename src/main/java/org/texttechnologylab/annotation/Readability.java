

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Readability Output
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Readability extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Readability";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Readability.class);
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
   
  public final static String _FeatName_TextReadabilities = "TextReadabilities";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_TextReadabilities = TypeSystemImpl.createCallSite(Readability.class, "TextReadabilities");
  private final static MethodHandle _FH_TextReadabilities = _FC_TextReadabilities.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Readability.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Readability() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Readability(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Readability(JCas jcas) {
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
  //* Feature: TextReadabilities

  /** getter for TextReadabilities - gets Set of Text Readability with key and Value
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<AnnotationComment> getTextReadabilities() { 
    return (FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_TextReadabilities)));
  }
    
  /** setter for TextReadabilities - sets Set of Text Readability with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTextReadabilities(FSArray<AnnotationComment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_TextReadabilities), v);
  }    
    
    
  /** indexed getter for TextReadabilities - gets an indexed value - Set of Text Readability with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public AnnotationComment getTextReadabilities(int i) {
     return (AnnotationComment)(((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_TextReadabilities)))).get(i));
  } 

  /** indexed setter for TextReadabilities - sets an indexed value - Set of Text Readability with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setTextReadabilities(int i, AnnotationComment v) {
    ((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_TextReadabilities)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the TextReadability
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets Which Model or Process was used to Compute the TextReadability 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    