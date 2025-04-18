

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Sat Apr 19 00:21:17 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class GNMetaData extends MetaData {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.GNMetaData";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GNMetaData.class);
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
   
  public final static String _FeatName_date = "date";
  public final static String _FeatName_version = "version";
  public final static String _FeatName_withAllMatches = "withAllMatches";
  public final static String _FeatName_withAmbiguousNames = "withAmbiguousNames";
  public final static String _FeatName_withBayes = "withBayes";
  public final static String _FeatName_wihUniqueNames = "wihUniqueNames";
  public final static String _FeatName_withOddsAdjustment = "withOddsAdjustment";
  public final static String _FeatName_withSources = "withSources";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_date = TypeSystemImpl.createCallSite(GNMetaData.class, "date");
  private final static MethodHandle _FH_date = _FC_date.dynamicInvoker();
  private final static CallSite _FC_version = TypeSystemImpl.createCallSite(GNMetaData.class, "version");
  private final static MethodHandle _FH_version = _FC_version.dynamicInvoker();
  private final static CallSite _FC_withAllMatches = TypeSystemImpl.createCallSite(GNMetaData.class, "withAllMatches");
  private final static MethodHandle _FH_withAllMatches = _FC_withAllMatches.dynamicInvoker();
  private final static CallSite _FC_withAmbiguousNames = TypeSystemImpl.createCallSite(GNMetaData.class, "withAmbiguousNames");
  private final static MethodHandle _FH_withAmbiguousNames = _FC_withAmbiguousNames.dynamicInvoker();
  private final static CallSite _FC_withBayes = TypeSystemImpl.createCallSite(GNMetaData.class, "withBayes");
  private final static MethodHandle _FH_withBayes = _FC_withBayes.dynamicInvoker();
  private final static CallSite _FC_wihUniqueNames = TypeSystemImpl.createCallSite(GNMetaData.class, "wihUniqueNames");
  private final static MethodHandle _FH_wihUniqueNames = _FC_wihUniqueNames.dynamicInvoker();
  private final static CallSite _FC_withOddsAdjustment = TypeSystemImpl.createCallSite(GNMetaData.class, "withOddsAdjustment");
  private final static MethodHandle _FH_withOddsAdjustment = _FC_withOddsAdjustment.dynamicInvoker();
  private final static CallSite _FC_withSources = TypeSystemImpl.createCallSite(GNMetaData.class, "withSources");
  private final static MethodHandle _FH_withSources = _FC_withSources.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected GNMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public GNMetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GNMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GNMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: date

  /** getter for date - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDate() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_date));
  }
    
  /** setter for date - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_date), v);
  }    
    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_version));
  }
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_version), v);
  }    
    
   
    
  //*--------------*
  //* Feature: withAllMatches

  /** getter for withAllMatches - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithAllMatches() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_withAllMatches));
  }
    
  /** setter for withAllMatches - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithAllMatches(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_withAllMatches), v);
  }    
    
   
    
  //*--------------*
  //* Feature: withAmbiguousNames

  /** getter for withAmbiguousNames - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithAmbiguousNames() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_withAmbiguousNames));
  }
    
  /** setter for withAmbiguousNames - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithAmbiguousNames(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_withAmbiguousNames), v);
  }    
    
   
    
  //*--------------*
  //* Feature: withBayes

  /** getter for withBayes - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithBayes() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_withBayes));
  }
    
  /** setter for withBayes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithBayes(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_withBayes), v);
  }    
    
   
    
  //*--------------*
  //* Feature: wihUniqueNames

  /** getter for wihUniqueNames - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWihUniqueNames() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_wihUniqueNames));
  }
    
  /** setter for wihUniqueNames - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWihUniqueNames(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_wihUniqueNames), v);
  }    
    
   
    
  //*--------------*
  //* Feature: withOddsAdjustment

  /** getter for withOddsAdjustment - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithOddsAdjustment() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_withOddsAdjustment));
  }
    
  /** setter for withOddsAdjustment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithOddsAdjustment(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_withOddsAdjustment), v);
  }    
    
   
    
  //*--------------*
  //* Feature: withSources

  /** getter for withSources - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWithSources() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_withSources));
  }
    
  /** setter for withSources - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithSources(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_withSources), v);
  }    
    
  }

    