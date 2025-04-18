


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.hucompute.textimager.uima.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Sentiment extends Annotation {

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.Sentiment";

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentiment.class);
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

  public final static String _FeatName_sentiment = "sentiment";
  public final static String _FeatName_subjectivity = "subjectivity";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_sentiment = TypeSystemImpl.createCallSite(Sentiment.class, "sentiment");
  private final static MethodHandle _FH_sentiment = _FC_sentiment.dynamicInvoker();
  private final static CallSite _FC_subjectivity = TypeSystemImpl.createCallSite(Sentiment.class, "subjectivity");
  private final static MethodHandle _FH_subjectivity = _FC_subjectivity.dynamicInvoker();


  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Sentiment() {/* intentionally empty block */}

  /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure
   */
  public Sentiment(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   */
  public Sentiment(JCas jcas) {
    super(jcas);
    readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
   */
  public Sentiment(JCas jcas, int begin, int end) {
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
  //* Feature: sentiment

  /** getter for sentiment - gets
   * @generated
   * @return value of the feature
   */
  public double getSentiment() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_sentiment));
  }

  /** setter for sentiment - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setSentiment(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_sentiment), v);
  }



  //*--------------*
  //* Feature: subjectivity

  /** getter for subjectivity - gets
   * @generated
   * @return value of the feature
   */
  public double getSubjectivity() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_subjectivity));
  }

  /** setter for subjectivity - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setSubjectivity(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_subjectivity), v);
  }

  }

