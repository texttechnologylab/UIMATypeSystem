


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:31:39 CEST 2025 */

package org.texttechnologylab.annotation.model;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


/**
 * Updated by JCasGen Fri Apr 18 23:31:39 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SpacyMetaData extends MetaData {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.model.SpacyMetaData";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpacyMetaData.class);
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

  public final static String _FeatName_SpacyVersion = "SpacyVersion";
  public final static String _FeatName_ModelSpacyGitVersion = "ModelSpacyGitVersion";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_SpacyVersion = TypeSystemImpl.createCallSite(SpacyMetaData.class, "SpacyVersion");
  private final static MethodHandle _FH_SpacyVersion = _FC_SpacyVersion.dynamicInvoker();
  private final static CallSite _FC_ModelSpacyGitVersion = TypeSystemImpl.createCallSite(SpacyMetaData.class, "ModelSpacyGitVersion");
  private final static MethodHandle _FH_ModelSpacyGitVersion = _FC_ModelSpacyGitVersion.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SpacyMetaData() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public SpacyMetaData(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public SpacyMetaData(JCas jcas) {
    super(jcas);
      readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
   */
  public SpacyMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: SpacyVersion

  /** getter for SpacyVersion - gets Spacy Libary Version
   * @generated
   * @return value of the feature
   */
  public String getSpacyVersion() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_SpacyVersion));
  }

    /** setter for SpacyVersion - sets Spacy Libary Version
   * @generated
     * @param v value to set into the feature
   */
  public void setSpacyVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_SpacyVersion), v);
  }



  //*--------------*
  //* Feature: ModelSpacyGitVersion

  /** getter for ModelSpacyGitVersion - gets Explicit Spacy git version
   * @generated
   * @return value of the feature
   */
  public String getModelSpacyGitVersion() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_ModelSpacyGitVersion));
  }

    /** setter for ModelSpacyGitVersion - sets Explicit Spacy git version
   * @generated
     * @param v value to set into the feature
   */
  public void setModelSpacyGitVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ModelSpacyGitVersion), v);
  }

  }

