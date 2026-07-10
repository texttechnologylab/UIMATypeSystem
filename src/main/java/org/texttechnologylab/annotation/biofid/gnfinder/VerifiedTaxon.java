

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Type for verified gnfinder-recognized taxonomic names.
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class VerifiedTaxon extends Taxon {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VerifiedTaxon.class);
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
  protected VerifiedTaxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public VerifiedTaxon(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public VerifiedTaxon(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public VerifiedTaxon(JCas jcas, int begin, int end) {
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
  //* Feature: dataSourceId

  /** getter for dataSourceId - gets 
   * @generated
   * @return value of the feature 
   */
  public short getDataSourceId() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_dataSourceId == null)
      jcasType.jcas.throwFeatMissing("dataSourceId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getShortValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_dataSourceId);}
    
  /** setter for dataSourceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDataSourceId(short v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_dataSourceId == null)
      jcasType.jcas.throwFeatMissing("dataSourceId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setShortValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_dataSourceId, v);}    
   
    
  //*--------------*
  //* Feature: recordId

  /** getter for recordId - gets RecordID from a data source. GNFinder tries its to return ID that corresponds to dwc:taxonID of
                        a DataSource. If such ID is not provided, this ID will be auto-generated. Auto-generated IDs
                        will have 'gn_' prefix.
   * @generated
   * @return value of the feature 
   */
  public String getRecordId() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_recordId == null)
      jcasType.jcas.throwFeatMissing("recordId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_recordId);}
    
  /** setter for recordId - sets RecordID from a data source. GNFinder tries its to return ID that corresponds to dwc:taxonID of
                        a DataSource. If such ID is not provided, this ID will be auto-generated. Auto-generated IDs
                        will have 'gn_' prefix. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecordId(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_recordId == null)
      jcasType.jcas.throwFeatMissing("recordId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_recordId, v);}    
   
    
  //*--------------*
  //* Feature: globalId

  /** getter for globalId - gets GlobalID that is exposed globally by a DataSource. Such IDs are usually self-resolved, like for
                        example LSID, pURL, DOI etc.
   * @generated
   * @return value of the feature 
   */
  public String getGlobalId() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_globalId == null)
      jcasType.jcas.throwFeatMissing("globalId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_globalId);}
    
  /** setter for globalId - sets GlobalID that is exposed globally by a DataSource. Such IDs are usually self-resolved, like for
                        example LSID, pURL, DOI etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGlobalId(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_globalId == null)
      jcasType.jcas.throwFeatMissing("globalId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_globalId, v);}    
   
    
  //*--------------*
  //* Feature: localId

  /** getter for localId - gets LocalID used by a DataSource internally. If an OutLink field is provided, LocalID serves as a
                        'dynamic' component of the URL.
   * @generated
   * @return value of the feature 
   */
  public String getLocalId() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_localId == null)
      jcasType.jcas.throwFeatMissing("localId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_localId);}
    
  /** setter for localId - sets LocalID used by a DataSource internally. If an OutLink field is provided, LocalID serves as a
                        'dynamic' component of the URL. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocalId(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_localId == null)
      jcasType.jcas.throwFeatMissing("localId", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_localId, v);}    
   
    
  //*--------------*
  //* Feature: outlink

  /** getter for outlink - gets Outlink to the record in the DataSource. It consists of a 'stable' URL and an appended 'dynamic'
                        LocalID
   * @generated
   * @return value of the feature 
   */
  public String getOutlink() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_outlink == null)
      jcasType.jcas.throwFeatMissing("outlink", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_outlink);}
    
  /** setter for outlink - sets Outlink to the record in the DataSource. It consists of a 'stable' URL and an appended 'dynamic'
                        LocalID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutlink(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_outlink == null)
      jcasType.jcas.throwFeatMissing("outlink", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_outlink, v);}    
   
    
  //*--------------*
  //* Feature: sortScore

  /** getter for sortScore - gets SortScore is a numeric representation of the whole score. It can be used to find the BestMatch
                        overall, as well as the best match for every data-source.

                        SortScore takes data from all other scores, using the priority sequence from highest to lowest:
                        InfraSpecificRankScore, FuzzyLessScore, CuratedDataScore, AuthorMatchScore, AcceptedNameScore,
                        ParsingQualityScore. Every highest priority trumps everything below. When the final score value
                        is calculated, it is used to sort verification or search results.

                        Comparing this score between results of different verifications will not necessarily be
                        accurate. The score is used for comparison of names from the same result.
   * @generated
   * @return value of the feature 
   */
  public float getSortScore() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_sortScore == null)
      jcasType.jcas.throwFeatMissing("sortScore", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_sortScore);}
    
  /** setter for sortScore - sets SortScore is a numeric representation of the whole score. It can be used to find the BestMatch
                        overall, as well as the best match for every data-source.

                        SortScore takes data from all other scores, using the priority sequence from highest to lowest:
                        InfraSpecificRankScore, FuzzyLessScore, CuratedDataScore, AuthorMatchScore, AcceptedNameScore,
                        ParsingQualityScore. Every highest priority trumps everything below. When the final score value
                        is calculated, it is used to sort verification or search results.

                        Comparing this score between results of different verifications will not necessarily be
                        accurate. The score is used for comparison of names from the same result. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSortScore(float v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_sortScore == null)
      jcasType.jcas.throwFeatMissing("sortScore", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setFloatValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_sortScore, v);}    
   
    
  //*--------------*
  //* Feature: matchedName

  /** getter for matchedName - gets The name-string from the DataSource that was matched by GNames algorithm.
                        Often contains the author names.
   * @generated
   * @return value of the feature 
   */
  public String getMatchedName() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchedName == null)
      jcasType.jcas.throwFeatMissing("matchedName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchedName);}
    
  /** setter for matchedName - sets The name-string from the DataSource that was matched by GNames algorithm.
                        Often contains the author names. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedName(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchedName == null)
      jcasType.jcas.throwFeatMissing("matchedName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchedName, v);}    
   
    
  //*--------------*
  //* Feature: matchedCanonicalSimple

  /** getter for matchedCanonicalSimple - gets A simplified canonical form without ranks for names lower than species, and with omitted hybrid
                        signs for named hybrids. Quite often simple canonical is the same as full canonical. Hybrid
                        signs are preserved for hybrid formulas.
   * @generated
   * @return value of the feature 
   */
  public String getMatchedCanonicalSimple() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchedCanonicalSimple == null)
      jcasType.jcas.throwFeatMissing("matchedCanonicalSimple", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchedCanonicalSimple);}
    
  /** setter for matchedCanonicalSimple - sets A simplified canonical form without ranks for names lower than species, and with omitted hybrid
                        signs for named hybrids. Quite often simple canonical is the same as full canonical. Hybrid
                        signs are preserved for hybrid formulas. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedCanonicalSimple(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchedCanonicalSimple == null)
      jcasType.jcas.throwFeatMissing("matchedCanonicalSimple", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchedCanonicalSimple, v);}    
   
    
  //*--------------*
  //* Feature: matchedCanonicalFull

  /** getter for matchedCanonicalFull - gets A canonical form of the name that preserves hybrid signs and infraspecific ranks.
   * @generated
   * @return value of the feature 
   */
  public String getMatchedCanonicalFull() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchedCanonicalFull == null)
      jcasType.jcas.throwFeatMissing("matchedCanonicalFull", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchedCanonicalFull);}
    
  /** setter for matchedCanonicalFull - sets A canonical form of the name that preserves hybrid signs and infraspecific ranks. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedCanonicalFull(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchedCanonicalFull == null)
      jcasType.jcas.throwFeatMissing("matchedCanonicalFull", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchedCanonicalFull, v);}    
   
    
  //*--------------*
  //* Feature: taxonomicStatus

  /** getter for taxonomicStatus - gets Provides taxonomic status of a name. Can be "Accepted", "Synonym", "N/A".
   * @generated
   * @return value of the feature 
   */
  public String getTaxonomicStatus() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_taxonomicStatus == null)
      jcasType.jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_taxonomicStatus);}
    
  /** setter for taxonomicStatus - sets Provides taxonomic status of a name. Can be "Accepted", "Synonym", "N/A". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaxonomicStatus(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_taxonomicStatus == null)
      jcasType.jcas.throwFeatMissing("taxonomicStatus", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_taxonomicStatus, v);}    
   
    
  //*--------------*
  //* Feature: currentName

  /** getter for currentName - gets The currently accepted name, present if it differs from the matchedName.
   * @generated
   * @return value of the feature 
   */
  public String getCurrentName() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_currentName == null)
      jcasType.jcas.throwFeatMissing("currentName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_currentName);}
    
  /** setter for currentName - sets The currently accepted name, present if it differs from the matchedName. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCurrentName(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_currentName == null)
      jcasType.jcas.throwFeatMissing("currentName", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_currentName, v);}    
   
    
  //*--------------*
  //* Feature: matchType

  /** getter for matchType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMatchType() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchType == null)
      jcasType.jcas.throwFeatMissing("matchType", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchType);}
    
  /** setter for matchType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchType(String v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_matchType == null)
      jcasType.jcas.throwFeatMissing("matchType", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setStringValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_matchType, v);}    
   
    
  //*--------------*
  //* Feature: editDistance

  /** getter for editDistance - gets The Levenshtein edit distance between canonical form of the input name-string and the matched
                        canonical form. If match type is EXACT, edit-distance will be 0.
   * @generated
   * @return value of the feature 
   */
  public short getEditDistance() {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_editDistance == null)
      jcasType.jcas.throwFeatMissing("editDistance", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    return jcasType.ll_cas.ll_getShortValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_editDistance);}
    
  /** setter for editDistance - sets The Levenshtein edit distance between canonical form of the input name-string and the matched
                        canonical form. If match type is EXACT, edit-distance will be 0. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEditDistance(short v) {
    if (VerifiedTaxon_Type.featOkTst && ((VerifiedTaxon_Type)jcasType).casFeat_editDistance == null)
      jcasType.jcas.throwFeatMissing("editDistance", "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon");
    jcasType.ll_cas.ll_setShortValue(addr, ((VerifiedTaxon_Type)jcasType).casFeatCode_editDistance, v);}    
  }

    