
/* First created by JCasGen Thu Aug 15 14:47:15 CEST 2019 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Attribute of an object (color, texture, srl, ...)
 * Updated by JCasGen Thu Aug 15 14:47:15 CEST 2019
 *
 * @generated
 */
public class ObjectAttribute_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = ObjectAttribute.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Room.ObjectAttribute");

    /**
     * @generated
     */
    final Feature casFeat_key;
    /**
     * @generated
     */
    final int casFeatCode_key;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getKey(int addr) {
        if (featOkTst && casFeat_key == null)
            jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.Room.ObjectAttribute");
        return ll_cas.ll_getStringValue(addr, casFeatCode_key);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setKey(int addr, String v) {
        if (featOkTst && casFeat_key == null)
            jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.Room.ObjectAttribute");
        ll_cas.ll_setStringValue(addr, casFeatCode_key, v);
    }


    /**
     * @generated
     */
    final Feature casFeat_value;
    /**
     * @generated
     */
    final int casFeatCode_value;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Room.ObjectAttribute");
        return ll_cas.ll_getStringValue(addr, casFeatCode_value);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
            jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Room.ObjectAttribute");
        ll_cas.ll_setStringValue(addr, casFeatCode_value, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public ObjectAttribute_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_key = jcas.getRequiredFeatureDE(casType, "key", "uima.cas.String", featOkTst);
        casFeatCode_key = (null == casFeat_key) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_key).getCode();


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();

    }
}



    