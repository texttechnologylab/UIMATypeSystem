
/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Thu Mar 25 09:35:20 CET 2021
 * @generated */
public class GraphBase_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GraphBase.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.GraphBase");
 
  /** @generated */
  final Feature casFeat_Id;
  /** @generated */
  final int     casFeatCode_Id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "org.texttechnologylab.annotation.type.GraphBase");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "org.texttechnologylab.annotation.type.GraphBase");
    ll_cas.ll_setStringValue(addr, casFeatCode_Id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_label;
  /** @generated */
  final int     casFeatCode_label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.type.GraphBase");
    return ll_cas.ll_getStringValue(addr, casFeatCode_label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.type.GraphBase");
    ll_cas.ll_setStringValue(addr, casFeatCode_label, v);}
    
  
 
  /** @generated */
  final Feature casFeat_create;
  /** @generated */
  final int     casFeatCode_create;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getCreate(int addr) {
        if (featOkTst && casFeat_create == null)
      jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.GraphBase");
    return ll_cas.ll_getLongValue(addr, casFeatCode_create);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCreate(int addr, long v) {
        if (featOkTst && casFeat_create == null)
      jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.GraphBase");
    ll_cas.ll_setLongValue(addr, casFeatCode_create, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modified;
  /** @generated */
  final int     casFeatCode_modified;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getModified(int addr) {
        if (featOkTst && casFeat_modified == null)
      jcas.throwFeatMissing("modified", "org.texttechnologylab.annotation.type.GraphBase");
    return ll_cas.ll_getLongValue(addr, casFeatCode_modified);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModified(int addr, long v) {
        if (featOkTst && casFeat_modified == null)
      jcas.throwFeatMissing("modified", "org.texttechnologylab.annotation.type.GraphBase");
    ll_cas.ll_setLongValue(addr, casFeatCode_modified, v);}
    
  
 
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
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.GraphBase");
    return ll_cas.ll_getStringValue(addr, casFeatCode_user);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.GraphBase");
    ll_cas.ll_setStringValue(addr, casFeatCode_user, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GraphBase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Id = jcas.getRequiredFeatureDE(casType, "Id", "uima.cas.String", featOkTst);
    casFeatCode_Id  = (null == casFeat_Id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Id).getCode();

 
    casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
    casFeatCode_label  = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_label).getCode();

 
    casFeat_create = jcas.getRequiredFeatureDE(casType, "create", "uima.cas.Long", featOkTst);
    casFeatCode_create  = (null == casFeat_create) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_create).getCode();

 
    casFeat_modified = jcas.getRequiredFeatureDE(casType, "modified", "uima.cas.Long", featOkTst);
    casFeatCode_modified  = (null == casFeat_modified) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modified).getCode();

 
    casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
    casFeatCode_user  = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_user).getCode();

  }
}



    