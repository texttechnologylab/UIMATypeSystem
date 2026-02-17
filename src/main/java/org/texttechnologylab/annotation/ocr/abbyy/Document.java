

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Document metadata.
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Document extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Document {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Document.class);
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
  protected Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Document(JCas jcas, int begin, int end) {
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
  //* Feature: documentName

  /** getter for documentName - gets The name of this document in the XML files.
   * @generated
   * @return value of the feature 
   */
  public String getDocumentName() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_documentName == null)
      jcasType.jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Document_Type)jcasType).casFeatCode_documentName);}
    
  /** setter for documentName - sets The name of this document in the XML files. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentName(String v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_documentName == null)
      jcasType.jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Document_Type)jcasType).casFeatCode_documentName, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets The version of the source XML files.
   * @generated
   * @return value of the feature 
   */
  public String getVersion() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Document_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets The version of the source XML files. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Document_Type)jcasType).casFeatCode_version, v);}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets The producer of the source XML files.
   * @generated
   * @return value of the feature 
   */
  public String getProducer() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Document_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets The producer of the source XML files. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProducer(String v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Document_Type)jcasType).casFeatCode_producer, v);}    
   
    
  //*--------------*
  //* Feature: pagesCount

  /** getter for pagesCount - gets The number of pages in this document (optional).
   * @generated
   * @return value of the feature 
   */
  public int getPagesCount() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_pagesCount == null)
      jcasType.jcas.throwFeatMissing("pagesCount", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Document_Type)jcasType).casFeatCode_pagesCount);}
    
  /** setter for pagesCount - sets The number of pages in this document (optional). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPagesCount(int v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_pagesCount == null)
      jcasType.jcas.throwFeatMissing("pagesCount", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    jcasType.ll_cas.ll_setIntValue(addr, ((Document_Type)jcasType).casFeatCode_pagesCount, v);}    
   
    
  //*--------------*
  //* Feature: mainLanguage

  /** getter for mainLanguage - gets The main language of this document.
   * @generated
   * @return value of the feature 
   */
  public String getMainLanguage() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_mainLanguage == null)
      jcasType.jcas.throwFeatMissing("mainLanguage", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Document_Type)jcasType).casFeatCode_mainLanguage);}
    
  /** setter for mainLanguage - sets The main language of this document. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMainLanguage(String v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_mainLanguage == null)
      jcasType.jcas.throwFeatMissing("mainLanguage", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Document_Type)jcasType).casFeatCode_mainLanguage, v);}    
   
    
  //*--------------*
  //* Feature: languages

  /** getter for languages - gets All languages used in this document (optional).
   * @generated
   * @return value of the feature 
   */
  public String getLanguages() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_languages == null)
      jcasType.jcas.throwFeatMissing("languages", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Document_Type)jcasType).casFeatCode_languages);}
    
  /** setter for languages - sets All languages used in this document (optional). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguages(String v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_languages == null)
      jcasType.jcas.throwFeatMissing("languages", "org.texttechnologylab.annotation.ocr.abbyy.Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Document_Type)jcasType).casFeatCode_languages, v);}    
  }

    