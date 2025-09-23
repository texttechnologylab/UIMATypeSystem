

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

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


/** L2SCA Output
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class L2SCA extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.L2SCA";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(L2SCA.class);
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
   
  public final static String _FeatName_Value = "Value";
  public final static String _FeatName_Code = "Code";
  public final static String _FeatName_typeName = "typeName";
  public final static String _FeatName_typeNumber = "typeNumber";
  public final static String _FeatName_Measure = "Measure";
  public final static String _FeatName_definition = "definition";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Value = TypeSystemImpl.createCallSite(L2SCA.class, "Value");
  private final static MethodHandle _FH_Value = _FC_Value.dynamicInvoker();
  private final static CallSite _FC_Code = TypeSystemImpl.createCallSite(L2SCA.class, "Code");
  private final static MethodHandle _FH_Code = _FC_Code.dynamicInvoker();
  private final static CallSite _FC_typeName = TypeSystemImpl.createCallSite(L2SCA.class, "typeName");
  private final static MethodHandle _FH_typeName = _FC_typeName.dynamicInvoker();
  private final static CallSite _FC_typeNumber = TypeSystemImpl.createCallSite(L2SCA.class, "typeNumber");
  private final static MethodHandle _FH_typeNumber = _FC_typeNumber.dynamicInvoker();
  private final static CallSite _FC_Measure = TypeSystemImpl.createCallSite(L2SCA.class, "Measure");
  private final static MethodHandle _FH_Measure = _FC_Measure.dynamicInvoker();
  private final static CallSite _FC_definition = TypeSystemImpl.createCallSite(L2SCA.class, "definition");
  private final static MethodHandle _FH_definition = _FC_definition.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(L2SCA.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected L2SCA() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public L2SCA(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public L2SCA(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public L2SCA(JCas jcas, int begin, int end) {
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
  //* Feature: Value

  /** getter for Value - gets L2SCA Feature Value
   * @generated
   * @return value of the feature 
   */
  public double getValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Value));
  }
    
  /** setter for Value - sets L2SCA Feature Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Code

  /** getter for Code - gets L2SCA Feature Code
   * @generated
   * @return value of the feature 
   */
  public String getCode() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Code));
  }
    
  /** setter for Code - sets L2SCA Feature Code 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCode(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Code), v);
  }    
    
   
    
  //*--------------*
  //* Feature: typeName

  /** getter for typeName - gets L2SCA Feature typeName
   * @generated
   * @return value of the feature 
   */
  public String getTypeName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_typeName));
  }
    
  /** setter for typeName - sets L2SCA Feature typeName 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_typeName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: typeNumber

  /** getter for typeNumber - gets L2SCA Feature type Number
   * @generated
   * @return value of the feature 
   */
  public int getTypeNumber() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_typeNumber));
  }
    
  /** setter for typeNumber - sets L2SCA Feature type Number 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeNumber(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_typeNumber), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Measure

  /** getter for Measure - gets L2SCA Feature Measure
   * @generated
   * @return value of the feature 
   */
  public String getMeasure() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Measure));
  }
    
  /** setter for Measure - sets L2SCA Feature Measure 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeasure(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Measure), v);
  }    
    
   
    
  //*--------------*
  //* Feature: definition

  /** getter for definition - gets L2SCA Feature definition
   * @generated
   * @return value of the feature 
   */
  public String getDefinition() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_definition));
  }
    
  /** setter for definition - sets L2SCA Feature definition 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDefinition(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_definition), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the L2SCA
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets Which Model or Process was used to Compute the L2SCA 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    