

   
/* Apache UIMA v3 - First created by JCasGen Mon May 05 11:13:03 CEST 2025 */

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
 * Updated by JCasGen Mon May 05 11:13:03 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AbstractNamedEntity extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.AbstractNamedEntity";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbstractNamedEntity.class);
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
   
  public final static String _FeatName_value = "value";
  public final static String _FeatName_specific = "specific";
  public final static String _FeatName_metaphor = "metaphor";
  public final static String _FeatName_metonym = "metonym";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(AbstractNamedEntity.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_specific = TypeSystemImpl.createCallSite(AbstractNamedEntity.class, "specific");
  private final static MethodHandle _FH_specific = _FC_specific.dynamicInvoker();
  private final static CallSite _FC_metaphor = TypeSystemImpl.createCallSite(AbstractNamedEntity.class, "metaphor");
  private final static MethodHandle _FH_metaphor = _FC_metaphor.dynamicInvoker();
  private final static CallSite _FC_metonym = TypeSystemImpl.createCallSite(AbstractNamedEntity.class, "metonym");
  private final static MethodHandle _FH_metonym = _FC_metonym.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AbstractNamedEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AbstractNamedEntity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AbstractNamedEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AbstractNamedEntity(JCas jcas, int begin, int end) {
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
    
   
    
  //*--------------*
  //* Feature: specific

  /** getter for specific - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSpecific() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_specific));
  }
    
  /** setter for specific - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpecific(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_specific), v);
  }    
    
   
    
  //*--------------*
  //* Feature: metaphor

  /** getter for metaphor - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getMetaphor() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_metaphor));
  }
    
  /** setter for metaphor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMetaphor(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_metaphor), v);
  }    
    
   
    
  //*--------------*
  //* Feature: metonym

  /** getter for metonym - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getMetonym() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_metonym));
  }
    
  /** setter for metonym - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMetonym(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_metonym), v);
  }    
    
  }

    