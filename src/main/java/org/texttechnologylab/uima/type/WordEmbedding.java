

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 29 20:58:21 CET 2026 */

package org.texttechnologylab.uima.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Vector of one word (token), e.g. from a spaCy, fastText or word2vec model. The span is the span of the token.
 * Updated by JCasGen Thu Oct 29 20:58:21 CET 2026
 * XML source: /tmp/claude-129622/-home-staff-homes-dbaumart-dev-git-duui-uima-duui-coh-metrix-paper-eval/fedf61c1-28e2-4768-b78f-993097470468/scratchpad/UIMATypeSystem-word-embedding/target/jcasgen/typesystem.xml
 * @generated */
public class WordEmbedding extends Embedding {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.uima.type.WordEmbedding";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WordEmbedding.class);
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
   
  public final static String _FeatName_reference = "reference";
  public final static String _FeatName_oov = "oov";
  public final static String _FeatName_shortName = "shortName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(WordEmbedding.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();
  private final static CallSite _FC_oov = TypeSystemImpl.createCallSite(WordEmbedding.class, "oov");
  private final static MethodHandle _FH_oov = _FC_oov.dynamicInvoker();
  private final static CallSite _FC_shortName = TypeSystemImpl.createCallSite(WordEmbedding.class, "shortName");
  private final static MethodHandle _FH_shortName = _FC_shortName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected WordEmbedding() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public WordEmbedding(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WordEmbedding(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WordEmbedding(JCas jcas, int begin, int end) {
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
  //* Feature: reference

  /** getter for reference - gets The token this vector belongs to.
   * @generated
   * @return value of the feature 
   */
  public Annotation getReference() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference)));
  }
    
  /** setter for reference - sets The token this vector belongs to. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: oov

  /** getter for oov - gets True if the word is not in the model's vocabulary, i.e. the vector is not one of the model's own word vectors (e.g. built from subwords by fastText).
   * @generated
   * @return value of the feature 
   */
  public boolean getOov() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_oov));
  }
    
  /** setter for oov - sets True if the word is not in the model's vocabulary, i.e. the vector is not one of the model's own word vectors (e.g. built from subwords by fastText). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOov(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_oov), v);
  }    
    
   
    
  //*--------------*
  //* Feature: shortName

  /** getter for shortName - gets Short name of the vector space, chosen by the tool or the user (e.g. SPACYlg), so tools using the vectors can select them by name without knowing the model (e.g. Coh-Metrix, where it becomes part of the index label).
   * @generated
   * @return value of the feature 
   */
  public String getShortName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_shortName));
  }
    
  /** setter for shortName - sets Short name of the vector space, chosen by the tool or the user (e.g. SPACYlg), so tools using the vectors can select them by name without knowing the model (e.g. Coh-Metrix, where it becomes part of the index label). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setShortName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_shortName), v);
  }    
    
  }

    