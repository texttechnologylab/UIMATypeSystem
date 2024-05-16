

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:29:53 CEST 2024 */

package org.texttechnologylab.type.id;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu May 16 17:29:53 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class URI extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.id.URI";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_scheme = "scheme";
  public final static String _FeatName_user = "user";
  public final static String _FeatName_password = "password";
  public final static String _FeatName_host = "host";
  public final static String _FeatName_port = "port";
  public final static String _FeatName_path = "path";
  public final static String _FeatName_query = "query";
  public final static String _FeatName_fragment = "fragment";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_scheme = TypeSystemImpl.createCallSite(URI.class, "scheme");
  private final static MethodHandle _FH_scheme = _FC_scheme.dynamicInvoker();
  private final static CallSite _FC_user = TypeSystemImpl.createCallSite(URI.class, "user");
  private final static MethodHandle _FH_user = _FC_user.dynamicInvoker();
  private final static CallSite _FC_password = TypeSystemImpl.createCallSite(URI.class, "password");
  private final static MethodHandle _FH_password = _FC_password.dynamicInvoker();
  private final static CallSite _FC_host = TypeSystemImpl.createCallSite(URI.class, "host");
  private final static MethodHandle _FH_host = _FC_host.dynamicInvoker();
  private final static CallSite _FC_port = TypeSystemImpl.createCallSite(URI.class, "port");
  private final static MethodHandle _FH_port = _FC_port.dynamicInvoker();
  private final static CallSite _FC_path = TypeSystemImpl.createCallSite(URI.class, "path");
  private final static MethodHandle _FH_path = _FC_path.dynamicInvoker();
  private final static CallSite _FC_query = TypeSystemImpl.createCallSite(URI.class, "query");
  private final static MethodHandle _FH_query = _FC_query.dynamicInvoker();
  private final static CallSite _FC_fragment = TypeSystemImpl.createCallSite(URI.class, "fragment");
  private final static MethodHandle _FH_fragment = _FC_fragment.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected URI() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public URI(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_scheme));
  }
    
  /** setter for scheme - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScheme(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_scheme), v);
  }    
    
   
    
  //*--------------*
  //* Feature: user

  /** getter for user - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUser() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_user));
  }
    
  /** setter for user - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_user), v);
  }    
    
   
    
  //*--------------*
  //* Feature: password

  /** getter for password - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPassword() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_password));
  }
    
  /** setter for password - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPassword(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_password), v);
  }    
    
   
    
  //*--------------*
  //* Feature: host

  /** getter for host - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHost() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_host));
  }
    
  /** setter for host - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHost(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_host), v);
  }    
    
   
    
  //*--------------*
  //* Feature: port

  /** getter for port - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPort() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_port));
  }
    
  /** setter for port - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPort(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_port), v);
  }    
    
   
    
  //*--------------*
  //* Feature: path

  /** getter for path - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPath() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_path));
  }
    
  /** setter for path - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPath(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_path), v);
  }    
    
   
    
  //*--------------*
  //* Feature: query

  /** getter for query - gets 
   * @generated
   * @return value of the feature 
   */
  public String getQuery() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_query));
  }
    
  /** setter for query - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuery(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_query), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fragment

  /** getter for fragment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFragment() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_fragment));
  }
    
  /** setter for fragment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFragment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_fragment), v);
  }    
    
  }

    