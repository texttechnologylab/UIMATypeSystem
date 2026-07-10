
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** List of messages.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class Message_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Message.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.llm.prompt.Message");
 
  /** @generated */
  final Feature casFeat_role;
  /** @generated */
  final int     casFeatCode_role;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRole(int addr) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "org.texttechnologylab.type.llm.prompt.Message");
    return ll_cas.ll_getStringValue(addr, casFeatCode_role);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRole(int addr, String v) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "org.texttechnologylab.type.llm.prompt.Message");
    ll_cas.ll_setStringValue(addr, casFeatCode_role, v);}
    
  
 
  /** @generated */
  final Feature casFeat_content;
  /** @generated */
  final int     casFeatCode_content;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContent(int addr) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Message");
    return ll_cas.ll_getStringValue(addr, casFeatCode_content);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContent(int addr, String v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Message");
    ll_cas.ll_setStringValue(addr, casFeatCode_content, v);}
    
  
 
  /** @generated */
  final Feature casFeat_classModule;
  /** @generated */
  final int     casFeatCode_classModule;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClassModule(int addr) {
        if (featOkTst && casFeat_classModule == null)
      jcas.throwFeatMissing("classModule", "org.texttechnologylab.type.llm.prompt.Message");
    return ll_cas.ll_getStringValue(addr, casFeatCode_classModule);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClassModule(int addr, String v) {
        if (featOkTst && casFeat_classModule == null)
      jcas.throwFeatMissing("classModule", "org.texttechnologylab.type.llm.prompt.Message");
    ll_cas.ll_setStringValue(addr, casFeatCode_classModule, v);}
    
  
 
  /** @generated */
  final Feature casFeat_className;
  /** @generated */
  final int     casFeatCode_className;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClassName(int addr) {
        if (featOkTst && casFeat_className == null)
      jcas.throwFeatMissing("className", "org.texttechnologylab.type.llm.prompt.Message");
    return ll_cas.ll_getStringValue(addr, casFeatCode_className);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClassName(int addr, String v) {
        if (featOkTst && casFeat_className == null)
      jcas.throwFeatMissing("className", "org.texttechnologylab.type.llm.prompt.Message");
    ll_cas.ll_setStringValue(addr, casFeatCode_className, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Message_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_role = jcas.getRequiredFeatureDE(casType, "role", "uima.cas.String", featOkTst);
    casFeatCode_role  = (null == casFeat_role) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_role).getCode();

 
    casFeat_content = jcas.getRequiredFeatureDE(casType, "content", "uima.cas.String", featOkTst);
    casFeatCode_content  = (null == casFeat_content) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_content).getCode();

 
    casFeat_classModule = jcas.getRequiredFeatureDE(casType, "classModule", "uima.cas.String", featOkTst);
    casFeatCode_classModule  = (null == casFeat_classModule) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_classModule).getCode();

 
    casFeat_className = jcas.getRequiredFeatureDE(casType, "className", "uima.cas.String", featOkTst);
    casFeatCode_className  = (null == casFeat_className) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_className).getCode();

  }
}



    