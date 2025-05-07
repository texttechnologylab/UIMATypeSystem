

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 18:09:54 CEST 2025 */

package org.texttechnologylab.annotation.paper;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;




/**
 * Updated by JCasGen Wed May 07 18:09:54 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Section extends TextContent {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.paper.Section";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Section.class);
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
   
  public final static String _FeatName_level = "level";
  public final static String _FeatName_label = "label";
  public final static String _FeatName_index = "index";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_level = TypeSystemImpl.createCallSite(Section.class, "level");
  private final static MethodHandle _FH_level = _FC_level.dynamicInvoker();
  private final static CallSite _FC_label = TypeSystemImpl.createCallSite(Section.class, "label");
  private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
  private final static CallSite _FC_index = TypeSystemImpl.createCallSite(Section.class, "index");
  private final static MethodHandle _FH_index = _FC_index.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Section() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Section(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Section(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Section(JCas jcas, int begin, int end) {
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
  //* Feature: level

  /** getter for level - gets Level of the section, 0 is top level
   * @generated
   * @return value of the feature 
   */
  public int getLevel() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_level));
  }
    
  /** setter for level - sets Level of the section, 0 is top level 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLevel(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_level), v);
  }    
    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets The heading of a section
   * @generated
   * @return value of the feature 
   */
  public String getLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_label));
  }
    
  /** setter for label - sets The heading of a section 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
  }    
    
   
    
  //*--------------*
  //* Feature: index

  /** getter for index - gets The index of a section (1, 1.1, 1.1.1, ...)
   * @generated
   * @return value of the feature 
   */
  public String getIndex() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_index));
  }
    
  /** setter for index - sets The index of a section (1, 1.1, 1.1.1, ...) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_index), v);
  }    
    
  }

    