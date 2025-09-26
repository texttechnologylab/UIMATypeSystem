

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:14 CEST 2025 */

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
 * Updated by JCasGen Fri Sep 26 15:44:14 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SourceDocInfo extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.unihd.dbs.uima.types.heideltime.SourceDocInfo";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SourceDocInfo.class);
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
   
  public final static String _FeatName_uri = "uri";
  public final static String _FeatName_offsetInSource = "offsetInSource";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_uri = TypeSystemImpl.createCallSite(SourceDocInfo.class, "uri");
  private final static MethodHandle _FH_uri = _FC_uri.dynamicInvoker();
  private final static CallSite _FC_offsetInSource = TypeSystemImpl.createCallSite(SourceDocInfo.class, "offsetInSource");
  private final static MethodHandle _FH_offsetInSource = _FC_offsetInSource.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SourceDocInfo() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SourceDocInfo(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SourceDocInfo(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SourceDocInfo(JCas jcas, int begin, int end) {
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
  //* Feature: uri

  /** getter for uri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUri() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_uri));
  }
    
  /** setter for uri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_uri), v);
  }    
    
   
    
  //*--------------*
  //* Feature: offsetInSource

  /** getter for offsetInSource - gets 
   * @generated
   * @return value of the feature 
   */
  public int getOffsetInSource() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_offsetInSource));
  }
    
  /** setter for offsetInSource - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOffsetInSource(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_offsetInSource), v);
  }    
    
  }

    