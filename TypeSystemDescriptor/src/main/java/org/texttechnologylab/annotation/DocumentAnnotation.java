

/* First created by JCasGen Tue Jul 16 18:21:24 CEST 2019 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;


/**
 * Updated by JCasGen Tue Jul 16 18:23:50 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyDokumentAnnotation.xml
 *
 * @generated
 */
public class DocumentAnnotation extends DocumentMetaData {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(DocumentAnnotation.class);
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
    protected DocumentAnnotation() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public DocumentAnnotation(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public DocumentAnnotation(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public DocumentAnnotation(JCas jcas, int begin, int end) {
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
    //* Feature: author

    /**
     * getter for author - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getAuthor() {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_author == null)
            jcasType.jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.DocumentAnnotation");
        return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_author);
    }

    /**
     * setter for author - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setAuthor(String v) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_author == null)
            jcasType.jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_author, v);
    }


    //*--------------*
    //* Feature: publisher

    /**
     * getter for publisher - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getPublisher() {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_publisher == null)
            jcasType.jcas.throwFeatMissing("publisher", "org.texttechnologylab.annotation.DocumentAnnotation");
        return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_publisher);
    }

    /**
     * setter for publisher - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPublisher(String v) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_publisher == null)
            jcasType.jcas.throwFeatMissing("publisher", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_publisher, v);
    }


    //*--------------*
    //* Feature: year

    /**
     * getter for year - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getYear() {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_year == null)
            jcasType.jcas.throwFeatMissing("year", "org.texttechnologylab.annotation.DocumentAnnotation");
        return jcasType.ll_cas.ll_getIntValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_year);
    }

    /**
     * setter for year - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setYear(int v) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_year == null)
            jcasType.jcas.throwFeatMissing("year", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.ll_cas.ll_setIntValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_year, v);
    }


    //*--------------*
    //* Feature: subtitle

    /**
     * getter for subtitle - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getSubtitle() {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_subtitle == null)
            jcasType.jcas.throwFeatMissing("subtitle", "org.texttechnologylab.annotation.DocumentAnnotation");
        return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_subtitle);
    }

    /**
     * setter for subtitle - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSubtitle(String v) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_subtitle == null)
            jcasType.jcas.throwFeatMissing("subtitle", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_subtitle, v);
    }


    //*--------------*
    //* Feature: metadata

    /**
     * getter for metadata - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringArray getMetadata() {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_metadata == null)
            jcasType.jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
        return (StringArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_metadata)));
    }

    /**
     * setter for metadata - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setMetadata(StringArray v) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_metadata == null)
            jcasType.jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.ll_cas.ll_setRefValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_metadata, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for metadata - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public String getMetadata(int i) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_metadata == null)
            jcasType.jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_metadata), i);
        return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_metadata), i);
    }

    /**
     * indexed setter for metadata - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setMetadata(int i, String v) {
        if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type) jcasType).casFeat_metadata == null)
            jcasType.jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.DocumentAnnotation");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_metadata), i);
        jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAnnotation_Type) jcasType).casFeatCode_metadata), i, v);
    }
}

    