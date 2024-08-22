

   
/* Apache UIMA v3 - First created by JCasGen Thu Aug 22 11:19:02 CEST 2024 */

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
 * Updated by JCasGen Thu Aug 22 11:19:02 CEST 2024
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
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
  public final static String _FeatName_SourceID = "SourceID";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_SourceViewName = TypeSystemImpl.createCallSite(ViewReference.class, "SourceViewName");
  private final static MethodHandle _FH_SourceViewName = _FC_SourceViewName.dynamicInvoker();
  private final static CallSite _FC_SourceID = TypeSystemImpl.createCallSite(ViewReference.class, "SourceID");
  private final static MethodHandle _FH_SourceID = _FC_SourceID.dynamicInvoker();

   
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
  //* Feature: SourceID

  /** getter for SourceID - gets ID of the source
   * @generated
   * @return value of the feature 
   */
  public String getSourceID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_SourceID));
  }
    
  /** setter for SourceID - sets ID of the source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_SourceID), v);
  }    
    
  }

    