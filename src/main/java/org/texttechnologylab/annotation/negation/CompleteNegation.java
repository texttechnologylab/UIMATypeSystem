

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.negation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class CompleteNegation extends Annotation {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected CompleteNegation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CompleteNegation(int addr, TOP_Type type) {
    super(addr, type);
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
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_negType == null)
      jcasType.jcas.throwFeatMissing("negType", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_negType);}
    
  /** setter for negType - sets Syntactic|Lexical|Morphological 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegType(String v) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_negType == null)
      jcasType.jcas.throwFeatMissing("negType", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_negType, v);}    
   
    
  //*--------------*
  //* Feature: cue

  /** getter for cue - gets Cue is a lexical item that modifies the truth value of the propositions that is within its scope
   * @generated
   * @return value of the feature 
   */
  public Token getCue() {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_cue == null)
      jcasType.jcas.throwFeatMissing("cue", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_cue)));}
    
  /** setter for cue - sets Cue is a lexical item that modifies the truth value of the propositions that is within its scope 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCue(Token v) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_cue == null)
      jcasType.jcas.throwFeatMissing("cue", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_cue, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: event

  /** getter for event - gets Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective
   * @generated
   * @return value of the feature 
   */
  public FSArray getEvent() {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_event == null)
      jcasType.jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_event)));}
    
  /** setter for event - sets Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent(FSArray v) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_event == null)
      jcasType.jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_event, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for event - gets an indexed value - Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getEvent(int i) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_event == null)
      jcasType.jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_event), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_event), i)));}

  /** indexed setter for event - sets an indexed value - Event that is directly negated by the negation cue, usually a verb, a noun, or an adjective
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEvent(int i, Token v) { 
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_event == null)
      jcasType.jcas.throwFeatMissing("event", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_event), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_event), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: focus

  /** getter for focus - gets Part of the scope that is most prominently or explicitly negated
   * @generated
   * @return value of the feature 
   */
  public FSArray getFocus() {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_focus == null)
      jcasType.jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_focus)));}
    
  /** setter for focus - sets Part of the scope that is most prominently or explicitly negated 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFocus(FSArray v) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_focus == null)
      jcasType.jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_focus, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for focus - gets an indexed value - Part of the scope that is most prominently or explicitly negated
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getFocus(int i) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_focus == null)
      jcasType.jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_focus), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_focus), i)));}

  /** indexed setter for focus - sets an indexed value - Part of the scope that is most prominently or explicitly negated
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFocus(int i, Token v) { 
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_focus == null)
      jcasType.jcas.throwFeatMissing("focus", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_focus), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_focus), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: scope

  /** getter for scope - gets Part of the sentence affected by the negation cue
   * @generated
   * @return value of the feature 
   */
  public FSArray getScope() {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_scope == null)
      jcasType.jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_scope)));}
    
  /** setter for scope - sets Part of the sentence affected by the negation cue 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScope(FSArray v) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_scope == null)
      jcasType.jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_scope, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for scope - gets an indexed value - Part of the sentence affected by the negation cue
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getScope(int i) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_scope == null)
      jcasType.jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_scope), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_scope), i)));}

  /** indexed setter for scope - sets an indexed value - Part of the sentence affected by the negation cue
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setScope(int i, Token v) { 
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_scope == null)
      jcasType.jcas.throwFeatMissing("scope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_scope), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_scope), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: xscope

  /** getter for xscope - gets Part affected by the negation cue, but outside of sentence (expanded context)
   * @generated
   * @return value of the feature 
   */
  public FSArray getXscope() {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_xscope == null)
      jcasType.jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_xscope)));}
    
  /** setter for xscope - sets Part affected by the negation cue, but outside of sentence (expanded context) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setXscope(FSArray v) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_xscope == null)
      jcasType.jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_xscope, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for xscope - gets an indexed value - Part affected by the negation cue, but outside of sentence (expanded context)
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Token getXscope(int i) {
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_xscope == null)
      jcasType.jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_xscope), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_xscope), i)));}

  /** indexed setter for xscope - sets an indexed value - Part affected by the negation cue, but outside of sentence (expanded context)
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setXscope(int i, Token v) { 
    if (CompleteNegation_Type.featOkTst && ((CompleteNegation_Type)jcasType).casFeat_xscope == null)
      jcasType.jcas.throwFeatMissing("xscope", "org.texttechnologylab.annotation.negation.CompleteNegation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_xscope), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CompleteNegation_Type)jcasType).casFeatCode_xscope), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    