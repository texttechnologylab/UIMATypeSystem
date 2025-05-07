

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 18:09:54 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;




/** Paragraph of a recognized text.
 * Updated by JCasGen Wed May 07 18:09:54 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Paragraph extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Paragraph {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Paragraph";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Paragraph.class);
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
   
  public final static String _FeatName_leftIndent = "leftIndent";
  public final static String _FeatName_rightIndent = "rightIndent";
  public final static String _FeatName_startIndent = "startIndent";
  public final static String _FeatName_lineSpacing = "lineSpacing";
  public final static String _FeatName_alignment = "alignment";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_leftIndent = TypeSystemImpl.createCallSite(Paragraph.class, "leftIndent");
  private final static MethodHandle _FH_leftIndent = _FC_leftIndent.dynamicInvoker();
  private final static CallSite _FC_rightIndent = TypeSystemImpl.createCallSite(Paragraph.class, "rightIndent");
  private final static MethodHandle _FH_rightIndent = _FC_rightIndent.dynamicInvoker();
  private final static CallSite _FC_startIndent = TypeSystemImpl.createCallSite(Paragraph.class, "startIndent");
  private final static MethodHandle _FH_startIndent = _FC_startIndent.dynamicInvoker();
  private final static CallSite _FC_lineSpacing = TypeSystemImpl.createCallSite(Paragraph.class, "lineSpacing");
  private final static MethodHandle _FH_lineSpacing = _FC_lineSpacing.dynamicInvoker();
  private final static CallSite _FC_alignment = TypeSystemImpl.createCallSite(Paragraph.class, "alignment");
  private final static MethodHandle _FH_alignment = _FC_alignment.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Paragraph() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Paragraph(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Paragraph(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Paragraph(JCas jcas, int begin, int end) {
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
  //* Feature: leftIndent

  /** getter for leftIndent - gets The left paragraph indent (optional, default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getLeftIndent() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_leftIndent));
  }
    
  /** setter for leftIndent - sets The left paragraph indent (optional, default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLeftIndent(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_leftIndent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rightIndent

  /** getter for rightIndent - gets The right paragraph indent (optional, default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getRightIndent() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_rightIndent));
  }
    
  /** setter for rightIndent - sets The right paragraph indent (optional, default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRightIndent(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_rightIndent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: startIndent

  /** getter for startIndent - gets The indent of the first line of the paragraph optional,default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getStartIndent() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_startIndent));
  }
    
  /** setter for startIndent - sets The indent of the first line of the paragraph optional,default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartIndent(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_startIndent), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lineSpacing

  /** getter for lineSpacing - gets The spacing between lines (optional, default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getLineSpacing() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_lineSpacing));
  }
    
  /** setter for lineSpacing - sets The spacing between lines (optional, default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLineSpacing(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_lineSpacing), v);
  }    
    
   
    
  //*--------------*
  //* Feature: alignment

  /** getter for alignment - gets The paragraph alignment (optional, default value is Left).
                        It can be one of the following values: Left, Center, Right, Justified
   * @generated
   * @return value of the feature 
   */
  public String getAlignment() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_alignment));
  }
    
  /** setter for alignment - sets The paragraph alignment (optional, default value is Left).
                        It can be one of the following values: Left, Center, Right, Justified 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlignment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_alignment), v);
  }    
    
  }

    