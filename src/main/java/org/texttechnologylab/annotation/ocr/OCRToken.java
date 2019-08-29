

/* First created by JCasGen Fri Jan 18 17:39:48 CET 2019 */
package org.texttechnologylab.annotation.ocr;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;


/**
 * Updated by JCasGen Wed Mar 13 09:48:05 CET 2019
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyOCR.xml
 *
 * @generated
 */
public class OCRToken extends Token {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(OCRToken.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected OCRToken() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public OCRToken(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public OCRToken(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public OCRToken(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
        readObject();
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: subTokenList

    /**
     * getter for subTokenList - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringList getSubTokenList() {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_subTokenList == null)
            jcasType.jcas.throwFeatMissing("subTokenList", "org.texttechnologylab.annotation.ocr.OCRToken");
        return (StringList) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((OCRToken_Type) jcasType).casFeatCode_subTokenList)));
    }

    /**
     * setter for subTokenList - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSubTokenList(StringList v) {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_subTokenList == null)
            jcasType.jcas.throwFeatMissing("subTokenList", "org.texttechnologylab.annotation.ocr.OCRToken");
        jcasType.ll_cas.ll_setRefValue(addr, ((OCRToken_Type) jcasType).casFeatCode_subTokenList, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: isWordFromDictionary

    /**
     * getter for isWordFromDictionary - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getIsWordFromDictionary() {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_isWordFromDictionary == null)
            jcasType.jcas.throwFeatMissing("isWordFromDictionary", "org.texttechnologylab.annotation.ocr.OCRToken");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_isWordFromDictionary);
    }

    /**
     * setter for isWordFromDictionary - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setIsWordFromDictionary(boolean v) {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_isWordFromDictionary == null)
            jcasType.jcas.throwFeatMissing("isWordFromDictionary", "org.texttechnologylab.annotation.ocr.OCRToken");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_isWordFromDictionary, v);
    }


    //*--------------*
    //* Feature: isWordNormal

    /**
     * getter for isWordNormal - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getIsWordNormal() {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_isWordNormal == null)
            jcasType.jcas.throwFeatMissing("isWordNormal", "org.texttechnologylab.annotation.ocr.OCRToken");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_isWordNormal);
    }

    /**
     * setter for isWordNormal - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setIsWordNormal(boolean v) {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_isWordNormal == null)
            jcasType.jcas.throwFeatMissing("isWordNormal", "org.texttechnologylab.annotation.ocr.OCRToken");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_isWordNormal, v);
    }


    //*--------------*
    //* Feature: isWordNumeric

    /**
     * getter for isWordNumeric - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getIsWordNumeric() {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_isWordNumeric == null)
            jcasType.jcas.throwFeatMissing("isWordNumeric", "org.texttechnologylab.annotation.ocr.OCRToken");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_isWordNumeric);
    }

    /**
     * setter for isWordNumeric - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setIsWordNumeric(boolean v) {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_isWordNumeric == null)
            jcasType.jcas.throwFeatMissing("isWordNumeric", "org.texttechnologylab.annotation.ocr.OCRToken");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_isWordNumeric, v);
    }


    //*--------------*
    //* Feature: containsHyphen

    /**
     * getter for containsHyphen - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getContainsHyphen() {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_containsHyphen == null)
            jcasType.jcas.throwFeatMissing("containsHyphen", "org.texttechnologylab.annotation.ocr.OCRToken");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_containsHyphen);
    }

    /**
     * setter for containsHyphen - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setContainsHyphen(boolean v) {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_containsHyphen == null)
            jcasType.jcas.throwFeatMissing("containsHyphen", "org.texttechnologylab.annotation.ocr.OCRToken");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((OCRToken_Type) jcasType).casFeatCode_containsHyphen, v);
    }


    //*--------------*
    //* Feature: suspiciousChars

    /**
     * getter for suspiciousChars - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getSuspiciousChars() {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_suspiciousChars == null)
            jcasType.jcas.throwFeatMissing("suspiciousChars", "org.texttechnologylab.annotation.ocr.OCRToken");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRToken_Type) jcasType).casFeatCode_suspiciousChars);
    }

    /**
     * setter for suspiciousChars - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSuspiciousChars(int v) {
        if (OCRToken_Type.featOkTst && ((OCRToken_Type) jcasType).casFeat_suspiciousChars == null)
            jcasType.jcas.throwFeatMissing("suspiciousChars", "org.texttechnologylab.annotation.ocr.OCRToken");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRToken_Type) jcasType).casFeatCode_suspiciousChars, v);
    }
}

    