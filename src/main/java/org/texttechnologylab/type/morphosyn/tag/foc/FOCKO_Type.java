
/* First created by JCasGen Mon Feb 26 14:11:21 CET 2024 */
package org.texttechnologylab.type.morphosyn.tag.foc;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.tag.FOC_Type;

/** 
 * Updated by JCasGen Mon Feb 26 14:11:21 CET 2024
 * @generated */
public class FOCKO_Type extends FOC_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FOCKO.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.tag.foc.FOCKO");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FOCKO_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    