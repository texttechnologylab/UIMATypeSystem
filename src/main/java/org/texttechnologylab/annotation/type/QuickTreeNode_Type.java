
/* First created by JCasGen Mon May 06 17:09:49 CEST 2019 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologielab.annotation.type.TreeAnnotationNode_Type;

/**
 * Updated by JCasGen Mon May 06 17:11:48 CEST 2019
 *
 * @generated
 */
public class QuickTreeNode_Type extends TreeAnnotationNode_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = QuickTreeNode.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.QuickTreeNode");


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public QuickTreeNode_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    }
}



    