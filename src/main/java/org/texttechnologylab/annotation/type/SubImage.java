

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SubImage extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SubImage.class);
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
  protected SubImage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SubImage(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SubImage(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SubImage(JCas jcas, int begin, int end) {
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
  //* Feature: coordinates

  /** getter for coordinates - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getCoordinates() {
    if (SubImage_Type.featOkTst && ((SubImage_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_coordinates)));}
    
  /** setter for coordinates - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCoordinates(FSArray v) {
    if (SubImage_Type.featOkTst && ((SubImage_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
    jcasType.ll_cas.ll_setRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_coordinates, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for coordinates - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Coordinate getCoordinates(int i) {
    if (SubImage_Type.featOkTst && ((SubImage_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_coordinates), i);
    return (Coordinate)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_coordinates), i)));}

  /** indexed setter for coordinates - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCoordinates(int i, Coordinate v) { 
    if (SubImage_Type.featOkTst && ((SubImage_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "org.texttechnologylab.annotation.type.SubImage");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_coordinates), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_coordinates), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: parent

  /** getter for parent - gets 
   * @generated
   * @return value of the feature 
   */
  public Image getParent() {
    if (SubImage_Type.featOkTst && ((SubImage_Type)jcasType).casFeat_parent == null)
      jcasType.jcas.throwFeatMissing("parent", "org.texttechnologylab.annotation.type.SubImage");
    return (Image)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_parent)));}
    
  /** setter for parent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParent(Image v) {
    if (SubImage_Type.featOkTst && ((SubImage_Type)jcasType).casFeat_parent == null)
      jcasType.jcas.throwFeatMissing("parent", "org.texttechnologylab.annotation.type.SubImage");
    jcasType.ll_cas.ll_setRefValue(addr, ((SubImage_Type)jcasType).casFeatCode_parent, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    