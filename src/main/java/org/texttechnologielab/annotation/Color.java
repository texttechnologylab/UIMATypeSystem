

/* First created by JCasGen Fri Jul 20 13:34:07 CEST 2018 */
package org.texttechnologielab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologielab.annotation.type.AnnotationNode;


/**
 * Updated by JCasGen Fri Jul 20 13:34:07 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyColor.xml
 *
 * @generated
 */
public class Color extends AnnotationNode {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Color.class);
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
    protected Color() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Color(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Color(JCas jcas) {
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
    //* Feature: rgb

    /**
     * getter for rgb - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getRgb() {
        if (Color_Type.featOkTst && ((Color_Type) jcasType).casFeat_rgb == null)
            jcasType.jcas.throwFeatMissing("rgb", "org.texttechnologielab.annotation.Color");
        return jcasType.ll_cas.ll_getStringValue(addr, ((Color_Type) jcasType).casFeatCode_rgb);
    }

    /**
     * setter for rgb - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRgb(String v) {
        if (Color_Type.featOkTst && ((Color_Type) jcasType).casFeat_rgb == null)
            jcasType.jcas.throwFeatMissing("rgb", "org.texttechnologielab.annotation.Color");
        jcasType.ll_cas.ll_setStringValue(addr, ((Color_Type) jcasType).casFeatCode_rgb, v);
    }
}

    