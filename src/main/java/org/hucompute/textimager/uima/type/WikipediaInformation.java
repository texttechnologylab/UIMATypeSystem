

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 21:27:09 CET 2024 */

package org.hucompute.textimager.uima.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Feb 28 21:27:09 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WikipediaInformation extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.WikipediaInformation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WikipediaInformation.class);
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
   
  public final static String _FeatName_pageURL = "pageURL";
  public final static String _FeatName_revisionID = "revisionID";
  public final static String _FeatName_namespaceID = "namespaceID";
  public final static String _FeatName_namespace = "namespace";
  public final static String _FeatName_timestamp = "timestamp";
  public final static String _FeatName_title = "title";
  public final static String _FeatName_pageID = "pageID";
  public final static String _FeatName_categories = "categories";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_pageURL = TypeSystemImpl.createCallSite(WikipediaInformation.class, "pageURL");
  private final static MethodHandle _FH_pageURL = _FC_pageURL.dynamicInvoker();
  private final static CallSite _FC_revisionID = TypeSystemImpl.createCallSite(WikipediaInformation.class, "revisionID");
  private final static MethodHandle _FH_revisionID = _FC_revisionID.dynamicInvoker();
  private final static CallSite _FC_namespaceID = TypeSystemImpl.createCallSite(WikipediaInformation.class, "namespaceID");
  private final static MethodHandle _FH_namespaceID = _FC_namespaceID.dynamicInvoker();
  private final static CallSite _FC_namespace = TypeSystemImpl.createCallSite(WikipediaInformation.class, "namespace");
  private final static MethodHandle _FH_namespace = _FC_namespace.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(WikipediaInformation.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(WikipediaInformation.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_pageID = TypeSystemImpl.createCallSite(WikipediaInformation.class, "pageID");
  private final static MethodHandle _FH_pageID = _FC_pageID.dynamicInvoker();
  private final static CallSite _FC_categories = TypeSystemImpl.createCallSite(WikipediaInformation.class, "categories");
  private final static MethodHandle _FH_categories = _FC_categories.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected WikipediaInformation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public WikipediaInformation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WikipediaInformation(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WikipediaInformation(JCas jcas, int begin, int end) {
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
  //* Feature: pageURL

  /** getter for pageURL - gets Description of the Synset
   * @generated
   * @return value of the feature 
   */
  public String getPageURL() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pageURL));
  }
    
  /** setter for pageURL - sets Description of the Synset 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageURL(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pageURL), v);
  }    
    
   
    
  //*--------------*
  //* Feature: revisionID

  /** getter for revisionID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRevisionID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_revisionID));
  }
    
  /** setter for revisionID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRevisionID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_revisionID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: namespaceID

  /** getter for namespaceID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNamespaceID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_namespaceID));
  }
    
  /** setter for namespaceID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNamespaceID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_namespaceID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: namespace

  /** getter for namespace - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNamespace() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_namespace));
  }
    
  /** setter for namespace - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNamespace(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_namespace), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimestamp() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pageID

  /** getter for pageID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPageID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pageID));
  }
    
  /** setter for pageID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pageID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: categories

  /** getter for categories - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getCategories() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categories)));
  }
    
  /** setter for categories - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategories(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_categories), v);
  }    
    
    
  /** indexed getter for categories - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCategories(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categories)))).get(i);
  } 

  /** indexed setter for categories - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategories(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categories)))).set(i, v);
  }  
  }

    