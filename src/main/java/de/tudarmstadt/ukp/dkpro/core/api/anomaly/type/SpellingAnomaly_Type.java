
/* First created by JCasGen Fri Mar 20 09:03:24 CET 2020 */
package de.tudarmstadt.ukp.dkpro.core.api.anomaly.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Wed Apr 01 17:34:51 CEST 2020
 * @generated */
public class SpellingAnomaly_Type extends Anomaly_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpellingAnomaly.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.SpellingAnomaly");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpellingAnomaly_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    