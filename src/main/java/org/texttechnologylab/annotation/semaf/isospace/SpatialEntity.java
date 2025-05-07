

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 15:57:08 CEST 2025 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed May 07 15:57:08 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SpatialEntity extends Entity {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpatialEntity.class);
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
   
  public final static String _FeatName_spatial_entitiy_type = "spatial_entitiy_type";
  public final static String _FeatName_dimensionality = "dimensionality";
  public final static String _FeatName_form = "form";
  public final static String _FeatName_dcl = "dcl";
  public final static String _FeatName_domain = "domain";
  public final static String _FeatName_lat = "lat";
  public final static String _FeatName_long = "long";
  public final static String _FeatName_elevation = "elevation";
  public final static String _FeatName_countable = "countable";
  public final static String _FeatName_gquant = "gquant";
  public final static String _FeatName_scopes = "scopes";
  public final static String _FeatName_scopes_array = "scopes_array";
  public final static String _FeatName_cardinality = "cardinality";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_spatial_entitiy_type = TypeSystemImpl.createCallSite(SpatialEntity.class, "spatial_entitiy_type");
  private final static MethodHandle _FH_spatial_entitiy_type = _FC_spatial_entitiy_type.dynamicInvoker();
  private final static CallSite _FC_dimensionality = TypeSystemImpl.createCallSite(SpatialEntity.class, "dimensionality");
  private final static MethodHandle _FH_dimensionality = _FC_dimensionality.dynamicInvoker();
  private final static CallSite _FC_form = TypeSystemImpl.createCallSite(SpatialEntity.class, "form");
  private final static MethodHandle _FH_form = _FC_form.dynamicInvoker();
  private final static CallSite _FC_dcl = TypeSystemImpl.createCallSite(SpatialEntity.class, "dcl");
  private final static MethodHandle _FH_dcl = _FC_dcl.dynamicInvoker();
  private final static CallSite _FC_domain = TypeSystemImpl.createCallSite(SpatialEntity.class, "domain");
  private final static MethodHandle _FH_domain = _FC_domain.dynamicInvoker();
  private final static CallSite _FC_lat = TypeSystemImpl.createCallSite(SpatialEntity.class, "lat");
  private final static MethodHandle _FH_lat = _FC_lat.dynamicInvoker();
  private final static CallSite _FC_long = TypeSystemImpl.createCallSite(SpatialEntity.class, "long");
  private final static MethodHandle _FH_long = _FC_long.dynamicInvoker();
  private final static CallSite _FC_elevation = TypeSystemImpl.createCallSite(SpatialEntity.class, "elevation");
  private final static MethodHandle _FH_elevation = _FC_elevation.dynamicInvoker();
  private final static CallSite _FC_countable = TypeSystemImpl.createCallSite(SpatialEntity.class, "countable");
  private final static MethodHandle _FH_countable = _FC_countable.dynamicInvoker();
  private final static CallSite _FC_gquant = TypeSystemImpl.createCallSite(SpatialEntity.class, "gquant");
  private final static MethodHandle _FH_gquant = _FC_gquant.dynamicInvoker();
  private final static CallSite _FC_scopes = TypeSystemImpl.createCallSite(SpatialEntity.class, "scopes");
  private final static MethodHandle _FH_scopes = _FC_scopes.dynamicInvoker();
  private final static CallSite _FC_scopes_array = TypeSystemImpl.createCallSite(SpatialEntity.class, "scopes_array");
  private final static MethodHandle _FH_scopes_array = _FC_scopes_array.dynamicInvoker();
  private final static CallSite _FC_cardinality = TypeSystemImpl.createCallSite(SpatialEntity.class, "cardinality");
  private final static MethodHandle _FH_cardinality = _FC_cardinality.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SpatialEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SpatialEntity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpatialEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpatialEntity(JCas jcas, int begin, int end) {
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
  //* Feature: spatial_entitiy_type

  /** getter for spatial_entitiy_type - gets Spatial Entitiy Type ( FAC | VEHICLE | PERSON | DYNAMIC_EVENT | ARTIFACT )
   * @generated
   * @return value of the feature 
   */
  public String getSpatial_entitiy_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_spatial_entitiy_type));
  }
    
  /** setter for spatial_entitiy_type - sets Spatial Entitiy Type ( FAC | VEHICLE | PERSON | DYNAMIC_EVENT | ARTIFACT ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpatial_entitiy_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_spatial_entitiy_type), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dimensionality

  /** getter for dimensionality - gets ( POINT | LINE | AREA | VOLUME )
   * @generated
   * @return value of the feature 
   */
  public String getDimensionality() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_dimensionality));
  }
    
  /** setter for dimensionality - sets ( POINT | LINE | AREA | VOLUME ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDimensionality(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_dimensionality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: form

  /** getter for form - gets ( NAM | NOM )
   * @generated
   * @return value of the feature 
   */
  public String getForm() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_form));
  }
    
  /** setter for form - sets ( NAM | NOM ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setForm(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_form), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dcl

  /** getter for dcl - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getDcl() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_dcl));
  }
    
  /** setter for dcl - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDcl(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_dcl), v);
  }    
    
   
    
  //*--------------*
  //* Feature: domain

  /** getter for domain - gets ( CONTENT | STRUCTURE )
   * @generated
   * @return value of the feature 
   */
  public String getDomain() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_domain));
  }
    
  /** setter for domain - sets ( CONTENT | STRUCTURE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDomain(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_domain), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lat

  /** getter for lat - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLat() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_lat));
  }
    
  /** setter for lat - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLat(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_lat), v);
  }    
    
   
    
  //*--------------*
  //* Feature: long

  /** getter for long - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLong() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_long));
  }
    
  /** setter for long - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLong(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_long), v);
  }    
    
   
    
  //*--------------*
  //* Feature: elevation

  /** getter for elevation - gets 
   * @generated
   * @return value of the feature 
   */
  public Measure getElevation() { 
    return (Measure)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elevation)));
  }
    
  /** setter for elevation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElevation(Measure v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_elevation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: countable

  /** getter for countable - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCountable() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_countable));
  }
    
  /** setter for countable - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountable(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_countable), v);
  }    
    
   
    
  //*--------------*
  //* Feature: gquant

  /** getter for gquant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGquant() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_gquant));
  }
    
  /** setter for gquant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGquant(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_gquant), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scopes

  /** getter for scopes - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Entity> getScopes() { 
    return (FSList<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes)));
  }
    
  /** setter for scopes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScopes(FSList<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scopes), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scopes_array

  /** getter for scopes_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Entity> getScopes_array() { 
    return (FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes_array)));
  }
    
  /** setter for scopes_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScopes_array(FSArray<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scopes_array), v);
  }    
    
    
  /** indexed getter for scopes_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Entity getScopes_array(int i) {
     return (Entity)(((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes_array)))).get(i));
  } 

  /** indexed setter for scopes_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setScopes_array(int i, Entity v) {
    ((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes_array)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: cardinality

  /** getter for cardinality - gets 
   * @generated
   * @return value of the feature 
   */
  public double getCardinality() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_cardinality));
  }
    
  /** setter for cardinality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCardinality(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_cardinality), v);
  }    
    
  }

    