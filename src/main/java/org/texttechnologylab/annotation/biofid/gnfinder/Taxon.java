

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

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


/** Type for gnfinder-recognized taxonomic names that have not been verified.
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Taxon extends org.texttechnologylab.annotation.biofid.Taxon {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.biofid.gnfinder.Taxon";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Taxon.class);
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
   
  public final static String _FeatName_cardinality = "cardinality";
  public final static String _FeatName_oddsLog10 = "oddsLog10";
  public final static String _FeatName_oddsDetails = "oddsDetails";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_cardinality = TypeSystemImpl.createCallSite(Taxon.class, "cardinality");
  private final static MethodHandle _FH_cardinality = _FC_cardinality.dynamicInvoker();
  private final static CallSite _FC_oddsLog10 = TypeSystemImpl.createCallSite(Taxon.class, "oddsLog10");
  private final static MethodHandle _FH_oddsLog10 = _FC_oddsLog10.dynamicInvoker();
  private final static CallSite _FC_oddsDetails = TypeSystemImpl.createCallSite(Taxon.class, "oddsDetails");
  private final static MethodHandle _FH_oddsDetails = _FC_oddsDetails.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Taxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Taxon(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Taxon(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Taxon(JCas jcas, int begin, int end) {
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
  //* Feature: cardinality

  /** getter for cardinality - gets Cardinality depicts the number of elements in a name.
                        0 - Could not determine cardinality,
                        1 - Uninomial,
                        2 - Binomial,
                        3 - Trinomial.
   * @generated
   * @return value of the feature 
   */
  public short getCardinality() { 
    return _getShortValueNc(wrapGetIntCatchException(_FH_cardinality));
  }
    
  /** setter for cardinality - sets Cardinality depicts the number of elements in a name.
                        0 - Could not determine cardinality,
                        1 - Uninomial,
                        2 - Binomial,
                        3 - Trinomial. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCardinality(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_cardinality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: oddsLog10

  /** getter for oddsLog10 - gets Log10 of the odds (probability) that name detection was correct.
   * @generated
   * @return value of the feature 
   */
  public float getOddsLog10() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_oddsLog10));
  }
    
  /** setter for oddsLog10 - sets Log10 of the odds (probability) that name detection was correct. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOddsLog10(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_oddsLog10), v);
  }    
    
   
    
  //*--------------*
  //* Feature: oddsDetails

  /** getter for oddsDetails - gets A list of OddsDetails that describe how odds were calculated (optional).
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TOP> getOddsDetails() { 
    return (FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_oddsDetails)));
  }
    
  /** setter for oddsDetails - sets A list of OddsDetails that describe how odds were calculated (optional). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOddsDetails(FSArray<TOP> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_oddsDetails), v);
  }    
    
    
  /** indexed getter for oddsDetails - gets an indexed value - A list of OddsDetails that describe how odds were calculated (optional).
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TOP getOddsDetails(int i) {
     return (TOP)(((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_oddsDetails)))).get(i));
  } 

  /** indexed setter for oddsDetails - sets an indexed value - A list of OddsDetails that describe how odds were calculated (optional).
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setOddsDetails(int i, TOP v) {
    ((FSArray<TOP>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_oddsDetails)))).set(i, v);
  }  
  }

    