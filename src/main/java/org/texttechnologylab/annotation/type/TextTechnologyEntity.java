

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:04:56 CET 2024 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Feb 28 22:04:56 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TextTechnologyEntity extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TextTechnologyEntity";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextTechnologyEntity.class);
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
  public final static String _FeatName_subvalue = "subvalue";
  public final static String _FeatName_knowledgeEntries = "knowledgeEntries";
  public final static String _FeatName_begin = "begin";
  public final static String _FeatName_end = "end";
  public final static String _FeatName_pos = "pos";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(TextTechnologyEntity.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_subvalue = TypeSystemImpl.createCallSite(TextTechnologyEntity.class, "subvalue");
  private final static MethodHandle _FH_subvalue = _FC_subvalue.dynamicInvoker();
  private final static CallSite _FC_knowledgeEntries = TypeSystemImpl.createCallSite(TextTechnologyEntity.class, "knowledgeEntries");
  private final static MethodHandle _FH_knowledgeEntries = _FC_knowledgeEntries.dynamicInvoker();
  private final static CallSite _FC_begin = TypeSystemImpl.createCallSite(TextTechnologyEntity.class, "begin");
  private final static MethodHandle _FH_begin = _FC_begin.dynamicInvoker();
  private final static CallSite _FC_end = TypeSystemImpl.createCallSite(TextTechnologyEntity.class, "end");
  private final static MethodHandle _FH_end = _FC_end.dynamicInvoker();
  private final static CallSite _FC_pos = TypeSystemImpl.createCallSite(TextTechnologyEntity.class, "pos");
  private final static MethodHandle _FH_pos = _FC_pos.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TextTechnologyEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TextTechnologyEntity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextTechnologyEntity(JCas jcas) {
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
  //* Feature: subvalue

  /** getter for subvalue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubvalue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subvalue));
  }
    
  /** setter for subvalue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubvalue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subvalue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: knowledgeEntries

  /** getter for knowledgeEntries - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<KnowledgeEntry> getKnowledgeEntries() { 
    return (FSArray<KnowledgeEntry>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_knowledgeEntries)));
  }
    
  /** setter for knowledgeEntries - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKnowledgeEntries(FSArray<KnowledgeEntry> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_knowledgeEntries), v);
  }    
    
    
  /** indexed getter for knowledgeEntries - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public KnowledgeEntry getKnowledgeEntries(int i) {
     return (KnowledgeEntry)(((FSArray<KnowledgeEntry>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_knowledgeEntries)))).get(i));
  } 

  /** indexed setter for knowledgeEntries - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setKnowledgeEntries(int i, KnowledgeEntry v) {
    ((FSArray<KnowledgeEntry>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_knowledgeEntries)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBegin() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_begin));
  }
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_begin), v);
  }    
    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEnd() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_end));
  }
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_end), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pos));
  }
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pos), v);
  }    
    
  }

    