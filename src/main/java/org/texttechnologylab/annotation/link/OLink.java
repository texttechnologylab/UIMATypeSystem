

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:15 CEST 2025 */

package org.texttechnologylab.annotation.link;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Annotation represents a (unidirectional) Link between a Document and another Document, linking offsets (can be in same Doc)
 * Updated by JCasGen Fri Sep 26 15:44:15 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.link.OLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OLink.class);
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
   
  public final static String _FeatName_from = "from";
  public final static String _FeatName_to = "to";
  public final static String _FeatName_fromBegin = "fromBegin";
  public final static String _FeatName_fromEnd = "fromEnd";
  public final static String _FeatName_toBegin = "toBegin";
  public final static String _FeatName_toEnd = "toEnd";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_from = TypeSystemImpl.createCallSite(OLink.class, "from");
  private final static MethodHandle _FH_from = _FC_from.dynamicInvoker();
  private final static CallSite _FC_to = TypeSystemImpl.createCallSite(OLink.class, "to");
  private final static MethodHandle _FH_to = _FC_to.dynamicInvoker();
  private final static CallSite _FC_fromBegin = TypeSystemImpl.createCallSite(OLink.class, "fromBegin");
  private final static MethodHandle _FH_fromBegin = _FC_fromBegin.dynamicInvoker();
  private final static CallSite _FC_fromEnd = TypeSystemImpl.createCallSite(OLink.class, "fromEnd");
  private final static MethodHandle _FH_fromEnd = _FC_fromEnd.dynamicInvoker();
  private final static CallSite _FC_toBegin = TypeSystemImpl.createCallSite(OLink.class, "toBegin");
  private final static MethodHandle _FH_toBegin = _FC_toBegin.dynamicInvoker();
  private final static CallSite _FC_toEnd = TypeSystemImpl.createCallSite(OLink.class, "toEnd");
  private final static MethodHandle _FH_toEnd = _FC_toEnd.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OLink(JCas jcas, int begin, int end) {
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
  //* Feature: from

  /** getter for from - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getFrom() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_from));
  }
    
  /** setter for from - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_from), v);
  }    
    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getTo() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_to));
  }
    
  /** setter for to - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_to), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fromBegin

  /** getter for fromBegin - gets Offset (begin) in (from) Doc
   * @generated
   * @return value of the feature 
   */
  public int getFromBegin() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_fromBegin));
  }
    
  /** setter for fromBegin - sets Offset (begin) in (from) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromBegin(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_fromBegin), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fromEnd

  /** getter for fromEnd - gets Offset (end) in (from) Doc
   * @generated
   * @return value of the feature 
   */
  public int getFromEnd() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_fromEnd));
  }
    
  /** setter for fromEnd - sets Offset (end) in (from) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromEnd(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_fromEnd), v);
  }    
    
   
    
  //*--------------*
  //* Feature: toBegin

  /** getter for toBegin - gets Offset (begin) in (to) Doc
   * @generated
   * @return value of the feature 
   */
  public int getToBegin() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_toBegin));
  }
    
  /** setter for toBegin - sets Offset (begin) in (to) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToBegin(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_toBegin), v);
  }    
    
   
    
  //*--------------*
  //* Feature: toEnd

  /** getter for toEnd - gets Offset (end) in (to) Doc
   * @generated
   * @return value of the feature 
   */
  public int getToEnd() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_toEnd));
  }
    
  /** setter for toEnd - sets Offset (end) in (to) Doc 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToEnd(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_toEnd), v);
  }    
    
  }

    