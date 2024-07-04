

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:09:04 CEST 2024 */

package org.texttechnologylab.annotation.model;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;


/**
 * Updated by JCasGen Thu Jul 04 15:09:04 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FactCheckingMetaData extends MetaData {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.model.FactCheckingMetaData";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FactCheckingMetaData.class);
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
   
  public final static String _FeatName_Source = "Source";
  public final static String _FeatName_DependeciesVersion = "DependeciesVersion";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Source = TypeSystemImpl.createCallSite(FactCheckingMetaData.class, "Source");
  private final static MethodHandle _FH_Source = _FC_Source.dynamicInvoker();
  private final static CallSite _FC_DependeciesVersion = TypeSystemImpl.createCallSite(FactCheckingMetaData.class, "DependeciesVersion");
  private final static MethodHandle _FH_DependeciesVersion = _FC_DependeciesVersion.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected FactCheckingMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public FactCheckingMetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FactCheckingMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FactCheckingMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: Source

  /** getter for Source - gets URL
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Source));
  }
    
  /** setter for Source - sets URL 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Source), v);
  }    
    
   
    
  //*--------------*
  //* Feature: DependeciesVersion

  /** getter for DependeciesVersion - gets Dependency Library Version e.g. Pytorch...
   * @generated
   * @return value of the feature 
   */
  public StringArray getDependeciesVersion() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_DependeciesVersion)));
  }
    
  /** setter for DependeciesVersion - sets Dependency Library Version e.g. Pytorch... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDependeciesVersion(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_DependeciesVersion), v);
  }    
    
    
  /** indexed getter for DependeciesVersion - gets an indexed value - Dependency Library Version e.g. Pytorch...
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getDependeciesVersion(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_DependeciesVersion)))).get(i);
  } 

  /** indexed setter for DependeciesVersion - sets an indexed value - Dependency Library Version e.g. Pytorch...
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDependeciesVersion(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_DependeciesVersion)))).set(i, v);
  }  
  }

    