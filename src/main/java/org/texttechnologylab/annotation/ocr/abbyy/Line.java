

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 22 17:11:16 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Tue Apr 22 17:11:16 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Line extends StructuralElement {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Line";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Line.class);
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
   
  public final static String _FeatName_baseline = "baseline";
  public final static String _FeatName_format = "format";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_baseline = TypeSystemImpl.createCallSite(Line.class, "baseline");
  private final static MethodHandle _FH_baseline = _FC_baseline.dynamicInvoker();
  private final static CallSite _FC_format = TypeSystemImpl.createCallSite(Line.class, "format");
  private final static MethodHandle _FH_format = _FC_format.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Line() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Line(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Line(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Line(JCas jcas, int begin, int end) {
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
  //* Feature: baseline

  /** getter for baseline - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBaseline() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_baseline));
  }
    
  /** setter for baseline - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseline(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_baseline), v);
  }    
    
   
    
  //*--------------*
  //* Feature: format

  /** getter for format - gets 
   * @generated
   * @return value of the feature 
   */
  public Format getFormat() { 
    return (Format)(_getFeatureValueNc(wrapGetIntCatchException(_FH_format)));
  }
    
  /** setter for format - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFormat(Format v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_format), v);
  }    
    
  }

    