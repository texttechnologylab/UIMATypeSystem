

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:19:03 CET 2024 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Wed Feb 28 22:19:03 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RelationDescription extends Attribute {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.RelationDescription";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationDescription.class);
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
  public final static String _FeatName_relationtype = "relationtype";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(RelationDescription.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_relationtype = TypeSystemImpl.createCallSite(RelationDescription.class, "relationtype");
  private final static MethodHandle _FH_relationtype = _FC_relationtype.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected RelationDescription() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RelationDescription(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationDescription(JCas jcas) {
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
  //* Feature: relationtype

  /** getter for relationtype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRelationtype() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_relationtype));
  }
    
  /** setter for relationtype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelationtype(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_relationtype), v);
  }    
    
  }

    