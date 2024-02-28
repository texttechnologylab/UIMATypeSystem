

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

package org.hucompute.textimager.uima.type.wikipedia;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;


/** Wikipedia link
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WikipediaLink extends de.tudarmstadt.ukp.dkpro.core.io.jwpl.type.WikipediaLink {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.wikipedia.WikipediaLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WikipediaLink.class);
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
   
  public final static String _FeatName_WikiData = "WikiData";
  public final static String _FeatName_WikiDataHyponyms = "WikiDataHyponyms";
  public final static String _FeatName_isInstance = "isInstance";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_WikiData = TypeSystemImpl.createCallSite(WikipediaLink.class, "WikiData");
  private final static MethodHandle _FH_WikiData = _FC_WikiData.dynamicInvoker();
  private final static CallSite _FC_WikiDataHyponyms = TypeSystemImpl.createCallSite(WikipediaLink.class, "WikiDataHyponyms");
  private final static MethodHandle _FH_WikiDataHyponyms = _FC_WikiDataHyponyms.dynamicInvoker();
  private final static CallSite _FC_isInstance = TypeSystemImpl.createCallSite(WikipediaLink.class, "isInstance");
  private final static MethodHandle _FH_isInstance = _FC_isInstance.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected WikipediaLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public WikipediaLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WikipediaLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WikipediaLink(JCas jcas, int begin, int end) {
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
  //* Feature: WikiData

  /** getter for WikiData - gets WikiData Id
   * @generated
   * @return value of the feature 
   */
  public String getWikiData() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_WikiData));
  }
    
  /** setter for WikiData - sets WikiData Id 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikiData(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_WikiData), v);
  }    
    
   
    
  //*--------------*
  //* Feature: WikiDataHyponyms

  /** getter for WikiDataHyponyms - gets WikiData Hyponyms
   * @generated
   * @return value of the feature 
   */
  public StringArray getWikiDataHyponyms() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_WikiDataHyponyms)));
  }
    
  /** setter for WikiDataHyponyms - sets WikiData Hyponyms 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikiDataHyponyms(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_WikiDataHyponyms), v);
  }    
    
    
  /** indexed getter for WikiDataHyponyms - gets an indexed value - WikiData Hyponyms
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getWikiDataHyponyms(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_WikiDataHyponyms)))).get(i);
  } 

  /** indexed setter for WikiDataHyponyms - sets an indexed value - WikiData Hyponyms
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setWikiDataHyponyms(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_WikiDataHyponyms)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: isInstance

  /** getter for isInstance - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsInstance() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isInstance));
  }
    
  /** setter for isInstance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsInstance(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isInstance), v);
  }    
    
  }

    