

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

package org.texttechnologylab.annotation.administration.activelearner;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.AnnotationComment;


/** 
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Recommendation extends AnnotationComment {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.administration.activelearner.Recommendation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Recommendation.class);
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
   
  public final static String _FeatName_hash = "hash";
  public final static String _FeatName_score = "score";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_hash = TypeSystemImpl.createCallSite(Recommendation.class, "hash");
  private final static MethodHandle _FH_hash = _FC_hash.dynamicInvoker();
  private final static CallSite _FC_score = TypeSystemImpl.createCallSite(Recommendation.class, "score");
  private final static MethodHandle _FH_score = _FC_score.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Recommendation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Recommendation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Recommendation(JCas jcas) {
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
  //* Feature: hash

  /** getter for hash - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHash() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_hash));
  }
    
  /** setter for hash - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHash(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_hash), v);
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
    
  }

    