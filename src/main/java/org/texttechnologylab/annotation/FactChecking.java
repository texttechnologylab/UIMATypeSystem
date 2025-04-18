


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Does the assertion confirm the statement
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FactChecking extends Annotation {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.FactChecking";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FactChecking.class);
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

  public final static String _FeatName_Fact = "Fact";
  public final static String _FeatName_Claim = "Claim";
  public final static String _FeatName_consistency = "consistency";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Fact = TypeSystemImpl.createCallSite(FactChecking.class, "Fact");
  private final static MethodHandle _FH_Fact = _FC_Fact.dynamicInvoker();
  private final static CallSite _FC_Claim = TypeSystemImpl.createCallSite(FactChecking.class, "Claim");
  private final static MethodHandle _FH_Claim = _FC_Claim.dynamicInvoker();
  private final static CallSite _FC_consistency = TypeSystemImpl.createCallSite(FactChecking.class, "consistency");
  private final static MethodHandle _FH_consistency = _FC_consistency.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(FactChecking.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected FactChecking() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public FactChecking(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public FactChecking(JCas jcas) {
    super(jcas);
      readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
   */
  public FactChecking(JCas jcas, int begin, int end) {
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
  //* Feature: Fact

    /** getter for Fact - gets
   * @generated
     * @return value of the feature
   */
    public Fact getFact() {
    return (Fact)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Fact)));
  }

    /** setter for Fact - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setFact(Fact v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Fact), v);
  }



  //*--------------*
  //* Feature: Claim

    /** getter for Claim - gets
   * @generated
     * @return value of the feature
   */
    public Claim getClaim() {
    return (Claim)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Claim)));
  }

    /** setter for Claim - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setClaim(Claim v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Claim), v);
  }



  //*--------------*
  //* Feature: consistency

    /** getter for consistency - gets
   * @generated
     * @return value of the feature
   */
    public double getConsistency() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_consistency));
  }

    /** setter for consistency - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setConsistency(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_consistency), v);
  }



  //*--------------*
  //* Feature: model

    /** getter for model - gets
   * @generated
     * @return value of the feature
   */
    public MetaData getModel() {
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }

    /** setter for model - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }

  }

