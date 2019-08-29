

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
public class OCRBlock extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(OCRBlock.class);
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
    protected OCRBlock() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public OCRBlock(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public OCRBlock(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public OCRBlock(JCas jcas, int begin, int end) {
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
    //* Feature: top

    /**
     * getter for top - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getTop() {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_top == null)
            jcasType.jcas.throwFeatMissing("top", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_top);
    }

    /**
     * setter for top - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setTop(int v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_top == null)
            jcasType.jcas.throwFeatMissing("top", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_top, v);
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
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_bottom == null)
            jcasType.jcas.throwFeatMissing("bottom", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_bottom);
    }

    /**
     * setter for bottom - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBottom(int v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_bottom == null)
            jcasType.jcas.throwFeatMissing("bottom", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_bottom, v);
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
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_left == null)
            jcasType.jcas.throwFeatMissing("left", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_left);
    }

    /**
     * setter for left - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLeft(int v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_left == null)
            jcasType.jcas.throwFeatMissing("left", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_left, v);
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
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_right == null)
            jcasType.jcas.throwFeatMissing("right", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_right);
    }

    /**
     * setter for right - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRight(int v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_right == null)
            jcasType.jcas.throwFeatMissing("right", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setIntValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_right, v);
    }


    //*--------------*
    //* Feature: blockType

    /**
     * getter for blockType - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getBlockType() {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_blockType == null)
            jcasType.jcas.throwFeatMissing("blockType", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getStringValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_blockType);
    }

    /**
     * setter for blockType - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBlockType(String v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_blockType == null)
            jcasType.jcas.throwFeatMissing("blockType", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setStringValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_blockType, v);
    }


    //*--------------*
    //* Feature: blockName

    /**
     * getter for blockName - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getBlockName() {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_blockName == null)
            jcasType.jcas.throwFeatMissing("blockName", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getStringValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_blockName);
    }

    /**
     * setter for blockName - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBlockName(String v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_blockName == null)
            jcasType.jcas.throwFeatMissing("blockName", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setStringValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_blockName, v);
    }


    //*--------------*
    //* Feature: valid

    /**
     * getter for valid - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getValid() {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_valid == null)
            jcasType.jcas.throwFeatMissing("valid", "org.texttechnologylab.annotation.ocr.OCRBlock");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_valid);
    }

    /**
     * setter for valid - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValid(boolean v) {
        if (OCRBlock_Type.featOkTst && ((OCRBlock_Type) jcasType).casFeat_valid == null)
            jcasType.jcas.throwFeatMissing("valid", "org.texttechnologylab.annotation.ocr.OCRBlock");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((OCRBlock_Type) jcasType).casFeatCode_valid, v);
    }
}

    