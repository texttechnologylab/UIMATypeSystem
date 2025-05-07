

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 16:38:29 CEST 2025 */

package org.texttechnologylab.annotation.biofid.gnfinder;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Type for verified gnfinder-recognized taxonomic names.
 * Updated by JCasGen Wed May 07 16:38:29 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class VerifiedTaxon extends Taxon {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.biofid.gnfinder.VerifiedTaxon";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_dataSourceId = "dataSourceId";
  public final static String _FeatName_recordId = "recordId";
  public final static String _FeatName_globalId = "globalId";
  public final static String _FeatName_localId = "localId";
  public final static String _FeatName_outlink = "outlink";
  public final static String _FeatName_sortScore = "sortScore";
  public final static String _FeatName_matchedName = "matchedName";
  public final static String _FeatName_matchedCanonicalSimple = "matchedCanonicalSimple";
  public final static String _FeatName_matchedCanonicalFull = "matchedCanonicalFull";
  public final static String _FeatName_taxonomicStatus = "taxonomicStatus";
  public final static String _FeatName_currentName = "currentName";
  public final static String _FeatName_matchType = "matchType";
  public final static String _FeatName_editDistance = "editDistance";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_dataSourceId = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "dataSourceId");
  private final static MethodHandle _FH_dataSourceId = _FC_dataSourceId.dynamicInvoker();
  private final static CallSite _FC_recordId = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "recordId");
  private final static MethodHandle _FH_recordId = _FC_recordId.dynamicInvoker();
  private final static CallSite _FC_globalId = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "globalId");
  private final static MethodHandle _FH_globalId = _FC_globalId.dynamicInvoker();
  private final static CallSite _FC_localId = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "localId");
  private final static MethodHandle _FH_localId = _FC_localId.dynamicInvoker();
  private final static CallSite _FC_outlink = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "outlink");
  private final static MethodHandle _FH_outlink = _FC_outlink.dynamicInvoker();
  private final static CallSite _FC_sortScore = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "sortScore");
  private final static MethodHandle _FH_sortScore = _FC_sortScore.dynamicInvoker();
  private final static CallSite _FC_matchedName = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "matchedName");
  private final static MethodHandle _FH_matchedName = _FC_matchedName.dynamicInvoker();
  private final static CallSite _FC_matchedCanonicalSimple = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "matchedCanonicalSimple");
  private final static MethodHandle _FH_matchedCanonicalSimple = _FC_matchedCanonicalSimple.dynamicInvoker();
  private final static CallSite _FC_matchedCanonicalFull = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "matchedCanonicalFull");
  private final static MethodHandle _FH_matchedCanonicalFull = _FC_matchedCanonicalFull.dynamicInvoker();
  private final static CallSite _FC_taxonomicStatus = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "taxonomicStatus");
  private final static MethodHandle _FH_taxonomicStatus = _FC_taxonomicStatus.dynamicInvoker();
  private final static CallSite _FC_currentName = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "currentName");
  private final static MethodHandle _FH_currentName = _FC_currentName.dynamicInvoker();
  private final static CallSite _FC_matchType = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "matchType");
  private final static MethodHandle _FH_matchType = _FC_matchType.dynamicInvoker();
  private final static CallSite _FC_editDistance = TypeSystemImpl.createCallSite(VerifiedTaxon.class, "editDistance");
  private final static MethodHandle _FH_editDistance = _FC_editDistance.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected VerifiedTaxon() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public VerifiedTaxon(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getShortValueNc(wrapGetIntCatchException(_FH_dataSourceId));
  }
    
  /** setter for dataSourceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDataSourceId(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_dataSourceId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: recordId

  /** getter for recordId - gets RecordID from a data source. GNFinder tries its to return ID that corresponds to dwc:taxonID of
                        a DataSource. If such ID is not provided, this ID will be auto-generated. Auto-generated IDs
                        will have 'gn_' prefix.
   * @generated
   * @return value of the feature 
   */
  public String getRecordId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_recordId));
  }
    
  /** setter for recordId - sets RecordID from a data source. GNFinder tries its to return ID that corresponds to dwc:taxonID of
                        a DataSource. If such ID is not provided, this ID will be auto-generated. Auto-generated IDs
                        will have 'gn_' prefix. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecordId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_recordId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: globalId

  /** getter for globalId - gets GlobalID that is exposed globally by a DataSource. Such IDs are usually self-resolved, like for
                        example LSID, pURL, DOI etc.
   * @generated
   * @return value of the feature 
   */
  public String getGlobalId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_globalId));
  }
    
  /** setter for globalId - sets GlobalID that is exposed globally by a DataSource. Such IDs are usually self-resolved, like for
                        example LSID, pURL, DOI etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGlobalId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_globalId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: localId

  /** getter for localId - gets LocalID used by a DataSource internally. If an OutLink field is provided, LocalID serves as a
                        'dynamic' component of the URL.
   * @generated
   * @return value of the feature 
   */
  public String getLocalId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_localId));
  }
    
  /** setter for localId - sets LocalID used by a DataSource internally. If an OutLink field is provided, LocalID serves as a
                        'dynamic' component of the URL. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocalId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_localId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: outlink

  /** getter for outlink - gets Outlink to the record in the DataSource. It consists of a 'stable' URL and an appended 'dynamic'
                        LocalID
   * @generated
   * @return value of the feature 
   */
  public String getOutlink() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_outlink));
  }
    
  /** setter for outlink - sets Outlink to the record in the DataSource. It consists of a 'stable' URL and an appended 'dynamic'
                        LocalID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutlink(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_outlink), v);
  }    
    
   
    
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
    return _getFloatValueNc(wrapGetIntCatchException(_FH_sortScore));
  }
    
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
    _setFloatValueNfc(wrapGetIntCatchException(_FH_sortScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: matchedName

  /** getter for matchedName - gets The name-string from the DataSource that was matched by GNames algorithm.
                        Often contains the author names.
   * @generated
   * @return value of the feature 
   */
  public String getMatchedName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_matchedName));
  }
    
  /** setter for matchedName - sets The name-string from the DataSource that was matched by GNames algorithm.
                        Often contains the author names. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_matchedName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: matchedCanonicalSimple

  /** getter for matchedCanonicalSimple - gets A simplified canonical form without ranks for names lower than species, and with omitted hybrid
                        signs for named hybrids. Quite often simple canonical is the same as full canonical. Hybrid
                        signs are preserved for hybrid formulas.
   * @generated
   * @return value of the feature 
   */
  public String getMatchedCanonicalSimple() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_matchedCanonicalSimple));
  }
    
  /** setter for matchedCanonicalSimple - sets A simplified canonical form without ranks for names lower than species, and with omitted hybrid
                        signs for named hybrids. Quite often simple canonical is the same as full canonical. Hybrid
                        signs are preserved for hybrid formulas. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedCanonicalSimple(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_matchedCanonicalSimple), v);
  }    
    
   
    
  //*--------------*
  //* Feature: matchedCanonicalFull

  /** getter for matchedCanonicalFull - gets A canonical form of the name that preserves hybrid signs and infraspecific ranks.
   * @generated
   * @return value of the feature 
   */
  public String getMatchedCanonicalFull() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_matchedCanonicalFull));
  }
    
  /** setter for matchedCanonicalFull - sets A canonical form of the name that preserves hybrid signs and infraspecific ranks. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchedCanonicalFull(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_matchedCanonicalFull), v);
  }    
    
   
    
  //*--------------*
  //* Feature: taxonomicStatus

  /** getter for taxonomicStatus - gets Provides taxonomic status of a name. Can be "Accepted", "Synonym", "N/A".
   * @generated
   * @return value of the feature 
   */
  public String getTaxonomicStatus() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_taxonomicStatus));
  }
    
  /** setter for taxonomicStatus - sets Provides taxonomic status of a name. Can be "Accepted", "Synonym", "N/A". 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTaxonomicStatus(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_taxonomicStatus), v);
  }    
    
   
    
  //*--------------*
  //* Feature: currentName

  /** getter for currentName - gets The currently accepted name, present if it differs from the matchedName.
   * @generated
   * @return value of the feature 
   */
  public String getCurrentName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_currentName));
  }
    
  /** setter for currentName - sets The currently accepted name, present if it differs from the matchedName. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCurrentName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_currentName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: matchType

  /** getter for matchType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMatchType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_matchType));
  }
    
  /** setter for matchType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatchType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_matchType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: editDistance

  /** getter for editDistance - gets The Levenshtein edit distance between canonical form of the input name-string and the matched
                        canonical form. If match type is EXACT, edit-distance will be 0.
   * @generated
   * @return value of the feature 
   */
  public short getEditDistance() { 
    return _getShortValueNc(wrapGetIntCatchException(_FH_editDistance));
  }
    
  /** setter for editDistance - sets The Levenshtein edit distance between canonical form of the input name-string and the matched
                        canonical form. If match type is EXACT, edit-distance will be 0. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEditDistance(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_editDistance), v);
  }    
    
  }

    