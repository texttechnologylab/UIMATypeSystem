

/* First created by JCasGen Thu Feb 28 20:08:17 CET 2019 */
package org.texttechnologylab.annotation.ocr;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Wed Mar 13 09:48:05 CET 2019
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyOCR.xml
 *
 * @generated
 */
public class OCRPage extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(OCRPage.class);
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
    protected OCRPage() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public OCRPage(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public OCRPage(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public OCRPage(JCas jcas, int begin, int end) {
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
    //* Feature: width

    /**
     * getter for width - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getWidth() {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_width == null)
            jcasType.jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.ocr.OCRPage");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_width);
    }

    /**
     * setter for width - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setWidth(int v) {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_width == null)
            jcasType.jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.ocr.OCRPage");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_width, v);
    }


    //*--------------*
    //* Feature: height

    /**
     * getter for height - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getHeight() {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_height == null)
            jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.ocr.OCRPage");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_height);
    }

    /**
     * setter for height - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setHeight(int v) {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_height == null)
            jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.ocr.OCRPage");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_height, v);
    }


    //*--------------*
    //* Feature: resolution

    /**
     * getter for resolution - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getResolution() {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_resolution == null)
            jcasType.jcas.throwFeatMissing("resolution", "org.texttechnologylab.annotation.ocr.OCRPage");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_resolution);
    }

    /**
     * setter for resolution - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setResolution(int v) {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_resolution == null)
            jcasType.jcas.throwFeatMissing("resolution", "org.texttechnologylab.annotation.ocr.OCRPage");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_resolution, v);
    }


    //*--------------*
    //* Feature: pageId

    /**
     * getter for pageId - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getPageId() {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_pageId == null)
            jcasType.jcas.throwFeatMissing("pageId", "org.texttechnologylab.annotation.ocr.OCRPage");
        return jcasType.ll_cas.ll_getStringValue(addr, ((OCRPage_Type) jcasType).casFeatCode_pageId);
    }

    /**
     * setter for pageId - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPageId(String v) {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_pageId == null)
            jcasType.jcas.throwFeatMissing("pageId", "org.texttechnologylab.annotation.ocr.OCRPage");
        jcasType.ll_cas.ll_setStringValue(addr, ((OCRPage_Type) jcasType).casFeatCode_pageId, v);
    }


    //*--------------*
    //* Feature: pageNumber

    /**
     * getter for pageNumber - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getPageNumber() {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_pageNumber == null)
            jcasType.jcas.throwFeatMissing("pageNumber", "org.texttechnologylab.annotation.ocr.OCRPage");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_pageNumber);
    }

    /**
     * setter for pageNumber - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPageNumber(int v) {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_pageNumber == null)
            jcasType.jcas.throwFeatMissing("pageNumber", "org.texttechnologylab.annotation.ocr.OCRPage");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRPage_Type) jcasType).casFeatCode_pageNumber, v);
    }


    //*--------------*
    //* Feature: uri

    /**
     * getter for uri - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getUri() {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_uri == null)
            jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.ocr.OCRPage");
        return jcasType.ll_cas.ll_getStringValue(addr, ((OCRPage_Type) jcasType).casFeatCode_uri);
    }

    /**
     * setter for uri - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setUri(String v) {
        if (OCRPage_Type.featOkTst && ((OCRPage_Type) jcasType).casFeat_uri == null)
            jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.ocr.OCRPage");
        jcasType.ll_cas.ll_setStringValue(addr, ((OCRPage_Type) jcasType).casFeatCode_uri, v);
    }
}

    