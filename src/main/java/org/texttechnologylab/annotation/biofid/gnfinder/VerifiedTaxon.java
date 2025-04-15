

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 15 18:58:11 CEST 2025 */

package org.texttechnologylab.annotation.biofid.gnfinder;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.biofid.Taxon;


/** 
 * Updated by JCasGen Tue Apr 15 18:58:11 CEST 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class VerifiedTaxon extends Taxon {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VerifiedTaxon.class);
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
   
  public final static String _FeatName_Id = "Id";
  public final static String _FeatName_MatchedCanonical = "MatchedCanonical";
  public final static String _FeatName_CurrentCanonical = "CurrentCanonical";
  public final static String _FeatName_VerifMatchType = "VerifMatchType";
  public final static String _FeatName_VerifSortScore = "VerifSortScore";
  public final static String _FeatName_VerifEditDistance = "VerifEditDistance";
  public final static String _FeatName_VerifMatchedName = "VerifMatchedName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Id = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "Id");
  private final static MethodHandle _FH_Id = _FC_Id.dynamicInvoker();
  private final static CallSite _FC_MatchedCanonical = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "MatchedCanonical");
  private final static MethodHandle _FH_MatchedCanonical = _FC_MatchedCanonical.dynamicInvoker();
  private final static CallSite _FC_CurrentCanonical = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "CurrentCanonical");
  private final static MethodHandle _FH_CurrentCanonical = _FC_CurrentCanonical.dynamicInvoker();
  private final static CallSite _FC_VerifMatchType = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "VerifMatchType");
  private final static MethodHandle _FH_VerifMatchType = _FC_VerifMatchType.dynamicInvoker();
  private final static CallSite _FC_VerifSortScore = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "VerifSortScore");
  private final static MethodHandle _FH_VerifSortScore = _FC_VerifSortScore.dynamicInvoker();
  private final static CallSite _FC_VerifEditDistance = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "VerifEditDistance");
  private final static MethodHandle _FH_VerifEditDistance = _FC_VerifEditDistance.dynamicInvoker();
  private final static CallSite _FC_VerifMatchedName = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "VerifMatchedName");
  private final static MethodHandle _FH_VerifMatchedName = _FC_VerifMatchedName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected VerifiedTaxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public VerifiedTaxon(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public VerifiedTaxon(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public VerifiedTaxon(JCas jcas, int begin, int end) {
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
  //* Feature: Id

  /** getter for Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Id));
  }
    
  /** setter for Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: MatchedCanonical

  /** getter for MatchedCanonical - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMatchedCanonical() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_MatchedCanonical));
  }
    
  /** setter for MatchedCanonical - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedCanonical(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_MatchedCanonical), v);
  }    
    
   
    
  //*--------------*
  //* Feature: CurrentCanonical

  /** getter for CurrentCanonical - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCurrentCanonical() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_CurrentCanonical));
  }
    
  /** setter for CurrentCanonical - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCurrentCanonical(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_CurrentCanonical), v);
  }    
    
   
    
  //*--------------*
  //* Feature: VerifMatchType

  /** getter for VerifMatchType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVerifMatchType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_VerifMatchType));
  }
    
  /** setter for VerifMatchType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerifMatchType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_VerifMatchType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: VerifSortScore

  /** getter for VerifSortScore - gets 
   * @generated
   * @return value of the feature 
   */
  public float getVerifSortScore() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_VerifSortScore));
  }
    
  /** setter for VerifSortScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerifSortScore(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_VerifSortScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: VerifEditDistance

  /** getter for VerifEditDistance - gets 
   * @generated
   * @return value of the feature 
   */
  public short getVerifEditDistance() { 
    return _getShortValueNc(wrapGetIntCatchException(_FH_VerifEditDistance));
  }
    
  /** setter for VerifEditDistance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerifEditDistance(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_VerifEditDistance), v);
  }    
    
   
    
  //*--------------*
  //* Feature: VerifMatchedName

  /** getter for VerifMatchedName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVerifMatchedName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_VerifMatchedName));
  }
    
  /** setter for VerifMatchedName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerifMatchedName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_VerifMatchedName), v);
  }    
    
  }

    