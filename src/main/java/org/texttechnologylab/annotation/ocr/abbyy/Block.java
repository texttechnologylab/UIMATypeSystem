

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A recognized block.
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Block extends StructuralElement {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Block.class);
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
  protected Block() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Block(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Block(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Block(JCas jcas, int begin, int end) {
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
  //* Feature: blockType

  /** getter for blockType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBlockType() {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_blockType == null)
      jcasType.jcas.throwFeatMissing("blockType", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Block_Type)jcasType).casFeatCode_blockType);}
    
  /** setter for blockType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlockType(String v) {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_blockType == null)
      jcasType.jcas.throwFeatMissing("blockType", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    jcasType.ll_cas.ll_setStringValue(addr, ((Block_Type)jcasType).casFeatCode_blockType, v);}    
   
    
  //*--------------*
  //* Feature: blockName

  /** getter for blockName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBlockName() {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_blockName == null)
      jcasType.jcas.throwFeatMissing("blockName", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Block_Type)jcasType).casFeatCode_blockName);}
    
  /** setter for blockName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlockName(String v) {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_blockName == null)
      jcasType.jcas.throwFeatMissing("blockName", "org.texttechnologylab.annotation.ocr.abbyy.Block");
    jcasType.ll_cas.ll_setStringValue(addr, ((Block_Type)jcasType).casFeatCode_blockName, v);}    
  }

    