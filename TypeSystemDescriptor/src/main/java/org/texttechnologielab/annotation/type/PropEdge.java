

/* First created by JCasGen Fri Jul 20 13:34:22 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Fri Jul 20 13:34:22 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TexttechnologyPropAnno.xml
 *
 * @generated
 */
public class PropEdge extends Edge {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(PropEdge.class);
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
    protected PropEdge() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public PropEdge(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public PropEdge(JCas jcas) {
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
    //* Feature: mode

    /**
     * getter for mode - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getMode() {
        if (PropEdge_Type.featOkTst && ((PropEdge_Type) jcasType).casFeat_mode == null)
            jcasType.jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.PropEdge");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropEdge_Type) jcasType).casFeatCode_mode);
    }

    /**
     * setter for mode - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setMode(String v) {
        if (PropEdge_Type.featOkTst && ((PropEdge_Type) jcasType).casFeat_mode == null)
            jcasType.jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.PropEdge");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropEdge_Type) jcasType).casFeatCode_mode, v);
    }


    //*--------------*
    //* Feature: graphSource

    /**
     * getter for graphSource - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getGraphSource() {
        if (PropEdge_Type.featOkTst && ((PropEdge_Type) jcasType).casFeat_graphSource == null)
            jcasType.jcas.throwFeatMissing("graphSource", "org.texttechnologielab.annotation.type.PropEdge");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropEdge_Type) jcasType).casFeatCode_graphSource);
    }

    /**
     * setter for graphSource - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setGraphSource(String v) {
        if (PropEdge_Type.featOkTst && ((PropEdge_Type) jcasType).casFeat_graphSource == null)
            jcasType.jcas.throwFeatMissing("graphSource", "org.texttechnologielab.annotation.type.PropEdge");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropEdge_Type) jcasType).casFeatCode_graphSource, v);
    }


    //*--------------*
    //* Feature: graphTarget

    /**
     * getter for graphTarget - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getGraphTarget() {
        if (PropEdge_Type.featOkTst && ((PropEdge_Type) jcasType).casFeat_graphTarget == null)
            jcasType.jcas.throwFeatMissing("graphTarget", "org.texttechnologielab.annotation.type.PropEdge");
        return jcasType.ll_cas.ll_getStringValue(addr, ((PropEdge_Type) jcasType).casFeatCode_graphTarget);
    }

    /**
     * setter for graphTarget - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setGraphTarget(String v) {
        if (PropEdge_Type.featOkTst && ((PropEdge_Type) jcasType).casFeat_graphTarget == null)
            jcasType.jcas.throwFeatMissing("graphTarget", "org.texttechnologielab.annotation.type.PropEdge");
        jcasType.ll_cas.ll_setStringValue(addr, ((PropEdge_Type) jcasType).casFeatCode_graphTarget, v);
    }
}

    