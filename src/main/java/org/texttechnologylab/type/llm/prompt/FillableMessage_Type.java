
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** This message is supposed to be filled by an LLM by using the previous messages as input/history.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class FillableMessage_Type extends Message_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FillableMessage.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.llm.prompt.FillableMessage");
 
  /** @generated */
  final Feature casFeat_contextName;
  /** @generated */
  final int     casFeatCode_contextName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContextName(int addr) {
        if (featOkTst && casFeat_contextName == null)
      jcas.throwFeatMissing("contextName", "org.texttechnologylab.type.llm.prompt.FillableMessage");
    return ll_cas.ll_getStringValue(addr, casFeatCode_contextName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContextName(int addr, String v) {
        if (featOkTst && casFeat_contextName == null)
      jcas.throwFeatMissing("contextName", "org.texttechnologylab.type.llm.prompt.FillableMessage");
    ll_cas.ll_setStringValue(addr, casFeatCode_contextName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FillableMessage_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_contextName = jcas.getRequiredFeatureDE(casType, "contextName", "uima.cas.String", featOkTst);
    casFeatCode_contextName  = (null == casFeat_contextName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contextName).getCode();

  }
}



    