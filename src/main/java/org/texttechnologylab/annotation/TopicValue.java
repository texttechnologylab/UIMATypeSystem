


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** Represents a topic instance with a value/label and associated probability
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicValue extends AnnotationBase {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.TopicValue";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicValue.class);
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

  public final static String _FeatName_value = "value";
  public final static String _FeatName_probability = "probability";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(TopicValue.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_probability = TypeSystemImpl.createCallSite(TopicValue.class, "probability");
  private final static MethodHandle _FH_probability = _FC_probability.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TopicValue() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public TopicValue(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public TopicValue(JCas jcas) {
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
  //* Feature: value

    /** getter for value - gets Topic label for the topic instance
   * @generated
     * @return value of the feature
   */
    public String getValue() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }

    /** setter for value - sets Topic label for the topic instance
   * @generated
     * @param v value to set into the feature
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }



  //*--------------*
  //* Feature: probability

    /** getter for probability - gets The probability associated with the topic instance
   * @generated
     * @return value of the feature
   */
    public double getProbability() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_probability));
  }

    /** setter for probability - sets The probability associated with the topic instance
   * @generated
     * @param v value to set into the feature
   */
  public void setProbability(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_probability), v);
  }

  }

