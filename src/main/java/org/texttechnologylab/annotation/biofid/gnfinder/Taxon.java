

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation.biofid.gnfinder;
 

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
   
  public final static String _FeatName_Version = "Version";
  public final static String _FeatName_Language = "Language";
  public final static String _FeatName_Cardinality = "Cardinality";
  public final static String _FeatName_OddsLog10 = "OddsLog10";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Version = TypeSystemImpl.createCallSite(Taxon.class, "Version");
  private final static MethodHandle _FH_Version = _FC_Version.dynamicInvoker();
  private final static CallSite _FC_Language = TypeSystemImpl.createCallSite(Taxon.class, "Language");
  private final static MethodHandle _FH_Language = _FC_Language.dynamicInvoker();
  private final static CallSite _FC_Cardinality = TypeSystemImpl.createCallSite(Taxon.class, "Cardinality");
  private final static MethodHandle _FH_Cardinality = _FC_Cardinality.dynamicInvoker();
  private final static CallSite _FC_OddsLog10 = TypeSystemImpl.createCallSite(Taxon.class, "OddsLog10");
  private final static MethodHandle _FH_OddsLog10 = _FC_OddsLog10.dynamicInvoker();

   
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
  //* Feature: Version

  /** getter for Version - gets gnfinder version.
   * @generated
   * @return value of the feature 
   */
  public String getVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Version));
  }
    
  /** setter for Version - sets gnfinder version. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Version), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Language

  /** getter for Language - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Language));
  }
    
  /** setter for Language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Language), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Cardinality

  /** getter for Cardinality - gets Cardinality depicts number of elements in a name.
                        0 - Cannot determine cardinality,
                        1 - Uninomial,
                        2 - Binomial,
                        3 - Trinomial.
   * @generated
   * @return value of the feature 
   */
  public short getCardinality() { 
    return _getShortValueNc(wrapGetIntCatchException(_FH_Cardinality));
  }
    
  /** setter for Cardinality - sets Cardinality depicts number of elements in a name.
                        0 - Cannot determine cardinality,
                        1 - Uninomial,
                        2 - Binomial,
                        3 - Trinomial. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCardinality(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_Cardinality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: OddsLog10

  /** getter for OddsLog10 - gets Log10 of the odds (probability) that name detection was correct.
   * @generated
   * @return value of the feature 
   */
  public float getOddsLog10() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_OddsLog10));
  }
    
  /** setter for OddsLog10 - sets Log10 of the odds (probability) that name detection was correct. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOddsLog10(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_OddsLog10), v);
  }    
    
  }

    