

/* First created by JCasGen Tue Mar 24 15:23:01 CET 2020 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed Apr 01 13:38:51 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class Link extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Link.class);
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
  protected Link() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Link(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Link(JCas jcas) {
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
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Link_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Link");
    jcasType.ll_cas.ll_setStringValue(addr, ((Link_Type)jcasType).casFeatCode_comment, v);}    
   
    
  //*--------------*
  //* Feature: figure

  /** getter for figure - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getFigure() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_figure == null)
      jcasType.jcas.throwFeatMissing("figure", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Link_Type)jcasType).casFeatCode_figure)));}
    
  /** setter for figure - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFigure(Entity v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_figure == null)
      jcasType.jcas.throwFeatMissing("figure", "org.texttechnologylab.annotation.semaf.isobase.Link");
    jcasType.ll_cas.ll_setRefValue(addr, ((Link_Type)jcasType).casFeatCode_figure, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ground

  /** getter for ground - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getGround() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_ground == null)
      jcasType.jcas.throwFeatMissing("ground", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Link_Type)jcasType).casFeatCode_ground)));}
    
  /** setter for ground - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGround(Entity v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_ground == null)
      jcasType.jcas.throwFeatMissing("ground", "org.texttechnologylab.annotation.semaf.isobase.Link");
    jcasType.ll_cas.ll_setRefValue(addr, ((Link_Type)jcasType).casFeatCode_ground, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: trigger

  /** getter for trigger - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getTrigger() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_trigger == null)
      jcasType.jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Link_Type)jcasType).casFeatCode_trigger)));}
    
  /** setter for trigger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrigger(Entity v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_trigger == null)
      jcasType.jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isobase.Link");
    jcasType.ll_cas.ll_setRefValue(addr, ((Link_Type)jcasType).casFeatCode_trigger, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rel_type

  /** getter for rel_type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRel_type() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_rel_type == null)
      jcasType.jcas.throwFeatMissing("rel_type", "org.texttechnologylab.annotation.semaf.isobase.Link");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Link_Type)jcasType).casFeatCode_rel_type);}
    
  /** setter for rel_type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRel_type(String v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_rel_type == null)
      jcasType.jcas.throwFeatMissing("rel_type", "org.texttechnologylab.annotation.semaf.isobase.Link");
    jcasType.ll_cas.ll_setStringValue(addr, ((Link_Type)jcasType).casFeatCode_rel_type, v);}    
  }

    