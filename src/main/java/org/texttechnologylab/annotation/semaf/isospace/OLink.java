

/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Thu Apr 23 09:56:12 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class OLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OLink.class);
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
  protected OLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OLink(JCas jcas) {
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
  //* Feature: projective

  /** getter for projective - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getProjective() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_projective == null)
      jcasType.jcas.throwFeatMissing("projective", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((OLink_Type)jcasType).casFeatCode_projective);}
    
  /** setter for projective - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProjective(boolean v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_projective == null)
      jcasType.jcas.throwFeatMissing("projective", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((OLink_Type)jcasType).casFeatCode_projective, v);}    
   
    
  //*--------------*
  //* Feature: frame_type

  /** getter for frame_type - gets ( ABSOLUTE | INTRINSIC | RELATIVE )
   * @generated
   * @return value of the feature 
   */
  public String getFrame_type() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_frame_type == null)
      jcasType.jcas.throwFeatMissing("frame_type", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OLink_Type)jcasType).casFeatCode_frame_type);}
    
  /** setter for frame_type - sets ( ABSOLUTE | INTRINSIC | RELATIVE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrame_type(String v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_frame_type == null)
      jcasType.jcas.throwFeatMissing("frame_type", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((OLink_Type)jcasType).casFeatCode_frame_type, v);}    
   
    
  //*--------------*
  //* Feature: reference_pt

  /** getter for reference_pt - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getReference_pt() {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_reference_pt == null)
      jcasType.jcas.throwFeatMissing("reference_pt", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((OLink_Type)jcasType).casFeatCode_reference_pt)));}
    
  /** setter for reference_pt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference_pt(Entity v) {
    if (OLink_Type.featOkTst && ((OLink_Type)jcasType).casFeat_reference_pt == null)
      jcasType.jcas.throwFeatMissing("reference_pt", "org.texttechnologylab.annotation.semaf.isospace.OLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((OLink_Type)jcasType).casFeatCode_reference_pt, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    