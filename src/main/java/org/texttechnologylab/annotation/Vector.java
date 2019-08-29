

/* First created by JCasGen Thu Aug 15 14:47:15 CEST 2019 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Vector in a room
 * Updated by JCasGen Thu Aug 15 14:47:15 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/TextAnnotator2/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyRoom.xml
 *
 * @generated
 */
public class Vector extends AnnotationBase {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Vector.class);
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
    protected Vector() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Vector(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Vector(JCas jcas) {
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
    //* Feature: x

    /**
     * getter for x - gets x Element
     *
     * @return value of the feature
     * @generated
     */
    public double getX() {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.Vector");
        return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_x);
    }

    /**
     * setter for x - sets x Element
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX(double v) {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.Vector");
        jcasType.ll_cas.ll_setDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_x, v);
    }


    //*--------------*
    //* Feature: y

    /**
     * getter for y - gets y Element
     *
     * @return value of the feature
     * @generated
     */
    public double getY() {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.Vector");
        return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_y);
    }

    /**
     * setter for y - sets y Element
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setY(double v) {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.Vector");
        jcasType.ll_cas.ll_setDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_y, v);
    }


    //*--------------*
    //* Feature: z

    /**
     * getter for z - gets z Element
     *
     * @return value of the feature
     * @generated
     */
    public double getZ() {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_z == null)
            jcasType.jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.Vector");
        return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_z);
    }

    /**
     * setter for z - sets z Element
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setZ(double v) {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_z == null)
            jcasType.jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.Vector");
        jcasType.ll_cas.ll_setDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_z, v);
    }


    //*--------------*
    //* Feature: w

    /**
     * getter for w - gets w Element (optimal)
     *
     * @return value of the feature
     * @generated
     */
    public double getW() {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_w == null)
            jcasType.jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.Vector");
        return jcasType.ll_cas.ll_getDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_w);
    }

    /**
     * setter for w - sets w Element (optimal)
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setW(double v) {
        if (Vector_Type.featOkTst && ((Vector_Type) jcasType).casFeat_w == null)
            jcasType.jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.Vector");
        jcasType.ll_cas.ll_setDoubleValue(addr, ((Vector_Type) jcasType).casFeatCode_w, v);
    }
}

    