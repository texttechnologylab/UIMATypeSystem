

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 12:41:26 CET 2025 */

package org.texttechnologylab.annotation.schema;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Tue Feb 25 12:41:26 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationClass extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.schema.AnnotationClass";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationClass.class);
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
   
  public final static String _FeatName_name = "name";
  public final static String _FeatName_description = "description";
  public final static String _FeatName_attributes = "attributes";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(AnnotationClass.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_description = TypeSystemImpl.createCallSite(AnnotationClass.class, "description");
  private final static MethodHandle _FH_description = _FC_description.dynamicInvoker();
  private final static CallSite _FC_attributes = TypeSystemImpl.createCallSite(AnnotationClass.class, "attributes");
  private final static MethodHandle _FH_attributes = _FC_attributes.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AnnotationClass() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnnotationClass(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationClass(JCas jcas) {
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
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_name));
  }
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_description));
  }
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_description), v);
  }    
    
   
    
  //*--------------*
  //* Feature: attributes

  /** getter for attributes - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Attribute> getAttributes() { 
    return (FSList<Attribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_attributes)));
  }
    
  /** setter for attributes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributes(FSList<Attribute> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_attributes), v);
  }    
    
  }

    