

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

package org.texttechnologylab.annotation.knowledge;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringList;


/** 
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WikidataEntry extends KnowledgeEntry {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.knowledge.WikidataEntry";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WikidataEntry.class);
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
   
  public final static String _FeatName_P31 = "P31";
  public final static String _FeatName_P279 = "P279";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_P31 = TypeSystemImpl.createCallSite(WikidataEntry.class, "P31");
  private final static MethodHandle _FH_P31 = _FC_P31.dynamicInvoker();
  private final static CallSite _FC_P279 = TypeSystemImpl.createCallSite(WikidataEntry.class, "P279");
  private final static MethodHandle _FH_P279 = _FC_P279.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected WikidataEntry() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public WikidataEntry(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WikidataEntry(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WikidataEntry(JCas jcas, int begin, int end) {
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
  //* Feature: P31

  /** getter for P31 - gets 
   * @generated
   * @return value of the feature 
   */
  public StringList getP31() { 
    return (StringList)(_getFeatureValueNc(wrapGetIntCatchException(_FH_P31)));
  }
    
  /** setter for P31 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setP31(StringList v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_P31), v);
  }    
    
   
    
  //*--------------*
  //* Feature: P279

  /** getter for P279 - gets 
   * @generated
   * @return value of the feature 
   */
  public StringList getP279() { 
    return (StringList)(_getFeatureValueNc(wrapGetIntCatchException(_FH_P279)));
  }
    
  /** setter for P279 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setP279(StringList v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_P279), v);
  }    
    
  }

    