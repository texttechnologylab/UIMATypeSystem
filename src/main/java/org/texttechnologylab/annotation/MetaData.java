

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:04:56 CET 2024 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Feb 28 22:04:56 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MetaData extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.MetaData";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
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
   
  public final static String _FeatName_Lang = "Lang";
  public final static String _FeatName_Source = "Source";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Lang = TypeSystemImpl.createCallSite(MetaData.class, "Lang");
  private final static MethodHandle _FH_Lang = _FC_Lang.dynamicInvoker();
  private final static CallSite _FC_Source = TypeSystemImpl.createCallSite(MetaData.class, "Source");
  private final static MethodHandle _FH_Source = _FC_Source.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetaData(JCas jcas, int begin, int end) {
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
  //* Feature: Lang

  /** getter for Lang - gets Language of the method or the Model
   * @generated
   * @return value of the feature 
   */
  public String getLang() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Lang));
  }
    
  /** setter for Lang - sets Language of the method or the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLang(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Lang), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Source

  /** getter for Source - gets Link of the used resource
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Source));
  }
    
  /** setter for Source - sets Link of the used resource 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Source), v);
  }    
    
  }

    