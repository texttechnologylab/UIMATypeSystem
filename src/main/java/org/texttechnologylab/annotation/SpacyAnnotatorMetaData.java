


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 04:00:59 CEST 2025 */

package org.texttechnologylab.annotation;


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
public class SpacyAnnotatorMetaData extends AnnotatorMetaData {

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.SpacyAnnotatorMetaData";

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpacyAnnotatorMetaData.class);
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

  public final static String _FeatName_spacyVersion = "spacyVersion";
  public final static String _FeatName_modelLang = "modelLang";
  public final static String _FeatName_modelSpacyVersion = "modelSpacyVersion";
  public final static String _FeatName_modelSpacyGitVersion = "modelSpacyGitVersion";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_spacyVersion = TypeSystemImpl.createCallSite(SpacyAnnotatorMetaData.class, "spacyVersion");
  private final static MethodHandle _FH_spacyVersion = _FC_spacyVersion.dynamicInvoker();
  private final static CallSite _FC_modelLang = TypeSystemImpl.createCallSite(SpacyAnnotatorMetaData.class, "modelLang");
  private final static MethodHandle _FH_modelLang = _FC_modelLang.dynamicInvoker();
  private final static CallSite _FC_modelSpacyVersion = TypeSystemImpl.createCallSite(SpacyAnnotatorMetaData.class, "modelSpacyVersion");
  private final static MethodHandle _FH_modelSpacyVersion = _FC_modelSpacyVersion.dynamicInvoker();
  private final static CallSite _FC_modelSpacyGitVersion = TypeSystemImpl.createCallSite(SpacyAnnotatorMetaData.class, "modelSpacyGitVersion");
  private final static MethodHandle _FH_modelSpacyGitVersion = _FC_modelSpacyGitVersion.dynamicInvoker();


  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SpacyAnnotatorMetaData() {/* intentionally empty block */}

  /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure
   */
  public SpacyAnnotatorMetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   */
  public SpacyAnnotatorMetaData(JCas jcas) {
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
  //* Feature: spacyVersion

  /** getter for spacyVersion - gets
   * @generated
   * @return value of the feature
   */
  public String getSpacyVersion() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_spacyVersion));
  }

  /** setter for spacyVersion - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setSpacyVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_spacyVersion), v);
  }



  //*--------------*
  //* Feature: modelLang

  /** getter for modelLang - gets
   * @generated
   * @return value of the feature
   */
  public String getModelLang() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_modelLang));
  }

  /** setter for modelLang - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setModelLang(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modelLang), v);
  }



  //*--------------*
  //* Feature: modelSpacyVersion

  /** getter for modelSpacyVersion - gets
   * @generated
   * @return value of the feature
   */
  public String getModelSpacyVersion() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_modelSpacyVersion));
  }

  /** setter for modelSpacyVersion - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setModelSpacyVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modelSpacyVersion), v);
  }



  //*--------------*
  //* Feature: modelSpacyGitVersion

  /** getter for modelSpacyGitVersion - gets
   * @generated
   * @return value of the feature
   */
  public String getModelSpacyGitVersion() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_modelSpacyGitVersion));
  }

  /** setter for modelSpacyGitVersion - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setModelSpacyGitVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modelSpacyGitVersion), v);
  }

  }

