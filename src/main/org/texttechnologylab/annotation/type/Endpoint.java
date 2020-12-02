

/* First created by JCasGen Wed Dec 02 17:55:07 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Dec 02 18:28:43 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 * @generated */
public class Endpoint extends GraphBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Endpoint.class);
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
  protected Endpoint() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Endpoint(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Endpoint(JCas jcas) {
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
  //* Feature: node

  /** getter for node - gets 
   * @generated
   * @return value of the feature 
   */
  public Node getNode() {
    if (Endpoint_Type.featOkTst && ((Endpoint_Type)jcasType).casFeat_node == null)
      jcasType.jcas.throwFeatMissing("node", "org.texttechnologylab.annotation.type.Endpoint");
    return (Node)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Endpoint_Type)jcasType).casFeatCode_node)));}
    
  /** setter for node - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNode(Node v) {
    if (Endpoint_Type.featOkTst && ((Endpoint_Type)jcasType).casFeat_node == null)
      jcasType.jcas.throwFeatMissing("node", "org.texttechnologylab.annotation.type.Endpoint");
    jcasType.ll_cas.ll_setRefValue(addr, ((Endpoint_Type)jcasType).casFeatCode_node, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    