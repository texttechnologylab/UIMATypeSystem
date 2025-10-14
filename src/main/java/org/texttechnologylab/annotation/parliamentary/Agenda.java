

   
/* Apache UIMA v3 - First created by JCasGen Tue Oct 14 18:13:27 CEST 2025 */

package org.texttechnologylab.annotation.parliamentary;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 14 18:13:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Agenda extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.parliamentary.Agenda";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Agenda.class);
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
   
  public final static String _FeatName_title = "title";
  public final static String _FeatName_index = "index";
  public final static String _FeatName_speeches = "speeches";
  public final static String _FeatName_protocol = "protocol";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Agenda.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_index = TypeSystemImpl.createCallSite(Agenda.class, "index");
  private final static MethodHandle _FH_index = _FC_index.dynamicInvoker();
  private final static CallSite _FC_speeches = TypeSystemImpl.createCallSite(Agenda.class, "speeches");
  private final static MethodHandle _FH_speeches = _FC_speeches.dynamicInvoker();
  private final static CallSite _FC_protocol = TypeSystemImpl.createCallSite(Agenda.class, "protocol");
  private final static MethodHandle _FH_protocol = _FC_protocol.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Agenda() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Agenda(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Agenda(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Agenda(JCas jcas, int begin, int end) {
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
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: index

  /** getter for index - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIndex() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_index));
  }
    
  /** setter for index - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_index), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speeches

  /** getter for speeches - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Speech> getSpeeches() { 
    return (FSList<Speech>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_speeches)));
  }
    
  /** setter for speeches - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeeches(FSList<Speech> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_speeches), v);
  }    
    
   
    
  //*--------------*
  //* Feature: protocol

  /** getter for protocol - gets 
   * @generated
   * @return value of the feature 
   */
  public Protocol getProtocol() { 
    return (Protocol)(_getFeatureValueNc(wrapGetIntCatchException(_FH_protocol)));
  }
    
  /** setter for protocol - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProtocol(Protocol v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_protocol), v);
  }    
    
  }

    