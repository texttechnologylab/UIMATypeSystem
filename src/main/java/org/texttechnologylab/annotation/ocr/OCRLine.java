

/* First created by JCasGen Fri Jan 18 17:39:48 CET 2019 */
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
public class OCRLine extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(OCRLine.class);
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
    protected OCRLine() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public OCRLine(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public OCRLine(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public OCRLine(JCas jcas, int begin, int end) {
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
    //* Feature: baseline

    /**
     * getter for baseline - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getBaseline() {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_baseline == null)
            jcasType.jcas.throwFeatMissing("baseline", "org.texttechnologylab.annotation.ocr.OCRLine");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_baseline);
    }

    /**
     * setter for baseline - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBaseline(int v) {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_baseline == null)
            jcasType.jcas.throwFeatMissing("baseline", "org.texttechnologylab.annotation.ocr.OCRLine");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_baseline, v);
    }


    //*--------------*
    //* Feature: top

    /**
     * getter for top - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getTop() {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_top == null)
            jcasType.jcas.throwFeatMissing("top", "org.texttechnologylab.annotation.ocr.OCRLine");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_top);
    }

    /**
     * setter for top - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setTop(int v) {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_top == null)
            jcasType.jcas.throwFeatMissing("top", "org.texttechnologylab.annotation.ocr.OCRLine");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_top, v);
    }


    //*--------------*
    //* Feature: bottom

    /**
     * getter for bottom - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getBottom() {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_bottom == null)
            jcasType.jcas.throwFeatMissing("bottom", "org.texttechnologylab.annotation.ocr.OCRLine");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_bottom);
    }

    /**
     * setter for bottom - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBottom(int v) {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_bottom == null)
            jcasType.jcas.throwFeatMissing("bottom", "org.texttechnologylab.annotation.ocr.OCRLine");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_bottom, v);
    }


    //*--------------*
    //* Feature: left

    /**
     * getter for left - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getLeft() {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_left == null)
            jcasType.jcas.throwFeatMissing("left", "org.texttechnologylab.annotation.ocr.OCRLine");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_left);
    }

    /**
     * setter for left - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLeft(int v) {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_left == null)
            jcasType.jcas.throwFeatMissing("left", "org.texttechnologylab.annotation.ocr.OCRLine");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_left, v);
    }


    //*--------------*
    //* Feature: right

    /**
     * getter for right - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getRight() {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_right == null)
            jcasType.jcas.throwFeatMissing("right", "org.texttechnologylab.annotation.ocr.OCRLine");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_right);
    }

    /**
     * setter for right - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRight(int v) {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_right == null)
            jcasType.jcas.throwFeatMissing("right", "org.texttechnologylab.annotation.ocr.OCRLine");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRLine_Type) jcasType).casFeatCode_right, v);
    }


    //*--------------*
    //* Feature: format

    /**
     * getter for format - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getFormat() {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_format == null)
            jcasType.jcas.throwFeatMissing("format", "org.texttechnologylab.annotation.ocr.OCRLine");
        return jcasType.ll_cas.ll_getStringValue(addr, ((OCRLine_Type) jcasType).casFeatCode_format);
    }

    /**
     * setter for format - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setFormat(String v) {
        if (OCRLine_Type.featOkTst && ((OCRLine_Type) jcasType).casFeat_format == null)
            jcasType.jcas.throwFeatMissing("format", "org.texttechnologylab.annotation.ocr.OCRLine");
        jcasType.ll_cas.ll_setStringValue(addr, ((OCRLine_Type) jcasType).casFeatCode_format, v);
    }
}

    