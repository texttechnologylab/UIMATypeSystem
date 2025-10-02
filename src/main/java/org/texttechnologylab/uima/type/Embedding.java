

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

package org.texttechnologylab.uima.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.ModelAnnotation;
import org.apache.uima.jcas.cas.FloatArray;


/**
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Embedding extends ModelAnnotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.uima.type.Embedding";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Embedding.class);
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
   
  public final static String _FeatName_embedding = "embedding";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_embedding = TypeSystemImpl.createCallSite(Embedding.class, "embedding");
  private final static MethodHandle _FH_embedding = _FC_embedding.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Embedding() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Embedding(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Embedding(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Embedding(JCas jcas, int begin, int end) {
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
  //* Feature: embedding

  /** getter for embedding - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getEmbedding() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_embedding)));
  }
    
  /** setter for embedding - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmbedding(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_embedding), v);
  }    
    
    
  /** indexed getter for embedding - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getEmbedding(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_embedding)))).get(i);
  } 

  /** indexed setter for embedding - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEmbedding(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_embedding)))).set(i, v);
  }  
  }

    