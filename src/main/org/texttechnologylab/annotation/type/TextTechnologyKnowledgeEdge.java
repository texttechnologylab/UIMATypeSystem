

/* First created by JCasGen Wed Dec 02 17:55:43 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Dec 02 17:55:43 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyKnowledgeEdge.xml
 * @generated */
public class TextTechnologyKnowledgeEdge extends Edge {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextTechnologyKnowledgeEdge.class);
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
  protected TextTechnologyKnowledgeEdge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TextTechnologyKnowledgeEdge(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextTechnologyKnowledgeEdge(JCas jcas) {
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
  //* Feature: linktype

  /** getter for linktype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLinktype() {
    if (TextTechnologyKnowledgeEdge_Type.featOkTst && ((TextTechnologyKnowledgeEdge_Type)jcasType).casFeat_linktype == null)
      jcasType.jcas.throwFeatMissing("linktype", "org.texttechnologylab.annotation.type.TextTechnologyKnowledgeEdge");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyKnowledgeEdge_Type)jcasType).casFeatCode_linktype);}
    
  /** setter for linktype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinktype(String v) {
    if (TextTechnologyKnowledgeEdge_Type.featOkTst && ((TextTechnologyKnowledgeEdge_Type)jcasType).casFeat_linktype == null)
      jcasType.jcas.throwFeatMissing("linktype", "org.texttechnologylab.annotation.type.TextTechnologyKnowledgeEdge");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyKnowledgeEdge_Type)jcasType).casFeatCode_linktype, v);}    
  }

    