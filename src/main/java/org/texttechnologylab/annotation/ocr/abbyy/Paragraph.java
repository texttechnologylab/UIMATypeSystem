

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Paragraph of a recognized text.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Paragraph extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Paragraph {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Paragraph() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Paragraph(int addr, TOP_Type type) {
    super(addr, type);
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
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_leftIndent == null)
      jcasType.jcas.throwFeatMissing("leftIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_leftIndent);}
    
  /** setter for leftIndent - sets The left paragraph indent (optional, default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLeftIndent(int v) {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_leftIndent == null)
      jcasType.jcas.throwFeatMissing("leftIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    jcasType.ll_cas.ll_setIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_leftIndent, v);}    
   
    
  //*--------------*
  //* Feature: rightIndent

  /** getter for rightIndent - gets The right paragraph indent (optional, default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getRightIndent() {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_rightIndent == null)
      jcasType.jcas.throwFeatMissing("rightIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_rightIndent);}
    
  /** setter for rightIndent - sets The right paragraph indent (optional, default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRightIndent(int v) {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_rightIndent == null)
      jcasType.jcas.throwFeatMissing("rightIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    jcasType.ll_cas.ll_setIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_rightIndent, v);}    
   
    
  //*--------------*
  //* Feature: startIndent

  /** getter for startIndent - gets The indent of the first line of the paragraph optional,default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getStartIndent() {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_startIndent == null)
      jcasType.jcas.throwFeatMissing("startIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_startIndent);}
    
  /** setter for startIndent - sets The indent of the first line of the paragraph optional,default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartIndent(int v) {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_startIndent == null)
      jcasType.jcas.throwFeatMissing("startIndent", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    jcasType.ll_cas.ll_setIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_startIndent, v);}    
   
    
  //*--------------*
  //* Feature: lineSpacing

  /** getter for lineSpacing - gets The spacing between lines (optional, default value is 0)
   * @generated
   * @return value of the feature 
   */
  public int getLineSpacing() {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_lineSpacing == null)
      jcasType.jcas.throwFeatMissing("lineSpacing", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_lineSpacing);}
    
  /** setter for lineSpacing - sets The spacing between lines (optional, default value is 0) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLineSpacing(int v) {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_lineSpacing == null)
      jcasType.jcas.throwFeatMissing("lineSpacing", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    jcasType.ll_cas.ll_setIntValue(addr, ((Paragraph_Type)jcasType).casFeatCode_lineSpacing, v);}    
   
    
  //*--------------*
  //* Feature: alignment

  /** getter for alignment - gets The paragraph alignment (optional, default value is Left).
                        It can be one of the following values: Left, Center, Right, Justified
   * @generated
   * @return value of the feature 
   */
  public String getAlignment() {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_alignment == null)
      jcasType.jcas.throwFeatMissing("alignment", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Paragraph_Type)jcasType).casFeatCode_alignment);}
    
  /** setter for alignment - sets The paragraph alignment (optional, default value is Left).
                        It can be one of the following values: Left, Center, Right, Justified 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAlignment(String v) {
    if (Paragraph_Type.featOkTst && ((Paragraph_Type)jcasType).casFeat_alignment == null)
      jcasType.jcas.throwFeatMissing("alignment", "org.texttechnologylab.annotation.ocr.abbyy.Paragraph");
    jcasType.ll_cas.ll_setStringValue(addr, ((Paragraph_Type)jcasType).casFeatCode_alignment, v);}    
  }

    