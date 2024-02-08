

/* First created by JCasGen Wed Jan 31 15:16:49 CET 2024 */
package org.texttechnologylab.type.id;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Jan 31 15:16:49 CET 2024
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyUrl.xml
 * @generated */
public class URI extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(URI.class);
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
  protected URI() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public URI(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public URI(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public URI(JCas jcas, int begin, int end) {
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
  //* Feature: scheme

  /** getter for scheme - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScheme() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_scheme == null)
      jcasType.jcas.throwFeatMissing("scheme", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_scheme);}
    
  /** setter for scheme - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScheme(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_scheme == null)
      jcasType.jcas.throwFeatMissing("scheme", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_scheme, v);}    
   
    
  //*--------------*
  //* Feature: user

  /** getter for user - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUser() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_user);}
    
  /** setter for user - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_user, v);}    
   
    
  //*--------------*
  //* Feature: password

  /** getter for password - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPassword() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_password == null)
      jcasType.jcas.throwFeatMissing("password", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_password);}
    
  /** setter for password - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassword(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_password == null)
      jcasType.jcas.throwFeatMissing("password", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_password, v);}    
   
    
  //*--------------*
  //* Feature: host

  /** getter for host - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHost() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_host == null)
      jcasType.jcas.throwFeatMissing("host", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_host);}
    
  /** setter for host - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHost(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_host == null)
      jcasType.jcas.throwFeatMissing("host", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_host, v);}    
   
    
  //*--------------*
  //* Feature: port

  /** getter for port - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPort() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_port == null)
      jcasType.jcas.throwFeatMissing("port", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getIntValue(addr, ((URI_Type)jcasType).casFeatCode_port);}
    
  /** setter for port - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPort(int v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_port == null)
      jcasType.jcas.throwFeatMissing("port", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setIntValue(addr, ((URI_Type)jcasType).casFeatCode_port, v);}    
   
    
  //*--------------*
  //* Feature: path

  /** getter for path - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPath() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_path == null)
      jcasType.jcas.throwFeatMissing("path", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_path);}
    
  /** setter for path - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPath(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_path == null)
      jcasType.jcas.throwFeatMissing("path", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_path, v);}    
   
    
  //*--------------*
  //* Feature: query

  /** getter for query - gets 
   * @generated
   * @return value of the feature 
   */
  public String getQuery() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_query == null)
      jcasType.jcas.throwFeatMissing("query", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_query);}
    
  /** setter for query - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuery(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_query == null)
      jcasType.jcas.throwFeatMissing("query", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_query, v);}    
   
    
  //*--------------*
  //* Feature: fragment

  /** getter for fragment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFragment() {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_fragment == null)
      jcasType.jcas.throwFeatMissing("fragment", "org.texttechnologylab.type.id.URI");
    return jcasType.ll_cas.ll_getStringValue(addr, ((URI_Type)jcasType).casFeatCode_fragment);}
    
  /** setter for fragment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFragment(String v) {
    if (URI_Type.featOkTst && ((URI_Type)jcasType).casFeat_fragment == null)
      jcasType.jcas.throwFeatMissing("fragment", "org.texttechnologylab.type.id.URI");
    jcasType.ll_cas.ll_setStringValue(addr, ((URI_Type)jcasType).casFeatCode_fragment, v);}    
  }

    