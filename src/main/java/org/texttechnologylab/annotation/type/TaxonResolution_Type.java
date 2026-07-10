
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Annotation type for matching taxon information to a taxonomic database.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class TaxonResolution_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TaxonResolution.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.TaxonResolution");
 
  /** @generated */
  final Feature casFeat_recognizedTaxon;
  /** @generated */
  final int     casFeatCode_recognizedTaxon;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRecognizedTaxon(int addr) {
        if (featOkTst && casFeat_recognizedTaxon == null)
      jcas.throwFeatMissing("recognizedTaxon", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getRefValue(addr, casFeatCode_recognizedTaxon);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecognizedTaxon(int addr, int v) {
        if (featOkTst && casFeat_recognizedTaxon == null)
      jcas.throwFeatMissing("recognizedTaxon", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setRefValue(addr, casFeatCode_recognizedTaxon, v);}
    
  
 
  /** @generated */
  final Feature casFeat_provider;
  /** @generated */
  final int     casFeatCode_provider;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getProvider(int addr) {
        if (featOkTst && casFeat_provider == null)
      jcas.throwFeatMissing("provider", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_provider);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProvider(int addr, String v) {
        if (featOkTst && casFeat_provider == null)
      jcas.throwFeatMissing("provider", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_provider, v);}
    
  
 
  /** @generated */
  final Feature casFeat_taxonId;
  /** @generated */
  final int     casFeatCode_taxonId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTaxonId(int addr) {
        if (featOkTst && casFeat_taxonId == null)
      jcas.throwFeatMissing("taxonId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_taxonId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTaxonId(int addr, int v) {
        if (featOkTst && casFeat_taxonId == null)
      jcas.throwFeatMissing("taxonId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_taxonId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_kingdomName;
  /** @generated */
  final int     casFeatCode_kingdomName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getKingdomName(int addr) {
        if (featOkTst && casFeat_kingdomName == null)
      jcas.throwFeatMissing("kingdomName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_kingdomName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKingdomName(int addr, String v) {
        if (featOkTst && casFeat_kingdomName == null)
      jcas.throwFeatMissing("kingdomName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_kingdomName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_kingdomId;
  /** @generated */
  final int     casFeatCode_kingdomId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getKingdomId(int addr) {
        if (featOkTst && casFeat_kingdomId == null)
      jcas.throwFeatMissing("kingdomId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_kingdomId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKingdomId(int addr, int v) {
        if (featOkTst && casFeat_kingdomId == null)
      jcas.throwFeatMissing("kingdomId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_kingdomId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_phylumName;
  /** @generated */
  final int     casFeatCode_phylumName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPhylumName(int addr) {
        if (featOkTst && casFeat_phylumName == null)
      jcas.throwFeatMissing("phylumName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_phylumName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhylumName(int addr, String v) {
        if (featOkTst && casFeat_phylumName == null)
      jcas.throwFeatMissing("phylumName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_phylumName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_phylumId;
  /** @generated */
  final int     casFeatCode_phylumId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPhylumId(int addr) {
        if (featOkTst && casFeat_phylumId == null)
      jcas.throwFeatMissing("phylumId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_phylumId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPhylumId(int addr, int v) {
        if (featOkTst && casFeat_phylumId == null)
      jcas.throwFeatMissing("phylumId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_phylumId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_className;
  /** @generated */
  final int     casFeatCode_className;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClassName(int addr) {
        if (featOkTst && casFeat_className == null)
      jcas.throwFeatMissing("className", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_className);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClassName(int addr, String v) {
        if (featOkTst && casFeat_className == null)
      jcas.throwFeatMissing("className", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_className, v);}
    
  
 
  /** @generated */
  final Feature casFeat_classId;
  /** @generated */
  final int     casFeatCode_classId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getClassId(int addr) {
        if (featOkTst && casFeat_classId == null)
      jcas.throwFeatMissing("classId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_classId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClassId(int addr, int v) {
        if (featOkTst && casFeat_classId == null)
      jcas.throwFeatMissing("classId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_classId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_orderName;
  /** @generated */
  final int     casFeatCode_orderName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOrderName(int addr) {
        if (featOkTst && casFeat_orderName == null)
      jcas.throwFeatMissing("orderName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_orderName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrderName(int addr, String v) {
        if (featOkTst && casFeat_orderName == null)
      jcas.throwFeatMissing("orderName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_orderName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_orderId;
  /** @generated */
  final int     casFeatCode_orderId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrderId(int addr) {
        if (featOkTst && casFeat_orderId == null)
      jcas.throwFeatMissing("orderId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_orderId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrderId(int addr, int v) {
        if (featOkTst && casFeat_orderId == null)
      jcas.throwFeatMissing("orderId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_orderId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_superfamilyName;
  /** @generated */
  final int     casFeatCode_superfamilyName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSuperfamilyName(int addr) {
        if (featOkTst && casFeat_superfamilyName == null)
      jcas.throwFeatMissing("superfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_superfamilyName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuperfamilyName(int addr, String v) {
        if (featOkTst && casFeat_superfamilyName == null)
      jcas.throwFeatMissing("superfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_superfamilyName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_superfamilyId;
  /** @generated */
  final int     casFeatCode_superfamilyId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSuperfamilyId(int addr) {
        if (featOkTst && casFeat_superfamilyId == null)
      jcas.throwFeatMissing("superfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_superfamilyId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuperfamilyId(int addr, int v) {
        if (featOkTst && casFeat_superfamilyId == null)
      jcas.throwFeatMissing("superfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_superfamilyId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_familyName;
  /** @generated */
  final int     casFeatCode_familyName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFamilyName(int addr) {
        if (featOkTst && casFeat_familyName == null)
      jcas.throwFeatMissing("familyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_familyName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFamilyName(int addr, String v) {
        if (featOkTst && casFeat_familyName == null)
      jcas.throwFeatMissing("familyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_familyName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_familyId;
  /** @generated */
  final int     casFeatCode_familyId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFamilyId(int addr) {
        if (featOkTst && casFeat_familyId == null)
      jcas.throwFeatMissing("familyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_familyId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFamilyId(int addr, int v) {
        if (featOkTst && casFeat_familyId == null)
      jcas.throwFeatMissing("familyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_familyId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subfamilyName;
  /** @generated */
  final int     casFeatCode_subfamilyName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubfamilyName(int addr) {
        if (featOkTst && casFeat_subfamilyName == null)
      jcas.throwFeatMissing("subfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subfamilyName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubfamilyName(int addr, String v) {
        if (featOkTst && casFeat_subfamilyName == null)
      jcas.throwFeatMissing("subfamilyName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_subfamilyName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subfamilyId;
  /** @generated */
  final int     casFeatCode_subfamilyId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubfamilyId(int addr) {
        if (featOkTst && casFeat_subfamilyId == null)
      jcas.throwFeatMissing("subfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subfamilyId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubfamilyId(int addr, int v) {
        if (featOkTst && casFeat_subfamilyId == null)
      jcas.throwFeatMissing("subfamilyId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_subfamilyId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tribeName;
  /** @generated */
  final int     casFeatCode_tribeName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTribeName(int addr) {
        if (featOkTst && casFeat_tribeName == null)
      jcas.throwFeatMissing("tribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tribeName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTribeName(int addr, String v) {
        if (featOkTst && casFeat_tribeName == null)
      jcas.throwFeatMissing("tribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_tribeName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tribeId;
  /** @generated */
  final int     casFeatCode_tribeId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTribeId(int addr) {
        if (featOkTst && casFeat_tribeId == null)
      jcas.throwFeatMissing("tribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tribeId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTribeId(int addr, int v) {
        if (featOkTst && casFeat_tribeId == null)
      jcas.throwFeatMissing("tribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_tribeId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subtribeName;
  /** @generated */
  final int     casFeatCode_subtribeName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubtribeName(int addr) {
        if (featOkTst && casFeat_subtribeName == null)
      jcas.throwFeatMissing("subtribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subtribeName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubtribeName(int addr, String v) {
        if (featOkTst && casFeat_subtribeName == null)
      jcas.throwFeatMissing("subtribeName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_subtribeName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subtribeId;
  /** @generated */
  final int     casFeatCode_subtribeId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubtribeId(int addr) {
        if (featOkTst && casFeat_subtribeId == null)
      jcas.throwFeatMissing("subtribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subtribeId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubtribeId(int addr, int v) {
        if (featOkTst && casFeat_subtribeId == null)
      jcas.throwFeatMissing("subtribeId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_subtribeId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_genusName;
  /** @generated */
  final int     casFeatCode_genusName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGenusName(int addr) {
        if (featOkTst && casFeat_genusName == null)
      jcas.throwFeatMissing("genusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_genusName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGenusName(int addr, String v) {
        if (featOkTst && casFeat_genusName == null)
      jcas.throwFeatMissing("genusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_genusName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_genusId;
  /** @generated */
  final int     casFeatCode_genusId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGenusId(int addr) {
        if (featOkTst && casFeat_genusId == null)
      jcas.throwFeatMissing("genusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_genusId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGenusId(int addr, int v) {
        if (featOkTst && casFeat_genusId == null)
      jcas.throwFeatMissing("genusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_genusId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subgenusName;
  /** @generated */
  final int     casFeatCode_subgenusName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSubgenusName(int addr) {
        if (featOkTst && casFeat_subgenusName == null)
      jcas.throwFeatMissing("subgenusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_subgenusName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubgenusName(int addr, String v) {
        if (featOkTst && casFeat_subgenusName == null)
      jcas.throwFeatMissing("subgenusName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_subgenusName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subgenusId;
  /** @generated */
  final int     casFeatCode_subgenusId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubgenusId(int addr) {
        if (featOkTst && casFeat_subgenusId == null)
      jcas.throwFeatMissing("subgenusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subgenusId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubgenusId(int addr, int v) {
        if (featOkTst && casFeat_subgenusId == null)
      jcas.throwFeatMissing("subgenusId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_subgenusId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speciesName;
  /** @generated */
  final int     casFeatCode_speciesName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpeciesName(int addr) {
        if (featOkTst && casFeat_speciesName == null)
      jcas.throwFeatMissing("speciesName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_speciesName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeciesName(int addr, String v) {
        if (featOkTst && casFeat_speciesName == null)
      jcas.throwFeatMissing("speciesName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_speciesName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speciesId;
  /** @generated */
  final int     casFeatCode_speciesId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpeciesId(int addr) {
        if (featOkTst && casFeat_speciesId == null)
      jcas.throwFeatMissing("speciesId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_speciesId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeciesId(int addr, int v) {
        if (featOkTst && casFeat_speciesId == null)
      jcas.throwFeatMissing("speciesId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_speciesId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_parentName;
  /** @generated */
  final int     casFeatCode_parentName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getParentName(int addr) {
        if (featOkTst && casFeat_parentName == null)
      jcas.throwFeatMissing("parentName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_parentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParentName(int addr, String v) {
        if (featOkTst && casFeat_parentName == null)
      jcas.throwFeatMissing("parentName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_parentName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_parentId;
  /** @generated */
  final int     casFeatCode_parentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getParentId(int addr) {
        if (featOkTst && casFeat_parentId == null)
      jcas.throwFeatMissing("parentId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_parentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParentId(int addr, int v) {
        if (featOkTst && casFeat_parentId == null)
      jcas.throwFeatMissing("parentId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_parentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scientificName;
  /** @generated */
  final int     casFeatCode_scientificName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScientificName(int addr) {
        if (featOkTst && casFeat_scientificName == null)
      jcas.throwFeatMissing("scientificName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_scientificName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScientificName(int addr, String v) {
        if (featOkTst && casFeat_scientificName == null)
      jcas.throwFeatMissing("scientificName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_scientificName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_canonicalName;
  /** @generated */
  final int     casFeatCode_canonicalName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCanonicalName(int addr) {
        if (featOkTst && casFeat_canonicalName == null)
      jcas.throwFeatMissing("canonicalName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_canonicalName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCanonicalName(int addr, String v) {
        if (featOkTst && casFeat_canonicalName == null)
      jcas.throwFeatMissing("canonicalName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_canonicalName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_vernacularName;
  /** @generated */
  final int     casFeatCode_vernacularName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVernacularName(int addr) {
        if (featOkTst && casFeat_vernacularName == null)
      jcas.throwFeatMissing("vernacularName", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_vernacularName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVernacularName(int addr, String v) {
        if (featOkTst && casFeat_vernacularName == null)
      jcas.throwFeatMissing("vernacularName", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_vernacularName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_acceptedNameUsage;
  /** @generated */
  final int     casFeatCode_acceptedNameUsage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAcceptedNameUsage(int addr) {
        if (featOkTst && casFeat_acceptedNameUsage == null)
      jcas.throwFeatMissing("acceptedNameUsage", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_acceptedNameUsage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAcceptedNameUsage(int addr, String v) {
        if (featOkTst && casFeat_acceptedNameUsage == null)
      jcas.throwFeatMissing("acceptedNameUsage", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_acceptedNameUsage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_authorship;
  /** @generated */
  final int     casFeatCode_authorship;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAuthorship(int addr) {
        if (featOkTst && casFeat_authorship == null)
      jcas.throwFeatMissing("authorship", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_authorship);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthorship(int addr, String v) {
        if (featOkTst && casFeat_authorship == null)
      jcas.throwFeatMissing("authorship", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_authorship, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nameType;
  /** @generated */
  final int     casFeatCode_nameType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNameType(int addr) {
        if (featOkTst && casFeat_nameType == null)
      jcas.throwFeatMissing("nameType", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nameType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNameType(int addr, String v) {
        if (featOkTst && casFeat_nameType == null)
      jcas.throwFeatMissing("nameType", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_nameType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rank;
  /** @generated */
  final int     casFeatCode_rank;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRank(int addr) {
        if (featOkTst && casFeat_rank == null)
      jcas.throwFeatMissing("rank", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rank);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRank(int addr, String v) {
        if (featOkTst && casFeat_rank == null)
      jcas.throwFeatMissing("rank", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_rank, v);}
    
  
 
  /** @generated */
  final Feature casFeat_origin;
  /** @generated */
  final int     casFeatCode_origin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOrigin(int addr) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_origin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigin(int addr, String v) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_origin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_taxonomicStatus;
  /** @generated */
  final int     casFeatCode_taxonomicStatus;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTaxonomicStatus(int addr) {
        if (featOkTst && casFeat_taxonomicStatus == null)
      jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_taxonomicStatus);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTaxonomicStatus(int addr, String v) {
        if (featOkTst && casFeat_taxonomicStatus == null)
      jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_taxonomicStatus, v);}
    
  
 
  /** @generated */
  final Feature casFeat_remarks;
  /** @generated */
  final int     casFeatCode_remarks;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRemarks(int addr) {
        if (featOkTst && casFeat_remarks == null)
      jcas.throwFeatMissing("remarks", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_remarks);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRemarks(int addr, String v) {
        if (featOkTst && casFeat_remarks == null)
      jcas.throwFeatMissing("remarks", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_remarks, v);}
    
  
 
  /** @generated */
  final Feature casFeat_references;
  /** @generated */
  final int     casFeatCode_references;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReferences(int addr) {
        if (featOkTst && casFeat_references == null)
      jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_references);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferences(int addr, String v) {
        if (featOkTst && casFeat_references == null)
      jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_references, v);}
    
  
 
  /** @generated */
  final Feature casFeat_publishedIn;
  /** @generated */
  final int     casFeatCode_publishedIn;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPublishedIn(int addr) {
        if (featOkTst && casFeat_publishedIn == null)
      jcas.throwFeatMissing("publishedIn", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_publishedIn);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPublishedIn(int addr, String v) {
        if (featOkTst && casFeat_publishedIn == null)
      jcas.throwFeatMissing("publishedIn", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_publishedIn, v);}
    
  
 
  /** @generated */
  final Feature casFeat_numDescendants;
  /** @generated */
  final int     casFeatCode_numDescendants;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNumDescendants(int addr) {
        if (featOkTst && casFeat_numDescendants == null)
      jcas.throwFeatMissing("numDescendants", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numDescendants);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumDescendants(int addr, int v) {
        if (featOkTst && casFeat_numDescendants == null)
      jcas.throwFeatMissing("numDescendants", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setIntValue(addr, casFeatCode_numDescendants, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lastCrawled;
  /** @generated */
  final int     casFeatCode_lastCrawled;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLastCrawled(int addr) {
        if (featOkTst && casFeat_lastCrawled == null)
      jcas.throwFeatMissing("lastCrawled", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lastCrawled);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLastCrawled(int addr, String v) {
        if (featOkTst && casFeat_lastCrawled == null)
      jcas.throwFeatMissing("lastCrawled", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_lastCrawled, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lastInterpreted;
  /** @generated */
  final int     casFeatCode_lastInterpreted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLastInterpreted(int addr) {
        if (featOkTst && casFeat_lastInterpreted == null)
      jcas.throwFeatMissing("lastInterpreted", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lastInterpreted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLastInterpreted(int addr, String v) {
        if (featOkTst && casFeat_lastInterpreted == null)
      jcas.throwFeatMissing("lastInterpreted", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_lastInterpreted, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speciesEpithet;
  /** @generated */
  final int     casFeatCode_speciesEpithet;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpeciesEpithet(int addr) {
        if (featOkTst && casFeat_speciesEpithet == null)
      jcas.throwFeatMissing("speciesEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_speciesEpithet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeciesEpithet(int addr, String v) {
        if (featOkTst && casFeat_speciesEpithet == null)
      jcas.throwFeatMissing("speciesEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_speciesEpithet, v);}
    
  
 
  /** @generated */
  final Feature casFeat_infraspecificEpithet;
  /** @generated */
  final int     casFeatCode_infraspecificEpithet;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInfraspecificEpithet(int addr) {
        if (featOkTst && casFeat_infraspecificEpithet == null)
      jcas.throwFeatMissing("infraspecificEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_infraspecificEpithet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInfraspecificEpithet(int addr, String v) {
        if (featOkTst && casFeat_infraspecificEpithet == null)
      jcas.throwFeatMissing("infraspecificEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_infraspecificEpithet, v);}
    
  
 
  /** @generated */
  final Feature casFeat_cultivarEpithet;
  /** @generated */
  final int     casFeatCode_cultivarEpithet;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCultivarEpithet(int addr) {
        if (featOkTst && casFeat_cultivarEpithet == null)
      jcas.throwFeatMissing("cultivarEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_cultivarEpithet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCultivarEpithet(int addr, String v) {
        if (featOkTst && casFeat_cultivarEpithet == null)
      jcas.throwFeatMissing("cultivarEpithet", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_cultivarEpithet, v);}
    
  
 
  /** @generated */
  final Feature casFeat_url;
  /** @generated */
  final int     casFeatCode_url;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUrl(int addr) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_url);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUrl(int addr, String v) {
        if (featOkTst && casFeat_url == null)
      jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_url, v);}
    
  
 
  /** @generated */
  final Feature casFeat_wikidataId;
  /** @generated */
  final int     casFeatCode_wikidataId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWikidataId(int addr) {
        if (featOkTst && casFeat_wikidataId == null)
      jcas.throwFeatMissing("wikidataId", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_wikidataId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWikidataId(int addr, String v) {
        if (featOkTst && casFeat_wikidataId == null)
      jcas.throwFeatMissing("wikidataId", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_wikidataId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_wikidataUrl;
  /** @generated */
  final int     casFeatCode_wikidataUrl;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWikidataUrl(int addr) {
        if (featOkTst && casFeat_wikidataUrl == null)
      jcas.throwFeatMissing("wikidataUrl", "org.texttechnologylab.annotation.type.TaxonResolution");
    return ll_cas.ll_getStringValue(addr, casFeatCode_wikidataUrl);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWikidataUrl(int addr, String v) {
        if (featOkTst && casFeat_wikidataUrl == null)
      jcas.throwFeatMissing("wikidataUrl", "org.texttechnologylab.annotation.type.TaxonResolution");
    ll_cas.ll_setStringValue(addr, casFeatCode_wikidataUrl, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TaxonResolution_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_recognizedTaxon = jcas.getRequiredFeatureDE(casType, "recognizedTaxon", "org.texttechnologylab.annotation.type.RecognizedTaxon", featOkTst);
    casFeatCode_recognizedTaxon  = (null == casFeat_recognizedTaxon) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_recognizedTaxon).getCode();

 
    casFeat_provider = jcas.getRequiredFeatureDE(casType, "provider", "uima.cas.String", featOkTst);
    casFeatCode_provider  = (null == casFeat_provider) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_provider).getCode();

 
    casFeat_taxonId = jcas.getRequiredFeatureDE(casType, "taxonId", "uima.cas.Integer", featOkTst);
    casFeatCode_taxonId  = (null == casFeat_taxonId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_taxonId).getCode();

 
    casFeat_kingdomName = jcas.getRequiredFeatureDE(casType, "kingdomName", "uima.cas.String", featOkTst);
    casFeatCode_kingdomName  = (null == casFeat_kingdomName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_kingdomName).getCode();

 
    casFeat_kingdomId = jcas.getRequiredFeatureDE(casType, "kingdomId", "uima.cas.Integer", featOkTst);
    casFeatCode_kingdomId  = (null == casFeat_kingdomId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_kingdomId).getCode();

 
    casFeat_phylumName = jcas.getRequiredFeatureDE(casType, "phylumName", "uima.cas.String", featOkTst);
    casFeatCode_phylumName  = (null == casFeat_phylumName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phylumName).getCode();

 
    casFeat_phylumId = jcas.getRequiredFeatureDE(casType, "phylumId", "uima.cas.Integer", featOkTst);
    casFeatCode_phylumId  = (null == casFeat_phylumId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phylumId).getCode();

 
    casFeat_className = jcas.getRequiredFeatureDE(casType, "className", "uima.cas.String", featOkTst);
    casFeatCode_className  = (null == casFeat_className) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_className).getCode();

 
    casFeat_classId = jcas.getRequiredFeatureDE(casType, "classId", "uima.cas.Integer", featOkTst);
    casFeatCode_classId  = (null == casFeat_classId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_classId).getCode();

 
    casFeat_orderName = jcas.getRequiredFeatureDE(casType, "orderName", "uima.cas.String", featOkTst);
    casFeatCode_orderName  = (null == casFeat_orderName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_orderName).getCode();

 
    casFeat_orderId = jcas.getRequiredFeatureDE(casType, "orderId", "uima.cas.Integer", featOkTst);
    casFeatCode_orderId  = (null == casFeat_orderId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_orderId).getCode();

 
    casFeat_superfamilyName = jcas.getRequiredFeatureDE(casType, "superfamilyName", "uima.cas.String", featOkTst);
    casFeatCode_superfamilyName  = (null == casFeat_superfamilyName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_superfamilyName).getCode();

 
    casFeat_superfamilyId = jcas.getRequiredFeatureDE(casType, "superfamilyId", "uima.cas.Integer", featOkTst);
    casFeatCode_superfamilyId  = (null == casFeat_superfamilyId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_superfamilyId).getCode();

 
    casFeat_familyName = jcas.getRequiredFeatureDE(casType, "familyName", "uima.cas.String", featOkTst);
    casFeatCode_familyName  = (null == casFeat_familyName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_familyName).getCode();

 
    casFeat_familyId = jcas.getRequiredFeatureDE(casType, "familyId", "uima.cas.Integer", featOkTst);
    casFeatCode_familyId  = (null == casFeat_familyId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_familyId).getCode();

 
    casFeat_subfamilyName = jcas.getRequiredFeatureDE(casType, "subfamilyName", "uima.cas.String", featOkTst);
    casFeatCode_subfamilyName  = (null == casFeat_subfamilyName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subfamilyName).getCode();

 
    casFeat_subfamilyId = jcas.getRequiredFeatureDE(casType, "subfamilyId", "uima.cas.Integer", featOkTst);
    casFeatCode_subfamilyId  = (null == casFeat_subfamilyId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subfamilyId).getCode();

 
    casFeat_tribeName = jcas.getRequiredFeatureDE(casType, "tribeName", "uima.cas.String", featOkTst);
    casFeatCode_tribeName  = (null == casFeat_tribeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tribeName).getCode();

 
    casFeat_tribeId = jcas.getRequiredFeatureDE(casType, "tribeId", "uima.cas.Integer", featOkTst);
    casFeatCode_tribeId  = (null == casFeat_tribeId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tribeId).getCode();

 
    casFeat_subtribeName = jcas.getRequiredFeatureDE(casType, "subtribeName", "uima.cas.String", featOkTst);
    casFeatCode_subtribeName  = (null == casFeat_subtribeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subtribeName).getCode();

 
    casFeat_subtribeId = jcas.getRequiredFeatureDE(casType, "subtribeId", "uima.cas.Integer", featOkTst);
    casFeatCode_subtribeId  = (null == casFeat_subtribeId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subtribeId).getCode();

 
    casFeat_genusName = jcas.getRequiredFeatureDE(casType, "genusName", "uima.cas.String", featOkTst);
    casFeatCode_genusName  = (null == casFeat_genusName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_genusName).getCode();

 
    casFeat_genusId = jcas.getRequiredFeatureDE(casType, "genusId", "uima.cas.Integer", featOkTst);
    casFeatCode_genusId  = (null == casFeat_genusId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_genusId).getCode();

 
    casFeat_subgenusName = jcas.getRequiredFeatureDE(casType, "subgenusName", "uima.cas.String", featOkTst);
    casFeatCode_subgenusName  = (null == casFeat_subgenusName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subgenusName).getCode();

 
    casFeat_subgenusId = jcas.getRequiredFeatureDE(casType, "subgenusId", "uima.cas.Integer", featOkTst);
    casFeatCode_subgenusId  = (null == casFeat_subgenusId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subgenusId).getCode();

 
    casFeat_speciesName = jcas.getRequiredFeatureDE(casType, "speciesName", "uima.cas.String", featOkTst);
    casFeatCode_speciesName  = (null == casFeat_speciesName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speciesName).getCode();

 
    casFeat_speciesId = jcas.getRequiredFeatureDE(casType, "speciesId", "uima.cas.Integer", featOkTst);
    casFeatCode_speciesId  = (null == casFeat_speciesId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speciesId).getCode();

 
    casFeat_parentName = jcas.getRequiredFeatureDE(casType, "parentName", "uima.cas.String", featOkTst);
    casFeatCode_parentName  = (null == casFeat_parentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentName).getCode();

 
    casFeat_parentId = jcas.getRequiredFeatureDE(casType, "parentId", "uima.cas.Integer", featOkTst);
    casFeatCode_parentId  = (null == casFeat_parentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentId).getCode();

 
    casFeat_scientificName = jcas.getRequiredFeatureDE(casType, "scientificName", "uima.cas.String", featOkTst);
    casFeatCode_scientificName  = (null == casFeat_scientificName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scientificName).getCode();

 
    casFeat_canonicalName = jcas.getRequiredFeatureDE(casType, "canonicalName", "uima.cas.String", featOkTst);
    casFeatCode_canonicalName  = (null == casFeat_canonicalName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_canonicalName).getCode();

 
    casFeat_vernacularName = jcas.getRequiredFeatureDE(casType, "vernacularName", "uima.cas.String", featOkTst);
    casFeatCode_vernacularName  = (null == casFeat_vernacularName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vernacularName).getCode();

 
    casFeat_acceptedNameUsage = jcas.getRequiredFeatureDE(casType, "acceptedNameUsage", "uima.cas.String", featOkTst);
    casFeatCode_acceptedNameUsage  = (null == casFeat_acceptedNameUsage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_acceptedNameUsage).getCode();

 
    casFeat_authorship = jcas.getRequiredFeatureDE(casType, "authorship", "uima.cas.String", featOkTst);
    casFeatCode_authorship  = (null == casFeat_authorship) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_authorship).getCode();

 
    casFeat_nameType = jcas.getRequiredFeatureDE(casType, "nameType", "uima.cas.String", featOkTst);
    casFeatCode_nameType  = (null == casFeat_nameType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nameType).getCode();

 
    casFeat_rank = jcas.getRequiredFeatureDE(casType, "rank", "uima.cas.String", featOkTst);
    casFeatCode_rank  = (null == casFeat_rank) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rank).getCode();

 
    casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "uima.cas.String", featOkTst);
    casFeatCode_origin  = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origin).getCode();

 
    casFeat_taxonomicStatus = jcas.getRequiredFeatureDE(casType, "taxonomicStatus", "uima.cas.String", featOkTst);
    casFeatCode_taxonomicStatus  = (null == casFeat_taxonomicStatus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_taxonomicStatus).getCode();

 
    casFeat_remarks = jcas.getRequiredFeatureDE(casType, "remarks", "uima.cas.String", featOkTst);
    casFeatCode_remarks  = (null == casFeat_remarks) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_remarks).getCode();

 
    casFeat_references = jcas.getRequiredFeatureDE(casType, "references", "uima.cas.String", featOkTst);
    casFeatCode_references  = (null == casFeat_references) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_references).getCode();

 
    casFeat_publishedIn = jcas.getRequiredFeatureDE(casType, "publishedIn", "uima.cas.String", featOkTst);
    casFeatCode_publishedIn  = (null == casFeat_publishedIn) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_publishedIn).getCode();

 
    casFeat_numDescendants = jcas.getRequiredFeatureDE(casType, "numDescendants", "uima.cas.Integer", featOkTst);
    casFeatCode_numDescendants  = (null == casFeat_numDescendants) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numDescendants).getCode();

 
    casFeat_lastCrawled = jcas.getRequiredFeatureDE(casType, "lastCrawled", "uima.cas.String", featOkTst);
    casFeatCode_lastCrawled  = (null == casFeat_lastCrawled) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lastCrawled).getCode();

 
    casFeat_lastInterpreted = jcas.getRequiredFeatureDE(casType, "lastInterpreted", "uima.cas.String", featOkTst);
    casFeatCode_lastInterpreted  = (null == casFeat_lastInterpreted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lastInterpreted).getCode();

 
    casFeat_speciesEpithet = jcas.getRequiredFeatureDE(casType, "speciesEpithet", "uima.cas.String", featOkTst);
    casFeatCode_speciesEpithet  = (null == casFeat_speciesEpithet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speciesEpithet).getCode();

 
    casFeat_infraspecificEpithet = jcas.getRequiredFeatureDE(casType, "infraspecificEpithet", "uima.cas.String", featOkTst);
    casFeatCode_infraspecificEpithet  = (null == casFeat_infraspecificEpithet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_infraspecificEpithet).getCode();

 
    casFeat_cultivarEpithet = jcas.getRequiredFeatureDE(casType, "cultivarEpithet", "uima.cas.String", featOkTst);
    casFeatCode_cultivarEpithet  = (null == casFeat_cultivarEpithet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cultivarEpithet).getCode();

 
    casFeat_url = jcas.getRequiredFeatureDE(casType, "url", "uima.cas.String", featOkTst);
    casFeatCode_url  = (null == casFeat_url) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_url).getCode();

 
    casFeat_wikidataId = jcas.getRequiredFeatureDE(casType, "wikidataId", "uima.cas.String", featOkTst);
    casFeatCode_wikidataId  = (null == casFeat_wikidataId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wikidataId).getCode();

 
    casFeat_wikidataUrl = jcas.getRequiredFeatureDE(casType, "wikidataUrl", "uima.cas.String", featOkTst);
    casFeatCode_wikidataUrl  = (null == casFeat_wikidataUrl) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wikidataUrl).getCode();

  }
}



    