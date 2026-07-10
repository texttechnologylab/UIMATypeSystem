

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.annis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Variation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Variation.class);
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
  protected Variation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Variation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Variation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Variation(JCas jcas, int begin, int end) {
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
  //* Feature: layer

  /** getter for layer - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLayer() {
    if (Variation_Type.featOkTst && ((Variation_Type)jcasType).casFeat_layer == null)
      jcasType.jcas.throwFeatMissing("layer", "org.texttechnologylab.annotation.annis.Variation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Variation_Type)jcasType).casFeatCode_layer);}
    
  /** setter for layer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLayer(String v) {
    if (Variation_Type.featOkTst && ((Variation_Type)jcasType).casFeat_layer == null)
      jcasType.jcas.throwFeatMissing("layer", "org.texttechnologylab.annotation.annis.Variation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Variation_Type)jcasType).casFeatCode_layer, v);}    
  }

    