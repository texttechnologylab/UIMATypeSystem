
/* First created by JCasGen Fri Jul 20 13:34:13 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Fri Jul 20 13:34:13 CEST 2018
 *
 * @generated
 */
public class TextTechnologyKnowledgeEdge_Type extends Edge_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TextTechnologyKnowledgeEdge.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologielab.annotation.type.TextTechnologyKnowledgeEdge");

    /**
     * @generated
     */
    final Feature casFeat_linktype;
    /**
     * @generated
     */
    final int casFeatCode_linktype;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getLinktype(int addr) {
        if (featOkTst && casFeat_linktype == null)
            jcas.throwFeatMissing("linktype", "org.texttechnologielab.annotation.type.TextTechnologyKnowledgeEdge");
        return ll_cas.ll_getStringValue(addr, casFeatCode_linktype);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setLinktype(int addr, String v) {
        if (featOkTst && casFeat_linktype == null)
            jcas.throwFeatMissing("linktype", "org.texttechnologielab.annotation.type.TextTechnologyKnowledgeEdge");
        ll_cas.ll_setStringValue(addr, casFeatCode_linktype, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TextTechnologyKnowledgeEdge_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_linktype = jcas.getRequiredFeatureDE(casType, "linktype", "uima.cas.String", featOkTst);
        casFeatCode_linktype = (null == casFeat_linktype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_linktype).getCode();

    }
}



    