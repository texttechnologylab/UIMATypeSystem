

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WebImage extends Image {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WebImage.class);
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
  protected WebImage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public WebImage(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WebImage(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WebImage(JCas jcas, int begin, int end) {
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
  //* Feature: posX

  /** getter for posX - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPosX() {
    if (WebImage_Type.featOkTst && ((WebImage_Type)jcasType).casFeat_posX == null)
      jcasType.jcas.throwFeatMissing("posX", "org.texttechnologylab.annotation.type.WebImage");
    return jcasType.ll_cas.ll_getIntValue(addr, ((WebImage_Type)jcasType).casFeatCode_posX);}
    
  /** setter for posX - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosX(int v) {
    if (WebImage_Type.featOkTst && ((WebImage_Type)jcasType).casFeat_posX == null)
      jcasType.jcas.throwFeatMissing("posX", "org.texttechnologylab.annotation.type.WebImage");
    jcasType.ll_cas.ll_setIntValue(addr, ((WebImage_Type)jcasType).casFeatCode_posX, v);}    
   
    
  //*--------------*
  //* Feature: posY

  /** getter for posY - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPosY() {
    if (WebImage_Type.featOkTst && ((WebImage_Type)jcasType).casFeat_posY == null)
      jcasType.jcas.throwFeatMissing("posY", "org.texttechnologylab.annotation.type.WebImage");
    return jcasType.ll_cas.ll_getIntValue(addr, ((WebImage_Type)jcasType).casFeatCode_posY);}
    
  /** setter for posY - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosY(int v) {
    if (WebImage_Type.featOkTst && ((WebImage_Type)jcasType).casFeat_posY == null)
      jcasType.jcas.throwFeatMissing("posY", "org.texttechnologylab.annotation.type.WebImage");
    jcasType.ll_cas.ll_setIntValue(addr, ((WebImage_Type)jcasType).casFeatCode_posY, v);}    
  }

    