

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation.relation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Base type for annotation relations between two annotations (u, v).
 * Updated by JCasGen Sat Apr 19 00:21:17 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationRelation extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.relation.AnnotationRelation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationRelation.class);
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
   
  public final static String _FeatName_u = "u";
  public final static String _FeatName_v = "v";
  public final static String _FeatName_directed = "directed";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_u = TypeSystemImpl.createCallSite(AnnotationRelation.class, "u");
  private final static MethodHandle _FH_u = _FC_u.dynamicInvoker();
  private final static CallSite _FC_v = TypeSystemImpl.createCallSite(AnnotationRelation.class, "v");
  private final static MethodHandle _FH_v = _FC_v.dynamicInvoker();
  private final static CallSite _FC_directed = TypeSystemImpl.createCallSite(AnnotationRelation.class, "directed");
  private final static MethodHandle _FH_directed = _FC_directed.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AnnotationRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnnotationRelation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationRelation(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationRelation(JCas jcas, int begin, int end) {
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
  //* Feature: u

  /** getter for u - gets Annotation node 'u'.
   * @generated
   * @return value of the feature 
   */
  public Annotation getU() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_u)));
  }
    
  /** setter for u - sets Annotation node 'u'. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setU(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_u), v);
  }    
    
   
    
  //*--------------*
  //* Feature: v

  /** getter for v - gets Annotation node 'v'.
   * @generated
   * @return value of the feature 
   */
  public Annotation getV() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_v)));
  }
    
  /** setter for v - sets Annotation node 'v'. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setV(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_v), v);
  }    
    
   
    
  //*--------------*
  //* Feature: directed

  /** getter for directed - gets If true, the relation only holds in direction (u, v).
   * @generated
   * @return value of the feature 
   */
  public boolean getDirected() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_directed));
  }
    
  /** setter for directed - sets If true, the relation only holds in direction (u, v). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDirected(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_directed), v);
  }    
    
  }

    