

/* First created by JCasGen Wed Aug 28 09:38:42 CEST 2019 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.node.type.Context;


/**
 * Updated by JCasGen Wed Aug 28 09:38:42 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 *
 * @generated
 */
public class PersonContext extends Context {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(PersonContext.class);
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
    protected PersonContext() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public PersonContext(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public PersonContext(JCas jcas) {
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
    //* Feature: birthDate

    /**
     * getter for birthDate - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getBirthDate() {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_birthDate == null)
            jcasType.jcas.throwFeatMissing("birthDate", "org.texttechnologylab.annotation.context.type.PersonContext");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_birthDate);
    }

    /**
     * setter for birthDate - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBirthDate(String v) {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_birthDate == null)
            jcasType.jcas.throwFeatMissing("birthDate", "org.texttechnologylab.annotation.context.type.PersonContext");
        jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_birthDate, v);
    }


    //*--------------*
    //* Feature: Name

    /**
     * getter for Name - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getName() {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_Name == null)
            jcasType.jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.context.type.PersonContext");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_Name);
    }

    /**
     * setter for Name - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setName(String v) {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_Name == null)
            jcasType.jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.context.type.PersonContext");
        jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_Name, v);
    }


    //*--------------*
    //* Feature: contextInf

    /**
     * getter for contextInf - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getContextInf() {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_contextInf == null)
            jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.PersonContext");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_contextInf);
    }

    /**
     * setter for contextInf - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setContextInf(String v) {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_contextInf == null)
            jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.PersonContext");
        jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_contextInf, v);
    }


    //*--------------*
    //* Feature: gender

    /**
     * getter for gender - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getGender() {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_gender == null)
            jcasType.jcas.throwFeatMissing("gender", "org.texttechnologylab.annotation.context.type.PersonContext");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_gender);
    }

    /**
     * setter for gender - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setGender(String v) {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_gender == null)
            jcasType.jcas.throwFeatMissing("gender", "org.texttechnologylab.annotation.context.type.PersonContext");
        jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_gender, v);
    }


    //*--------------*
    //* Feature: birthPlace

    /**
     * getter for birthPlace - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getBirthPlace() {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_birthPlace == null)
            jcasType.jcas.throwFeatMissing("birthPlace", "org.texttechnologylab.annotation.context.type.PersonContext");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_birthPlace);
    }

    /**
     * setter for birthPlace - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBirthPlace(String v) {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_birthPlace == null)
            jcasType.jcas.throwFeatMissing("birthPlace", "org.texttechnologylab.annotation.context.type.PersonContext");
        jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_birthPlace, v);
    }


    //*--------------*
    //* Feature: fieldOfWork

    /**
     * getter for fieldOfWork - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getFieldOfWork() {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_fieldOfWork == null)
            jcasType.jcas.throwFeatMissing("fieldOfWork", "org.texttechnologylab.annotation.context.type.PersonContext");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_fieldOfWork);
    }

    /**
     * setter for fieldOfWork - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setFieldOfWork(String v) {
        if (PersonContext_Type.featOkTst && ((PersonContext_Type) jcasType).casFeat_fieldOfWork == null)
            jcasType.jcas.throwFeatMissing("fieldOfWork", "org.texttechnologylab.annotation.context.type.PersonContext");
        jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type) jcasType).casFeatCode_fieldOfWork, v);
    }
}

    