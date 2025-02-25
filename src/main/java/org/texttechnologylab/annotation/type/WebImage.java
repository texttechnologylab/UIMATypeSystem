

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 13:16:03 CET 2025 */

package org.texttechnologylab.annotation.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


/**
 * Updated by JCasGen Tue Feb 25 13:16:03 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WebImage extends Image {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.type.WebImage";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(WebImage.class);
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

    public final static String _FeatName_posX = "posX";
    public final static String _FeatName_posY = "posY";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_posX = TypeSystemImpl.createCallSite(WebImage.class, "posX");
    private final static MethodHandle _FH_posX = _FC_posX.dynamicInvoker();
    private final static CallSite _FC_posY = TypeSystemImpl.createCallSite(WebImage.class, "posY");
    private final static MethodHandle _FH_posY = _FC_posY.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected WebImage() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public WebImage(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public WebImage(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public WebImage(JCas jcas, int begin, int end) {
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
    //* Feature: posX

    /**
     * getter for posX - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getPosX() {
        return _getIntValueNc(wrapGetIntCatchException(_FH_posX));
    }

    /**
     * setter for posX - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setPosX(int v) {
        _setIntValueNfc(wrapGetIntCatchException(_FH_posX), v);
    }


    //*--------------*
    //* Feature: posY

    /** getter for posY - gets
   * @generated
   * @return value of the feature 
   */
  public int getPosY() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_posY));
  }
    
  /** setter for posY - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosY(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_posY), v);
  }    
    
  }

    