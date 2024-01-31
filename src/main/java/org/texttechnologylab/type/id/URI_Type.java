
/* First created by JCasGen Wed Jan 31 15:16:49 CET 2024 */
package org.texttechnologylab.type.id;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Jan 31 15:16:49 CET 2024
 * @generated */
public class URI_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = URI.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.id.URI");
 
  /** @generated */
  final Feature casFeat_scheme;
  /** @generated */
  final int     casFeatCode_scheme;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScheme(int addr) {
        if (featOkTst && casFeat_scheme == null)
      jcas.throwFeatMissing("scheme", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_scheme);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScheme(int addr, String v) {
        if (featOkTst && casFeat_scheme == null)
      jcas.throwFeatMissing("scheme", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_scheme, v);}
    
  
 
  /** @generated */
  final Feature casFeat_user;
  /** @generated */
  final int     casFeatCode_user;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUser(int addr) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_user);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_user, v);}
    
  
 
  /** @generated */
  final Feature casFeat_password;
  /** @generated */
  final int     casFeatCode_password;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPassword(int addr) {
        if (featOkTst && casFeat_password == null)
      jcas.throwFeatMissing("password", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_password);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassword(int addr, String v) {
        if (featOkTst && casFeat_password == null)
      jcas.throwFeatMissing("password", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_password, v);}
    
  
 
  /** @generated */
  final Feature casFeat_host;
  /** @generated */
  final int     casFeatCode_host;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHost(int addr) {
        if (featOkTst && casFeat_host == null)
      jcas.throwFeatMissing("host", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_host);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHost(int addr, String v) {
        if (featOkTst && casFeat_host == null)
      jcas.throwFeatMissing("host", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_host, v);}
    
  
 
  /** @generated */
  final Feature casFeat_port;
  /** @generated */
  final int     casFeatCode_port;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPort(int addr) {
        if (featOkTst && casFeat_port == null)
      jcas.throwFeatMissing("port", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getIntValue(addr, casFeatCode_port);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPort(int addr, int v) {
        if (featOkTst && casFeat_port == null)
      jcas.throwFeatMissing("port", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setIntValue(addr, casFeatCode_port, v);}
    
  
 
  /** @generated */
  final Feature casFeat_path;
  /** @generated */
  final int     casFeatCode_path;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPath(int addr) {
        if (featOkTst && casFeat_path == null)
      jcas.throwFeatMissing("path", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_path);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPath(int addr, String v) {
        if (featOkTst && casFeat_path == null)
      jcas.throwFeatMissing("path", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_path, v);}
    
  
 
  /** @generated */
  final Feature casFeat_query;
  /** @generated */
  final int     casFeatCode_query;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuery(int addr) {
        if (featOkTst && casFeat_query == null)
      jcas.throwFeatMissing("query", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_query);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuery(int addr, String v) {
        if (featOkTst && casFeat_query == null)
      jcas.throwFeatMissing("query", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_query, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fragment;
  /** @generated */
  final int     casFeatCode_fragment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFragment(int addr) {
        if (featOkTst && casFeat_fragment == null)
      jcas.throwFeatMissing("fragment", "org.texttechnologylab.type.id.URI");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fragment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFragment(int addr, String v) {
        if (featOkTst && casFeat_fragment == null)
      jcas.throwFeatMissing("fragment", "org.texttechnologylab.type.id.URI");
    ll_cas.ll_setStringValue(addr, casFeatCode_fragment, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public URI_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_scheme = jcas.getRequiredFeatureDE(casType, "scheme", "uima.cas.String", featOkTst);
    casFeatCode_scheme  = (null == casFeat_scheme) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scheme).getCode();

 
    casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
    casFeatCode_user  = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_user).getCode();

 
    casFeat_password = jcas.getRequiredFeatureDE(casType, "password", "uima.cas.String", featOkTst);
    casFeatCode_password  = (null == casFeat_password) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_password).getCode();

 
    casFeat_host = jcas.getRequiredFeatureDE(casType, "host", "uima.cas.String", featOkTst);
    casFeatCode_host  = (null == casFeat_host) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_host).getCode();

 
    casFeat_port = jcas.getRequiredFeatureDE(casType, "port", "uima.cas.Integer", featOkTst);
    casFeatCode_port  = (null == casFeat_port) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_port).getCode();

 
    casFeat_path = jcas.getRequiredFeatureDE(casType, "path", "uima.cas.String", featOkTst);
    casFeatCode_path  = (null == casFeat_path) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_path).getCode();

 
    casFeat_query = jcas.getRequiredFeatureDE(casType, "query", "uima.cas.String", featOkTst);
    casFeatCode_query  = (null == casFeat_query) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_query).getCode();

 
    casFeat_fragment = jcas.getRequiredFeatureDE(casType, "fragment", "uima.cas.String", featOkTst);
    casFeatCode_fragment  = (null == casFeat_fragment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fragment).getCode();

  }
}



    