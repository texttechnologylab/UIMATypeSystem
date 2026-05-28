

   
/* Apache UIMA v3 - First created by JCasGen Wed May 27 16:09:26 CEST 2026 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Climate Output
 * Updated by JCasGen Wed May 27 16:09:26 CEST 2026
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Climate extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Climate";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Climate.class);
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
   
  public final static String _FeatName_Climates = "Climates";
  public final static String _FeatName_ClimateType = "ClimateType";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Climates = TypeSystemImpl.createCallSite(Climate.class, "Climates");
  private final static MethodHandle _FH_Climates = _FC_Climates.dynamicInvoker();
  private final static CallSite _FC_ClimateType = TypeSystemImpl.createCallSite(Climate.class, "ClimateType");
  private final static MethodHandle _FH_ClimateType = _FC_ClimateType.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Climate.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Climate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Climate(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Climate(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Climate(JCas jcas, int begin, int end) {
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
  //* Feature: Climates

  /** getter for Climates - gets Set of climate related keys and Value
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<AnnotationComment> getClimates() { 
    return (FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Climates)));
  }
    
  /** setter for Climates - sets Set of climate related keys and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClimates(FSArray<AnnotationComment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Climates), v);
  }    
    
    
  /** indexed getter for Climates - gets an indexed value - Set of climate related keys and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public AnnotationComment getClimates(int i) {
     return (AnnotationComment)(((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Climates)))).get(i));
  } 

  /** indexed setter for Climates - sets an indexed value - Set of climate related keys and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setClimates(int i, AnnotationComment v) {
    ((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Climates)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: ClimateType

  /** getter for ClimateType - gets Type of climate classification
   * @generated
   * @return value of the feature 
   */
  public String getClimateType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ClimateType));
  }
    
  /** setter for ClimateType - sets Type of climate classification 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClimateType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ClimateType), v);
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

    