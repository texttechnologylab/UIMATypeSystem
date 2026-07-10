
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.hucompute.textimager.uima.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Subtype of VADER sentiment results, specific for the german adaption (https://github.com/KarstenAMF/GerVADER)
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class GerVaderSentiment_Type extends VaderSentiment_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GerVaderSentiment.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.textimager.uima.type.GerVaderSentiment");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GerVaderSentiment_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    