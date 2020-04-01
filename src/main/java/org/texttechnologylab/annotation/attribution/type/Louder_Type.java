
/* First created by JCasGen Fri Mar 20 09:13:54 CET 2020 */
package org.texttechnologylab.annotation.attribution.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.Attribution_Type;

/** 
 * Updated by JCasGen Fri Mar 20 09:13:54 CET 2020
 * @generated */
public class Louder_Type extends Attribution_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Louder.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.attribution.type.Louder");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Louder_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    