

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:23:28 CET 2024 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed Feb 28 22:23:28 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RelationSet extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.RelationSet";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationSet.class);
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
   
  public final static String _FeatName_relations = "relations";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_relations = TypeSystemImpl.createCallSite(RelationSet.class, "relations");
  private final static MethodHandle _FH_relations = _FC_relations.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected RelationSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RelationSet(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationSet(JCas jcas) {
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
  //* Feature: relations

  /** getter for relations - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<RelationDescription> getRelations() { 
    return (FSArray<RelationDescription>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relations)));
  }
    
  /** setter for relations - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelations(FSArray<RelationDescription> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_relations), v);
  }    
    
    
  /** indexed getter for relations - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public RelationDescription getRelations(int i) {
     return (RelationDescription)(((FSArray<RelationDescription>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relations)))).get(i));
  } 

  /** indexed setter for relations - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setRelations(int i, RelationDescription v) {
    ((FSArray<RelationDescription>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_relations)))).set(i, v);
  }  
  }

    