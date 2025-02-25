

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 12:41:26 CET 2025 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/**
 * Updated by JCasGen Tue Feb 25 12:41:26 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.OLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OLink.class);
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
   
  public final static String _FeatName_projective = "projective";
  public final static String _FeatName_frame_type = "frame_type";
  public final static String _FeatName_reference_pt = "reference_pt";
  public final static String _FeatName_reference_pt_str = "reference_pt_str";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_projective = TypeSystemImpl.createCallSite(OLink.class, "projective");
  private final static MethodHandle _FH_projective = _FC_projective.dynamicInvoker();
  private final static CallSite _FC_frame_type = TypeSystemImpl.createCallSite(OLink.class, "frame_type");
  private final static MethodHandle _FH_frame_type = _FC_frame_type.dynamicInvoker();
  private final static CallSite _FC_reference_pt = TypeSystemImpl.createCallSite(OLink.class, "reference_pt");
  private final static MethodHandle _FH_reference_pt = _FC_reference_pt.dynamicInvoker();
  private final static CallSite _FC_reference_pt_str = TypeSystemImpl.createCallSite(OLink.class, "reference_pt_str");
  private final static MethodHandle _FH_reference_pt_str = _FC_reference_pt_str.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OLink(JCas jcas) {
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
  //* Feature: projective

  /** getter for projective - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getProjective() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_projective));
  }
    
  /** setter for projective - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProjective(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_projective), v);
  }    
    
   
    
  //*--------------*
  //* Feature: frame_type

  /** getter for frame_type - gets ( ABSOLUTE | INTRINSIC | RELATIVE )
   * @generated
   * @return value of the feature 
   */
  public String getFrame_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_frame_type));
  }
    
  /** setter for frame_type - sets ( ABSOLUTE | INTRINSIC | RELATIVE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrame_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_frame_type), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference_pt

  /** getter for reference_pt - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getReference_pt() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference_pt)));
  }
    
  /** setter for reference_pt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference_pt(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference_pt), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference_pt_str

  /** getter for reference_pt_str - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReference_pt_str() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_reference_pt_str));
  }
    
  /** setter for reference_pt_str - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference_pt_str(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_reference_pt_str), v);
  }    
    
  }

    