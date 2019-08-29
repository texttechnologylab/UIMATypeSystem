

/* First created by JCasGen Wed Feb 14 16:42:04 CET 2018 */
package org.hucompute.services.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Wed Mar 28 16:47:51 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyEntity.xml
 *
 * @generated
 */
public class RelationSet extends AnnotationBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(RelationSet.class);
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
    protected RelationSet() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public RelationSet(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public RelationSet(JCas jcas) {
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
    //* Feature: relations

    /**
     * getter for relations - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getRelations() {
        if (RelationSet_Type.featOkTst && ((RelationSet_Type) jcasType).casFeat_relations == null)
            jcasType.jcas.throwFeatMissing("relations", "org.hucompute.services.type.RelationSet");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type) jcasType).casFeatCode_relations)));
    }

    /**
     * setter for relations - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRelations(FSArray v) {
        if (RelationSet_Type.featOkTst && ((RelationSet_Type) jcasType).casFeat_relations == null)
            jcasType.jcas.throwFeatMissing("relations", "org.hucompute.services.type.RelationSet");
        jcasType.ll_cas.ll_setRefValue(addr, ((RelationSet_Type) jcasType).casFeatCode_relations, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for relations - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public RelationDescription getRelations(int i) {
        if (RelationSet_Type.featOkTst && ((RelationSet_Type) jcasType).casFeat_relations == null)
            jcasType.jcas.throwFeatMissing("relations", "org.hucompute.services.type.RelationSet");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type) jcasType).casFeatCode_relations), i);
        return (RelationDescription) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type) jcasType).casFeatCode_relations), i)));
    }

    /**
     * indexed setter for relations - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setRelations(int i, RelationDescription v) {
        if (RelationSet_Type.featOkTst && ((RelationSet_Type) jcasType).casFeat_relations == null)
            jcasType.jcas.throwFeatMissing("relations", "org.hucompute.services.type.RelationSet");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type) jcasType).casFeatCode_relations), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RelationSet_Type) jcasType).casFeatCode_relations), i, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    