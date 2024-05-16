

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 11:15:15 CEST 2024 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Stance Detection
 * Updated by JCasGen Thu May 16 11:15:15 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Stance extends StanceBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Stance";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Stance.class);
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
   
  public final static String _FeatName_Support = "Support";
  public final static String _FeatName_Oppose = "Oppose";
  public final static String _FeatName_Neutral = "Neutral";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Support = TypeSystemImpl.createCallSite(Stance.class, "Support");
  private final static MethodHandle _FH_Support = _FC_Support.dynamicInvoker();
  private final static CallSite _FC_Oppose = TypeSystemImpl.createCallSite(Stance.class, "Oppose");
  private final static MethodHandle _FH_Oppose = _FC_Oppose.dynamicInvoker();
  private final static CallSite _FC_Neutral = TypeSystemImpl.createCallSite(Stance.class, "Neutral");
  private final static MethodHandle _FH_Neutral = _FC_Neutral.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Stance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Stance(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Stance(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Stance(JCas jcas, int begin, int end) {
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
  //* Feature: Support

  /** getter for Support - gets Probability of support
   * @generated
   * @return value of the feature 
   */
  public double getSupport() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Support));
  }
    
  /** setter for Support - sets Probability of support 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSupport(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Support), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Oppose

  /** getter for Oppose - gets Probability of oppose
   * @generated
   * @return value of the feature 
   */
  public double getOppose() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Oppose));
  }
    
  /** setter for Oppose - sets Probability of oppose 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOppose(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Oppose), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Neutral

  /** getter for Neutral - gets Probability of neutral
   * @generated
   * @return value of the feature 
   */
  public double getNeutral() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Neutral));
  }
    
  /** setter for Neutral - sets Probability of neutral 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNeutral(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Neutral), v);
  }    
    
  }

    