

/* First created by JCasGen Fri Jun 17 16:34:14 CEST 2022 */
package de.tudarmstadt.ukp.dkpro.core.api.semantics.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The SemanticField is a coarse-grained semantic category that can be attached to
nouns, verbs or adjectives. Semantic field information is present e.g. in WordNet as
lexicographer file names. Previously, this kind of semantic information has also
been called supersenses or semantic types.
 * Updated by JCasGen Fri Jan 20 19:11:52 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SemanticField extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticField.class);
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
  protected SemanticField() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticField(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticField(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticField(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets The value or name of the semantic field. Examples of semantic field values are: location, artifact, event, communication, attribute
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (SemanticField_Type.featOkTst && ((SemanticField_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemanticField");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticField_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets The value or name of the semantic field. Examples of semantic field values are: location, artifact, event, communication, attribute 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (SemanticField_Type.featOkTst && ((SemanticField_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemanticField");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticField_Type)jcasType).casFeatCode_value, v);}    
  }

    