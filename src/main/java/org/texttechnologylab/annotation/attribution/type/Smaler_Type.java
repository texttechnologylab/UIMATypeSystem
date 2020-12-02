
/* First created by JCasGen Wed Dec 02 18:39:45 CET 2020 */
package org.texttechnologylab.annotation.attribution.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.Attribution_Type;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:45 CET 2020
 * @generated */
public class Smaler_Type extends Attribution_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Smaler.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.attribution.type.Smaler");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Smaler_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    