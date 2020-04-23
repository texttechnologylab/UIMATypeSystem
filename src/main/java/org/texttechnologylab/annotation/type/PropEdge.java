

/* First created by JCasGen Thu Apr 23 09:55:24 CEST 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Apr 23 09:55:24 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyPropAnno.xml
 * @generated */
public class PropEdge extends Edge {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PropEdge.class);
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
  protected PropEdge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PropEdge(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PropEdge(JCas jcas) {
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
  //* Feature: mode

  /** getter for mode - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMode() {
    if (PropEdge_Type.featOkTst && ((PropEdge_Type)jcasType).casFeat_mode == null)
      jcasType.jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.PropEdge");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropEdge_Type)jcasType).casFeatCode_mode);}
    
  /** setter for mode - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMode(String v) {
    if (PropEdge_Type.featOkTst && ((PropEdge_Type)jcasType).casFeat_mode == null)
      jcasType.jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.PropEdge");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropEdge_Type)jcasType).casFeatCode_mode, v);}    
   
    
  //*--------------*
  //* Feature: graphSource

  /** getter for graphSource - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGraphSource() {
    if (PropEdge_Type.featOkTst && ((PropEdge_Type)jcasType).casFeat_graphSource == null)
      jcasType.jcas.throwFeatMissing("graphSource", "org.texttechnologylab.annotation.type.PropEdge");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropEdge_Type)jcasType).casFeatCode_graphSource);}
    
  /** setter for graphSource - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGraphSource(String v) {
    if (PropEdge_Type.featOkTst && ((PropEdge_Type)jcasType).casFeat_graphSource == null)
      jcasType.jcas.throwFeatMissing("graphSource", "org.texttechnologylab.annotation.type.PropEdge");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropEdge_Type)jcasType).casFeatCode_graphSource, v);}    
   
    
  //*--------------*
  //* Feature: graphTarget

  /** getter for graphTarget - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGraphTarget() {
    if (PropEdge_Type.featOkTst && ((PropEdge_Type)jcasType).casFeat_graphTarget == null)
      jcasType.jcas.throwFeatMissing("graphTarget", "org.texttechnologylab.annotation.type.PropEdge");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PropEdge_Type)jcasType).casFeatCode_graphTarget);}
    
  /** setter for graphTarget - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGraphTarget(String v) {
    if (PropEdge_Type.featOkTst && ((PropEdge_Type)jcasType).casFeat_graphTarget == null)
      jcasType.jcas.throwFeatMissing("graphTarget", "org.texttechnologylab.annotation.type.PropEdge");
    jcasType.ll_cas.ll_setStringValue(addr, ((PropEdge_Type)jcasType).casFeatCode_graphTarget, v);}    
  }

    