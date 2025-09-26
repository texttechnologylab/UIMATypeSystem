

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:14 CEST 2025 */

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


/** Sarcasm Output
 * Updated by JCasGen Fri Sep 26 15:44:14 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Sarcasm extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Sarcasm";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sarcasm.class);
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
   
  public final static String _FeatName_Sarcasm = "Sarcasm";
  public final static String _FeatName_NonSarcasm = "NonSarcasm";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Sarcasm = TypeSystemImpl.createCallSite(Sarcasm.class, "Sarcasm");
  private final static MethodHandle _FH_Sarcasm = _FC_Sarcasm.dynamicInvoker();
  private final static CallSite _FC_NonSarcasm = TypeSystemImpl.createCallSite(Sarcasm.class, "NonSarcasm");
  private final static MethodHandle _FH_NonSarcasm = _FC_NonSarcasm.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Sarcasm.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Sarcasm() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Sarcasm(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sarcasm(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Sarcasm(JCas jcas, int begin, int end) {
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
  //* Feature: Sarcasm

  /** getter for Sarcasm - gets Probability of Sarcasm
   * @generated
   * @return value of the feature 
   */
  public double getSarcasm() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Sarcasm));
  }
    
  /** setter for Sarcasm - sets Probability of Sarcasm 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSarcasm(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Sarcasm), v);
  }    
    
   
    
  //*--------------*
  //* Feature: NonSarcasm

  /** getter for NonSarcasm - gets Probability of not Sarcasm
   * @generated
   * @return value of the feature 
   */
  public double getNonSarcasm() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_NonSarcasm));
  }
    
  /** setter for NonSarcasm - sets Probability of not Sarcasm 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNonSarcasm(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_NonSarcasm), v);
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

    