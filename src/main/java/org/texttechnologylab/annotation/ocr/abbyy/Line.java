

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Line of a paragraph.
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Line extends StructuralElement {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Line() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Line(int addr, TOP_Type type) {
    super(addr, type);
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

  /** getter for baseline - gets The distance from the baseline to the top edge of the page, in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getBaseline() {
    if (Line_Type.featOkTst && ((Line_Type)jcasType).casFeat_baseline == null)
      jcasType.jcas.throwFeatMissing("baseline", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Line_Type)jcasType).casFeatCode_baseline);}
    
  /** setter for baseline - sets The distance from the baseline to the top edge of the page, in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseline(int v) {
    if (Line_Type.featOkTst && ((Line_Type)jcasType).casFeat_baseline == null)
      jcasType.jcas.throwFeatMissing("baseline", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    jcasType.ll_cas.ll_setIntValue(addr, ((Line_Type)jcasType).casFeatCode_baseline, v);}    
   
    
  //*--------------*
  //* Feature: format

  /** getter for format - gets If present, this line denotes a group of characters with uniform formatting.
   * @generated
   * @return value of the feature 
   */
  public Format getFormat() {
    if (Line_Type.featOkTst && ((Line_Type)jcasType).casFeat_format == null)
      jcasType.jcas.throwFeatMissing("format", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    return (Format)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Line_Type)jcasType).casFeatCode_format)));}
    
  /** setter for format - sets If present, this line denotes a group of characters with uniform formatting. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFormat(Format v) {
    if (Line_Type.featOkTst && ((Line_Type)jcasType).casFeat_format == null)
      jcasType.jcas.throwFeatMissing("format", "org.texttechnologylab.annotation.ocr.abbyy.Line");
    jcasType.ll_cas.ll_setRefValue(addr, ((Line_Type)jcasType).casFeatCode_format, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    