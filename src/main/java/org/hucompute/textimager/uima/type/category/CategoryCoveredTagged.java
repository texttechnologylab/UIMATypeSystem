

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

package org.hucompute.textimager.uima.type.category;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class CategoryCoveredTagged extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.category.CategoryCoveredTagged";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CategoryCoveredTagged.class);
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
   
  public final static String _FeatName_value = "value";
  public final static String _FeatName_score = "score";
  public final static String _FeatName_tags = "tags";
  public final static String _FeatName_ref = "ref";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(CategoryCoveredTagged.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_score = TypeSystemImpl.createCallSite(CategoryCoveredTagged.class, "score");
  private final static MethodHandle _FH_score = _FC_score.dynamicInvoker();
  private final static CallSite _FC_tags = TypeSystemImpl.createCallSite(CategoryCoveredTagged.class, "tags");
  private final static MethodHandle _FH_tags = _FC_tags.dynamicInvoker();
  private final static CallSite _FC_ref = TypeSystemImpl.createCallSite(CategoryCoveredTagged.class, "ref");
  private final static MethodHandle _FH_ref = _FC_ref.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected CategoryCoveredTagged() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public CategoryCoveredTagged(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CategoryCoveredTagged(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CategoryCoveredTagged(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_score));
  }
    
  /** setter for score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_score), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tags

  /** getter for tags - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTags() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_tags));
  }
    
  /** setter for tags - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTags(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_tags), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ref

  /** getter for ref - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getRef() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_ref)));
  }
    
  /** setter for ref - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRef(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_ref), v);
  }    
    
  }

    