
/* First created by JCasGen Mon Feb 26 14:11:21 CET 2024 */
package org.texttechnologylab.type.morphosyn.tag.conv;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.tag.CONV_Type;

/** 
 * Updated by JCasGen Mon Feb 26 14:11:21 CET 2024
 * @generated */
public class CONVCON_Type extends CONV_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CONVCON.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.tag.conv.CONVCON");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CONVCON_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    