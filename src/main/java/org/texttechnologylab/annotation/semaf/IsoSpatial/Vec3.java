

/* First created by JCasGen Mon Aug 23 15:33:08 CEST 2021 */
package org.texttechnologylab.annotation.semaf.IsoSpatial;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Mon Aug 23 15:33:08 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoBaseTypeSystem.xml
 * @generated */
public class Vec3 extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Vec3.class);
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
  protected Vec3() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Vec3(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Vec3(JCas jcas) {
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
  //* Feature: x

  /** getter for x - gets 
   * @generated
   * @return value of the feature 
   */
  public double getX() {
    if (Vec3_Type.featOkTst && ((Vec3_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vec3_Type)jcasType).casFeatCode_x);}
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(double v) {
    if (Vec3_Type.featOkTst && ((Vec3_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Vec3_Type)jcasType).casFeatCode_x, v);}    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public double getY() {
    if (Vec3_Type.featOkTst && ((Vec3_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vec3_Type)jcasType).casFeatCode_y);}
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(double v) {
    if (Vec3_Type.featOkTst && ((Vec3_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Vec3_Type)jcasType).casFeatCode_y, v);}    
   
    
  //*--------------*
  //* Feature: z

  /** getter for z - gets 
   * @generated
   * @return value of the feature 
   */
  public double getZ() {
    if (Vec3_Type.featOkTst && ((Vec3_Type)jcasType).casFeat_z == null)
      jcasType.jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vec3_Type)jcasType).casFeatCode_z);}
    
  /** setter for z - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setZ(double v) {
    if (Vec3_Type.featOkTst && ((Vec3_Type)jcasType).casFeat_z == null)
      jcasType.jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Vec3_Type)jcasType).casFeatCode_z, v);}    
  }

    