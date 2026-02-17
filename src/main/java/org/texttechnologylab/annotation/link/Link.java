

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base type for unidirectional links between entities
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Link extends Annotation {
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

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Link(JCas jcas, int begin, int end) {
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
  //* Feature: linkType

  /** getter for linkType - gets Type of the link
   * @generated
   * @return value of the feature 
   */
  public String getLinkType() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_linkType == null)
      jcasType.jcas.throwFeatMissing("linkType", "org.texttechnologylab.annotation.link.Link");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Link_Type)jcasType).casFeatCode_linkType);}
    
  /** setter for linkType - sets Type of the link 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinkType(String v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_linkType == null)
      jcasType.jcas.throwFeatMissing("linkType", "org.texttechnologylab.annotation.link.Link");
    jcasType.ll_cas.ll_setStringValue(addr, ((Link_Type)jcasType).casFeatCode_linkType, v);}    
   
    
  //*--------------*
  //* Feature: linkId

  /** getter for linkId - gets Id of a Link
   * @generated
   * @return value of the feature 
   */
  public long getLinkId() {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_linkId == null)
      jcasType.jcas.throwFeatMissing("linkId", "org.texttechnologylab.annotation.link.Link");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Link_Type)jcasType).casFeatCode_linkId);}
    
  /** setter for linkId - sets Id of a Link 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinkId(long v) {
    if (Link_Type.featOkTst && ((Link_Type)jcasType).casFeat_linkId == null)
      jcasType.jcas.throwFeatMissing("linkId", "org.texttechnologylab.annotation.link.Link");
    jcasType.ll_cas.ll_setLongValue(addr, ((Link_Type)jcasType).casFeatCode_linkId, v);}    
  }

    