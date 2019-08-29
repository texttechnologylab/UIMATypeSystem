

/* First created by JCasGen Fri Jun 21 09:34:41 CEST 2019 */
package org.texttechnologylab.annotation.sentence;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Fri Jul 12 15:48:41 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 *
 * @generated
 */
public class Anomaly extends de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Anomaly.class);
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
    protected Anomaly() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Anomaly(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Anomaly(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Anomaly(JCas jcas, int begin, int end) {
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
    //* Feature: value

    /**
     * getter for value - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getValue() {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.sentence.Anomaly");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Anomaly_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(String v) {
        if (Anomaly_Type.featOkTst && ((Anomaly_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.sentence.Anomaly");
        jcasType.ll_cas.ll_setStringValue(addr, ((Anomaly_Type) jcasType).casFeatCode_value, v);
    }
}

    