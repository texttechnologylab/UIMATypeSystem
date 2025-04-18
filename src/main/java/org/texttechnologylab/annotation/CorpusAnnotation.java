


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:31:39 CEST 2025 */

package org.texttechnologylab.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Fri Apr 18 23:31:39 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class CorpusAnnotation extends AnnotationBase {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.CorpusAnnotation";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CorpusAnnotation.class);
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

  public final static String _FeatName_license = "license";
  public final static String _FeatName_corpusUrl = "corpusUrl";
  public final static String _FeatName_corpusName = "corpusName";
  public final static String _FeatName_author = "author";
  public final static String _FeatName_comment = "comment";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_license = TypeSystemImpl.createCallSite(CorpusAnnotation.class, "license");
  private final static MethodHandle _FH_license = _FC_license.dynamicInvoker();
  private final static CallSite _FC_corpusUrl = TypeSystemImpl.createCallSite(CorpusAnnotation.class, "corpusUrl");
  private final static MethodHandle _FH_corpusUrl = _FC_corpusUrl.dynamicInvoker();
  private final static CallSite _FC_corpusName = TypeSystemImpl.createCallSite(CorpusAnnotation.class, "corpusName");
  private final static MethodHandle _FH_corpusName = _FC_corpusName.dynamicInvoker();
  private final static CallSite _FC_author = TypeSystemImpl.createCallSite(CorpusAnnotation.class, "author");
  private final static MethodHandle _FH_author = _FC_author.dynamicInvoker();
  private final static CallSite _FC_comment = TypeSystemImpl.createCallSite(CorpusAnnotation.class, "comment");
  private final static MethodHandle _FH_comment = _FC_comment.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected CorpusAnnotation() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public CorpusAnnotation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public CorpusAnnotation(JCas jcas) {
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
  //* Feature: license

    /** getter for license - gets
   * @generated
     * @return value of the feature
   */
    public String getLicense() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_license));
  }

    /** setter for license - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setLicense(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_license), v);
  }



  //*--------------*
  //* Feature: corpusUrl

    /** getter for corpusUrl - gets
   * @generated
     * @return value of the feature
   */
    public String getCorpusUrl() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_corpusUrl));
  }

    /** setter for corpusUrl - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setCorpusUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_corpusUrl), v);
  }



  //*--------------*
  //* Feature: corpusName

    /** getter for corpusName - gets
   * @generated
     * @return value of the feature
   */
    public String getCorpusName() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_corpusName));
  }

    /** setter for corpusName - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setCorpusName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_corpusName), v);
  }



  //*--------------*
  //* Feature: author

    /** getter for author - gets
   * @generated
     * @return value of the feature
   */
    public String getAuthor() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_author));
  }

    /** setter for author - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setAuthor(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_author), v);
  }



  //*--------------*
  //* Feature: comment

    /** getter for comment - gets
   * @generated
     * @return value of the feature
   */
    public String getComment() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_comment));
  }

    /** setter for comment - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setComment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_comment), v);
  }

  }

