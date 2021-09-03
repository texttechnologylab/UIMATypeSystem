
/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.meta;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** ( COREFERENCE | SUBCOREFERENCE | SPLITCOREFERENCE )
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * @generated */
public class MetaLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetaLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.meta.MetaLink");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetaLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    