
/* First created by JCasGen Fri Mar 20 09:14:38 CET 2020 */
package org.texttechnologylab.annotation.orientation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.OrientationEdge_Type;

/** 
 * Updated by JCasGen Fri Mar 20 09:14:38 CET 2020
 * @generated */
public class NotAt_Type extends OrientationEdge_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NotAt.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.orientation.type.NotAt");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NotAt_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    