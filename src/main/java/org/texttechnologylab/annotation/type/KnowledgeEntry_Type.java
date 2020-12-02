
/* First created by JCasGen Wed Dec 02 18:39:16 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:24 CET 2020
 * @generated */
public class KnowledgeEntry_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = KnowledgeEntry.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.KnowledgeEntry");
 
  /** @generated */
  final Feature casFeat_identifier;
  /** @generated */
  final int     casFeatCode_identifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIdentifier(int addr) {
        if (featOkTst && casFeat_identifier == null)
      jcas.throwFeatMissing("identifier", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return ll_cas.ll_getStringValue(addr, casFeatCode_identifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIdentifier(int addr, String v) {
        if (featOkTst && casFeat_identifier == null)
      jcas.throwFeatMissing("identifier", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    ll_cas.ll_setStringValue(addr, casFeatCode_identifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reference;
  /** @generated */
  final int     casFeatCode_reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return ll_cas.ll_getStringValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, String v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    ll_cas.ll_setStringValue(addr, casFeatCode_reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_parentEntity;
  /** @generated */
  final int     casFeatCode_parentEntity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getParentEntity(int addr) {
        if (featOkTst && casFeat_parentEntity == null)
      jcas.throwFeatMissing("parentEntity", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return ll_cas.ll_getStringValue(addr, casFeatCode_parentEntity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParentEntity(int addr, String v) {
        if (featOkTst && casFeat_parentEntity == null)
      jcas.throwFeatMissing("parentEntity", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    ll_cas.ll_setStringValue(addr, casFeatCode_parentEntity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public KnowledgeEntry_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_identifier = jcas.getRequiredFeatureDE(casType, "identifier", "uima.cas.String", featOkTst);
    casFeatCode_identifier  = (null == casFeat_identifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_identifier).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.String", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_parentEntity = jcas.getRequiredFeatureDE(casType, "parentEntity", "uima.cas.String", featOkTst);
    casFeatCode_parentEntity  = (null == casFeat_parentEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentEntity).getCode();

  }
}



    