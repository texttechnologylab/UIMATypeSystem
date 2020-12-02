
/* First created by JCasGen Wed Dec 02 18:39:05 CET 2020 */
package org.texttechnologylab.annotation.temporal.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.Temporal_Type;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:05 CET 2020
 * @generated */
public class During_Type extends Temporal_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = During.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.temporal.type.During");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public During_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    