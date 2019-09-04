

/* First created by JCasGen Fri Jun 21 09:34:41 CEST 2019 */
package org.texttechnologylab.annotation.knowledge;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** 
 * Updated by JCasGen Wed Sep 04 14:12:24 CEST 2019
 * XML source: /home/stud_homes/s3676959/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class WikidataEntry extends KnowledgeEntry {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(WikidataEntry.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {return typeIndexID;}
 
    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected WikidataEntry() {/* intentionally empty block */}
    
    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public WikidataEntry(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public WikidataEntry(JCas jcas) {
    super(jcas);
    readObject();   
  } 

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public WikidataEntry(JCas jcas, int begin, int end) {
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
    //* Feature: P31

    /**
     * getter for P31 - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringList getP31() {
    if (WikidataEntry_Type.featOkTst && ((WikidataEntry_Type)jcasType).casFeat_P31 == null)
      jcasType.jcas.throwFeatMissing("P31", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WikidataEntry_Type)jcasType).casFeatCode_P31)));}
    
    /**
     * setter for P31 - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setP31(StringList v) {
    if (WikidataEntry_Type.featOkTst && ((WikidataEntry_Type)jcasType).casFeat_P31 == null)
      jcasType.jcas.throwFeatMissing("P31", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    jcasType.ll_cas.ll_setRefValue(addr, ((WikidataEntry_Type)jcasType).casFeatCode_P31, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
    //*--------------*
    //* Feature: P279

    /**
     * getter for P279 - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringList getP279() {
    if (WikidataEntry_Type.featOkTst && ((WikidataEntry_Type)jcasType).casFeat_P279 == null)
      jcasType.jcas.throwFeatMissing("P279", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WikidataEntry_Type)jcasType).casFeatCode_P279)));}
    
    /**
     * setter for P279 - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setP279(StringList v) {
    if (WikidataEntry_Type.featOkTst && ((WikidataEntry_Type)jcasType).casFeat_P279 == null)
      jcasType.jcas.throwFeatMissing("P279", "org.texttechnologylab.annotation.knowledge.WikidataEntry");
    jcasType.ll_cas.ll_setRefValue(addr, ((WikidataEntry_Type)jcasType).casFeatCode_P279, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    