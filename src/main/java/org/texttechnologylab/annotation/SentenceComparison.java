

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Sentence i and Sentence j which will be compared
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SentenceComparison extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.SentenceComparison";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceComparison.class);
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
   
  public final static String _FeatName_SentenceI = "SentenceI";
  public final static String _FeatName_SentenceJ = "SentenceJ";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_SentenceI = TypeSystemImpl.createCallSite(SentenceComparison.class, "SentenceI");
  private final static MethodHandle _FH_SentenceI = _FC_SentenceI.dynamicInvoker();
  private final static CallSite _FC_SentenceJ = TypeSystemImpl.createCallSite(SentenceComparison.class, "SentenceJ");
  private final static MethodHandle _FH_SentenceJ = _FC_SentenceJ.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SentenceComparison() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SentenceComparison(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceComparison(JCas jcas) {
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
  //* Feature: SentenceI

  /** getter for SentenceI - gets Sentence i which will be compared with Sentence j
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceI() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_SentenceI)));
  }
    
  /** setter for SentenceI - sets Sentence i which will be compared with Sentence j 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceI(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_SentenceI), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SentenceJ

  /** getter for SentenceJ - gets Sentence j which will be compared with Sentence i
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceJ() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_SentenceJ)));
  }
    
  /** setter for SentenceJ - sets Sentence j which will be compared with Sentence i 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceJ(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_SentenceJ), v);
  }    
    
  }

    