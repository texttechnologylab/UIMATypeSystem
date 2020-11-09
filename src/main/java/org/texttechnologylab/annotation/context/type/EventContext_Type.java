
/* First created by JCasGen Thu Nov 05 17:33:42 CET 2020 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.node.type.Context_Type;

/** 
 * Updated by JCasGen Thu Nov 05 17:33:42 CET 2020
 * @generated */
public class EventContext_Type extends Context_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EventContext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.context.type.EventContext");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EventContext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    