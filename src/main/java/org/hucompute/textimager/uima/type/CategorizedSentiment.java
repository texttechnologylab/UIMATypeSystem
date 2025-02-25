

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 13:16:03 CET 2025 */

package org.hucompute.textimager.uima.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


/**
 * Updated by JCasGen Tue Feb 25 13:16:03 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class CategorizedSentiment extends Sentiment {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.CategorizedSentiment";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CategorizedSentiment.class);
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
   
  public final static String _FeatName_pos = "pos";
  public final static String _FeatName_neu = "neu";
  public final static String _FeatName_neg = "neg";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_pos = TypeSystemImpl.createCallSite(CategorizedSentiment.class, "pos");
  private final static MethodHandle _FH_pos = _FC_pos.dynamicInvoker();
  private final static CallSite _FC_neu = TypeSystemImpl.createCallSite(CategorizedSentiment.class, "neu");
  private final static MethodHandle _FH_neu = _FC_neu.dynamicInvoker();
  private final static CallSite _FC_neg = TypeSystemImpl.createCallSite(CategorizedSentiment.class, "neg");
  private final static MethodHandle _FH_neg = _FC_neg.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected CategorizedSentiment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public CategorizedSentiment(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CategorizedSentiment(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CategorizedSentiment(JCas jcas, int begin, int end) {
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
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPos() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_pos));
  }
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_pos), v);
  }    
    
   
    
  //*--------------*
  //* Feature: neu

  /** getter for neu - gets 
   * @generated
   * @return value of the feature 
   */
  public double getNeu() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_neu));
  }
    
  /** setter for neu - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNeu(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_neu), v);
  }    
    
   
    
  //*--------------*
  //* Feature: neg

  /** getter for neg - gets 
   * @generated
   * @return value of the feature 
   */
  public double getNeg() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_neg));
  }
    
  /** setter for neg - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNeg(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_neg), v);
  }    
    
  }

    