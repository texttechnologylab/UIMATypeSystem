
/* First created by JCasGen Tue Apr 07 19:23:28 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.semaf.isobase.Signal_Type;

/** 
 * Updated by JCasGen Tue Apr 07 19:23:30 CEST 2020
 * @generated */
public class TimeSignal_Type extends Signal_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeSignal.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.TimeSignal");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeSignal_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    