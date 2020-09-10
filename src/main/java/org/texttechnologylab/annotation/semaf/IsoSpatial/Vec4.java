

/* First created by JCasGen Thu Sep 10 17:48:48 CEST 2020 */
package org.texttechnologylab.annotation.semaf.IsoSpatial;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Sep 10 17:49:24 CEST 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoMetaTypeSystem.xml
 * @generated */
public class Vec4 extends Vec3 {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Vec4.class);
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
  protected Vec4() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Vec4(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Vec4(JCas jcas) {
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
  //* Feature: w

  /** getter for w - gets 
   * @generated
   * @return value of the feature 
   */
  public double getW() {
    if (Vec4_Type.featOkTst && ((Vec4_Type)jcasType).casFeat_w == null)
      jcasType.jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vec4_Type)jcasType).casFeatCode_w);}
    
  /** setter for w - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setW(double v) {
    if (Vec4_Type.featOkTst && ((Vec4_Type)jcasType).casFeat_w == null)
      jcasType.jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Vec4_Type)jcasType).casFeatCode_w, v);}    
  }

    