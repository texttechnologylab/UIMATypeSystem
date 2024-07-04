

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:09:04 CEST 2024 */

package org.texttechnologylab.annotation.type.dbpedia;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu Jul 04 15:09:04 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DBPediaObject extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.dbpedia.DBPediaObject";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DBPediaObject.class);
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
   
  public final static String _FeatName_similarityScore = "similarityScore";
  public final static String _FeatName_percentageOfSecondRank = "percentageOfSecondRank";
  public final static String _FeatName_uri = "uri";
  public final static String _FeatName_types = "types";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_similarityScore = TypeSystemImpl.createCallSite(DBPediaObject.class, "similarityScore");
  private final static MethodHandle _FH_similarityScore = _FC_similarityScore.dynamicInvoker();
  private final static CallSite _FC_percentageOfSecondRank = TypeSystemImpl.createCallSite(DBPediaObject.class, "percentageOfSecondRank");
  private final static MethodHandle _FH_percentageOfSecondRank = _FC_percentageOfSecondRank.dynamicInvoker();
  private final static CallSite _FC_uri = TypeSystemImpl.createCallSite(DBPediaObject.class, "uri");
  private final static MethodHandle _FH_uri = _FC_uri.dynamicInvoker();
  private final static CallSite _FC_types = TypeSystemImpl.createCallSite(DBPediaObject.class, "types");
  private final static MethodHandle _FH_types = _FC_types.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected DBPediaObject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DBPediaObject(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DBPediaObject(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DBPediaObject(JCas jcas, int begin, int end) {
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
  //* Feature: similarityScore

  /** getter for similarityScore - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSimilarityScore() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_similarityScore));
  }
    
  /** setter for similarityScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSimilarityScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_similarityScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: percentageOfSecondRank

  /** getter for percentageOfSecondRank - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPercentageOfSecondRank() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_percentageOfSecondRank));
  }
    
  /** setter for percentageOfSecondRank - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentageOfSecondRank(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_percentageOfSecondRank), v);
  }    
    
   
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_uri));
  }
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_uri), v);
  }    
    
   
    
  //*--------------*
  //* Feature: types

  /** getter for types - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<DBPediaType> getTypes() { 
    return (FSList<DBPediaType>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_types)));
  }
    
  /** setter for types - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypes(FSList<DBPediaType> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_types), v);
  }    
    
  }

    