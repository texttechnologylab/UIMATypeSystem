

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.AnnotationBase;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DocumentModification extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.DocumentModification";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentModification.class);
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
   
  public final static String _FeatName_user = "user";
  public final static String _FeatName_timestamp = "timestamp";
  public final static String _FeatName_comment = "comment";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_user = TypeSystemImpl.createCallSite(DocumentModification.class, "user");
  private final static MethodHandle _FH_user = _FC_user.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(DocumentModification.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();
  private final static CallSite _FC_comment = TypeSystemImpl.createCallSite(DocumentModification.class, "comment");
  private final static MethodHandle _FH_comment = _FC_comment.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected DocumentModification() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DocumentModification(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocumentModification(JCas jcas) {
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
  //* Feature: user

  /** getter for user - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUser() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_user));
  }
    
  /** setter for user - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_user), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public long getTimestamp() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
   
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_comment));
  }
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_comment), v);
  }    
    
  }

    