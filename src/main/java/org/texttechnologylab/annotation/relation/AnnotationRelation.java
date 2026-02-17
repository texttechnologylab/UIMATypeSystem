

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base type for annotation relations between two annotations (u, v).
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationRelation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationRelation.class);
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationRelation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationRelation(JCas jcas, int begin, int end) {
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
  //* Feature: u

  /** getter for u - gets Annotation node 'u'.
   * @generated
   * @return value of the feature 
   */
  public Annotation getU() {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_u == null)
      jcasType.jcas.throwFeatMissing("u", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_u)));}
    
  /** setter for u - sets Annotation node 'u'. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setU(Annotation v) {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_u == null)
      jcasType.jcas.throwFeatMissing("u", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_u, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: v

  /** getter for v - gets Annotation node 'v'.
   * @generated
   * @return value of the feature 
   */
  public Annotation getV() {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_v == null)
      jcasType.jcas.throwFeatMissing("v", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_v)));}
    
  /** setter for v - sets Annotation node 'v'. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setV(Annotation v) {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_v == null)
      jcasType.jcas.throwFeatMissing("v", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_v, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: directed

  /** getter for directed - gets If true, the relation only holds in direction (u, v).
   * @generated
   * @return value of the feature 
   */
  public boolean getDirected() {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_directed == null)
      jcasType.jcas.throwFeatMissing("directed", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_directed);}
    
  /** setter for directed - sets If true, the relation only holds in direction (u, v). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDirected(boolean v) {
    if (AnnotationRelation_Type.featOkTst && ((AnnotationRelation_Type)jcasType).casFeat_directed == null)
      jcasType.jcas.throwFeatMissing("directed", "org.texttechnologylab.annotation.relation.AnnotationRelation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AnnotationRelation_Type)jcasType).casFeatCode_directed, v);}    
  }

    