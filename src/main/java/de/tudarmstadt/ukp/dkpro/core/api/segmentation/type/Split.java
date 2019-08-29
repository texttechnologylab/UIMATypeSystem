

/* First created by JCasGen Thu Feb 28 20:07:01 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.segmentation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * This type represents a part of a decompounding word. A Split can be either a CompoundPart or a LinkingMorpheme.
 * Updated by JCasGen Thu Feb 28 20:08:17 CET 2019
 * XML source: C:/Users/irrep/Documents/Sync/Arbeit/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyOCR.xml
 *
 * @generated
 */
public class Split extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Split.class);
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
    protected Split() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Split(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Split(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Split(JCas jcas, int begin, int end) {
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
    //* Feature: splits

    /**
     * getter for splits - gets Sub-splits of the current split.
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getSplits() {
        if (Split_Type.featOkTst && ((Split_Type) jcasType).casFeat_splits == null)
            jcasType.jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Split_Type) jcasType).casFeatCode_splits)));
    }

    /**
     * setter for splits - sets Sub-splits of the current split.
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSplits(FSArray v) {
        if (Split_Type.featOkTst && ((Split_Type) jcasType).casFeat_splits == null)
            jcasType.jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        jcasType.ll_cas.ll_setRefValue(addr, ((Split_Type) jcasType).casFeatCode_splits, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for splits - gets an indexed value - Sub-splits of the current split.
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public Split getSplits(int i) {
        if (Split_Type.featOkTst && ((Split_Type) jcasType).casFeat_splits == null)
            jcasType.jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Split_Type) jcasType).casFeatCode_splits), i);
        return (Split) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Split_Type) jcasType).casFeatCode_splits), i)));
    }

    /**
     * indexed setter for splits - sets an indexed value - Sub-splits of the current split.
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setSplits(int i, Split v) {
        if (Split_Type.featOkTst && ((Split_Type) jcasType).casFeat_splits == null)
            jcasType.jcas.throwFeatMissing("splits", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Split");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Split_Type) jcasType).casFeatCode_splits), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Split_Type) jcasType).casFeatCode_splits), i, jcasType.ll_cas.ll_getFSRef(v));
    }
}

    