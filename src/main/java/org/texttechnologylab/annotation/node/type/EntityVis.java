

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 16:38:29 CEST 2025 */

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
 * Updated by JCasGen Wed May 07 16:38:29 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EntityVis extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.node.type.EntityVis";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntityVis.class);
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
   
  public final static String _FeatName_geonamesID = "geonamesID";
  public final static String _FeatName_geoJson = "geoJson";
  public final static String _FeatName_displayName = "displayName";
  public final static String _FeatName_ofClass = "ofClass";
  public final static String _FeatName_image = "image";
  public final static String _FeatName_wikiDataID = "wikiDataID";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_geonamesID = TypeSystemImpl.createCallSite(EntityVis.class, "geonamesID");
  private final static MethodHandle _FH_geonamesID = _FC_geonamesID.dynamicInvoker();
  private final static CallSite _FC_geoJson = TypeSystemImpl.createCallSite(EntityVis.class, "geoJson");
  private final static MethodHandle _FH_geoJson = _FC_geoJson.dynamicInvoker();
  private final static CallSite _FC_displayName = TypeSystemImpl.createCallSite(EntityVis.class, "displayName");
  private final static MethodHandle _FH_displayName = _FC_displayName.dynamicInvoker();
  private final static CallSite _FC_ofClass = TypeSystemImpl.createCallSite(EntityVis.class, "ofClass");
  private final static MethodHandle _FH_ofClass = _FC_ofClass.dynamicInvoker();
  private final static CallSite _FC_image = TypeSystemImpl.createCallSite(EntityVis.class, "image");
  private final static MethodHandle _FH_image = _FC_image.dynamicInvoker();
  private final static CallSite _FC_wikiDataID = TypeSystemImpl.createCallSite(EntityVis.class, "wikiDataID");
  private final static MethodHandle _FH_wikiDataID = _FC_wikiDataID.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EntityVis() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public EntityVis(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EntityVis(JCas jcas) {
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
  //* Feature: geonamesID

  /** getter for geonamesID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getGeonamesID() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_geonamesID));
  }
    
  /** setter for geonamesID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeonamesID(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_geonamesID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: geoJson

  /** getter for geoJson - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeoJson() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_geoJson));
  }
    
  /** setter for geoJson - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoJson(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_geoJson), v);
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
  //* Feature: ofClass

  /** getter for ofClass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOfClass() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ofClass));
  }
    
  /** setter for ofClass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOfClass(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ofClass), v);
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
    
  }

    