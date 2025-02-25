

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 13:16:03 CET 2025 */

package org.texttechnologylab.annotation.paper;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


/**
 * Updated by JCasGen Tue Feb 25 13:16:03 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Table extends FloatingElements {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.paper.Table";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Table.class);
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


    /* *******************
     *   Feature Offsets *
     * *******************/



    /* Feature Adjusted Offsets */


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected Table() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public Table(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Table(JCas jcas) {
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

    