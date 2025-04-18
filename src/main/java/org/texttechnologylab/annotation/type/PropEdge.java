


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 04:00:59 CEST 2025 */

package org.texttechnologylab.annotation.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


/**
 * Updated by JCasGen Fri Apr 18 04:00:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class PropEdge extends Edge {

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.PropEdge";

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PropEdge.class);
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

  public final static String _FeatName_mode = "mode";
  public final static String _FeatName_graphSource = "graphSource";
  public final static String _FeatName_graphTarget = "graphTarget";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_mode = TypeSystemImpl.createCallSite(PropEdge.class, "mode");
  private final static MethodHandle _FH_mode = _FC_mode.dynamicInvoker();
  private final static CallSite _FC_graphSource = TypeSystemImpl.createCallSite(PropEdge.class, "graphSource");
  private final static MethodHandle _FH_graphSource = _FC_graphSource.dynamicInvoker();
  private final static CallSite _FC_graphTarget = TypeSystemImpl.createCallSite(PropEdge.class, "graphTarget");
  private final static MethodHandle _FH_graphTarget = _FC_graphTarget.dynamicInvoker();


  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected PropEdge() {/* intentionally empty block */}

  /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure
   */
  public PropEdge(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   */
  public PropEdge(JCas jcas) {
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
  //* Feature: mode

  /** getter for mode - gets
   * @generated
   * @return value of the feature
   */
  public String getMode() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_mode));
  }

  /** setter for mode - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setMode(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mode), v);
  }



  //*--------------*
  //* Feature: graphSource

  /** getter for graphSource - gets
   * @generated
   * @return value of the feature
   */
  public String getGraphSource() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_graphSource));
  }

  /** setter for graphSource - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setGraphSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_graphSource), v);
  }



  //*--------------*
  //* Feature: graphTarget

  /** getter for graphTarget - gets
   * @generated
   * @return value of the feature
   */
  public String getGraphTarget() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_graphTarget));
  }

  /** setter for graphTarget - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setGraphTarget(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_graphTarget), v);
  }

  }

