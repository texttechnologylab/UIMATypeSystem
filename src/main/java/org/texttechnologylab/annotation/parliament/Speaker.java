


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:31:39 CEST 2025 */

package org.texttechnologylab.annotation.parliament;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Apr 18 23:31:39 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Speaker extends Annotation {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.parliament.Speaker";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Speaker.class);
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}


    /* *******************
   *   Feature Offsets *
     * *******************/

  public final static String _FeatName_label = "label";
  public final static String _FeatName_firstname = "firstname";
  public final static String _FeatName_name = "name";
    public final static String _FeatName_title = "title";
    public final static String _FeatName_role = "role";
    public final static String _FeatName_party = "party";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_label = TypeSystemImpl.createCallSite(Speaker.class, "label");
  private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
  private final static CallSite _FC_firstname = TypeSystemImpl.createCallSite(Speaker.class, "firstname");
  private final static MethodHandle _FH_firstname = _FC_firstname.dynamicInvoker();
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(Speaker.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
    private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Speaker.class, "title");
    private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
    private final static CallSite _FC_role = TypeSystemImpl.createCallSite(Speaker.class, "role");
    private final static MethodHandle _FH_role = _FC_role.dynamicInvoker();
    private final static CallSite _FC_party = TypeSystemImpl.createCallSite(Speaker.class, "party");
    private final static MethodHandle _FH_party = _FC_party.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Speaker() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public Speaker(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public Speaker(JCas jcas) {
    super(jcas);
      readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
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

    /** getter for label - gets
   * @generated
     * @return value of the feature
   */
    public String getLabel() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_label));
  }

    /** setter for label - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
  }



  //*--------------*
  //* Feature: firstname

    /** getter for firstname - gets
   * @generated
     * @return value of the feature
   */
    public String getFirstname() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_firstname));
  }

    /** setter for firstname - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setFirstname(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_firstname), v);
  }



  //*--------------*
  //* Feature: name

    /** getter for name - gets
   * @generated
     * @return value of the feature
   */
    public String getName() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_name));
  }

    /** setter for name - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
  }


    //*--------------*
    //* Feature: title

    /**
     * getter for title - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getTitle() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_title));
    }

    /**
     * setter for title - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setTitle(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
    }


    //*--------------*
    //* Feature: role

    /**
     * getter for role - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getRole() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_role));
    }

    /**
     * setter for role - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setRole(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_role), v);
    }


    //*--------------*
    //* Feature: party

    /**
     * getter for party - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getParty() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_party));
    }

    /**
     * setter for party - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setParty(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_party), v);
    }

  }

