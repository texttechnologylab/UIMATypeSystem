
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.type.morphosyn.tag.pp1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.tag.PP1_Type;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class PP1DE_Type extends PP1_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PP1DE.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.tag.pp1.PP1DE");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PP1DE_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    