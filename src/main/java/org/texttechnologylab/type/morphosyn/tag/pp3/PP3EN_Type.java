
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.type.morphosyn.tag.pp3;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.tag.PP3_Type;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class PP3EN_Type extends PP3_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PP3EN.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.tag.pp3.PP3EN");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PP3EN_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    