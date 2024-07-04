
/* First created by JCasGen Thu Jul 04 14:57:19 CEST 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/**
 * Updated by JCasGen Thu Jul 04 14:57:19 CEST 2024
 *
 * @generated
 */
public class WebImage_Type extends Image_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = WebImage.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.WebImage");

    /**
     * @generated
     */
    final Feature casFeat_posX;
    /**
     * @generated
     */
    final int casFeatCode_posX;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getPosX(int addr) {
        if (featOkTst && casFeat_posX == null)
            jcas.throwFeatMissing("posX", "org.texttechnologylab.annotation.type.WebImage");
        return ll_cas.ll_getIntValue(addr, casFeatCode_posX);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setPosX(int addr, int v) {
        if (featOkTst && casFeat_posX == null)
            jcas.throwFeatMissing("posX", "org.texttechnologylab.annotation.type.WebImage");
        ll_cas.ll_setIntValue(addr, casFeatCode_posX, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_posY;
    /**
     * @generated
     */
    final int casFeatCode_posY;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getPosY(int addr) {
        if (featOkTst && casFeat_posY == null)
            jcas.throwFeatMissing("posY", "org.texttechnologylab.annotation.type.WebImage");
        return ll_cas.ll_getIntValue(addr, casFeatCode_posY);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setPosY(int addr, int v) {
        if (featOkTst && casFeat_posY == null)
            jcas.throwFeatMissing("posY", "org.texttechnologylab.annotation.type.WebImage");
        ll_cas.ll_setIntValue(addr, casFeatCode_posY, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public WebImage_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_posX = jcas.getRequiredFeatureDE(casType, "posX", "uima.cas.Integer", featOkTst);
        casFeatCode_posX = (null == casFeat_posX) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_posX).getCode();


        casFeat_posY = jcas.getRequiredFeatureDE(casType, "posY", "uima.cas.Integer", featOkTst);
        casFeatCode_posY = (null == casFeat_posY) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_posY).getCode();

    }
}



    