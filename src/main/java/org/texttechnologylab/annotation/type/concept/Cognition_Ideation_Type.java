
/* First created by JCasGen Mon Apr 08 19:02:29 CEST 2019 */
package org.texttechnologylab.annotation.type.concept;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.AbstractNamedEntity_Type;

/**
 * Updated by JCasGen Fri Jul 12 15:34:30 CEST 2019
 *
 * @generated
 */
public class Cognition_Ideation_Type extends AbstractNamedEntity_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Cognition_Ideation.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.concept.Cognition_Ideation");


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Cognition_Ideation_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    }
}



    