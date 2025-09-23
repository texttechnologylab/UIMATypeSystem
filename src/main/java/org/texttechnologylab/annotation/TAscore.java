

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** TextAnalyzer scores.
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TAscore extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.TAscore";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TAscore.class);
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
   
  public final static String _FeatName_name = "name";
  public final static String _FeatName_score = "score";
  public final static String _FeatName_group = "group";
  public final static String _FeatName_ref = "ref";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(TAscore.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_score = TypeSystemImpl.createCallSite(TAscore.class, "score");
  private final static MethodHandle _FH_score = _FC_score.dynamicInvoker();
  private final static CallSite _FC_group = TypeSystemImpl.createCallSite(TAscore.class, "group");
  private final static MethodHandle _FH_group = _FC_group.dynamicInvoker();
  private final static CallSite _FC_ref = TypeSystemImpl.createCallSite(TAscore.class, "ref");
  private final static MethodHandle _FH_ref = _FC_ref.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TAscore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TAscore(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TAscore(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TAscore(JCas jcas, int begin, int end) {
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
  //* Feature: name

  /** getter for name - gets String-based value, e.g. a topic name like "politics" or "sports".
   * @generated
   * @return value of the feature 
   */
  public String getName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_name));
  }
    
  /** setter for name - sets String-based value, e.g. a topic name like "politics" or "sports". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Score, probability or confidence value for the category set in the "value" field.
   * @generated
   * @return value of the feature 
   */
  public double getScore() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_score));
  }
    
  /** setter for score - sets Score, probability or confidence value for the category set in the "value" field. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_score), v);
  }    
    
   
    
  //*--------------*
  //* Feature: group

  /** getter for group - gets Feature class, e.g. pos-b (part of speech basic), pos-a, syntactic, coherence-l (token based), coherence-s (sentence based), etc.
   * @generated
   * @return value of the feature 
   */
  public String getGroup() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_group));
  }
    
  /** setter for group - sets Feature class, e.g. pos-b (part of speech basic), pos-a, syntactic, coherence-l (token based), coherence-s (sentence based), etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroup(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_group), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ref

  /** getter for ref - gets This field can reference any other annotation in the CAS, can be used to e.g. directly point to a span in the text to differentiate sentence- and paragraph-based classification results.
   * @generated
   * @return value of the feature 
   */
  public Annotation getRef() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_ref)));
  }
    
  /** setter for ref - sets This field can reference any other annotation in the CAS, can be used to e.g. directly point to a span in the text to differentiate sentence- and paragraph-based classification results. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRef(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_ref), v);
  }    
    
  }

    