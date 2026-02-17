

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Coordinate extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Coordinate.class);
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
  protected Coordinate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Coordinate(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Coordinate(JCas jcas) {
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
  public int getX() {
    if (Coordinate_Type.featOkTst && ((Coordinate_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.Coordinate");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Coordinate_Type)jcasType).casFeatCode_x);}
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(int v) {
    if (Coordinate_Type.featOkTst && ((Coordinate_Type)jcasType).casFeat_x == null)
      jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.Coordinate");
    jcasType.ll_cas.ll_setIntValue(addr, ((Coordinate_Type)jcasType).casFeatCode_x, v);}    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public int getY() {
    if (Coordinate_Type.featOkTst && ((Coordinate_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.Coordinate");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Coordinate_Type)jcasType).casFeatCode_y);}
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(int v) {
    if (Coordinate_Type.featOkTst && ((Coordinate_Type)jcasType).casFeat_y == null)
      jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.Coordinate");
    jcasType.ll_cas.ll_setIntValue(addr, ((Coordinate_Type)jcasType).casFeatCode_y, v);}    
  }

    