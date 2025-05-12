

   
/* Apache UIMA v3 - First created by JCasGen Mon May 12 10:32:10 CEST 2025 */

package org.texttechnologylab.annotation.biofid.gnfinder;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Mon May 12 10:32:10 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MetaData extends TOP {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.biofid.gnfinder.MetaData";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
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
  public final static String _FeatName_language = "language";
  public final static String _FeatName_other = "other";
  public final static String _FeatName_references = "references";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_date = TypeSystemImpl.createCallSite(MetaData.class, "date");
  private final static MethodHandle _FH_date = _FC_date.dynamicInvoker();
  private final static CallSite _FC_version = TypeSystemImpl.createCallSite(MetaData.class, "version");
  private final static MethodHandle _FH_version = _FC_version.dynamicInvoker();
  private final static CallSite _FC_language = TypeSystemImpl.createCallSite(MetaData.class, "language");
  private final static MethodHandle _FH_language = _FC_language.dynamicInvoker();
  private final static CallSite _FC_other = TypeSystemImpl.createCallSite(MetaData.class, "other");
  private final static MethodHandle _FH_other = _FC_other.dynamicInvoker();
  private final static CallSite _FC_references = TypeSystemImpl.createCallSite(MetaData.class, "references");
  private final static MethodHandle _FH_references = _FC_references.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaData(JCas jcas) {
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
  //* Feature: date

  /** getter for date - gets The date of running a GNfinder query.
   * @generated
   * @return value of the feature 
   */
  public String getDate() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_date));
  }
    
  /** setter for date - sets The date of running a GNfinder query. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_date), v);
  }    
    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets The version of GNfinder.
   * @generated
   * @return value of the feature 
   */
  public String getVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_version));
  }
    
  /** setter for version - sets The version of GNfinder. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_version), v);
  }    
    
   
    
  //*--------------*
  //* Feature: language

  /** getter for language - gets Indicates the language that was used for calculation of Bayes' odds.
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_language));
  }
    
  /** setter for language - sets Indicates the language that was used for calculation of Bayes' odds. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_language), v);
  }    
    
   
    
  //*--------------*
  //* Feature: other

  /** getter for other - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TOP> getOther() { 
    return (FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_other)));
  }
    
  /** setter for other - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOther(FSArray<TOP> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_other), v);
  }    
    
    
  /** indexed getter for other - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TOP getOther(int i) {
     return (TOP)(((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_other)))).get(i));
  } 

  /** indexed setter for other - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setOther(int i, TOP v) {
    ((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_other)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: references

  /** getter for references - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TOP> getReferences() { 
    return (FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_references)));
  }
    
  /** setter for references - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferences(FSArray<TOP> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_references), v);
  }    
    
    
  /** indexed getter for references - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TOP getReferences(int i) {
     return (TOP)(((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_references)))).get(i));
  } 

  /** indexed setter for references - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setReferences(int i, TOP v) {
    ((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_references)))).set(i, v);
  }  
  }

    