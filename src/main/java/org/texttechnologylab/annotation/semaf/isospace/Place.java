

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Place extends Location {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.Place";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Place.class);
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
   
  public final static String _FeatName_country = "country";
  public final static String _FeatName_state = "state";
  public final static String _FeatName_ctv = "ctv";
  public final static String _FeatName_continent = "continent";
  public final static String _FeatName_county = "county";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_country = TypeSystemImpl.createCallSite(Place.class, "country");
  private final static MethodHandle _FH_country = _FC_country.dynamicInvoker();
  private final static CallSite _FC_state = TypeSystemImpl.createCallSite(Place.class, "state");
  private final static MethodHandle _FH_state = _FC_state.dynamicInvoker();
  private final static CallSite _FC_ctv = TypeSystemImpl.createCallSite(Place.class, "ctv");
  private final static MethodHandle _FH_ctv = _FC_ctv.dynamicInvoker();
  private final static CallSite _FC_continent = TypeSystemImpl.createCallSite(Place.class, "continent");
  private final static MethodHandle _FH_continent = _FC_continent.dynamicInvoker();
  private final static CallSite _FC_county = TypeSystemImpl.createCallSite(Place.class, "county");
  private final static MethodHandle _FH_county = _FC_county.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Place() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Place(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Place(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Place(JCas jcas, int begin, int end) {
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
  //* Feature: country

  /** getter for country - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCountry() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_country));
  }
    
  /** setter for country - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountry(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_country), v);
  }    
    
   
    
  //*--------------*
  //* Feature: state

  /** getter for state - gets 
   * @generated
   * @return value of the feature 
   */
  public String getState() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_state));
  }
    
  /** setter for state - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setState(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_state), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ctv

  /** getter for ctv - gets ( CITY | TOWN | VILLAGE )
   * @generated
   * @return value of the feature 
   */
  public String getCtv() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ctv));
  }
    
  /** setter for ctv - sets ( CITY | TOWN | VILLAGE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCtv(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ctv), v);
  }    
    
   
    
  //*--------------*
  //* Feature: continent

  /** getter for continent - gets ( AF | AN | AI | AU | GO | LA | NA | PA | SA )
   * @generated
   * @return value of the feature 
   */
  public String getContinent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_continent));
  }
    
  /** setter for continent - sets ( AF | AN | AI | AU | GO | LA | NA | PA | SA ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContinent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_continent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: county

  /** getter for county - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCounty() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_county));
  }
    
  /** setter for county - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCounty(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_county), v);
  }    
    
  }

    