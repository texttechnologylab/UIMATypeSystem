


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class GraphBase extends AnnotationBase {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.GraphBase";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GraphBase.class);
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

  public final static String _FeatName_Id = "Id";
  public final static String _FeatName_label = "label";
  public final static String _FeatName_create = "create";
  public final static String _FeatName_modified = "modified";
  public final static String _FeatName_user = "user";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Id = TypeSystemImpl.createCallSite(GraphBase.class, "Id");
  private final static MethodHandle _FH_Id = _FC_Id.dynamicInvoker();
  private final static CallSite _FC_label = TypeSystemImpl.createCallSite(GraphBase.class, "label");
  private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
  private final static CallSite _FC_create = TypeSystemImpl.createCallSite(GraphBase.class, "create");
  private final static MethodHandle _FH_create = _FC_create.dynamicInvoker();
  private final static CallSite _FC_modified = TypeSystemImpl.createCallSite(GraphBase.class, "modified");
  private final static MethodHandle _FH_modified = _FC_modified.dynamicInvoker();
  private final static CallSite _FC_user = TypeSystemImpl.createCallSite(GraphBase.class, "user");
  private final static MethodHandle _FH_user = _FC_user.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected GraphBase() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public GraphBase(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public GraphBase(JCas jcas) {
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
  //* Feature: Id

    /** getter for Id - gets
   * @generated
     * @return value of the feature
   */
    public String getId() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_Id));
  }

    /** setter for Id - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Id), v);
  }



  //*--------------*
  //* Feature: label

    /** getter for label - gets
   * @generated
     * @return value of the feature
   */
    public String getLabel() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_label));
  }

    /** setter for label - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
  }



  //*--------------*
  //* Feature: create

    /** getter for create - gets
   * @generated
     * @return value of the feature
   */
    public long getCreate() {
    return _getLongValueNc(wrapGetIntCatchException(_FH_create));
  }

    /** setter for create - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setCreate(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_create), v);
  }



  //*--------------*
  //* Feature: modified

    /** getter for modified - gets
   * @generated
     * @return value of the feature
   */
    public long getModified() {
    return _getLongValueNc(wrapGetIntCatchException(_FH_modified));
  }

    /** setter for modified - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setModified(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_modified), v);
  }



  //*--------------*
  //* Feature: user

    /** getter for user - gets
   * @generated
     * @return value of the feature
   */
    public String getUser() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_user));
  }

    /** setter for user - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setUser(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_user), v);
  }

  }

