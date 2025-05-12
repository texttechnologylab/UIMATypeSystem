

   
/* Apache UIMA v3 - First created by JCasGen Mon May 12 10:32:10 CEST 2025 */

package org.texttechnologylab.annotation.biofid.gnfinder;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Mon May 12 10:32:10 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OddsDetails extends TOP {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OddsDetails.class);
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
   
  public final static String _FeatName_feature = "feature";
  public final static String _FeatName_odds = "odds";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_feature = TypeSystemImpl.createCallSite(OddsDetails.class, "feature");
  private final static MethodHandle _FH_feature = _FC_feature.dynamicInvoker();
  private final static CallSite _FC_odds = TypeSystemImpl.createCallSite(OddsDetails.class, "odds");
  private final static MethodHandle _FH_odds = _FC_odds.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OddsDetails() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OddsDetails(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OddsDetails(JCas jcas) {
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
  //* Feature: feature

  /** getter for feature - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFeature() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_feature));
  }
    
  /** setter for feature - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeature(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_feature), v);
  }    
    
   
    
  //*--------------*
  //* Feature: odds

  /** getter for odds - gets 
   * @generated
   * @return value of the feature 
   */
  public float getOdds() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_odds));
  }
    
  /** setter for odds - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOdds(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_odds), v);
  }    
    
  }

    