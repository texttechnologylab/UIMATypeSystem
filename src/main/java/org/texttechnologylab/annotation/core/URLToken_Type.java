
/* First created by JCasGen Thu Jan 18 16:06:27 CET 2024 */
package org.texttechnologylab.annotation.core;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token_Type;

/** Generic URL Token
 * Updated by JCasGen Thu Jan 18 16:13:36 CET 2024
 * @generated */
public class URLToken_Type extends Token_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = URLToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.core.URLToken");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public URLToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    