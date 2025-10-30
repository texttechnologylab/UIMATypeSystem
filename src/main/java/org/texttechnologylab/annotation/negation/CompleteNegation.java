

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation.negation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class CompleteNegation extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.negation.CompleteNegation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CompleteNegation.class);
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
   
  public final static String _FeatName_negType = "negType";
  public final static String _FeatName_cue = "cue";
  public final static String _FeatName_event = "event";
  public final static String _FeatName_focus = "focus";
  public final static String _FeatName_scope = "scope";
  public final static String _FeatName_xscope = "xscope";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_negType = TypeSystemImpl.createCallSite(CompleteNegation.class, "negType");
  private final static MethodHandle _FH_negType = _FC_negType.dynamicInvoker();
  private final static CallSite _FC_cue = TypeSystemImpl.createCallSite(CompleteNegation.class, "cue");
  private final static MethodHandle _FH_cue = _FC_cue.dynamicInvoker();
  private final static CallSite _FC_event = TypeSystemImpl.createCallSite(CompleteNegation.class, "event");
  private final static MethodHandle _FH_event = _FC_event.dynamicInvoker();
  private final static CallSite _FC_focus = TypeSystemImpl.createCallSite(CompleteNegation.class, "focus");
  private final static MethodHandle _FH_focus = _FC_focus.dynamicInvoker();
  private final static CallSite _FC_scope = TypeSystemImpl.createCallSite(CompleteNegation.class, "scope");
  private final static MethodHandle _FH_scope = _FC_scope.dynamicInvoker();
  private final static CallSite _FC_xscope = TypeSystemImpl.createCallSite(CompleteNegation.class, "xscope");
  private final static MethodHandle _FH_xscope = _FC_xscope.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected CompleteNegation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public CompleteNegation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CompleteNegation(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CompleteNegation(JCas jcas, int begin, int end) {
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
  //* Feature: negType

  /** getter for negType - gets Syntactic|Lexical|Morphological
   * @generated
   * @return value of the feature 
   */
  public String getNegType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_negType));
  }
    
  /** setter for negType - sets Syntactic|Lexical|Morphological 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_negType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: cue

  /** getter for cue - gets Cue is a lexical item that modifies the truth value of the propositions that is within its scope
   * @generated
   * @return value of the feature 
   */
  public Token getCue() { 
    return (Token)(_getFeatureValueNc(wrapGetIntCatchException(_FH_cue)));
  }
    
  /** setter for cue - sets Cue is a lexical item that modifies the truth value of the propositions that is within its scope 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCue(Token v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_cue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: event

  /** getter for event - gets Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Token> getEvent() { 
    return (FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_event)));
  }
    
  /** setter for event - sets Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent(FSArray<Token> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_event), v);
  }    
    
    
  /** indexed getter for event - gets an indexed value - Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Token getEvent(int i) {
     return (Token)(((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_event)))).get(i));
  } 

  /** indexed setter for event - sets an indexed value - Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setEvent(int i, Token v) {
    ((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_event)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: focus

  /** getter for focus - gets Part of the scope that is most prominently or explicitly negated
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Token> getFocus() { 
    return (FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_focus)));
  }
    
  /** setter for focus - sets Part of the scope that is most prominently or explicitly negated 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFocus(FSArray<Token> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_focus), v);
  }    
    
    
  /** indexed getter for focus - gets an indexed value - Part of the scope that is most prominently or explicitly negated
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Token getFocus(int i) {
     return (Token)(((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_focus)))).get(i));
  } 

  /** indexed setter for focus - sets an indexed value - Part of the scope that is most prominently or explicitly negated
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setFocus(int i, Token v) {
    ((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_focus)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: scope

  /** getter for scope - gets Part of the sentence affected by the negation cue
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Token> getScope() { 
    return (FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scope)));
  }
    
  /** setter for scope - sets Part of the sentence affected by the negation cue 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScope(FSArray<Token> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scope), v);
  }    
    
    
  /** indexed getter for scope - gets an indexed value - Part of the sentence affected by the negation cue
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Token getScope(int i) {
     return (Token)(((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scope)))).get(i));
  } 

  /** indexed setter for scope - sets an indexed value - Part of the sentence affected by the negation cue
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setScope(int i, Token v) {
    ((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scope)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: xscope

  /** getter for xscope - gets Part affected by the negation cue, but outside of sentence (expanded context)
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Token> getXscope() { 
    return (FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_xscope)));
  }
    
  /** setter for xscope - sets Part affected by the negation cue, but outside of sentence (expanded context) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setXscope(FSArray<Token> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_xscope), v);
  }    
    
    
  /** indexed getter for xscope - gets an indexed value - Part affected by the negation cue, but outside of sentence (expanded context)
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Token getXscope(int i) {
     return (Token)(((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_xscope)))).get(i));
  } 

  /** indexed setter for xscope - sets an indexed value - Part affected by the negation cue, but outside of sentence (expanded context)
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setXscope(int i, Token v) {
    ((FSArray<Token>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_xscope)))).set(i, v);
  }  
  }

    