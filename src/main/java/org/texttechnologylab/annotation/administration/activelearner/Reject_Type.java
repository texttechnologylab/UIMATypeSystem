
/* First created by JCasGen Fri Apr 01 18:16:00 CEST 2022 */
package org.texttechnologylab.annotation.administration.activelearner;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Fri Jan 20 19:11:52 CET 2023
 * @generated */
public class Reject_Type extends Decision_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Reject.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.activelearner.Reject");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Reject_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    