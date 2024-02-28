

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:19:03 CET 2024 */

package org.texttechnologylab.annotation.semaf.IsoSpatial;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed Feb 28 22:19:03 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ObjectAttribute extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ObjectAttribute.class);
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
   
  public final static String _FeatName_key = "key";
  public final static String _FeatName_value = "value";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_key = TypeSystemImpl.createCallSite(ObjectAttribute.class, "key");
  private final static MethodHandle _FH_key = _FC_key.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(ObjectAttribute.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ObjectAttribute() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ObjectAttribute(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ObjectAttribute(JCas jcas) {
    super(jcas);
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_key));
  }
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_key), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
  }

    