
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.uce;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Provides permission details for a document. Note that this annotation can be included multiple times to configure access to multiple users.
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class Permission_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Permission.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.uce.Permission");
 
  /** @generated */
  final Feature casFeat_permissionType;
  /** @generated */
  final int     casFeatCode_permissionType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPermissionType(int addr) {
        if (featOkTst && casFeat_permissionType == null)
      jcas.throwFeatMissing("permissionType", "org.texttechnologylab.annotation.uce.Permission");
    return ll_cas.ll_getStringValue(addr, casFeatCode_permissionType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPermissionType(int addr, String v) {
        if (featOkTst && casFeat_permissionType == null)
      jcas.throwFeatMissing("permissionType", "org.texttechnologylab.annotation.uce.Permission");
    ll_cas.ll_setStringValue(addr, casFeatCode_permissionType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_permissionLevel;
  /** @generated */
  final int     casFeatCode_permissionLevel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPermissionLevel(int addr) {
        if (featOkTst && casFeat_permissionLevel == null)
      jcas.throwFeatMissing("permissionLevel", "org.texttechnologylab.annotation.uce.Permission");
    return ll_cas.ll_getStringValue(addr, casFeatCode_permissionLevel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPermissionLevel(int addr, String v) {
        if (featOkTst && casFeat_permissionLevel == null)
      jcas.throwFeatMissing("permissionLevel", "org.texttechnologylab.annotation.uce.Permission");
    ll_cas.ll_setStringValue(addr, casFeatCode_permissionLevel, v);}
    
  
 
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
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.uce.Permission");
    return ll_cas.ll_getStringValue(addr, casFeatCode_user);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.uce.Permission");
    ll_cas.ll_setStringValue(addr, casFeatCode_user, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Permission_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_permissionType = jcas.getRequiredFeatureDE(casType, "permissionType", "org.texttechnologylab.annotation.uce.PermissionType", featOkTst);
    casFeatCode_permissionType  = (null == casFeat_permissionType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_permissionType).getCode();

 
    casFeat_permissionLevel = jcas.getRequiredFeatureDE(casType, "permissionLevel", "org.texttechnologylab.annotation.uce.PermissionLevel", featOkTst);
    casFeatCode_permissionLevel  = (null == casFeat_permissionLevel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_permissionLevel).getCode();

 
    casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
    casFeatCode_user  = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_user).getCode();

  }
}



    