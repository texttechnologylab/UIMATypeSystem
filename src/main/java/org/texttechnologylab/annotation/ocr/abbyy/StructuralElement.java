

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div;


/** Meta-Type for structural elements with pixel offsets in the ABBYY FineReader schema.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class StructuralElement extends Div {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StructuralElement.class);
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
  protected StructuralElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public StructuralElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public StructuralElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public StructuralElement(JCas jcas, int begin, int end) {
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
  //* Feature: top

  /** getter for top - gets Coordinate of the top border, in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getTop() {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_top == null)
      jcasType.jcas.throwFeatMissing("top", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    return jcasType.ll_cas.ll_getIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_top);}
    
  /** setter for top - sets Coordinate of the top border, in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTop(int v) {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_top == null)
      jcasType.jcas.throwFeatMissing("top", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    jcasType.ll_cas.ll_setIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_top, v);}    
   
    
  //*--------------*
  //* Feature: bottom

  /** getter for bottom - gets Coordinate of the bottom border, in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getBottom() {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_bottom == null)
      jcasType.jcas.throwFeatMissing("bottom", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    return jcasType.ll_cas.ll_getIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_bottom);}
    
  /** setter for bottom - sets Coordinate of the bottom border, in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBottom(int v) {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_bottom == null)
      jcasType.jcas.throwFeatMissing("bottom", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    jcasType.ll_cas.ll_setIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_bottom, v);}    
   
    
  //*--------------*
  //* Feature: left

  /** getter for left - gets Coordinate of the left border, in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getLeft() {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_left == null)
      jcasType.jcas.throwFeatMissing("left", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    return jcasType.ll_cas.ll_getIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_left);}
    
  /** setter for left - sets Coordinate of the left border, in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLeft(int v) {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_left == null)
      jcasType.jcas.throwFeatMissing("left", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    jcasType.ll_cas.ll_setIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_left, v);}    
   
    
  //*--------------*
  //* Feature: right

  /** getter for right - gets Coordinate of the right border, in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getRight() {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_right == null)
      jcasType.jcas.throwFeatMissing("right", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    return jcasType.ll_cas.ll_getIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_right);}
    
  /** setter for right - sets Coordinate of the right border, in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRight(int v) {
    if (StructuralElement_Type.featOkTst && ((StructuralElement_Type)jcasType).casFeat_right == null)
      jcasType.jcas.throwFeatMissing("right", "org.texttechnologylab.annotation.ocr.abbyy.StructuralElement");
    jcasType.ll_cas.ll_setIntValue(addr, ((StructuralElement_Type)jcasType).casFeatCode_right, v);}    
  }

    