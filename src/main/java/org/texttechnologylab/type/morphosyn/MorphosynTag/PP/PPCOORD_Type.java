
/* First created by JCasGen Sat Feb 24 15:32:58 CET 2024 */
package org.texttechnologylab.type.morphosyn.MorphosynTag.PP;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.MorphosynTag.PP_Type;

/** 
 * Updated by JCasGen Sat Feb 24 15:32:58 CET 2024
 * @generated */
public class PPCOORD_Type extends PP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PPCOORD.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.MorphosynTag.PP.PPCOORD");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PPCOORD_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    