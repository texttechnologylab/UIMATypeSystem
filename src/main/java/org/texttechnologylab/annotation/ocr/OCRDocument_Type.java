
/* First created by JCasGen Tue Mar 12 17:40:05 CET 2019 */
package org.texttechnologylab.annotation.ocr;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Wed Mar 13 09:48:05 CET 2019
 *
 * @generated
 */
public class OCRDocument_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = OCRDocument.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.OCRDocument");

    /**
     * @generated
     */
    final Feature casFeat_documentname;
    /**
     * @generated
     */
    final int casFeatCode_documentname;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getDocumentname(int addr) {
        if (featOkTst && casFeat_documentname == null)
            jcas.throwFeatMissing("documentname", "org.texttechnologylab.annotation.ocr.OCRDocument");
        return ll_cas.ll_getStringValue(addr, casFeatCode_documentname);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setDocumentname(int addr, String v) {
        if (featOkTst && casFeat_documentname == null)
            jcas.throwFeatMissing("documentname", "org.texttechnologylab.annotation.ocr.OCRDocument");
        ll_cas.ll_setStringValue(addr, casFeatCode_documentname, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public OCRDocument_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_documentname = jcas.getRequiredFeatureDE(casType, "documentname", "uima.cas.String", featOkTst);
        casFeatCode_documentname = (null == casFeat_documentname) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_documentname).getCode();

    }
}



    