

/* First created by JCasGen Fri Oct 05 13:23:05 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


import org.apache.uima.jcas.cas.TOP;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class Fingerprint extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Fingerprint.class);
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
    protected Fingerprint() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Fingerprint(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Fingerprint(JCas jcas) {
        super(jcas);
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
        if (Fingerprint_Type.featOkTst && ((Fingerprint_Type) jcasType).casFeat_user == null)
            jcasType.jcas.throwFeatMissing("user", "org.texttechnologielab.annotation.type.Fingerprint");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Fingerprint_Type) jcasType).casFeatCode_user);
    }

    /**
     * setter for user - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setUser(String v) {
        if (Fingerprint_Type.featOkTst && ((Fingerprint_Type) jcasType).casFeat_user == null)
            jcasType.jcas.throwFeatMissing("user", "org.texttechnologielab.annotation.type.Fingerprint");
        jcasType.ll_cas.ll_setStringValue(addr, ((Fingerprint_Type) jcasType).casFeatCode_user, v);
    }


    //*--------------*
    //* Feature: create

    /**
     * getter for create - gets
     *
     * @return value of the feature
     * @generated
     */
    public long getCreate() {
        if (Fingerprint_Type.featOkTst && ((Fingerprint_Type) jcasType).casFeat_create == null)
            jcasType.jcas.throwFeatMissing("create", "org.texttechnologielab.annotation.type.Fingerprint");
        return jcasType.ll_cas.ll_getLongValue(addr, ((Fingerprint_Type) jcasType).casFeatCode_create);
    }

    /**
     * setter for create - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setCreate(long v) {
        if (Fingerprint_Type.featOkTst && ((Fingerprint_Type) jcasType).casFeat_create == null)
            jcasType.jcas.throwFeatMissing("create", "org.texttechnologielab.annotation.type.Fingerprint");
        jcasType.ll_cas.ll_setLongValue(addr, ((Fingerprint_Type) jcasType).casFeatCode_create, v);
    }


    //*--------------*
    //* Feature: reference

    /**
     * getter for reference - gets
     *
     * @return value of the feature
     * @generated
     */
    public TOP getReference() {
        if (Fingerprint_Type.featOkTst && ((Fingerprint_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.Fingerprint");
        return (TOP) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Fingerprint_Type) jcasType).casFeatCode_reference)));
    }

    /**
     * setter for reference - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setReference(TOP v) {
        if (Fingerprint_Type.featOkTst && ((Fingerprint_Type) jcasType).casFeat_reference == null)
            jcasType.jcas.throwFeatMissing("reference", "org.texttechnologielab.annotation.type.Fingerprint");
        jcasType.ll_cas.ll_setRefValue(addr, ((Fingerprint_Type) jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    