
/* First created by JCasGen Thu Mar 25 09:35:20 CET 2021 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Thu Feb 08 19:39:47 CET 2024
 * @generated */
public class QuickTreeMultiSpanNode_Type extends QuickTreeNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuickTreeMultiSpanNode.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.QuickTreeMultiSpanNode");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuickTreeMultiSpanNode_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    