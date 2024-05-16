

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 11:15:15 CEST 2024 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu May 16 11:15:15 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TexttechnologyNamedEntity extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TexttechnologyNamedEntity";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TexttechnologyNamedEntity.class);
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
   
  public final static String _FeatName_subvalue = "subvalue";
  public final static String _FeatName_belongsTo = "belongsTo";
  public final static String _FeatName_value = "value";
  public final static String _FeatName_knowledgeEntries = "knowledgeEntries";
  public final static String _FeatName_wikipediaID = "wikipediaID";
  public final static String _FeatName_wikidataID = "wikidataID";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_subvalue = TypeSystemImpl.createCallSite(TexttechnologyNamedEntity.class, "subvalue");
  private final static MethodHandle _FH_subvalue = _FC_subvalue.dynamicInvoker();
  private final static CallSite _FC_belongsTo = TypeSystemImpl.createCallSite(TexttechnologyNamedEntity.class, "belongsTo");
  private final static MethodHandle _FH_belongsTo = _FC_belongsTo.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(TexttechnologyNamedEntity.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_knowledgeEntries = TypeSystemImpl.createCallSite(TexttechnologyNamedEntity.class, "knowledgeEntries");
  private final static MethodHandle _FH_knowledgeEntries = _FC_knowledgeEntries.dynamicInvoker();
  private final static CallSite _FC_wikipediaID = TypeSystemImpl.createCallSite(TexttechnologyNamedEntity.class, "wikipediaID");
  private final static MethodHandle _FH_wikipediaID = _FC_wikipediaID.dynamicInvoker();
  private final static CallSite _FC_wikidataID = TypeSystemImpl.createCallSite(TexttechnologyNamedEntity.class, "wikidataID");
  private final static MethodHandle _FH_wikidataID = _FC_wikidataID.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TexttechnologyNamedEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TexttechnologyNamedEntity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TexttechnologyNamedEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TexttechnologyNamedEntity(JCas jcas, int begin, int end) {
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
  //* Feature: belongsTo

  /** getter for belongsTo - gets 
   * @generated
   * @return value of the feature 
   */
  public TexttechnologyNamedEntity getBelongsTo() { 
    return (TexttechnologyNamedEntity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_belongsTo)));
  }
    
  /** setter for belongsTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBelongsTo(TexttechnologyNamedEntity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_belongsTo), v);
  }    
    
   
    
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
  //* Feature: knowledgeEntries

  /** getter for knowledgeEntries - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getKnowledgeEntries() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_knowledgeEntries)));
  }
    
  /** setter for knowledgeEntries - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKnowledgeEntries(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_knowledgeEntries), v);
  }    
    
    
  /** indexed getter for knowledgeEntries - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getKnowledgeEntries(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_knowledgeEntries)))).get(i);
  } 

  /** indexed setter for knowledgeEntries - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setKnowledgeEntries(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_knowledgeEntries)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: wikipediaID

  /** getter for wikipediaID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWikipediaID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_wikipediaID));
  }
    
  /** setter for wikipediaID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikipediaID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_wikipediaID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: wikidataID

  /** getter for wikidataID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWikidataID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_wikidataID));
  }
    
  /** setter for wikidataID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikidataID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_wikidataID), v);
  }    
    
  }

    