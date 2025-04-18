


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 04:00:59 CEST 2025 */

package org.hucompute.wikidragon.core.nlp.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Apr 18 04:00:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class HtmlTag extends Annotation {

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.wikidragon.core.nlp.annotation.HtmlTag";

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(HtmlTag.class);
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

  public final static String _FeatName_tag = "tag";
  public final static String _FeatName_attr = "attr";
  public final static String _FeatName_depth = "depth";
  public final static String _FeatName_order = "order";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_tag = TypeSystemImpl.createCallSite(HtmlTag.class, "tag");
  private final static MethodHandle _FH_tag = _FC_tag.dynamicInvoker();
  private final static CallSite _FC_attr = TypeSystemImpl.createCallSite(HtmlTag.class, "attr");
  private final static MethodHandle _FH_attr = _FC_attr.dynamicInvoker();
  private final static CallSite _FC_depth = TypeSystemImpl.createCallSite(HtmlTag.class, "depth");
  private final static MethodHandle _FH_depth = _FC_depth.dynamicInvoker();
  private final static CallSite _FC_order = TypeSystemImpl.createCallSite(HtmlTag.class, "order");
  private final static MethodHandle _FH_order = _FC_order.dynamicInvoker();


  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected HtmlTag() {/* intentionally empty block */}

  /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure
   */
  public HtmlTag(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   */
  public HtmlTag(JCas jcas) {
    super(jcas);
    readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public HtmlTag(JCas jcas, int begin, int end) {
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
  //* Feature: tag

  /** getter for tag - gets
   * @generated
   * @return value of the feature
   */
  public String getTag() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_tag));
  }

  /** setter for tag - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setTag(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_tag), v);
  }



  //*--------------*
  //* Feature: attr

  /** getter for attr - gets
   * @generated
   * @return value of the feature
   */
  public String getAttr() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_attr));
  }

  /** setter for attr - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setAttr(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_attr), v);
  }



  //*--------------*
  //* Feature: depth

  /** getter for depth - gets
   * @generated
   * @return value of the feature
   */
  public int getDepth() {
    return _getIntValueNc(wrapGetIntCatchException(_FH_depth));
  }

  /** setter for depth - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setDepth(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_depth), v);
  }



  //*--------------*
  //* Feature: order

  /** getter for order - gets
   * @generated
   * @return value of the feature
   */
  public int getOrder() {
    return _getIntValueNc(wrapGetIntCatchException(_FH_order));
  }

  /** setter for order - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setOrder(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_order), v);
  }

  }

