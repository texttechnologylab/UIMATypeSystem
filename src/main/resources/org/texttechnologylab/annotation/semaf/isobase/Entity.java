

/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Apr 07 19:23:38 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoBaseTypeSystem.xml
 * @generated */
public class Entity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entity.class);
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
  protected Entity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Entity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Entity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Entity(JCas jcas, int begin, int end) {
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
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_comment, v);}    
   
    
  //*--------------*
  //* Feature: mod

  /** getter for mod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMod() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_mod == null)
      jcasType.jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_mod);}
    
  /** setter for mod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMod(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_mod == null)
      jcasType.jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_mod, v);}    
  }

    