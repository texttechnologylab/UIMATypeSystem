

/* First created by JCasGen Tue Jan 12 18:59:27 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.semantics.type.WordSense;


/** 
 * Updated by JCasGen Tue Jan 12 18:59:27 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SemanticSource extends WordSense {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticSource.class);
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
  protected SemanticSource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticSource(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticSource(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticSource(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (SemanticSource_Type.featOkTst && ((SemanticSource_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.SemanticSource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticSource_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (SemanticSource_Type.featOkTst && ((SemanticSource_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.SemanticSource");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticSource_Type)jcasType).casFeatCode_source, v);}    
  }

    