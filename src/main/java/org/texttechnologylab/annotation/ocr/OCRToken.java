


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation.ocr;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringList;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;


/**
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OCRToken extends Token {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.OCRToken";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OCRToken.class);
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

  public final static String _FeatName_subTokenList = "subTokenList";
  public final static String _FeatName_isWordFromDictionary = "isWordFromDictionary";
  public final static String _FeatName_isWordNormal = "isWordNormal";
  public final static String _FeatName_isWordNumeric = "isWordNumeric";
  public final static String _FeatName_containsHyphen = "containsHyphen";
  public final static String _FeatName_suspiciousChars = "suspiciousChars";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_subTokenList = TypeSystemImpl.createCallSite(OCRToken.class, "subTokenList");
  private final static MethodHandle _FH_subTokenList = _FC_subTokenList.dynamicInvoker();
  private final static CallSite _FC_isWordFromDictionary = TypeSystemImpl.createCallSite(OCRToken.class, "isWordFromDictionary");
  private final static MethodHandle _FH_isWordFromDictionary = _FC_isWordFromDictionary.dynamicInvoker();
  private final static CallSite _FC_isWordNormal = TypeSystemImpl.createCallSite(OCRToken.class, "isWordNormal");
  private final static MethodHandle _FH_isWordNormal = _FC_isWordNormal.dynamicInvoker();
  private final static CallSite _FC_isWordNumeric = TypeSystemImpl.createCallSite(OCRToken.class, "isWordNumeric");
  private final static MethodHandle _FH_isWordNumeric = _FC_isWordNumeric.dynamicInvoker();
  private final static CallSite _FC_containsHyphen = TypeSystemImpl.createCallSite(OCRToken.class, "containsHyphen");
  private final static MethodHandle _FH_containsHyphen = _FC_containsHyphen.dynamicInvoker();
  private final static CallSite _FC_suspiciousChars = TypeSystemImpl.createCallSite(OCRToken.class, "suspiciousChars");
  private final static MethodHandle _FH_suspiciousChars = _FC_suspiciousChars.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OCRToken() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public OCRToken(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public OCRToken(JCas jcas) {
    super(jcas);
      readObject();
  }


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
   */
  public OCRToken(JCas jcas, int begin, int end) {
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
  //* Feature: subTokenList

    /** getter for subTokenList - gets
   * @generated
     * @return value of the feature
   */
    public StringList getSubTokenList() {
    return (StringList)(_getFeatureValueNc(wrapGetIntCatchException(_FH_subTokenList)));
  }

    /** setter for subTokenList - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setSubTokenList(StringList v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_subTokenList), v);
  }



  //*--------------*
  //* Feature: isWordFromDictionary

    /** getter for isWordFromDictionary - gets
   * @generated
     * @return value of the feature
   */
    public boolean getIsWordFromDictionary() {
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isWordFromDictionary));
  }

    /** setter for isWordFromDictionary - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setIsWordFromDictionary(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isWordFromDictionary), v);
  }



  //*--------------*
  //* Feature: isWordNormal

    /** getter for isWordNormal - gets
   * @generated
     * @return value of the feature
   */
    public boolean getIsWordNormal() {
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isWordNormal));
  }

    /** setter for isWordNormal - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setIsWordNormal(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isWordNormal), v);
  }



  //*--------------*
  //* Feature: isWordNumeric

    /** getter for isWordNumeric - gets
   * @generated
     * @return value of the feature
   */
    public boolean getIsWordNumeric() {
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isWordNumeric));
  }

    /** setter for isWordNumeric - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setIsWordNumeric(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isWordNumeric), v);
  }



  //*--------------*
  //* Feature: containsHyphen

    /** getter for containsHyphen - gets
   * @generated
     * @return value of the feature
   */
    public boolean getContainsHyphen() {
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_containsHyphen));
  }

    /** setter for containsHyphen - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setContainsHyphen(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_containsHyphen), v);
  }



  //*--------------*
  //* Feature: suspiciousChars

    /** getter for suspiciousChars - gets
   * @generated
     * @return value of the feature
   */
    public int getSuspiciousChars() {
    return _getIntValueNc(wrapGetIntCatchException(_FH_suspiciousChars));
  }

    /** setter for suspiciousChars - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setSuspiciousChars(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_suspiciousChars), v);
  }

  }

