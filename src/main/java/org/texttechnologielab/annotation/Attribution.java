

/* First created by JCasGen Fri Jul 20 13:34:04 CEST 2018 */
package org.texttechnologielab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologielab.annotation.type.AnnotationNode;


/**
 * Updated by JCasGen Fri Jul 20 13:34:04 CEST 2018
 * XML source: /home/abrami/Projects/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyAttribution.xml
 *
 * @generated
 */
public class Attribution extends AnnotationNode {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Attribution.class);
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
    protected Attribution() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public Attribution(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Attribution(JCas jcas) {
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

}

    