

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;




/** A recognized block.
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Block extends StructuralElement {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Block";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_blockType = "blockType";
  public final static String _FeatName_blockName = "blockName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_blockType = TypeSystemImpl.createCallSite(Block.class, "blockType");
  private final static MethodHandle _FH_blockType = _FC_blockType.dynamicInvoker();
  private final static CallSite _FC_blockName = TypeSystemImpl.createCallSite(Block.class, "blockName");
  private final static MethodHandle _FH_blockName = _FC_blockName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Block() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Block(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_blockType));
  }
    
  /** setter for blockType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlockType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_blockType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: blockName

  /** getter for blockName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBlockName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_blockName));
  }
    
  /** setter for blockName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBlockName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_blockName), v);
  }    
    
  }

    