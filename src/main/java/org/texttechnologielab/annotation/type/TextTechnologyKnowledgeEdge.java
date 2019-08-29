

/* First created by JCasGen Fri Jul 20 13:34:13 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Fri Jul 20 13:34:13 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyKnowledgeEdge.xml
 *
 * @generated
 */
public class TextTechnologyKnowledgeEdge extends Edge {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TextTechnologyKnowledgeEdge.class);
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
    protected TextTechnologyKnowledgeEdge() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TextTechnologyKnowledgeEdge(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TextTechnologyKnowledgeEdge(JCas jcas) {
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
    //* Feature: linktype

    /**
     * getter for linktype - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getLinktype() {
        if (TextTechnologyKnowledgeEdge_Type.featOkTst && ((TextTechnologyKnowledgeEdge_Type) jcasType).casFeat_linktype == null)
            jcasType.jcas.throwFeatMissing("linktype", "org.texttechnologielab.annotation.type.TextTechnologyKnowledgeEdge");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyKnowledgeEdge_Type) jcasType).casFeatCode_linktype);
    }

    /**
     * setter for linktype - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLinktype(String v) {
        if (TextTechnologyKnowledgeEdge_Type.featOkTst && ((TextTechnologyKnowledgeEdge_Type) jcasType).casFeat_linktype == null)
            jcasType.jcas.throwFeatMissing("linktype", "org.texttechnologielab.annotation.type.TextTechnologyKnowledgeEdge");
        jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyKnowledgeEdge_Type) jcasType).casFeatCode_linktype, v);
    }
}

    