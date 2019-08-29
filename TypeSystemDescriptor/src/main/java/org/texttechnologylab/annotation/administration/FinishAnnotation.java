

/* First created by JCasGen Thu Jul 04 16:45:39 CEST 2019 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;


/**
 * Updated by JCasGen Fri Jul 12 15:48:41 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 *
 * @generated
 */
public class FinishAnnotation extends DocumentMetaData {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(FinishAnnotation.class);
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
    protected FinishAnnotation() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public FinishAnnotation(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public FinishAnnotation(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public FinishAnnotation(JCas jcas, int begin, int end) {
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
        if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type) jcasType).casFeat_user == null)
            jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.FinishAnnotation");
        return jcasType.ll_cas.ll_getStringValue(addr, ((FinishAnnotation_Type) jcasType).casFeatCode_user);
    }

    /**
     * setter for user - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setUser(String v) {
        if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type) jcasType).casFeat_user == null)
            jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.FinishAnnotation");
        jcasType.ll_cas.ll_setStringValue(addr, ((FinishAnnotation_Type) jcasType).casFeatCode_user, v);
    }


    //*--------------*
    //* Feature: comment

    /**
     * getter for comment - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getComment() {
        if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type) jcasType).casFeat_comment == null)
            jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.FinishAnnotation");
        return jcasType.ll_cas.ll_getStringValue(addr, ((FinishAnnotation_Type) jcasType).casFeatCode_comment);
    }

    /**
     * setter for comment - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setComment(String v) {
        if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type) jcasType).casFeat_comment == null)
            jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.FinishAnnotation");
        jcasType.ll_cas.ll_setStringValue(addr, ((FinishAnnotation_Type) jcasType).casFeatCode_comment, v);
    }


    //*--------------*
    //* Feature: tool

    /**
     * getter for tool - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getTool() {
        if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type) jcasType).casFeat_tool == null)
            jcasType.jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.FinishAnnotation");
        return jcasType.ll_cas.ll_getStringValue(addr, ((FinishAnnotation_Type) jcasType).casFeatCode_tool);
    }

    /**
     * setter for tool - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setTool(String v) {
        if (FinishAnnotation_Type.featOkTst && ((FinishAnnotation_Type) jcasType).casFeat_tool == null)
            jcasType.jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.FinishAnnotation");
        jcasType.ll_cas.ll_setStringValue(addr, ((FinishAnnotation_Type) jcasType).casFeatCode_tool, v);
    }
}

    