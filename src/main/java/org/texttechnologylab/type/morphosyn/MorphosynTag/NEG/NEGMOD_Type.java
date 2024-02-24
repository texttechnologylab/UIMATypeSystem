
/* First created by JCasGen Sat Feb 24 15:32:58 CET 2024 */
package org.texttechnologylab.type.morphosyn.MorphosynTag.NEG;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.MorphosynTag.NEG_Type;

/** 
 * Updated by JCasGen Sat Feb 24 15:32:58 CET 2024
 * @generated */
public class NEGMOD_Type extends NEG_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NEGMOD.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.MorphosynTag.NEG.NEGMOD");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NEGMOD_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    