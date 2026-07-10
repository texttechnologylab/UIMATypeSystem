

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Sentence i and Sentence j which will be compared
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SentenceComparison extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceComparison.class);
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
  protected SentenceComparison() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentenceComparison(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceComparison(JCas jcas) {
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
  //* Feature: SentenceI

  /** getter for SentenceI - gets Sentence i which will be compared with Sentence j
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceI() {
    if (SentenceComparison_Type.featOkTst && ((SentenceComparison_Type)jcasType).casFeat_SentenceI == null)
      jcasType.jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.SentenceComparison");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceComparison_Type)jcasType).casFeatCode_SentenceI)));}
    
  /** setter for SentenceI - sets Sentence i which will be compared with Sentence j 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceI(Annotation v) {
    if (SentenceComparison_Type.featOkTst && ((SentenceComparison_Type)jcasType).casFeat_SentenceI == null)
      jcasType.jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.SentenceComparison");
    jcasType.ll_cas.ll_setRefValue(addr, ((SentenceComparison_Type)jcasType).casFeatCode_SentenceI, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: SentenceJ

  /** getter for SentenceJ - gets Sentence j which will be compared with Sentence i
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceJ() {
    if (SentenceComparison_Type.featOkTst && ((SentenceComparison_Type)jcasType).casFeat_SentenceJ == null)
      jcasType.jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.SentenceComparison");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceComparison_Type)jcasType).casFeatCode_SentenceJ)));}
    
  /** setter for SentenceJ - sets Sentence j which will be compared with Sentence i 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceJ(Annotation v) {
    if (SentenceComparison_Type.featOkTst && ((SentenceComparison_Type)jcasType).casFeat_SentenceJ == null)
      jcasType.jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.SentenceComparison");
    jcasType.ll_cas.ll_setRefValue(addr, ((SentenceComparison_Type)jcasType).casFeatCode_SentenceJ, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    