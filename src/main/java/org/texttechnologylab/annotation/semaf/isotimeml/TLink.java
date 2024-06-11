

   
/* Apache UIMA v3 - First created by JCasGen Tue Jun 11 17:17:54 CEST 2024 */

package org.texttechnologylab.annotation.semaf.isotimeml;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Link;


/**
 * Updated by JCasGen Tue Jun 11 17:17:54 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isotimeml.TLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TLink.class);
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
   
  public final static String _FeatName_syntax = "syntax";
  public final static String _FeatName_origin = "origin";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_syntax = TypeSystemImpl.createCallSite(TLink.class, "syntax");
  private final static MethodHandle _FH_syntax = _FC_syntax.dynamicInvoker();
  private final static CallSite _FC_origin = TypeSystemImpl.createCallSite(TLink.class, "origin");
  private final static MethodHandle _FH_origin = _FC_origin.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TLink(JCas jcas) {
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
  //* Feature: syntax

  /** getter for syntax - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSyntax() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_syntax));
  }
    
  /** setter for syntax - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSyntax(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_syntax), v);
  }    
    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_origin));
  }
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_origin), v);
  }    
    
  }

    