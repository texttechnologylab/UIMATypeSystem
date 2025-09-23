

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

package de.unihd.dbs.uima.types.heideltime;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Timex3Interval extends Timex3 {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.unihd.dbs.uima.types.heideltime.Timex3Interval";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Timex3Interval.class);
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
   
  public final static String _FeatName_TimexValueEB = "TimexValueEB";
  public final static String _FeatName_TimexValueLE = "TimexValueLE";
  public final static String _FeatName_TimexValueEE = "TimexValueEE";
  public final static String _FeatName_TimexValueLB = "TimexValueLB";
  public final static String _FeatName_emptyValue = "emptyValue";
  public final static String _FeatName_beginTimex = "beginTimex";
  public final static String _FeatName_endTimex = "endTimex";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_TimexValueEB = TypeSystemImpl.createCallSite(Timex3Interval.class, "TimexValueEB");
  private final static MethodHandle _FH_TimexValueEB = _FC_TimexValueEB.dynamicInvoker();
  private final static CallSite _FC_TimexValueLE = TypeSystemImpl.createCallSite(Timex3Interval.class, "TimexValueLE");
  private final static MethodHandle _FH_TimexValueLE = _FC_TimexValueLE.dynamicInvoker();
  private final static CallSite _FC_TimexValueEE = TypeSystemImpl.createCallSite(Timex3Interval.class, "TimexValueEE");
  private final static MethodHandle _FH_TimexValueEE = _FC_TimexValueEE.dynamicInvoker();
  private final static CallSite _FC_TimexValueLB = TypeSystemImpl.createCallSite(Timex3Interval.class, "TimexValueLB");
  private final static MethodHandle _FH_TimexValueLB = _FC_TimexValueLB.dynamicInvoker();
  private final static CallSite _FC_emptyValue = TypeSystemImpl.createCallSite(Timex3Interval.class, "emptyValue");
  private final static MethodHandle _FH_emptyValue = _FC_emptyValue.dynamicInvoker();
  private final static CallSite _FC_beginTimex = TypeSystemImpl.createCallSite(Timex3Interval.class, "beginTimex");
  private final static MethodHandle _FH_beginTimex = _FC_beginTimex.dynamicInvoker();
  private final static CallSite _FC_endTimex = TypeSystemImpl.createCallSite(Timex3Interval.class, "endTimex");
  private final static MethodHandle _FH_endTimex = _FC_endTimex.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Timex3Interval() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Timex3Interval(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Timex3Interval(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Timex3Interval(JCas jcas, int begin, int end) {
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
  //* Feature: TimexValueEB

  /** getter for TimexValueEB - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexValueEB() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_TimexValueEB));
  }
    
  /** setter for TimexValueEB - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexValueEB(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_TimexValueEB), v);
  }    
    
   
    
  //*--------------*
  //* Feature: TimexValueLE

  /** getter for TimexValueLE - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexValueLE() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_TimexValueLE));
  }
    
  /** setter for TimexValueLE - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexValueLE(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_TimexValueLE), v);
  }    
    
   
    
  //*--------------*
  //* Feature: TimexValueEE

  /** getter for TimexValueEE - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexValueEE() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_TimexValueEE));
  }
    
  /** setter for TimexValueEE - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexValueEE(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_TimexValueEE), v);
  }    
    
   
    
  //*--------------*
  //* Feature: TimexValueLB

  /** getter for TimexValueLB - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexValueLB() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_TimexValueLB));
  }
    
  /** setter for TimexValueLB - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexValueLB(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_TimexValueLB), v);
  }    
    
   
    
  //*--------------*
  //* Feature: emptyValue

  /** getter for emptyValue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEmptyValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_emptyValue));
  }
    
  /** setter for emptyValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmptyValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_emptyValue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: beginTimex

  /** getter for beginTimex - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBeginTimex() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_beginTimex));
  }
    
  /** setter for beginTimex - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginTimex(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_beginTimex), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endTimex

  /** getter for endTimex - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEndTimex() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_endTimex));
  }
    
  /** setter for endTimex - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTimex(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_endTimex), v);
  }    
    
  }

    