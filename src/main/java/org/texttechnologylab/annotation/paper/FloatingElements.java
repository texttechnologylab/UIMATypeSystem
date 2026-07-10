

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.paper;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FloatingElements extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FloatingElements.class);
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
  protected FloatingElements() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FloatingElements(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FloatingElements(JCas jcas) {
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
  //* Feature: caption

  /** getter for caption - gets 
   * @generated
   * @return value of the feature 
   */
  public Caption getCaption() {
    if (FloatingElements_Type.featOkTst && ((FloatingElements_Type)jcasType).casFeat_caption == null)
      jcasType.jcas.throwFeatMissing("caption", "org.texttechnologylab.annotation.paper.FloatingElements");
    return (Caption)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FloatingElements_Type)jcasType).casFeatCode_caption)));}
    
  /** setter for caption - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCaption(Caption v) {
    if (FloatingElements_Type.featOkTst && ((FloatingElements_Type)jcasType).casFeat_caption == null)
      jcasType.jcas.throwFeatMissing("caption", "org.texttechnologylab.annotation.paper.FloatingElements");
    jcasType.ll_cas.ll_setRefValue(addr, ((FloatingElements_Type)jcasType).casFeatCode_caption, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    