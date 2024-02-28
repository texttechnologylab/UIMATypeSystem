

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 21:43:09 CET 2024 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import de.tudarmstadt.ukp.dkpro.core.api.semantics.type.WordSense;


/** 
 * Updated by JCasGen Wed Feb 28 21:43:09 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SemanticSource extends WordSense {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.SemanticSource";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticSource.class);
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
   
  public final static String _FeatName_source = "source";
  public final static String _FeatName_searchResult = "searchResult";
  public final static String _FeatName_comment = "comment";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(SemanticSource.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();
  private final static CallSite _FC_searchResult = TypeSystemImpl.createCallSite(SemanticSource.class, "searchResult");
  private final static MethodHandle _FH_searchResult = _FC_searchResult.dynamicInvoker();
  private final static CallSite _FC_comment = TypeSystemImpl.createCallSite(SemanticSource.class, "comment");
  private final static MethodHandle _FH_comment = _FC_comment.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SemanticSource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SemanticSource(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticSource(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticSource(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_source));
  }
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_source), v);
  }    
    
   
    
  //*--------------*
  //* Feature: searchResult

  /** getter for searchResult - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSearchResult() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_searchResult));
  }
    
  /** setter for searchResult - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSearchResult(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_searchResult), v);
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
    
  }

    