

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

package de.unihd.dbs.uima.types.heideltime;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Timex3 extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.unihd.dbs.uima.types.heideltime.Timex3";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Timex3.class);
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
   
  public final static String _FeatName_filename = "filename";
  public final static String _FeatName_sentId = "sentId";
  public final static String _FeatName_firstTokId = "firstTokId";
  public final static String _FeatName_allTokIds = "allTokIds";
  public final static String _FeatName_timexId = "timexId";
  public final static String _FeatName_timexInstance = "timexInstance";
  public final static String _FeatName_timexType = "timexType";
  public final static String _FeatName_timexValue = "timexValue";
  public final static String _FeatName_foundByRule = "foundByRule";
  public final static String _FeatName_timexQuant = "timexQuant";
  public final static String _FeatName_timexFreq = "timexFreq";
  public final static String _FeatName_timexMod = "timexMod";
  public final static String _FeatName_emptyValue = "emptyValue";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_filename = TypeSystemImpl.createCallSite(Timex3.class, "filename");
  private final static MethodHandle _FH_filename = _FC_filename.dynamicInvoker();
  private final static CallSite _FC_sentId = TypeSystemImpl.createCallSite(Timex3.class, "sentId");
  private final static MethodHandle _FH_sentId = _FC_sentId.dynamicInvoker();
  private final static CallSite _FC_firstTokId = TypeSystemImpl.createCallSite(Timex3.class, "firstTokId");
  private final static MethodHandle _FH_firstTokId = _FC_firstTokId.dynamicInvoker();
  private final static CallSite _FC_allTokIds = TypeSystemImpl.createCallSite(Timex3.class, "allTokIds");
  private final static MethodHandle _FH_allTokIds = _FC_allTokIds.dynamicInvoker();
  private final static CallSite _FC_timexId = TypeSystemImpl.createCallSite(Timex3.class, "timexId");
  private final static MethodHandle _FH_timexId = _FC_timexId.dynamicInvoker();
  private final static CallSite _FC_timexInstance = TypeSystemImpl.createCallSite(Timex3.class, "timexInstance");
  private final static MethodHandle _FH_timexInstance = _FC_timexInstance.dynamicInvoker();
  private final static CallSite _FC_timexType = TypeSystemImpl.createCallSite(Timex3.class, "timexType");
  private final static MethodHandle _FH_timexType = _FC_timexType.dynamicInvoker();
  private final static CallSite _FC_timexValue = TypeSystemImpl.createCallSite(Timex3.class, "timexValue");
  private final static MethodHandle _FH_timexValue = _FC_timexValue.dynamicInvoker();
  private final static CallSite _FC_foundByRule = TypeSystemImpl.createCallSite(Timex3.class, "foundByRule");
  private final static MethodHandle _FH_foundByRule = _FC_foundByRule.dynamicInvoker();
  private final static CallSite _FC_timexQuant = TypeSystemImpl.createCallSite(Timex3.class, "timexQuant");
  private final static MethodHandle _FH_timexQuant = _FC_timexQuant.dynamicInvoker();
  private final static CallSite _FC_timexFreq = TypeSystemImpl.createCallSite(Timex3.class, "timexFreq");
  private final static MethodHandle _FH_timexFreq = _FC_timexFreq.dynamicInvoker();
  private final static CallSite _FC_timexMod = TypeSystemImpl.createCallSite(Timex3.class, "timexMod");
  private final static MethodHandle _FH_timexMod = _FC_timexMod.dynamicInvoker();
  private final static CallSite _FC_emptyValue = TypeSystemImpl.createCallSite(Timex3.class, "emptyValue");
  private final static MethodHandle _FH_emptyValue = _FC_emptyValue.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Timex3() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Timex3(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Timex3(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Timex3(JCas jcas, int begin, int end) {
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
  //* Feature: filename

  /** getter for filename - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFilename() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_filename));
  }
    
  /** setter for filename - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFilename(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_filename), v);
  }    
    
   
    
  //*--------------*
  //* Feature: sentId

  /** getter for sentId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_sentId));
  }
    
  /** setter for sentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_sentId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: firstTokId

  /** getter for firstTokId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFirstTokId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_firstTokId));
  }
    
  /** setter for firstTokId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstTokId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_firstTokId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: allTokIds

  /** getter for allTokIds - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAllTokIds() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_allTokIds));
  }
    
  /** setter for allTokIds - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAllTokIds(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_allTokIds), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexId

  /** getter for timexId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timexId));
  }
    
  /** setter for timexId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timexId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexInstance

  /** getter for timexInstance - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTimexInstance() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_timexInstance));
  }
    
  /** setter for timexInstance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexInstance(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_timexInstance), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexType

  /** getter for timexType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timexType));
  }
    
  /** setter for timexType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timexType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexValue

  /** getter for timexValue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timexValue));
  }
    
  /** setter for timexValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timexValue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: foundByRule

  /** getter for foundByRule - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFoundByRule() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_foundByRule));
  }
    
  /** setter for foundByRule - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFoundByRule(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_foundByRule), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexQuant

  /** getter for timexQuant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexQuant() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timexQuant));
  }
    
  /** setter for timexQuant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexQuant(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timexQuant), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexFreq

  /** getter for timexFreq - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexFreq() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timexFreq));
  }
    
  /** setter for timexFreq - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexFreq(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timexFreq), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timexMod

  /** getter for timexMod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimexMod() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timexMod));
  }
    
  /** setter for timexMod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimexMod(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timexMod), v);
  }    
    
   
    
  //*--------------*
  //* Feature: emptyValue

  /** getter for emptyValue - gets attribute to hold a value for "empty" timex3 tags
   * @generated
   * @return value of the feature 
   */
  public String getEmptyValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_emptyValue));
  }
    
  /** setter for emptyValue - sets attribute to hold a value for "empty" timex3 tags 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmptyValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_emptyValue), v);
  }    
    
  }

    