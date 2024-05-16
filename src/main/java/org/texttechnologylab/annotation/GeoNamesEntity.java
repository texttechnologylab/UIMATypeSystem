

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 11:15:15 CEST 2024 */

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
 * Updated by JCasGen Thu May 16 11:15:15 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class GeoNamesEntity extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.GeoNamesEntity";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeoNamesEntity.class);
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
   
  public final static String _FeatName_id = "id";
  public final static String _FeatName_mainclass = "mainclass";
  public final static String _FeatName_subclass = "subclass";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_mainclass = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "mainclass");
  private final static MethodHandle _FH_mainclass = _FC_mainclass.dynamicInvoker();
  private final static CallSite _FC_subclass = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "subclass");
  private final static MethodHandle _FH_subclass = _FC_subclass.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected GeoNamesEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public GeoNamesEntity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeoNamesEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeoNamesEntity(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_id));
  }
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: mainclass

  /** getter for mainclass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMainclass() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_mainclass));
  }
    
  /** setter for mainclass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMainclass(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mainclass), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subclass

  /** getter for subclass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubclass() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subclass));
  }
    
  /** setter for subclass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubclass(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subclass), v);
  }    
    
  }

    