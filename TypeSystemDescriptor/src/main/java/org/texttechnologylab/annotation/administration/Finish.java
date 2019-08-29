

/* First created by JCasGen Wed Feb 20 18:22:31 CET 2019 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Jun 21 09:34:41 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 *
 * @generated
 */
public class Finish extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Finish.class);
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
    protected Finish() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Finish(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Finish(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Finish(JCas jcas, int begin, int end) {
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
    //* Feature: user

    /**
     * getter for user - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getUser() {
        if (Finish_Type.featOkTst && ((Finish_Type) jcasType).casFeat_user == null)
            jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.Finish");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Finish_Type) jcasType).casFeatCode_user);
    }

    /**
     * setter for user - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setUser(String v) {
        if (Finish_Type.featOkTst && ((Finish_Type) jcasType).casFeat_user == null)
            jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.Finish");
        jcasType.ll_cas.ll_setStringValue(addr, ((Finish_Type) jcasType).casFeatCode_user, v);
    }


    //*--------------*
    //* Feature: toolview

    /**
     * getter for toolview - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getToolview() {
        if (Finish_Type.featOkTst && ((Finish_Type) jcasType).casFeat_toolview == null)
            jcasType.jcas.throwFeatMissing("toolview", "org.texttechnologylab.annotation.administration.Finish");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Finish_Type) jcasType).casFeatCode_toolview);
    }

    /**
     * setter for toolview - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setToolview(String v) {
        if (Finish_Type.featOkTst && ((Finish_Type) jcasType).casFeat_toolview == null)
            jcasType.jcas.throwFeatMissing("toolview", "org.texttechnologylab.annotation.administration.Finish");
        jcasType.ll_cas.ll_setStringValue(addr, ((Finish_Type) jcasType).casFeatCode_toolview, v);
    }
}

    