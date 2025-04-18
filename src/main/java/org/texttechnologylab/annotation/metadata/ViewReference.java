

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation.metadata;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** View Reference
 * Updated by JCasGen Sat Apr 19 00:21:17 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ViewReference extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.metadata.ViewReference";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ViewReference.class);
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
   
  public final static String _FeatName_SourceViewName = "SourceViewName";
  public final static String _FeatName_SourceBegin = "SourceBegin";
  public final static String _FeatName_SourceEnd = "SourceEnd";
  public final static String _FeatName_SourceType = "SourceType";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_SourceViewName = TypeSystemImpl.createCallSite(ViewReference.class, "SourceViewName");
  private final static MethodHandle _FH_SourceViewName = _FC_SourceViewName.dynamicInvoker();
  private final static CallSite _FC_SourceBegin = TypeSystemImpl.createCallSite(ViewReference.class, "SourceBegin");
  private final static MethodHandle _FH_SourceBegin = _FC_SourceBegin.dynamicInvoker();
  private final static CallSite _FC_SourceEnd = TypeSystemImpl.createCallSite(ViewReference.class, "SourceEnd");
  private final static MethodHandle _FH_SourceEnd = _FC_SourceEnd.dynamicInvoker();
  private final static CallSite _FC_SourceType = TypeSystemImpl.createCallSite(ViewReference.class, "SourceType");
  private final static MethodHandle _FH_SourceType = _FC_SourceType.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ViewReference() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ViewReference(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ViewReference(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ViewReference(JCas jcas, int begin, int end) {
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
  //* Feature: SourceViewName

  /** getter for SourceViewName - gets The name of the view from source
   * @generated
   * @return value of the feature 
   */
  public String getSourceViewName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_SourceViewName));
  }
    
  /** setter for SourceViewName - sets The name of the view from source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceViewName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_SourceViewName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SourceBegin

  /** getter for SourceBegin - gets Begin of the source
   * @generated
   * @return value of the feature 
   */
  public int getSourceBegin() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_SourceBegin));
  }
    
  /** setter for SourceBegin - sets Begin of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceBegin(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_SourceBegin), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SourceEnd

  /** getter for SourceEnd - gets End of the source
   * @generated
   * @return value of the feature 
   */
  public int getSourceEnd() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_SourceEnd));
  }
    
  /** setter for SourceEnd - sets End of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceEnd(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_SourceEnd), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SourceType

  /** getter for SourceType - gets Type of the source
   * @generated
   * @return value of the feature 
   */
  public String getSourceType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_SourceType));
  }
    
  /** setter for SourceType - sets Type of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_SourceType), v);
  }    
    
  }

    