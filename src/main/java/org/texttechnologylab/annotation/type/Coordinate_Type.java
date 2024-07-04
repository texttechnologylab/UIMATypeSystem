
/* First created by JCasGen Thu Jul 04 14:57:19 CEST 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/**
 * Updated by JCasGen Thu Jul 04 14:57:19 CEST 2024
 *
 * @generated
 */
public class Coordinate_Type extends AnnotationBase_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Coordinate.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Coordinate");

    /**
     * @generated
     */
    final Feature casFeat_x;
    /**
     * @generated
     */
    final int casFeatCode_x;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getX(int addr) {
        if (featOkTst && casFeat_x == null)
            jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.Coordinate");
        return ll_cas.ll_getIntValue(addr, casFeatCode_x);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setX(int addr, int v) {
        if (featOkTst && casFeat_x == null)
            jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.Coordinate");
        ll_cas.ll_setIntValue(addr, casFeatCode_x, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_y;
    /**
     * @generated
     */
    final int casFeatCode_y;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getY(int addr) {
        if (featOkTst && casFeat_y == null)
            jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.Coordinate");
        return ll_cas.ll_getIntValue(addr, casFeatCode_y);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setY(int addr, int v) {
        if (featOkTst && casFeat_y == null)
            jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.Coordinate");
        ll_cas.ll_setIntValue(addr, casFeatCode_y, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Coordinate_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.Integer", featOkTst);
        casFeatCode_x = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_x).getCode();


        casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.Integer", featOkTst);
        casFeatCode_y = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_y).getCode();

    }
}



    