

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** Annotation type for matching taxon information to a taxonomic database.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TaxonResolution extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TaxonResolution.class);
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
  protected TaxonResolution() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TaxonResolution(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TaxonResolution(JCas jcas) {
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
  //* Feature: recognizedTaxon

  /** getter for recognizedTaxon - gets Reference to the taxon in the document that was recognized.
   * @generated
   * @return value of the feature 
   */
  public RecognizedTaxon getRecognizedTaxon() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_recognizedTaxon == null)
      jcasType.jcas.throwFeatMissing("recognizedTaxon", "org.texttechnologylab.annotation.type.TaxonResolution");
    return (RecognizedTaxon)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_recognizedTaxon)));}
    
  /** setter for recognizedTaxon - sets Reference to the taxon in the document that was recognized. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecognizedTaxon(RecognizedTaxon v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_recognizedTaxon == null)
      jcasType.jcas.throwFeatMissing("recognizedTaxon", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setRefValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_recognizedTaxon, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: provider

  /** getter for provider - gets The provider of the taxon resolution information.
   * @generated
   * @return value of the feature 
   */
  public String getProvider() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_provider == null)
      jcasType.jcas.throwFeatMissing("provider", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_provider);}
    
  /** setter for provider - sets The provider of the taxon resolution information. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProvider(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_provider == null)
      jcasType.jcas.throwFeatMissing("provider", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_provider, v);}    
   
    
  //*--------------*
  //* Feature: taxonId

  /** getter for taxonId - gets The identifier of the taxon in the taxonomic database.
   * @generated
   * @return value of the feature 
   */
  public int getTaxonId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_taxonId == null)
      jcasType.jcas.throwFeatMissing("taxonId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_taxonId);}
    
  /** setter for taxonId - sets The identifier of the taxon in the taxonomic database. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaxonId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_taxonId == null)
      jcasType.jcas.throwFeatMissing("taxonId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_taxonId, v);}    
   
    
  //*--------------*
  //* Feature: kingdomName

  /** getter for kingdomName - gets The name of the kingdom to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getKingdomName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_kingdomName == null)
      jcasType.jcas.throwFeatMissing("kingdomName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_kingdomName);}
    
  /** setter for kingdomName - sets The name of the kingdom to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKingdomName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_kingdomName == null)
      jcasType.jcas.throwFeatMissing("kingdomName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_kingdomName, v);}    
   
    
  //*--------------*
  //* Feature: kingdomId

  /** getter for kingdomId - gets The identifier of the kingdom to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getKingdomId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_kingdomId == null)
      jcasType.jcas.throwFeatMissing("kingdomId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_kingdomId);}
    
  /** setter for kingdomId - sets The identifier of the kingdom to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKingdomId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_kingdomId == null)
      jcasType.jcas.throwFeatMissing("kingdomId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_kingdomId, v);}    
   
    
  //*--------------*
  //* Feature: phylumName

  /** getter for phylumName - gets The name of the phylum to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getPhylumName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_phylumName == null)
      jcasType.jcas.throwFeatMissing("phylumName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_phylumName);}
    
  /** setter for phylumName - sets The name of the phylum to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhylumName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_phylumName == null)
      jcasType.jcas.throwFeatMissing("phylumName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_phylumName, v);}    
   
    
  //*--------------*
  //* Feature: phylumId

  /** getter for phylumId - gets The identifier of the phylum to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getPhylumId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_phylumId == null)
      jcasType.jcas.throwFeatMissing("phylumId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_phylumId);}
    
  /** setter for phylumId - sets The identifier of the phylum to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhylumId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_phylumId == null)
      jcasType.jcas.throwFeatMissing("phylumId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_phylumId, v);}    
   
    
  //*--------------*
  //* Feature: className

  /** getter for className - gets The name of the class to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getClassName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_className == null)
      jcasType.jcas.throwFeatMissing("className", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_className);}
    
  /** setter for className - sets The name of the class to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_className == null)
      jcasType.jcas.throwFeatMissing("className", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_className, v);}    
   
    
  //*--------------*
  //* Feature: classId

  /** getter for classId - gets The identifier of the class to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getClassId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_classId == null)
      jcasType.jcas.throwFeatMissing("classId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_classId);}
    
  /** setter for classId - sets The identifier of the class to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_classId == null)
      jcasType.jcas.throwFeatMissing("classId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_classId, v);}    
   
    
  //*--------------*
  //* Feature: orderName

  /** getter for orderName - gets The name of the order to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getOrderName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_orderName == null)
      jcasType.jcas.throwFeatMissing("orderName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_orderName);}
    
  /** setter for orderName - sets The name of the order to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrderName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_orderName == null)
      jcasType.jcas.throwFeatMissing("orderName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_orderName, v);}    
   
    
  //*--------------*
  //* Feature: orderId

  /** getter for orderId - gets The identifier of the order to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getOrderId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_orderId == null)
      jcasType.jcas.throwFeatMissing("orderId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_orderId);}
    
  /** setter for orderId - sets The identifier of the order to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrderId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_orderId == null)
      jcasType.jcas.throwFeatMissing("orderId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_orderId, v);}    
   
    
  //*--------------*
  //* Feature: superfamilyName

  /** getter for superfamilyName - gets The name of the superfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSuperfamilyName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_superfamilyName == null)
      jcasType.jcas.throwFeatMissing("superfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_superfamilyName);}
    
  /** setter for superfamilyName - sets The name of the superfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuperfamilyName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_superfamilyName == null)
      jcasType.jcas.throwFeatMissing("superfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_superfamilyName, v);}    
   
    
  //*--------------*
  //* Feature: superfamilyId

  /** getter for superfamilyId - gets The identifier of the superfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSuperfamilyId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_superfamilyId == null)
      jcasType.jcas.throwFeatMissing("superfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_superfamilyId);}
    
  /** setter for superfamilyId - sets The identifier of the superfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuperfamilyId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_superfamilyId == null)
      jcasType.jcas.throwFeatMissing("superfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_superfamilyId, v);}    
   
    
  //*--------------*
  //* Feature: familyName

  /** getter for familyName - gets The name of the family to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getFamilyName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_familyName == null)
      jcasType.jcas.throwFeatMissing("familyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_familyName);}
    
  /** setter for familyName - sets The name of the family to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFamilyName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_familyName == null)
      jcasType.jcas.throwFeatMissing("familyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_familyName, v);}    
   
    
  //*--------------*
  //* Feature: familyId

  /** getter for familyId - gets The identifier of the family to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getFamilyId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_familyId == null)
      jcasType.jcas.throwFeatMissing("familyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_familyId);}
    
  /** setter for familyId - sets The identifier of the family to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFamilyId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_familyId == null)
      jcasType.jcas.throwFeatMissing("familyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_familyId, v);}    
   
    
  //*--------------*
  //* Feature: subfamilyName

  /** getter for subfamilyName - gets The name of the subfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSubfamilyName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subfamilyName == null)
      jcasType.jcas.throwFeatMissing("subfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subfamilyName);}
    
  /** setter for subfamilyName - sets The name of the subfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubfamilyName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subfamilyName == null)
      jcasType.jcas.throwFeatMissing("subfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subfamilyName, v);}    
   
    
  //*--------------*
  //* Feature: subfamilyId

  /** getter for subfamilyId - gets The identifier of the subfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSubfamilyId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subfamilyId == null)
      jcasType.jcas.throwFeatMissing("subfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subfamilyId);}
    
  /** setter for subfamilyId - sets The identifier of the subfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubfamilyId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subfamilyId == null)
      jcasType.jcas.throwFeatMissing("subfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subfamilyId, v);}    
   
    
  //*--------------*
  //* Feature: tribeName

  /** getter for tribeName - gets The name of the tribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getTribeName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_tribeName == null)
      jcasType.jcas.throwFeatMissing("tribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_tribeName);}
    
  /** setter for tribeName - sets The name of the tribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTribeName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_tribeName == null)
      jcasType.jcas.throwFeatMissing("tribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_tribeName, v);}    
   
    
  //*--------------*
  //* Feature: tribeId

  /** getter for tribeId - gets The identifier of the tribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getTribeId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_tribeId == null)
      jcasType.jcas.throwFeatMissing("tribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_tribeId);}
    
  /** setter for tribeId - sets The identifier of the tribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTribeId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_tribeId == null)
      jcasType.jcas.throwFeatMissing("tribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_tribeId, v);}    
   
    
  //*--------------*
  //* Feature: subtribeName

  /** getter for subtribeName - gets The name of the subtribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSubtribeName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subtribeName == null)
      jcasType.jcas.throwFeatMissing("subtribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subtribeName);}
    
  /** setter for subtribeName - sets The name of the subtribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtribeName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subtribeName == null)
      jcasType.jcas.throwFeatMissing("subtribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subtribeName, v);}    
   
    
  //*--------------*
  //* Feature: subtribeId

  /** getter for subtribeId - gets The identifier of the subtribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSubtribeId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subtribeId == null)
      jcasType.jcas.throwFeatMissing("subtribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subtribeId);}
    
  /** setter for subtribeId - sets The identifier of the subtribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtribeId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subtribeId == null)
      jcasType.jcas.throwFeatMissing("subtribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subtribeId, v);}    
   
    
  //*--------------*
  //* Feature: genusName

  /** getter for genusName - gets The name of the genus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getGenusName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_genusName == null)
      jcasType.jcas.throwFeatMissing("genusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_genusName);}
    
  /** setter for genusName - sets The name of the genus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGenusName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_genusName == null)
      jcasType.jcas.throwFeatMissing("genusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_genusName, v);}    
   
    
  //*--------------*
  //* Feature: genusId

  /** getter for genusId - gets The identifier of the genus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getGenusId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_genusId == null)
      jcasType.jcas.throwFeatMissing("genusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_genusId);}
    
  /** setter for genusId - sets The identifier of the genus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGenusId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_genusId == null)
      jcasType.jcas.throwFeatMissing("genusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_genusId, v);}    
   
    
  //*--------------*
  //* Feature: subgenusName

  /** getter for subgenusName - gets The name of the subgenus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSubgenusName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subgenusName == null)
      jcasType.jcas.throwFeatMissing("subgenusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subgenusName);}
    
  /** setter for subgenusName - sets The name of the subgenus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubgenusName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subgenusName == null)
      jcasType.jcas.throwFeatMissing("subgenusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subgenusName, v);}    
   
    
  //*--------------*
  //* Feature: subgenusId

  /** getter for subgenusId - gets The identifier of the subgenus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSubgenusId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subgenusId == null)
      jcasType.jcas.throwFeatMissing("subgenusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subgenusId);}
    
  /** setter for subgenusId - sets The identifier of the subgenus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubgenusId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_subgenusId == null)
      jcasType.jcas.throwFeatMissing("subgenusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_subgenusId, v);}    
   
    
  //*--------------*
  //* Feature: speciesName

  /** getter for speciesName - gets The name of the species to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSpeciesName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_speciesName == null)
      jcasType.jcas.throwFeatMissing("speciesName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_speciesName);}
    
  /** setter for speciesName - sets The name of the species to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeciesName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_speciesName == null)
      jcasType.jcas.throwFeatMissing("speciesName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_speciesName, v);}    
   
    
  //*--------------*
  //* Feature: speciesId

  /** getter for speciesId - gets The identifier of the species to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSpeciesId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_speciesId == null)
      jcasType.jcas.throwFeatMissing("speciesId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_speciesId);}
    
  /** setter for speciesId - sets The identifier of the species to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeciesId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_speciesId == null)
      jcasType.jcas.throwFeatMissing("speciesId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_speciesId, v);}    
   
    
  //*--------------*
  //* Feature: parentName

  /** getter for parentName - gets The name of the parent taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getParentName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_parentName == null)
      jcasType.jcas.throwFeatMissing("parentName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_parentName);}
    
  /** setter for parentName - sets The name of the parent taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_parentName == null)
      jcasType.jcas.throwFeatMissing("parentName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_parentName, v);}    
   
    
  //*--------------*
  //* Feature: parentId

  /** getter for parentId - gets The identifier of the parent taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public int getParentId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_parentId == null)
      jcasType.jcas.throwFeatMissing("parentId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_parentId);}
    
  /** setter for parentId - sets The identifier of the parent taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentId(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_parentId == null)
      jcasType.jcas.throwFeatMissing("parentId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_parentId, v);}    
   
    
  //*--------------*
  //* Feature: scientificName

  /** getter for scientificName - gets The scientific name of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getScientificName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_scientificName == null)
      jcasType.jcas.throwFeatMissing("scientificName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_scientificName);}
    
  /** setter for scientificName - sets The scientific name of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScientificName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_scientificName == null)
      jcasType.jcas.throwFeatMissing("scientificName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_scientificName, v);}    
   
    
  //*--------------*
  //* Feature: canonicalName

  /** getter for canonicalName - gets The canonical name of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getCanonicalName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_canonicalName == null)
      jcasType.jcas.throwFeatMissing("canonicalName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_canonicalName);}
    
  /** setter for canonicalName - sets The canonical name of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCanonicalName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_canonicalName == null)
      jcasType.jcas.throwFeatMissing("canonicalName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_canonicalName, v);}    
   
    
  //*--------------*
  //* Feature: vernacularName

  /** getter for vernacularName - gets The vernacular name of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getVernacularName() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_vernacularName == null)
      jcasType.jcas.throwFeatMissing("vernacularName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_vernacularName);}
    
  /** setter for vernacularName - sets The vernacular name of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVernacularName(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_vernacularName == null)
      jcasType.jcas.throwFeatMissing("vernacularName", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_vernacularName, v);}    
   
    
  //*--------------*
  //* Feature: acceptedNameUsage

  /** getter for acceptedNameUsage - gets The accepted name usage of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getAcceptedNameUsage() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_acceptedNameUsage == null)
      jcasType.jcas.throwFeatMissing("acceptedNameUsage", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_acceptedNameUsage);}
    
  /** setter for acceptedNameUsage - sets The accepted name usage of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAcceptedNameUsage(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_acceptedNameUsage == null)
      jcasType.jcas.throwFeatMissing("acceptedNameUsage", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_acceptedNameUsage, v);}    
   
    
  //*--------------*
  //* Feature: authorship

  /** getter for authorship - gets The authorship information for the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getAuthorship() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_authorship == null)
      jcasType.jcas.throwFeatMissing("authorship", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_authorship);}
    
  /** setter for authorship - sets The authorship information for the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthorship(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_authorship == null)
      jcasType.jcas.throwFeatMissing("authorship", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_authorship, v);}    
   
    
  //*--------------*
  //* Feature: nameType

  /** getter for nameType - gets The type of the taxon name, if available.
   * @generated
   * @return value of the feature 
   */
  public String getNameType() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_nameType == null)
      jcasType.jcas.throwFeatMissing("nameType", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_nameType);}
    
  /** setter for nameType - sets The type of the taxon name, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNameType(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_nameType == null)
      jcasType.jcas.throwFeatMissing("nameType", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_nameType, v);}    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets The taxonomic rank of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getRank() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_rank);}
    
  /** setter for rank - sets The taxonomic rank of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRank(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_rank, v);}    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets The origin of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_origin);}
    
  /** setter for origin - sets The origin of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_origin, v);}    
   
    
  //*--------------*
  //* Feature: taxonomicStatus

  /** getter for taxonomicStatus - gets The taxonomic status of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getTaxonomicStatus() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_taxonomicStatus == null)
      jcasType.jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_taxonomicStatus);}
    
  /** setter for taxonomicStatus - sets The taxonomic status of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaxonomicStatus(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_taxonomicStatus == null)
      jcasType.jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_taxonomicStatus, v);}    
   
    
  //*--------------*
  //* Feature: remarks

  /** getter for remarks - gets Any additional remarks about the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getRemarks() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_remarks == null)
      jcasType.jcas.throwFeatMissing("remarks", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_remarks);}
    
  /** setter for remarks - sets Any additional remarks about the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRemarks(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_remarks == null)
      jcasType.jcas.throwFeatMissing("remarks", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_remarks, v);}    
   
    
  //*--------------*
  //* Feature: references

  /** getter for references - gets References for the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getReferences() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_references == null)
      jcasType.jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_references);}
    
  /** setter for references - sets References for the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferences(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_references == null)
      jcasType.jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_references, v);}    
   
    
  //*--------------*
  //* Feature: publishedIn

  /** getter for publishedIn - gets The publication in which the taxon was published, if available.
   * @generated
   * @return value of the feature 
   */
  public String getPublishedIn() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_publishedIn == null)
      jcasType.jcas.throwFeatMissing("publishedIn", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_publishedIn);}
    
  /** setter for publishedIn - sets The publication in which the taxon was published, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPublishedIn(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_publishedIn == null)
      jcasType.jcas.throwFeatMissing("publishedIn", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_publishedIn, v);}    
   
    
  //*--------------*
  //* Feature: numDescendants

  /** getter for numDescendants - gets The number of descendant taxa, if available.
   * @generated
   * @return value of the feature 
   */
  public int getNumDescendants() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_numDescendants == null)
      jcasType.jcas.throwFeatMissing("numDescendants", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_numDescendants);}
    
  /** setter for numDescendants - sets The number of descendant taxa, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumDescendants(int v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_numDescendants == null)
      jcasType.jcas.throwFeatMissing("numDescendants", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setIntValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_numDescendants, v);}    
   
    
  //*--------------*
  //* Feature: lastCrawled

  /** getter for lastCrawled - gets The date and time when the taxon was last crawled, if available.
   * @generated
   * @return value of the feature 
   */
  public String getLastCrawled() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_lastCrawled == null)
      jcasType.jcas.throwFeatMissing("lastCrawled", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_lastCrawled);}
    
  /** setter for lastCrawled - sets The date and time when the taxon was last crawled, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastCrawled(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_lastCrawled == null)
      jcasType.jcas.throwFeatMissing("lastCrawled", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_lastCrawled, v);}    
   
    
  //*--------------*
  //* Feature: lastInterpreted

  /** getter for lastInterpreted - gets The date and time when the taxon was last interpreted, if available.
   * @generated
   * @return value of the feature 
   */
  public String getLastInterpreted() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_lastInterpreted == null)
      jcasType.jcas.throwFeatMissing("lastInterpreted", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_lastInterpreted);}
    
  /** setter for lastInterpreted - sets The date and time when the taxon was last interpreted, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastInterpreted(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_lastInterpreted == null)
      jcasType.jcas.throwFeatMissing("lastInterpreted", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_lastInterpreted, v);}    
   
    
  //*--------------*
  //* Feature: speciesEpithet

  /** getter for speciesEpithet - gets The species epithet of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSpeciesEpithet() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_speciesEpithet == null)
      jcasType.jcas.throwFeatMissing("speciesEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_speciesEpithet);}
    
  /** setter for speciesEpithet - sets The species epithet of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeciesEpithet(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_speciesEpithet == null)
      jcasType.jcas.throwFeatMissing("speciesEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_speciesEpithet, v);}    
   
    
  //*--------------*
  //* Feature: infraspecificEpithet

  /** getter for infraspecificEpithet - gets The infraspecific epithet of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getInfraspecificEpithet() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_infraspecificEpithet == null)
      jcasType.jcas.throwFeatMissing("infraspecificEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_infraspecificEpithet);}
    
  /** setter for infraspecificEpithet - sets The infraspecific epithet of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInfraspecificEpithet(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_infraspecificEpithet == null)
      jcasType.jcas.throwFeatMissing("infraspecificEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_infraspecificEpithet, v);}    
   
    
  //*--------------*
  //* Feature: cultivarEpithet

  /** getter for cultivarEpithet - gets The cultivar epithet of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getCultivarEpithet() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_cultivarEpithet == null)
      jcasType.jcas.throwFeatMissing("cultivarEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_cultivarEpithet);}
    
  /** setter for cultivarEpithet - sets The cultivar epithet of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCultivarEpithet(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_cultivarEpithet == null)
      jcasType.jcas.throwFeatMissing("cultivarEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_cultivarEpithet, v);}    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets A web URL associated with the taxon, provided by the taxonomic database, if available.
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets A web URL associated with the taxon, provided by the taxonomic database, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_url, v);}    
   
    
  //*--------------*
  //* Feature: wikidataId

  /** getter for wikidataId - gets The Wikidata ID of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getWikidataId() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_wikidataId == null)
      jcasType.jcas.throwFeatMissing("wikidataId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_wikidataId);}
    
  /** setter for wikidataId - sets The Wikidata ID of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikidataId(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_wikidataId == null)
      jcasType.jcas.throwFeatMissing("wikidataId", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_wikidataId, v);}    
   
    
  //*--------------*
  //* Feature: wikidataUrl

  /** getter for wikidataUrl - gets The URL of the Wikidata page for the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getWikidataUrl() {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_wikidataUrl == null)
      jcasType.jcas.throwFeatMissing("wikidataUrl", "org.texttechnologylab.annotation.type.TaxonResolution");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_wikidataUrl);}
    
  /** setter for wikidataUrl - sets The URL of the Wikidata page for the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikidataUrl(String v) {
    if (TaxonResolution_Type.featOkTst && ((TaxonResolution_Type)jcasType).casFeat_wikidataUrl == null)
      jcasType.jcas.throwFeatMissing("wikidataUrl", "org.texttechnologylab.annotation.type.TaxonResolution");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaxonResolution_Type)jcasType).casFeatCode_wikidataUrl, v);}    
  }

    