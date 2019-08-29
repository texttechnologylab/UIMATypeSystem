

/* First created by JCasGen Thu Aug 30 01:52:35 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Mon May 06 17:11:48 CEST 2019
 * XML source: C:/Users/Elias/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyQuickAnno.xml
 *
 * @generated
 */
public class QuickAnnoUnit extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(QuickAnnoUnit.class);
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
    protected QuickAnnoUnit() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public QuickAnnoUnit(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public QuickAnnoUnit(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public QuickAnnoUnit(JCas jcas, int begin, int end) {
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
    //* Feature: begin

    /**
     * getter for begin - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getBegin() {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return jcasType.ll_cas.ll_getIntValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_begin);
    }

    /**
     * setter for begin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBegin(int v) {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        jcasType.ll_cas.ll_setIntValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_begin, v);
    }


    //*--------------*
    //* Feature: end

    /**
     * getter for end - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getEnd() {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return jcasType.ll_cas.ll_getIntValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_end);
    }

    /**
     * setter for end - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEnd(int v) {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        jcasType.ll_cas.ll_setIntValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_end, v);
    }


    //*--------------*
    //* Feature: combined

    /**
     * getter for combined - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getCombined() {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_combined == null)
            jcasType.jcas.throwFeatMissing("combined", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_combined);
    }

    /**
     * setter for combined - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setCombined(boolean v) {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_combined == null)
            jcasType.jcas.throwFeatMissing("combined", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_combined, v);
    }


    //*--------------*
    //* Feature: pos

    /**
     * getter for pos - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getPos() {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_pos == null)
            jcasType.jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return jcasType.ll_cas.ll_getStringValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_pos);
    }

    /**
     * setter for pos - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPos(String v) {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_pos == null)
            jcasType.jcas.throwFeatMissing("pos", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        jcasType.ll_cas.ll_setStringValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_pos, v);
    }


    //*--------------*
    //* Feature: origin

    /**
     * getter for origin - gets
     *
     * @return value of the feature
     * @generated
     */
    public Annotation getOrigin() {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_origin == null)
            jcasType.jcas.throwFeatMissing("origin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        return (Annotation) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_origin)));
    }

    /**
     * setter for origin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setOrigin(Annotation v) {
        if (QuickAnnoUnit_Type.featOkTst && ((QuickAnnoUnit_Type) jcasType).casFeat_origin == null)
            jcasType.jcas.throwFeatMissing("origin", "org.texttechnologielab.annotation.type.QuickAnnoUnit");
        jcasType.ll_cas.ll_setRefValue(addr, ((QuickAnnoUnit_Type) jcasType).casFeatCode_origin, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    