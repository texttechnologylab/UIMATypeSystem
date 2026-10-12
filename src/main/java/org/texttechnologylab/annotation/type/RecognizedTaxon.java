

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 19 13:53:31 CEST 2026 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;


/** Annotation type for recognized taxon mentions.
 * Updated by JCasGen Fri Jun 19 13:53:31 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RecognizedTaxon extends Taxon {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.RecognizedTaxon";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RecognizedTaxon.class);
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
   
  public final static String _FeatName_resolutions = "resolutions";
  public final static String _FeatName_text = "text";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_resolutions = TypeSystemImpl.createCallSite(RecognizedTaxon.class, "resolutions");
  private final static MethodHandle _FH_resolutions = _FC_resolutions.dynamicInvoker();
  private final static CallSite _FC_text = TypeSystemImpl.createCallSite(RecognizedTaxon.class, "text");
  private final static MethodHandle _FH_text = _FC_text.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected RecognizedTaxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RecognizedTaxon(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RecognizedTaxon(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RecognizedTaxon(JCas jcas, int begin, int end) {
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
  //* Feature: resolutions

  /** getter for resolutions - gets List of taxon resolutions associated with this recognized taxon.
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TaxonResolution> getResolutions() { 
    return (FSArray<TaxonResolution>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_resolutions)));
  }
    
  /** setter for resolutions - sets List of taxon resolutions associated with this recognized taxon. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResolutions(FSArray<TaxonResolution> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_resolutions), v);
  }    
    
    
  /** indexed getter for resolutions - gets an indexed value - List of taxon resolutions associated with this recognized taxon.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TaxonResolution getResolutions(int i) {
     return (TaxonResolution)(((FSArray<TaxonResolution>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_resolutions)))).get(i));
  } 

  /** indexed setter for resolutions - sets an indexed value - List of taxon resolutions associated with this recognized taxon.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setResolutions(int i, TaxonResolution v) {
    ((FSArray<TaxonResolution>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_resolutions)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The text of the recognized taxon.
   * @generated
   * @return value of the feature 
   */
  public String getText() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_text));
  }
    
  /** setter for text - sets The text of the recognized taxon. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_text), v);
  }    
    
  }

    