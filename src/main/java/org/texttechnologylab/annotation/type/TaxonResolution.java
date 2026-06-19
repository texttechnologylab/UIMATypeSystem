

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 19 13:50:52 CEST 2026 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** Annotation type for matching taxon information to a taxonomic database.
 * Updated by JCasGen Fri Jun 19 13:50:52 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TaxonResolution extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TaxonResolution";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TaxonResolution.class);
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
   
  public final static String _FeatName_recognizedTaxon = "recognizedTaxon";
  public final static String _FeatName_provider = "provider";
  public final static String _FeatName_taxonId = "taxonId";
  public final static String _FeatName_kingdomName = "kingdomName";
  public final static String _FeatName_kingdomId = "kingdomId";
  public final static String _FeatName_phylumName = "phylumName";
  public final static String _FeatName_phylumId = "phylumId";
  public final static String _FeatName_className = "className";
  public final static String _FeatName_classId = "classId";
  public final static String _FeatName_orderName = "orderName";
  public final static String _FeatName_orderId = "orderId";
  public final static String _FeatName_superfamilyName = "superfamilyName";
  public final static String _FeatName_superfamilyId = "superfamilyId";
  public final static String _FeatName_familyName = "familyName";
  public final static String _FeatName_familyId = "familyId";
  public final static String _FeatName_subfamilyName = "subfamilyName";
  public final static String _FeatName_subfamilyId = "subfamilyId";
  public final static String _FeatName_tribeName = "tribeName";
  public final static String _FeatName_tribeId = "tribeId";
  public final static String _FeatName_subtribeName = "subtribeName";
  public final static String _FeatName_subtribeId = "subtribeId";
  public final static String _FeatName_genusName = "genusName";
  public final static String _FeatName_genusId = "genusId";
  public final static String _FeatName_subgenusName = "subgenusName";
  public final static String _FeatName_subgenusId = "subgenusId";
  public final static String _FeatName_speciesName = "speciesName";
  public final static String _FeatName_speciesId = "speciesId";
  public final static String _FeatName_parentName = "parentName";
  public final static String _FeatName_parentId = "parentId";
  public final static String _FeatName_scientificName = "scientificName";
  public final static String _FeatName_canonicalName = "canonicalName";
  public final static String _FeatName_vernacularName = "vernacularName";
  public final static String _FeatName_acceptedNameUsage = "acceptedNameUsage";
  public final static String _FeatName_authorship = "authorship";
  public final static String _FeatName_nameType = "nameType";
  public final static String _FeatName_rank = "rank";
  public final static String _FeatName_origin = "origin";
  public final static String _FeatName_taxonomicStatus = "taxonomicStatus";
  public final static String _FeatName_remarks = "remarks";
  public final static String _FeatName_references = "references";
  public final static String _FeatName_publishedIn = "publishedIn";
  public final static String _FeatName_numDescendants = "numDescendants";
  public final static String _FeatName_lastCrawled = "lastCrawled";
  public final static String _FeatName_lastInterpreted = "lastInterpreted";
  public final static String _FeatName_speciesEpithet = "speciesEpithet";
  public final static String _FeatName_infraspecificEpithet = "infraspecificEpithet";
  public final static String _FeatName_cultivarEpithet = "cultivarEpithet";
  public final static String _FeatName_url = "url";
  public final static String _FeatName_wikidataId = "wikidataId";
  public final static String _FeatName_wikidataUrl = "wikidataUrl";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_recognizedTaxon = TypeSystemImpl.createCallSite(TaxonResolution.class, "recognizedTaxon");
  private final static MethodHandle _FH_recognizedTaxon = _FC_recognizedTaxon.dynamicInvoker();
  private final static CallSite _FC_provider = TypeSystemImpl.createCallSite(TaxonResolution.class, "provider");
  private final static MethodHandle _FH_provider = _FC_provider.dynamicInvoker();
  private final static CallSite _FC_taxonId = TypeSystemImpl.createCallSite(TaxonResolution.class, "taxonId");
  private final static MethodHandle _FH_taxonId = _FC_taxonId.dynamicInvoker();
  private final static CallSite _FC_kingdomName = TypeSystemImpl.createCallSite(TaxonResolution.class, "kingdomName");
  private final static MethodHandle _FH_kingdomName = _FC_kingdomName.dynamicInvoker();
  private final static CallSite _FC_kingdomId = TypeSystemImpl.createCallSite(TaxonResolution.class, "kingdomId");
  private final static MethodHandle _FH_kingdomId = _FC_kingdomId.dynamicInvoker();
  private final static CallSite _FC_phylumName = TypeSystemImpl.createCallSite(TaxonResolution.class, "phylumName");
  private final static MethodHandle _FH_phylumName = _FC_phylumName.dynamicInvoker();
  private final static CallSite _FC_phylumId = TypeSystemImpl.createCallSite(TaxonResolution.class, "phylumId");
  private final static MethodHandle _FH_phylumId = _FC_phylumId.dynamicInvoker();
  private final static CallSite _FC_className = TypeSystemImpl.createCallSite(TaxonResolution.class, "className");
  private final static MethodHandle _FH_className = _FC_className.dynamicInvoker();
  private final static CallSite _FC_classId = TypeSystemImpl.createCallSite(TaxonResolution.class, "classId");
  private final static MethodHandle _FH_classId = _FC_classId.dynamicInvoker();
  private final static CallSite _FC_orderName = TypeSystemImpl.createCallSite(TaxonResolution.class, "orderName");
  private final static MethodHandle _FH_orderName = _FC_orderName.dynamicInvoker();
  private final static CallSite _FC_orderId = TypeSystemImpl.createCallSite(TaxonResolution.class, "orderId");
  private final static MethodHandle _FH_orderId = _FC_orderId.dynamicInvoker();
  private final static CallSite _FC_superfamilyName = TypeSystemImpl.createCallSite(TaxonResolution.class, "superfamilyName");
  private final static MethodHandle _FH_superfamilyName = _FC_superfamilyName.dynamicInvoker();
  private final static CallSite _FC_superfamilyId = TypeSystemImpl.createCallSite(TaxonResolution.class, "superfamilyId");
  private final static MethodHandle _FH_superfamilyId = _FC_superfamilyId.dynamicInvoker();
  private final static CallSite _FC_familyName = TypeSystemImpl.createCallSite(TaxonResolution.class, "familyName");
  private final static MethodHandle _FH_familyName = _FC_familyName.dynamicInvoker();
  private final static CallSite _FC_familyId = TypeSystemImpl.createCallSite(TaxonResolution.class, "familyId");
  private final static MethodHandle _FH_familyId = _FC_familyId.dynamicInvoker();
  private final static CallSite _FC_subfamilyName = TypeSystemImpl.createCallSite(TaxonResolution.class, "subfamilyName");
  private final static MethodHandle _FH_subfamilyName = _FC_subfamilyName.dynamicInvoker();
  private final static CallSite _FC_subfamilyId = TypeSystemImpl.createCallSite(TaxonResolution.class, "subfamilyId");
  private final static MethodHandle _FH_subfamilyId = _FC_subfamilyId.dynamicInvoker();
  private final static CallSite _FC_tribeName = TypeSystemImpl.createCallSite(TaxonResolution.class, "tribeName");
  private final static MethodHandle _FH_tribeName = _FC_tribeName.dynamicInvoker();
  private final static CallSite _FC_tribeId = TypeSystemImpl.createCallSite(TaxonResolution.class, "tribeId");
  private final static MethodHandle _FH_tribeId = _FC_tribeId.dynamicInvoker();
  private final static CallSite _FC_subtribeName = TypeSystemImpl.createCallSite(TaxonResolution.class, "subtribeName");
  private final static MethodHandle _FH_subtribeName = _FC_subtribeName.dynamicInvoker();
  private final static CallSite _FC_subtribeId = TypeSystemImpl.createCallSite(TaxonResolution.class, "subtribeId");
  private final static MethodHandle _FH_subtribeId = _FC_subtribeId.dynamicInvoker();
  private final static CallSite _FC_genusName = TypeSystemImpl.createCallSite(TaxonResolution.class, "genusName");
  private final static MethodHandle _FH_genusName = _FC_genusName.dynamicInvoker();
  private final static CallSite _FC_genusId = TypeSystemImpl.createCallSite(TaxonResolution.class, "genusId");
  private final static MethodHandle _FH_genusId = _FC_genusId.dynamicInvoker();
  private final static CallSite _FC_subgenusName = TypeSystemImpl.createCallSite(TaxonResolution.class, "subgenusName");
  private final static MethodHandle _FH_subgenusName = _FC_subgenusName.dynamicInvoker();
  private final static CallSite _FC_subgenusId = TypeSystemImpl.createCallSite(TaxonResolution.class, "subgenusId");
  private final static MethodHandle _FH_subgenusId = _FC_subgenusId.dynamicInvoker();
  private final static CallSite _FC_speciesName = TypeSystemImpl.createCallSite(TaxonResolution.class, "speciesName");
  private final static MethodHandle _FH_speciesName = _FC_speciesName.dynamicInvoker();
  private final static CallSite _FC_speciesId = TypeSystemImpl.createCallSite(TaxonResolution.class, "speciesId");
  private final static MethodHandle _FH_speciesId = _FC_speciesId.dynamicInvoker();
  private final static CallSite _FC_parentName = TypeSystemImpl.createCallSite(TaxonResolution.class, "parentName");
  private final static MethodHandle _FH_parentName = _FC_parentName.dynamicInvoker();
  private final static CallSite _FC_parentId = TypeSystemImpl.createCallSite(TaxonResolution.class, "parentId");
  private final static MethodHandle _FH_parentId = _FC_parentId.dynamicInvoker();
  private final static CallSite _FC_scientificName = TypeSystemImpl.createCallSite(TaxonResolution.class, "scientificName");
  private final static MethodHandle _FH_scientificName = _FC_scientificName.dynamicInvoker();
  private final static CallSite _FC_canonicalName = TypeSystemImpl.createCallSite(TaxonResolution.class, "canonicalName");
  private final static MethodHandle _FH_canonicalName = _FC_canonicalName.dynamicInvoker();
  private final static CallSite _FC_vernacularName = TypeSystemImpl.createCallSite(TaxonResolution.class, "vernacularName");
  private final static MethodHandle _FH_vernacularName = _FC_vernacularName.dynamicInvoker();
  private final static CallSite _FC_acceptedNameUsage = TypeSystemImpl.createCallSite(TaxonResolution.class, "acceptedNameUsage");
  private final static MethodHandle _FH_acceptedNameUsage = _FC_acceptedNameUsage.dynamicInvoker();
  private final static CallSite _FC_authorship = TypeSystemImpl.createCallSite(TaxonResolution.class, "authorship");
  private final static MethodHandle _FH_authorship = _FC_authorship.dynamicInvoker();
  private final static CallSite _FC_nameType = TypeSystemImpl.createCallSite(TaxonResolution.class, "nameType");
  private final static MethodHandle _FH_nameType = _FC_nameType.dynamicInvoker();
  private final static CallSite _FC_rank = TypeSystemImpl.createCallSite(TaxonResolution.class, "rank");
  private final static MethodHandle _FH_rank = _FC_rank.dynamicInvoker();
  private final static CallSite _FC_origin = TypeSystemImpl.createCallSite(TaxonResolution.class, "origin");
  private final static MethodHandle _FH_origin = _FC_origin.dynamicInvoker();
  private final static CallSite _FC_taxonomicStatus = TypeSystemImpl.createCallSite(TaxonResolution.class, "taxonomicStatus");
  private final static MethodHandle _FH_taxonomicStatus = _FC_taxonomicStatus.dynamicInvoker();
  private final static CallSite _FC_remarks = TypeSystemImpl.createCallSite(TaxonResolution.class, "remarks");
  private final static MethodHandle _FH_remarks = _FC_remarks.dynamicInvoker();
  private final static CallSite _FC_references = TypeSystemImpl.createCallSite(TaxonResolution.class, "references");
  private final static MethodHandle _FH_references = _FC_references.dynamicInvoker();
  private final static CallSite _FC_publishedIn = TypeSystemImpl.createCallSite(TaxonResolution.class, "publishedIn");
  private final static MethodHandle _FH_publishedIn = _FC_publishedIn.dynamicInvoker();
  private final static CallSite _FC_numDescendants = TypeSystemImpl.createCallSite(TaxonResolution.class, "numDescendants");
  private final static MethodHandle _FH_numDescendants = _FC_numDescendants.dynamicInvoker();
  private final static CallSite _FC_lastCrawled = TypeSystemImpl.createCallSite(TaxonResolution.class, "lastCrawled");
  private final static MethodHandle _FH_lastCrawled = _FC_lastCrawled.dynamicInvoker();
  private final static CallSite _FC_lastInterpreted = TypeSystemImpl.createCallSite(TaxonResolution.class, "lastInterpreted");
  private final static MethodHandle _FH_lastInterpreted = _FC_lastInterpreted.dynamicInvoker();
  private final static CallSite _FC_speciesEpithet = TypeSystemImpl.createCallSite(TaxonResolution.class, "speciesEpithet");
  private final static MethodHandle _FH_speciesEpithet = _FC_speciesEpithet.dynamicInvoker();
  private final static CallSite _FC_infraspecificEpithet = TypeSystemImpl.createCallSite(TaxonResolution.class, "infraspecificEpithet");
  private final static MethodHandle _FH_infraspecificEpithet = _FC_infraspecificEpithet.dynamicInvoker();
  private final static CallSite _FC_cultivarEpithet = TypeSystemImpl.createCallSite(TaxonResolution.class, "cultivarEpithet");
  private final static MethodHandle _FH_cultivarEpithet = _FC_cultivarEpithet.dynamicInvoker();
  private final static CallSite _FC_url = TypeSystemImpl.createCallSite(TaxonResolution.class, "url");
  private final static MethodHandle _FH_url = _FC_url.dynamicInvoker();
  private final static CallSite _FC_wikidataId = TypeSystemImpl.createCallSite(TaxonResolution.class, "wikidataId");
  private final static MethodHandle _FH_wikidataId = _FC_wikidataId.dynamicInvoker();
  private final static CallSite _FC_wikidataUrl = TypeSystemImpl.createCallSite(TaxonResolution.class, "wikidataUrl");
  private final static MethodHandle _FH_wikidataUrl = _FC_wikidataUrl.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TaxonResolution() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TaxonResolution(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TaxonResolution(JCas jcas) {
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
  //* Feature: recognizedTaxon

  /** getter for recognizedTaxon - gets Reference to the taxon in the document that was recognized.
   * @generated
   * @return value of the feature 
   */
  public RecognizedTaxon getRecognizedTaxon() { 
    return (RecognizedTaxon)(_getFeatureValueNc(wrapGetIntCatchException(_FH_recognizedTaxon)));
  }
    
  /** setter for recognizedTaxon - sets Reference to the taxon in the document that was recognized. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecognizedTaxon(RecognizedTaxon v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_recognizedTaxon), v);
  }    
    
   
    
  //*--------------*
  //* Feature: provider

  /** getter for provider - gets The provider of the taxon resolution information.
   * @generated
   * @return value of the feature 
   */
  public String getProvider() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_provider));
  }
    
  /** setter for provider - sets The provider of the taxon resolution information. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProvider(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_provider), v);
  }    
    
   
    
  //*--------------*
  //* Feature: taxonId

  /** getter for taxonId - gets The identifier of the taxon in the taxonomic database.
   * @generated
   * @return value of the feature 
   */
  public int getTaxonId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_taxonId));
  }
    
  /** setter for taxonId - sets The identifier of the taxon in the taxonomic database. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaxonId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_taxonId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: kingdomName

  /** getter for kingdomName - gets The name of the kingdom to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getKingdomName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_kingdomName));
  }
    
  /** setter for kingdomName - sets The name of the kingdom to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKingdomName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_kingdomName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: kingdomId

  /** getter for kingdomId - gets The identifier of the kingdom to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getKingdomId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_kingdomId));
  }
    
  /** setter for kingdomId - sets The identifier of the kingdom to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKingdomId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_kingdomId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: phylumName

  /** getter for phylumName - gets The name of the phylum to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getPhylumName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_phylumName));
  }
    
  /** setter for phylumName - sets The name of the phylum to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhylumName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_phylumName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: phylumId

  /** getter for phylumId - gets The identifier of the phylum to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getPhylumId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_phylumId));
  }
    
  /** setter for phylumId - sets The identifier of the phylum to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPhylumId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_phylumId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: className

  /** getter for className - gets The name of the class to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getClassName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_className));
  }
    
  /** setter for className - sets The name of the class to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_className), v);
  }    
    
   
    
  //*--------------*
  //* Feature: classId

  /** getter for classId - gets The identifier of the class to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getClassId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_classId));
  }
    
  /** setter for classId - sets The identifier of the class to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_classId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: orderName

  /** getter for orderName - gets The name of the order to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getOrderName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_orderName));
  }
    
  /** setter for orderName - sets The name of the order to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrderName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_orderName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: orderId

  /** getter for orderId - gets The identifier of the order to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getOrderId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_orderId));
  }
    
  /** setter for orderId - sets The identifier of the order to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrderId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_orderId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: superfamilyName

  /** getter for superfamilyName - gets The name of the superfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSuperfamilyName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_superfamilyName));
  }
    
  /** setter for superfamilyName - sets The name of the superfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuperfamilyName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_superfamilyName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: superfamilyId

  /** getter for superfamilyId - gets The identifier of the superfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSuperfamilyId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_superfamilyId));
  }
    
  /** setter for superfamilyId - sets The identifier of the superfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuperfamilyId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_superfamilyId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: familyName

  /** getter for familyName - gets The name of the family to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getFamilyName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_familyName));
  }
    
  /** setter for familyName - sets The name of the family to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFamilyName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_familyName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: familyId

  /** getter for familyId - gets The identifier of the family to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getFamilyId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_familyId));
  }
    
  /** setter for familyId - sets The identifier of the family to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFamilyId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_familyId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subfamilyName

  /** getter for subfamilyName - gets The name of the subfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSubfamilyName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subfamilyName));
  }
    
  /** setter for subfamilyName - sets The name of the subfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubfamilyName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subfamilyName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subfamilyId

  /** getter for subfamilyId - gets The identifier of the subfamily to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSubfamilyId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_subfamilyId));
  }
    
  /** setter for subfamilyId - sets The identifier of the subfamily to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubfamilyId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_subfamilyId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tribeName

  /** getter for tribeName - gets The name of the tribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getTribeName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_tribeName));
  }
    
  /** setter for tribeName - sets The name of the tribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTribeName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_tribeName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tribeId

  /** getter for tribeId - gets The identifier of the tribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getTribeId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_tribeId));
  }
    
  /** setter for tribeId - sets The identifier of the tribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTribeId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_tribeId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subtribeName

  /** getter for subtribeName - gets The name of the subtribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSubtribeName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subtribeName));
  }
    
  /** setter for subtribeName - sets The name of the subtribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtribeName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subtribeName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subtribeId

  /** getter for subtribeId - gets The identifier of the subtribe to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSubtribeId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_subtribeId));
  }
    
  /** setter for subtribeId - sets The identifier of the subtribe to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtribeId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_subtribeId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: genusName

  /** getter for genusName - gets The name of the genus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getGenusName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_genusName));
  }
    
  /** setter for genusName - sets The name of the genus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGenusName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_genusName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: genusId

  /** getter for genusId - gets The identifier of the genus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getGenusId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_genusId));
  }
    
  /** setter for genusId - sets The identifier of the genus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGenusId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_genusId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subgenusName

  /** getter for subgenusName - gets The name of the subgenus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSubgenusName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_subgenusName));
  }
    
  /** setter for subgenusName - sets The name of the subgenus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubgenusName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_subgenusName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: subgenusId

  /** getter for subgenusId - gets The identifier of the subgenus to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSubgenusId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_subgenusId));
  }
    
  /** setter for subgenusId - sets The identifier of the subgenus to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubgenusId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_subgenusId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speciesName

  /** getter for speciesName - gets The name of the species to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSpeciesName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speciesName));
  }
    
  /** setter for speciesName - sets The name of the species to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeciesName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speciesName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speciesId

  /** getter for speciesId - gets The identifier of the species to which the taxon belongs, if available.
   * @generated
   * @return value of the feature 
   */
  public int getSpeciesId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_speciesId));
  }
    
  /** setter for speciesId - sets The identifier of the species to which the taxon belongs, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeciesId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_speciesId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: parentName

  /** getter for parentName - gets The name of the parent taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getParentName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_parentName));
  }
    
  /** setter for parentName - sets The name of the parent taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_parentName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: parentId

  /** getter for parentId - gets The identifier of the parent taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public int getParentId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_parentId));
  }
    
  /** setter for parentId - sets The identifier of the parent taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_parentId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scientificName

  /** getter for scientificName - gets The scientific name of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getScientificName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_scientificName));
  }
    
  /** setter for scientificName - sets The scientific name of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScientificName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_scientificName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: canonicalName

  /** getter for canonicalName - gets The canonical name of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getCanonicalName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_canonicalName));
  }
    
  /** setter for canonicalName - sets The canonical name of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCanonicalName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_canonicalName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: vernacularName

  /** getter for vernacularName - gets The vernacular name of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getVernacularName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_vernacularName));
  }
    
  /** setter for vernacularName - sets The vernacular name of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVernacularName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_vernacularName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: acceptedNameUsage

  /** getter for acceptedNameUsage - gets The accepted name usage of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getAcceptedNameUsage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_acceptedNameUsage));
  }
    
  /** setter for acceptedNameUsage - sets The accepted name usage of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAcceptedNameUsage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_acceptedNameUsage), v);
  }    
    
   
    
  //*--------------*
  //* Feature: authorship

  /** getter for authorship - gets The authorship information for the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getAuthorship() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_authorship));
  }
    
  /** setter for authorship - sets The authorship information for the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthorship(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_authorship), v);
  }    
    
   
    
  //*--------------*
  //* Feature: nameType

  /** getter for nameType - gets The type of the taxon name, if available.
   * @generated
   * @return value of the feature 
   */
  public String getNameType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_nameType));
  }
    
  /** setter for nameType - sets The type of the taxon name, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNameType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_nameType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets The taxonomic rank of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getRank() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_rank));
  }
    
  /** setter for rank - sets The taxonomic rank of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRank(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_rank), v);
  }    
    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets The origin of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_origin));
  }
    
  /** setter for origin - sets The origin of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_origin), v);
  }    
    
   
    
  //*--------------*
  //* Feature: taxonomicStatus

  /** getter for taxonomicStatus - gets The taxonomic status of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getTaxonomicStatus() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_taxonomicStatus));
  }
    
  /** setter for taxonomicStatus - sets The taxonomic status of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaxonomicStatus(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_taxonomicStatus), v);
  }    
    
   
    
  //*--------------*
  //* Feature: remarks

  /** getter for remarks - gets Any additional remarks about the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getRemarks() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_remarks));
  }
    
  /** setter for remarks - sets Any additional remarks about the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRemarks(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_remarks), v);
  }    
    
   
    
  //*--------------*
  //* Feature: references

  /** getter for references - gets References for the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getReferences() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_references));
  }
    
  /** setter for references - sets References for the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferences(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_references), v);
  }    
    
   
    
  //*--------------*
  //* Feature: publishedIn

  /** getter for publishedIn - gets The publication in which the taxon was published, if available.
   * @generated
   * @return value of the feature 
   */
  public String getPublishedIn() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_publishedIn));
  }
    
  /** setter for publishedIn - sets The publication in which the taxon was published, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPublishedIn(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_publishedIn), v);
  }    
    
   
    
  //*--------------*
  //* Feature: numDescendants

  /** getter for numDescendants - gets The number of descendant taxa, if available.
   * @generated
   * @return value of the feature 
   */
  public int getNumDescendants() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_numDescendants));
  }
    
  /** setter for numDescendants - sets The number of descendant taxa, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumDescendants(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_numDescendants), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lastCrawled

  /** getter for lastCrawled - gets The date and time when the taxon was last crawled, if available.
   * @generated
   * @return value of the feature 
   */
  public String getLastCrawled() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_lastCrawled));
  }
    
  /** setter for lastCrawled - sets The date and time when the taxon was last crawled, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastCrawled(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_lastCrawled), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lastInterpreted

  /** getter for lastInterpreted - gets The date and time when the taxon was last interpreted, if available.
   * @generated
   * @return value of the feature 
   */
  public String getLastInterpreted() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_lastInterpreted));
  }
    
  /** setter for lastInterpreted - sets The date and time when the taxon was last interpreted, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastInterpreted(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_lastInterpreted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speciesEpithet

  /** getter for speciesEpithet - gets The species epithet of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getSpeciesEpithet() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speciesEpithet));
  }
    
  /** setter for speciesEpithet - sets The species epithet of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeciesEpithet(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speciesEpithet), v);
  }    
    
   
    
  //*--------------*
  //* Feature: infraspecificEpithet

  /** getter for infraspecificEpithet - gets The infraspecific epithet of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getInfraspecificEpithet() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_infraspecificEpithet));
  }
    
  /** setter for infraspecificEpithet - sets The infraspecific epithet of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInfraspecificEpithet(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_infraspecificEpithet), v);
  }    
    
   
    
  //*--------------*
  //* Feature: cultivarEpithet

  /** getter for cultivarEpithet - gets The cultivar epithet of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getCultivarEpithet() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_cultivarEpithet));
  }
    
  /** setter for cultivarEpithet - sets The cultivar epithet of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCultivarEpithet(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_cultivarEpithet), v);
  }    
    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets A web URL associated with the taxon, provided by the taxonomic database, if available.
   * @generated
   * @return value of the feature 
   */
  public String getUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_url));
  }
    
  /** setter for url - sets A web URL associated with the taxon, provided by the taxonomic database, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_url), v);
  }    
    
   
    
  //*--------------*
  //* Feature: wikidataId

  /** getter for wikidataId - gets The Wikidata ID of the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getWikidataId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_wikidataId));
  }
    
  /** setter for wikidataId - sets The Wikidata ID of the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikidataId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_wikidataId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: wikidataUrl

  /** getter for wikidataUrl - gets The URL of the Wikidata page for the taxon, if available.
   * @generated
   * @return value of the feature 
   */
  public String getWikidataUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_wikidataUrl));
  }
    
  /** setter for wikidataUrl - sets The URL of the Wikidata page for the taxon, if available. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikidataUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_wikidataUrl), v);
  }    
    
  }

    