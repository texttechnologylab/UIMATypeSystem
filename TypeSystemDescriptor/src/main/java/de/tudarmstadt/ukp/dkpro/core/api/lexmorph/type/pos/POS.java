

/* First created by JCasGen Thu Feb 28 20:07:00 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/**
 * The part of speech of a word or a phrase.
 * Updated by JCasGen Thu Feb 28 20:08:16 CET 2019
 * XML source: C:/Users/irrep/Documents/Sync/Arbeit/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyOCR.xml
 *
 * @generated
 */
public class POS extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(POS.class);
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
    protected POS() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public POS(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public POS(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public POS(JCas jcas, int begin, int end) {
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
    //* Feature: PosValue

    /**
     * getter for PosValue - gets The string representation of POS. Mostly it is the POS
     * representation of the wrapped POS tagger.
     *
     * @return value of the feature
     * @generated
     */
    public String getPosValue() {
        if (POS_Type.featOkTst && ((POS_Type) jcasType).casFeat_PosValue == null)
            jcasType.jcas.throwFeatMissing("PosValue", "de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS");
        return jcasType.ll_cas.ll_getStringValue(addr, ((POS_Type) jcasType).casFeatCode_PosValue);
    }

    /**
     * setter for PosValue - sets The string representation of POS. Mostly it is the POS
     * representation of the wrapped POS tagger.
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPosValue(String v) {
        if (POS_Type.featOkTst && ((POS_Type) jcasType).casFeat_PosValue == null)
            jcasType.jcas.throwFeatMissing("PosValue", "de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS");
        jcasType.ll_cas.ll_setStringValue(addr, ((POS_Type) jcasType).casFeatCode_PosValue, v);
    }
}

    