
/* First created by JCasGen Tue Feb 17 20:19:38 CET 2026 */
package org.texttechnologylab.type.morphosyn.tag.inf;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.type.morphosyn.tag.INF_Type;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:38 CET 2026
 * @generated */
public class INFDE_Type extends INF_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = INFDE.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.morphosyn.tag.inf.INFDE");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public INFDE_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    