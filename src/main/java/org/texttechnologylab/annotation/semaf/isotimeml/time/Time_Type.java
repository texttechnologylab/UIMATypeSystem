
/* First created by JCasGen Tue Mar 24 16:00:31 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml.time;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.semaf.isotimeml.TimeX3_Type;

/** 
 * Updated by JCasGen Wed Apr 01 09:53:21 CEST 2020
 * @generated */
public class Time_Type extends TimeX3_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Time.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.time.Time");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Time_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    