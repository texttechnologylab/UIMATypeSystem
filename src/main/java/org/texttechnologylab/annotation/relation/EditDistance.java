

   
/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 04:00:59 CEST 2025 */

package org.texttechnologylab.annotation.relation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** An annotation that denotes an edit distance difference between two annotations.
 * Updated by JCasGen Fri Apr 18 04:00:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EditDistance extends AnnotationRelation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.relation.EditDistance";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EditDistance.class);
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
   
  public final static String _FeatName_distance = "distance";
  public final static String _FeatName_algorithm = "algorithm";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_distance = TypeSystemImpl.createCallSite(EditDistance.class, "distance");
  private final static MethodHandle _FH_distance = _FC_distance.dynamicInvoker();
  private final static CallSite _FC_algorithm = TypeSystemImpl.createCallSite(EditDistance.class, "algorithm");
  private final static MethodHandle _FH_algorithm = _FC_algorithm.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EditDistance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public EditDistance(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EditDistance(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EditDistance(JCas jcas, int begin, int end) {
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
  //* Feature: distance

  /** getter for distance - gets The edit distance as a 32-bit integer value.
   * @generated
   * @return value of the feature 
   */
  public int getDistance() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_distance));
  }
    
  /** setter for distance - sets The edit distance as a 32-bit integer value. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDistance(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_distance), v);
  }    
    
   
    
  //*--------------*
  //* Feature: algorithm

  /** getter for algorithm - gets The algorithm used to calculate the edit distance.
   * @generated
   * @return value of the feature 
   */
  public String getAlgorithm() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_algorithm));
  }
    
  /** setter for algorithm - sets The algorithm used to calculate the edit distance. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlgorithm(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_algorithm), v);
  }    
    
  }

    