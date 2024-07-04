

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:09:04 CEST 2024 */

package org.texttechnologylab.annotation.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu Jul 04 15:09:04 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Speech extends Annotation {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.type.Speech";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Speech.class);
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

    public final static String _FeatName_speaker = "speaker";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_speaker = TypeSystemImpl.createCallSite(Speech.class, "speaker");
    private final static MethodHandle _FH_speaker = _FC_speaker.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected Speech() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public Speech(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Speech(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Speech(JCas jcas, int begin, int end) {
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
    //* Feature: speaker

    /**
     * getter for speaker - gets
     *
     * @return value of the feature
     * @generated
     */
    public Speaker getSpeaker() {
        return (Speaker) (_getFeatureValueNc(wrapGetIntCatchException(_FH_speaker)));
    }

    /**
     * setter for speaker - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSpeaker(Speaker v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_speaker), v);
  }    
    
  }

    