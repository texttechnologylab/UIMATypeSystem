

/* First created by JCasGen Wed Feb 14 16:42:04 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class RelationDescription extends Attribute {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(RelationDescription.class);
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
    protected RelationDescription() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public RelationDescription(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public RelationDescription(JCas jcas) {
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
    //* Feature: name

    /**
     * getter for name - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getName() {
        if (RelationDescription_Type.featOkTst && ((RelationDescription_Type) jcasType).casFeat_name == null)
            jcasType.jcas.throwFeatMissing("name", "org.hucompute.services.type.RelationDescription");
        return jcasType.ll_cas.ll_getStringValue(addr, ((RelationDescription_Type) jcasType).casFeatCode_name);
    }

    /**
     * setter for name - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setName(String v) {
        if (RelationDescription_Type.featOkTst && ((RelationDescription_Type) jcasType).casFeat_name == null)
            jcasType.jcas.throwFeatMissing("name", "org.hucompute.services.type.RelationDescription");
        jcasType.ll_cas.ll_setStringValue(addr, ((RelationDescription_Type) jcasType).casFeatCode_name, v);
    }


    //*--------------*
    //* Feature: relationtype

    /**
     * getter for relationtype - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getRelationtype() {
        if (RelationDescription_Type.featOkTst && ((RelationDescription_Type) jcasType).casFeat_relationtype == null)
            jcasType.jcas.throwFeatMissing("relationtype", "org.hucompute.services.type.RelationDescription");
        return jcasType.ll_cas.ll_getStringValue(addr, ((RelationDescription_Type) jcasType).casFeatCode_relationtype);
    }

    /**
     * setter for relationtype - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRelationtype(String v) {
        if (RelationDescription_Type.featOkTst && ((RelationDescription_Type) jcasType).casFeat_relationtype == null)
            jcasType.jcas.throwFeatMissing("relationtype", "org.hucompute.services.type.RelationDescription");
        jcasType.ll_cas.ll_setStringValue(addr, ((RelationDescription_Type) jcasType).casFeatCode_relationtype, v);
    }
}

    