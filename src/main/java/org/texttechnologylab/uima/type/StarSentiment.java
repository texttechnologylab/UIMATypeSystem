


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.uima.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


/**
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class StarSentiment extends Sentiment {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.uima.type.StarSentiment";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StarSentiment.class);
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

  public final static String _FeatName_OneStar = "OneStar";
  public final static String _FeatName_TwoStars = "TwoStars";
  public final static String _FeatName_ThreeStars = "ThreeStars";
  public final static String _FeatName_FourStars = "FourStars";
  public final static String _FeatName_FiveStars = "FiveStars";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_OneStar = TypeSystemImpl.createCallSite(StarSentiment.class, "OneStar");
  private final static MethodHandle _FH_OneStar = _FC_OneStar.dynamicInvoker();
  private final static CallSite _FC_TwoStars = TypeSystemImpl.createCallSite(StarSentiment.class, "TwoStars");
  private final static MethodHandle _FH_TwoStars = _FC_TwoStars.dynamicInvoker();
  private final static CallSite _FC_ThreeStars = TypeSystemImpl.createCallSite(StarSentiment.class, "ThreeStars");
  private final static MethodHandle _FH_ThreeStars = _FC_ThreeStars.dynamicInvoker();
  private final static CallSite _FC_FourStars = TypeSystemImpl.createCallSite(StarSentiment.class, "FourStars");
  private final static MethodHandle _FH_FourStars = _FC_FourStars.dynamicInvoker();
  private final static CallSite _FC_FiveStars = TypeSystemImpl.createCallSite(StarSentiment.class, "FiveStars");
  private final static MethodHandle _FH_FiveStars = _FC_FiveStars.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected StarSentiment() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public StarSentiment(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public StarSentiment(JCas jcas) {
    super(jcas);
      readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
   */
  public StarSentiment(JCas jcas, int begin, int end) {
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
  //* Feature: OneStar

    /** getter for OneStar - gets
   * @generated
     * @return value of the feature
   */
    public double getOneStar() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_OneStar));
  }

    /** setter for OneStar - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setOneStar(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_OneStar), v);
  }



  //*--------------*
  //* Feature: TwoStars

    /** getter for TwoStars - gets
   * @generated
     * @return value of the feature
   */
    public double getTwoStars() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_TwoStars));
  }

    /** setter for TwoStars - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setTwoStars(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_TwoStars), v);
  }



  //*--------------*
  //* Feature: ThreeStars

    /** getter for ThreeStars - gets
   * @generated
     * @return value of the feature
   */
    public double getThreeStars() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_ThreeStars));
  }

    /** setter for ThreeStars - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setThreeStars(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_ThreeStars), v);
  }



  //*--------------*
  //* Feature: FourStars

    /** getter for FourStars - gets
   * @generated
     * @return value of the feature
   */
    public double getFourStars() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_FourStars));
  }

    /** setter for FourStars - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setFourStars(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_FourStars), v);
  }



  //*--------------*
  //* Feature: FiveStars

    /** getter for FiveStars - gets
   * @generated
     * @return value of the feature
   */
    public double getFiveStars() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_FiveStars));
  }

    /** setter for FiveStars - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setFiveStars(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_FiveStars), v);
  }

  }

