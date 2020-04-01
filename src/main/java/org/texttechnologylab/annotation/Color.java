

/* First created by JCasGen Fri Mar 20 09:13:58 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.type.AnnotationNode;


/** 
 * Updated by JCasGen Fri Mar 20 09:13:58 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyColor.xml
 * @generated */
public class Color extends AnnotationNode {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Color.class);
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
  protected Color() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Color(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Color(JCas jcas) {
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
  //* Feature: rgb

  /** getter for rgb - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRgb() {
    if (Color_Type.featOkTst && ((Color_Type)jcasType).casFeat_rgb == null)
      jcasType.jcas.throwFeatMissing("rgb", "org.texttechnologylab.annotation.Color");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Color_Type)jcasType).casFeatCode_rgb);}
    
  /** setter for rgb - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRgb(String v) {
    if (Color_Type.featOkTst && ((Color_Type)jcasType).casFeat_rgb == null)
      jcasType.jcas.throwFeatMissing("rgb", "org.texttechnologylab.annotation.Color");
    jcasType.ll_cas.ll_setStringValue(addr, ((Color_Type)jcasType).casFeatCode_rgb, v);}    
  }

    