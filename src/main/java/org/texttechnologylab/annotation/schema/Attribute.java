


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:31:39 CEST 2025 */

package org.texttechnologylab.annotation.schema;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Fri Apr 18 23:31:39 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Attribute extends AnnotationBase {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.schema.Attribute";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Attribute.class);
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

  public final static String _FeatName_name = "name";
  public final static String _FeatName_description = "description";
  public final static String _FeatName_range = "range";
  public final static String _FeatName_mandatory = "mandatory";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(Attribute.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_description = TypeSystemImpl.createCallSite(Attribute.class, "description");
  private final static MethodHandle _FH_description = _FC_description.dynamicInvoker();
  private final static CallSite _FC_range = TypeSystemImpl.createCallSite(Attribute.class, "range");
  private final static MethodHandle _FH_range = _FC_range.dynamicInvoker();
  private final static CallSite _FC_mandatory = TypeSystemImpl.createCallSite(Attribute.class, "mandatory");
  private final static MethodHandle _FH_mandatory = _FC_mandatory.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Attribute() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public Attribute(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public Attribute(JCas jcas) {
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
  //* Feature: description

    /** getter for description - gets
   * @generated
     * @return value of the feature
   */
    public String getDescription() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_description));
  }

    /** setter for description - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setDescription(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_description), v);
  }



  //*--------------*
  //* Feature: range

    /** getter for range - gets
   * @generated
     * @return value of the feature
   */
    public TOP getRange() {
    return (TOP)(_getFeatureValueNc(wrapGetIntCatchException(_FH_range)));
  }

    /** setter for range - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setRange(TOP v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_range), v);
  }



  //*--------------*
  //* Feature: mandatory

    /** getter for mandatory - gets
   * @generated
     * @return value of the feature
   */
    public boolean getMandatory() {
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_mandatory));
  }

    /** setter for mandatory - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setMandatory(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_mandatory), v);
  }

  }

