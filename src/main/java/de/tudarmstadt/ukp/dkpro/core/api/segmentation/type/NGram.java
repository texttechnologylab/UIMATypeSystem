

/* First created by JCasGen Thu Feb 28 20:07:00 CET 2019 */
package de.tudarmstadt.ukp.dkpro.core.api.segmentation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu Feb 28 20:08:17 CET 2019
 * XML source: C:/Users/irrep/Documents/Sync/Arbeit/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyOCR.xml
 *
 * @generated
 */
public class NGram extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
    protected NGram() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public NGram(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public NGram(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public NGram(JCas jcas, int begin, int end) {
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
    //* Feature: text

    /**
     * getter for text - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getText() {
        if (NGram_Type.featOkTst && ((NGram_Type) jcasType).casFeat_text == null)
            jcasType.jcas.throwFeatMissing("text", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram");
        return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type) jcasType).casFeatCode_text);
    }

    /**
     * setter for text - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setText(String v) {
        if (NGram_Type.featOkTst && ((NGram_Type) jcasType).casFeat_text == null)
            jcasType.jcas.throwFeatMissing("text", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram");
        jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type) jcasType).casFeatCode_text, v);
    }
}

    