


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation;


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
public class TopicValueBaseWithScore extends TopicValueBase {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.TopicValueBaseWithScore";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicValueBaseWithScore.class);
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

  public final static String _FeatName_score = "score";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_score = TypeSystemImpl.createCallSite(TopicValueBaseWithScore.class, "score");
  private final static MethodHandle _FH_score = _FC_score.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TopicValueBaseWithScore() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public TopicValueBaseWithScore(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public TopicValueBaseWithScore(JCas jcas) {
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
  //* Feature: score

  /** getter for score - gets Probability of the topic label
   * @generated
   * @return value of the feature
   */
  public double getScore() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_score));
  }

    /** setter for score - sets Probability of the topic label
   * @generated
     * @param v value to set into the feature
   */
  public void setScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_score), v);
  }

  }

