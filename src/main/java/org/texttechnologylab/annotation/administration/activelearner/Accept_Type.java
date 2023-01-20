
/* First created by JCasGen Fri Apr 01 18:16:00 CEST 2022 */
package org.texttechnologylab.annotation.administration.activelearner;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * @generated */
public class Accept_Type extends Decision_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Accept.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.activelearner.Accept");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Accept_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    