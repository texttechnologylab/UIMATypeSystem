
/* First created by JCasGen Fri Jul 20 13:34:20 CEST 2018 */
package org.texttechnologielab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologielab.annotation.type.AnnotationNode_Type;

/**
 * Updated by JCasGen Mon Aug 06 15:03:33 CEST 2018
 *
 * @generated
 */
public class Orientation_Type extends AnnotationNode_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Orientation.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.Orientation");


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Orientation_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    }
}



    