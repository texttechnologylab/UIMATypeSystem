

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.socialmedia;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MetaData extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.socialmedia.MetaData";
  
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
   
  public final static String _FeatName_name = "name";
  public final static String _FeatName_description = "description";
  public final static String _FeatName_url = "url";
  public final static String _FeatName_createDate = "createDate";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(MetaData.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_description = TypeSystemImpl.createCallSite(MetaData.class, "description");
  private final static MethodHandle _FH_description = _FC_description.dynamicInvoker();
  private final static CallSite _FC_url = TypeSystemImpl.createCallSite(MetaData.class, "url");
  private final static MethodHandle _FH_url = _FC_url.dynamicInvoker();
  private final static CallSite _FC_createDate = TypeSystemImpl.createCallSite(MetaData.class, "createDate");
  private final static MethodHandle _FH_createDate = _FC_createDate.dynamicInvoker();

   
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
  //* Feature: url

  /** getter for url - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_url));
  }
    
  /** setter for url - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_url), v);
  }    
    
   
    
  //*--------------*
  //* Feature: createDate

  /** getter for createDate - gets 
   * @generated
   * @return value of the feature 
   */
  public int getCreateDate() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_createDate));
  }
    
  /** setter for createDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreateDate(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_createDate), v);
  }    
    
  }

    