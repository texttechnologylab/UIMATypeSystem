

   
/* Apache UIMA v3 - First created by JCasGen Thu Apr 17 16:51:19 CEST 2025 */

package org.texttechnologylab.annotation.parliament;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Thu Apr 17 16:51:19 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 *
 * @generated
 */
public class Speaker extends Annotation {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.parliament.Speaker";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Speaker.class);
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

    public final static String _FeatName_label = "label";
    public final static String _FeatName_firstname = "firstname";
    public final static String _FeatName_name = "name";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_label = TypeSystemImpl.createCallSite(Speaker.class, "label");
    private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
    private final static CallSite _FC_firstname = TypeSystemImpl.createCallSite(Speaker.class, "firstname");
    private final static MethodHandle _FH_firstname = _FC_firstname.dynamicInvoker();
    private final static CallSite _FC_name = TypeSystemImpl.createCallSite(Speaker.class, "name");
    private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected Speaker() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public Speaker(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Speaker(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Speaker(JCas jcas, int begin, int end) {
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
    //* Feature: label

    /**
     * getter for label - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getLabel() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_label));
    }

    /**
     * setter for label - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setLabel(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
    }


    //*--------------*
    //* Feature: firstname

    /**
     * getter for firstname - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getFirstname() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_firstname));
    }

    /**
     * setter for firstname - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setFirstname(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_firstname), v);
    }


    //*--------------*
    //* Feature: name

    /**
     * getter for name - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getName() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_name));
    }

    /**
     * setter for name - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setName(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
    }

}

    