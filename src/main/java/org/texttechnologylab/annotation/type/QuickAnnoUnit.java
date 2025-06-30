

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class QuickAnnoUnit extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.QuickAnnoUnit";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuickAnnoUnit.class);
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
   
  public final static String _FeatName_combined = "combined";
  public final static String _FeatName_pos = "pos";
  public final static String _FeatName_origin = "origin";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_combined = TypeSystemImpl.createCallSite(QuickAnnoUnit.class, "combined");
  private final static MethodHandle _FH_combined = _FC_combined.dynamicInvoker();
  private final static CallSite _FC_pos = TypeSystemImpl.createCallSite(QuickAnnoUnit.class, "pos");
  private final static MethodHandle _FH_pos = _FC_pos.dynamicInvoker();
  private final static CallSite _FC_origin = TypeSystemImpl.createCallSite(QuickAnnoUnit.class, "origin");
  private final static MethodHandle _FH_origin = _FC_origin.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected QuickAnnoUnit() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public QuickAnnoUnit(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuickAnnoUnit(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuickAnnoUnit(JCas jcas, int begin, int end) {
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
  //* Feature: combined

  /** getter for combined - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCombined() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_combined));
  }
    
  /** setter for combined - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCombined(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_combined), v);
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
    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getOrigin() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_origin)));
  }
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_origin), v);
  }    
    
  }

    