

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LayerImage extends WebImage {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LayerImage.class);
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
  protected LayerImage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LayerImage(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LayerImage(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LayerImage(JCas jcas, int begin, int end) {
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
  //* Feature: index

  /** getter for index - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIndex() {
    if (LayerImage_Type.featOkTst && ((LayerImage_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.type.LayerImage");
    return jcasType.ll_cas.ll_getIntValue(addr, ((LayerImage_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    if (LayerImage_Type.featOkTst && ((LayerImage_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.type.LayerImage");
    jcasType.ll_cas.ll_setIntValue(addr, ((LayerImage_Type)jcasType).casFeatCode_index, v);}    
  }

    