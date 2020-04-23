
/* First created by JCasGen Thu Apr 23 09:54:27 CEST 2020 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData_Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:54:27 CEST 2020
 * @generated */
public class FinishAnnotation_Type extends DocumentMetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FinishAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.FinishAnnotation");
 
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
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_user);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_user, v);}
    
  
 
  /** @generated */
  final Feature casFeat_comment;
  /** @generated */
  final int     casFeatCode_comment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComment(int addr) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tool;
  /** @generated */
  final int     casFeatCode_tool;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTool(int addr) {
        if (featOkTst && casFeat_tool == null)
      jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tool);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTool(int addr, String v) {
        if (featOkTst && casFeat_tool == null)
      jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.FinishAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_tool, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FinishAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
    casFeatCode_user  = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_user).getCode();

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

 
    casFeat_tool = jcas.getRequiredFeatureDE(casType, "tool", "uima.cas.String", featOkTst);
    casFeatCode_tool  = (null == casFeat_tool) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tool).getCode();

  }
}



    