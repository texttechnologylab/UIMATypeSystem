

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Hate Output
 * Updated by JCasGen Sat Apr 19 00:21:17 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Hate extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Hate";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Hate.class);
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
   
  public final static String _FeatName_Hate = "Hate";
  public final static String _FeatName_NonHate = "NonHate";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Hate = TypeSystemImpl.createCallSite(Hate.class, "Hate");
  private final static MethodHandle _FH_Hate = _FC_Hate.dynamicInvoker();
  private final static CallSite _FC_NonHate = TypeSystemImpl.createCallSite(Hate.class, "NonHate");
  private final static MethodHandle _FH_NonHate = _FC_NonHate.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Hate.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Hate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Hate(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Hate(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Hate(JCas jcas, int begin, int end) {
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
  //* Feature: Hate

  /** getter for Hate - gets Probability of Hate
   * @generated
   * @return value of the feature 
   */
  public double getHate() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Hate));
  }
    
  /** setter for Hate - sets Probability of Hate 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHate(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Hate), v);
  }    
    
   
    
  //*--------------*
  //* Feature: NonHate

  /** getter for NonHate - gets Probability of not Hate
   * @generated
   * @return value of the feature 
   */
  public double getNonHate() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_NonHate));
  }
    
  /** setter for NonHate - sets Probability of not Hate 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNonHate(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_NonHate), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    