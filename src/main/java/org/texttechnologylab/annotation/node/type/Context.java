


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation.node.type;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.type.Node;


/**
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Context extends Node {

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.node.type.Context";

    /** @generated
     * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Context.class);
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

  public final static String _FeatName_ReferencedID = "ReferencedID";
  public final static String _FeatName_displayName = "displayName";
  public final static String _FeatName_wikiDataID = "wikiDataID";
  public final static String _FeatName_image = "image";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_ReferencedID = TypeSystemImpl.createCallSite(Context.class, "ReferencedID");
  private final static MethodHandle _FH_ReferencedID = _FC_ReferencedID.dynamicInvoker();
  private final static CallSite _FC_displayName = TypeSystemImpl.createCallSite(Context.class, "displayName");
  private final static MethodHandle _FH_displayName = _FC_displayName.dynamicInvoker();
  private final static CallSite _FC_wikiDataID = TypeSystemImpl.createCallSite(Context.class, "wikiDataID");
  private final static MethodHandle _FH_wikiDataID = _FC_wikiDataID.dynamicInvoker();
  private final static CallSite _FC_image = TypeSystemImpl.createCallSite(Context.class, "image");
  private final static MethodHandle _FH_image = _FC_image.dynamicInvoker();


    /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Context() {/* intentionally empty block */}

    /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
     * @param type the type of this Feature Structure
   */
  public Context(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public Context(JCas jcas) {
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
  //* Feature: ReferencedID

    /** getter for ReferencedID - gets
   * @generated
     * @return value of the feature
   */
    public int getReferencedID() {
    return _getIntValueNc(wrapGetIntCatchException(_FH_ReferencedID));
  }

    /** setter for ReferencedID - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setReferencedID(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_ReferencedID), v);
  }



  //*--------------*
  //* Feature: displayName

    /** getter for displayName - gets
   * @generated
     * @return value of the feature
   */
    public String getDisplayName() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_displayName));
  }

    /** setter for displayName - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setDisplayName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_displayName), v);
  }



  //*--------------*
  //* Feature: wikiDataID

    /** getter for wikiDataID - gets
   * @generated
     * @return value of the feature
   */
    public String getWikiDataID() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_wikiDataID));
  }

    /** setter for wikiDataID - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setWikiDataID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_wikiDataID), v);
  }



  //*--------------*
  //* Feature: image

    /** getter for image - gets
   * @generated
     * @return value of the feature
   */
    public String getImage() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_image));
  }

    /** setter for image - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setImage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_image), v);
  }

  }

