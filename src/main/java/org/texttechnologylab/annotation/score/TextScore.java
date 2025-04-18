

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation.score;
 

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
 * Updated by JCasGen Sat Apr 19 00:21:17 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TextScore extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.score.TextScore";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextScore.class);
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
   
  public final static String _FeatName_elements = "elements";
  public final static String _FeatName_documentURI = "documentURI";
  public final static String _FeatName_documentName = "documentName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_elements = TypeSystemImpl.createCallSite(TextScore.class, "elements");
  private final static MethodHandle _FH_elements = _FC_elements.dynamicInvoker();
  private final static CallSite _FC_documentURI = TypeSystemImpl.createCallSite(TextScore.class, "documentURI");
  private final static MethodHandle _FH_documentURI = _FC_documentURI.dynamicInvoker();
  private final static CallSite _FC_documentName = TypeSystemImpl.createCallSite(TextScore.class, "documentName");
  private final static MethodHandle _FH_documentName = _FC_documentName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TextScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TextScore(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextScore(JCas jcas) {
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
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TextScoreEntry> getElements() { 
    return (FSArray<TextScoreEntry>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)));
  }
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSArray<TextScoreEntry> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_elements), v);
  }    
    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TextScoreEntry getElements(int i) {
     return (TextScoreEntry)(((FSArray<TextScoreEntry>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)))).get(i));
  } 

  /** indexed setter for elements - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setElements(int i, TextScoreEntry v) {
    ((FSArray<TextScoreEntry>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elements)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: documentURI

  /** getter for documentURI - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentURI() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_documentURI));
  }
    
  /** setter for documentURI - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentURI(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_documentURI), v);
  }    
    
   
    
  //*--------------*
  //* Feature: documentName

  /** getter for documentName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_documentName));
  }
    
  /** setter for documentName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_documentName), v);
  }    
    
  }

    