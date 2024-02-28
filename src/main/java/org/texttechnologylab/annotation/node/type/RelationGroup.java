

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

package org.texttechnologylab.annotation.node.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.type.Node;


/** 
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RelationGroup extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.node.type.RelationGroup";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationGroup.class);
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
   
  public final static String _FeatName_relation = "relation";
  public final static String _FeatName_locationID = "locationID";
  public final static String _FeatName_sentence = "sentence";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_relation = TypeSystemImpl.createCallSite(RelationGroup.class, "relation");
  private final static MethodHandle _FH_relation = _FC_relation.dynamicInvoker();
  private final static CallSite _FC_locationID = TypeSystemImpl.createCallSite(RelationGroup.class, "locationID");
  private final static MethodHandle _FH_locationID = _FC_locationID.dynamicInvoker();
  private final static CallSite _FC_sentence = TypeSystemImpl.createCallSite(RelationGroup.class, "sentence");
  private final static MethodHandle _FH_sentence = _FC_sentence.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected RelationGroup() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RelationGroup(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationGroup(JCas jcas) {
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
  //* Feature: relation

  /** getter for relation - gets 
   * @generated
   * @return value of the feature 
   */
  public RelationContext getRelation() { 
    return (RelationContext)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relation)));
  }
    
  /** setter for relation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelation(RelationContext v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_relation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: locationID

  /** getter for locationID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLocationID() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_locationID));
  }
    
  /** setter for locationID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocationID(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_locationID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentence() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_sentence));
  }
    
  /** setter for sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_sentence), v);
  }    
    
  }

    