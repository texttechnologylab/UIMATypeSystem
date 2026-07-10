

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Annotation type for recognized taxon mentions.
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RecognizedTaxon extends Taxon {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RecognizedTaxon.class);
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
  protected RecognizedTaxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RecognizedTaxon(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RecognizedTaxon(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RecognizedTaxon(JCas jcas, int begin, int end) {
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
  //* Feature: resolutions

  /** getter for resolutions - gets List of taxon resolutions associated with this recognized taxon.
   * @generated
   * @return value of the feature 
   */
  public FSArray getResolutions() {
    if (RecognizedTaxon_Type.featOkTst && ((RecognizedTaxon_Type)jcasType).casFeat_resolutions == null)
      jcasType.jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_resolutions)));}
    
  /** setter for resolutions - sets List of taxon resolutions associated with this recognized taxon. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResolutions(FSArray v) {
    if (RecognizedTaxon_Type.featOkTst && ((RecognizedTaxon_Type)jcasType).casFeat_resolutions == null)
      jcasType.jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    jcasType.ll_cas.ll_setRefValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_resolutions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for resolutions - gets an indexed value - List of taxon resolutions associated with this recognized taxon.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TaxonResolution getResolutions(int i) {
    if (RecognizedTaxon_Type.featOkTst && ((RecognizedTaxon_Type)jcasType).casFeat_resolutions == null)
      jcasType.jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_resolutions), i);
    return (TaxonResolution)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_resolutions), i)));}

  /** indexed setter for resolutions - sets an indexed value - List of taxon resolutions associated with this recognized taxon.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setResolutions(int i, TaxonResolution v) { 
    if (RecognizedTaxon_Type.featOkTst && ((RecognizedTaxon_Type)jcasType).casFeat_resolutions == null)
      jcasType.jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_resolutions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_resolutions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The text of the recognized taxon.
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (RecognizedTaxon_Type.featOkTst && ((RecognizedTaxon_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets The text of the recognized taxon. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (RecognizedTaxon_Type.featOkTst && ((RecognizedTaxon_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((RecognizedTaxon_Type)jcasType).casFeatCode_text, v);}    
  }

    