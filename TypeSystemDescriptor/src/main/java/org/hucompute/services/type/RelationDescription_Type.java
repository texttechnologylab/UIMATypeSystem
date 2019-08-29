
/* First created by JCasGen Wed Feb 14 16:42:04 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 *
 * @generated
 */
public class RelationDescription_Type extends Attribute_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = RelationDescription.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.services.type.RelationDescription");

    /**
     * @generated
     */
    final Feature casFeat_name;
    /**
     * @generated
     */
    final int casFeatCode_name;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
            jcas.throwFeatMissing("name", "org.hucompute.services.type.RelationDescription");
        return ll_cas.ll_getStringValue(addr, casFeatCode_name);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
            jcas.throwFeatMissing("name", "org.hucompute.services.type.RelationDescription");
        ll_cas.ll_setStringValue(addr, casFeatCode_name, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_relationtype;
    /**
     * @generated
     */
    final int casFeatCode_relationtype;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getRelationtype(int addr) {
        if (featOkTst && casFeat_relationtype == null)
            jcas.throwFeatMissing("relationtype", "org.hucompute.services.type.RelationDescription");
        return ll_cas.ll_getStringValue(addr, casFeatCode_relationtype);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setRelationtype(int addr, String v) {
        if (featOkTst && casFeat_relationtype == null)
            jcas.throwFeatMissing("relationtype", "org.hucompute.services.type.RelationDescription");
        ll_cas.ll_setStringValue(addr, casFeatCode_relationtype, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public RelationDescription_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
        casFeatCode_name = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_name).getCode();


        casFeat_relationtype = jcas.getRequiredFeatureDE(casType, "relationtype", "uima.cas.String", featOkTst);
        casFeatCode_relationtype = (null == casFeat_relationtype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_relationtype).getCode();

    }
}



    