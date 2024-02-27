

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 27 21:02:41 CET 2024 */

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
 * Updated by JCasGen Tue Feb 27 21:02:41 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SentimentBert extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.SentimentBert";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentimentBert.class);
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
   
  public final static String _FeatName_sentiment = "sentiment";
  public final static String _FeatName_probabilityPositive = "probabilityPositive";
  public final static String _FeatName_probabilityNeutral = "probabilityNeutral";
  public final static String _FeatName_probabilityNegative = "probabilityNegative";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_sentiment = TypeSystemImpl.createCallSite(SentimentBert.class, "sentiment");
  private final static MethodHandle _FH_sentiment = _FC_sentiment.dynamicInvoker();
  private final static CallSite _FC_probabilityPositive = TypeSystemImpl.createCallSite(SentimentBert.class, "probabilityPositive");
  private final static MethodHandle _FH_probabilityPositive = _FC_probabilityPositive.dynamicInvoker();
  private final static CallSite _FC_probabilityNeutral = TypeSystemImpl.createCallSite(SentimentBert.class, "probabilityNeutral");
  private final static MethodHandle _FH_probabilityNeutral = _FC_probabilityNeutral.dynamicInvoker();
  private final static CallSite _FC_probabilityNegative = TypeSystemImpl.createCallSite(SentimentBert.class, "probabilityNegative");
  private final static MethodHandle _FH_probabilityNegative = _FC_probabilityNegative.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SentimentBert() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SentimentBert(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentimentBert(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentimentBert(JCas jcas, int begin, int end) {
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
  //* Feature: sentiment

  /** getter for sentiment - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentiment() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_sentiment));
  }
    
  /** setter for sentiment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentiment(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_sentiment), v);
  }    
    
   
    
  //*--------------*
  //* Feature: probabilityPositive

  /** getter for probabilityPositive - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbabilityPositive() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_probabilityPositive));
  }
    
  /** setter for probabilityPositive - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbabilityPositive(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_probabilityPositive), v);
  }    
    
   
    
  //*--------------*
  //* Feature: probabilityNeutral

  /** getter for probabilityNeutral - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbabilityNeutral() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_probabilityNeutral));
  }
    
  /** setter for probabilityNeutral - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbabilityNeutral(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_probabilityNeutral), v);
  }    
    
   
    
  //*--------------*
  //* Feature: probabilityNegative

  /** getter for probabilityNegative - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbabilityNegative() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_probabilityNegative));
  }
    
  /** setter for probabilityNegative - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbabilityNegative(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_probabilityNegative), v);
  }    
    
  }

    