
/* First created by JCasGen Thu Feb 28 20:07:00 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.segmentation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Document structure element.
 * Updated by JCasGen Thu Feb 28 20:08:17 CET 2019
 *
 * @generated
 */
public class Div_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Div.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div");

    /**
     * @generated
     */
    final Feature casFeat_divType;
    /**
     * @generated
     */
    final int casFeatCode_divType;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getDivType(int addr) {
        if (featOkTst && casFeat_divType == null)
            jcas.throwFeatMissing("divType", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div");
        return ll_cas.ll_getStringValue(addr, casFeatCode_divType);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setDivType(int addr, String v) {
        if (featOkTst && casFeat_divType == null)
            jcas.throwFeatMissing("divType", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div");
        ll_cas.ll_setStringValue(addr, casFeatCode_divType, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_id;
    /**
     * @generated
     */
    final int casFeatCode_id;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
            jcas.throwFeatMissing("id", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div");
        return ll_cas.ll_getStringValue(addr, casFeatCode_id);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
            jcas.throwFeatMissing("id", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div");
        ll_cas.ll_setStringValue(addr, casFeatCode_id, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Div_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_divType = jcas.getRequiredFeatureDE(casType, "divType", "uima.cas.String", featOkTst);
        casFeatCode_divType = (null == casFeat_divType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_divType).getCode();


        casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
        casFeatCode_id = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_id).getCode();

    }
}



    