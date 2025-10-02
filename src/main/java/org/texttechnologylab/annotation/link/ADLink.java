

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

package org.texttechnologylab.annotation.link;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Annotation represents a (unidirectional) Link between another Annotation and a Document
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ADLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.link.ADLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ADLink.class);
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


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_from = TypeSystemImpl.createCallSite(ADLink.class, "from");
  private final static MethodHandle _FH_from = _FC_from.dynamicInvoker();
  private final static CallSite _FC_to = TypeSystemImpl.createCallSite(ADLink.class, "to");
  private final static MethodHandle _FH_to = _FC_to.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ADLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ADLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ADLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ADLink(JCas jcas, int begin, int end) {
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

  /** getter for from - gets from (annotation) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public Annotation getFrom() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_from)));
  }
    
  /** setter for from - sets from (annotation) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_from), v);
  }    
    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (annotation) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getTo() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_to));
  }
    
  /** setter for to - sets from (annotation) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_to), v);
  }    
    
  }

    