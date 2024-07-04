
/* First created by JCasGen Thu Jul 04 14:57:19 CEST 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Thu Jul 04 14:57:19 CEST 2024
 *
 * @generated
 */
public class Image_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Image.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Image");

    /**
     * @generated
     */
    final Feature casFeat_src;
    /**
     * @generated
     */
    final int casFeatCode_src;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getSrc(int addr) {
        if (featOkTst && casFeat_src == null)
            jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Image");
        return ll_cas.ll_getStringValue(addr, casFeatCode_src);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSrc(int addr, String v) {
        if (featOkTst && casFeat_src == null)
            jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Image");
        ll_cas.ll_setStringValue(addr, casFeatCode_src, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_width;
    /**
     * @generated
     */
    final int casFeatCode_width;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getWidth(int addr) {
        if (featOkTst && casFeat_width == null)
            jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.type.Image");
        return ll_cas.ll_getIntValue(addr, casFeatCode_width);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setWidth(int addr, int v) {
        if (featOkTst && casFeat_width == null)
            jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.type.Image");
        ll_cas.ll_setIntValue(addr, casFeatCode_width, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_height;
    /**
     * @generated
     */
    final int casFeatCode_height;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getHeight(int addr) {
        if (featOkTst && casFeat_height == null)
            jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.type.Image");
        return ll_cas.ll_getRefValue(addr, casFeatCode_height);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setHeight(int addr, int v) {
        if (featOkTst && casFeat_height == null)
            jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.type.Image");
        ll_cas.ll_setRefValue(addr, casFeatCode_height, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Image_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_src = jcas.getRequiredFeatureDE(casType, "src", "uima.cas.String", featOkTst);
        casFeatCode_src = (null == casFeat_src) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_src).getCode();


        casFeat_width = jcas.getRequiredFeatureDE(casType, "width", "uima.cas.Integer", featOkTst);
        casFeatCode_width = (null == casFeat_width) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_width).getCode();


        casFeat_height = jcas.getRequiredFeatureDE(casType, "height", "uima.tcas.Annotation", featOkTst);
        casFeatCode_height = (null == casFeat_height) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_height).getCode();

    }
}



    