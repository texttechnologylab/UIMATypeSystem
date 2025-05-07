

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 18:09:54 CEST 2025 */

package org.texttechnologylab.annotation.model;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/**
 * Updated by JCasGen Wed May 07 18:09:54 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MetaData extends org.texttechnologylab.annotation.MetaData {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.model.MetaData";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
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
   
  public final static String _FeatName_ModelVersion = "ModelVersion";
  public final static String _FeatName_ModelName = "ModelName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_ModelVersion = TypeSystemImpl.createCallSite(MetaData.class, "ModelVersion");
  private final static MethodHandle _FH_ModelVersion = _FC_ModelVersion.dynamicInvoker();
  private final static CallSite _FC_ModelName = TypeSystemImpl.createCallSite(MetaData.class, "ModelName");
  private final static MethodHandle _FH_ModelName = _FC_ModelName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetaData(JCas jcas, int begin, int end) {
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
  //* Feature: ModelVersion

  /** getter for ModelVersion - gets Version of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ModelVersion));
  }
    
  /** setter for ModelVersion - sets Version of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ModelVersion), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ModelName

  /** getter for ModelName - gets Name of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ModelName));
  }
    
  /** setter for ModelName - sets Name of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ModelName), v);
  }    
    
  }

    