

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.semaf.isospace;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Signal;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SpatialSignal extends Signal {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpatialSignal.class);
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
   
  public final static String _FeatName_cluster = "cluster";
  public final static String _FeatName_semantic_type = "semantic_type";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_cluster = TypeSystemImpl.createCallSite(SpatialSignal.class, "cluster");
  private final static MethodHandle _FH_cluster = _FC_cluster.dynamicInvoker();
  private final static CallSite _FC_semantic_type = TypeSystemImpl.createCallSite(SpatialSignal.class, "semantic_type");
  private final static MethodHandle _FH_semantic_type = _FC_semantic_type.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SpatialSignal() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SpatialSignal(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpatialSignal(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpatialSignal(JCas jcas, int begin, int end) {
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
  //* Feature: cluster

  /** getter for cluster - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCluster() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_cluster));
  }
    
  /** setter for cluster - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCluster(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_cluster), v);
  }    
    
   
    
  //*--------------*
  //* Feature: semantic_type

  /** getter for semantic_type - gets ( DIRECTIONAL | TOPOLOGICAL | DIR_TOP )
   * @generated
   * @return value of the feature 
   */
  public String getSemantic_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_semantic_type));
  }
    
  /** setter for semantic_type - sets ( DIRECTIONAL | TOPOLOGICAL | DIR_TOP ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSemantic_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_semantic_type), v);
  }    
    
  }

    