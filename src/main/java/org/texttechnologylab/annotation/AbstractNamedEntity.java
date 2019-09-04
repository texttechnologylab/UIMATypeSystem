

/* First created by JCasGen Mon Apr 08 18:58:00 CEST 2019 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 04 14:11:41 CEST 2019
 * XML source: /home/stud_homes/s3676959/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTypes.xml
 * @generated */
public class AbstractNamedEntity extends Annotation {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(AbstractNamedEntity.class);
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
    protected AbstractNamedEntity() {/* intentionally empty block */}
    
    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public AbstractNamedEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public AbstractNamedEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public AbstractNamedEntity(JCas jcas, int begin, int end) {
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
    //* Feature: value

    /**
     * getter for value - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getValue() {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.AbstractNamedEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_value);}
    
    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(String v) {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.AbstractNamedEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_value, v);}    
   
    
    //*--------------*
    //* Feature: specific

    /**
     * getter for specific - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getSpecific() {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_specific == null)
      jcasType.jcas.throwFeatMissing("specific", "org.texttechnologylab.annotation.AbstractNamedEntity");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_specific);}
    
    /**
     * setter for specific - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSpecific(boolean v) {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_specific == null)
      jcasType.jcas.throwFeatMissing("specific", "org.texttechnologylab.annotation.AbstractNamedEntity");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_specific, v);}    
   
    
    //*--------------*
    //* Feature: metaphor

    /**
     * getter for metaphor - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getMetaphor() {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_metaphor == null)
      jcasType.jcas.throwFeatMissing("metaphor", "org.texttechnologylab.annotation.AbstractNamedEntity");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_metaphor);}
    
    /**
     * setter for metaphor - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setMetaphor(boolean v) {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_metaphor == null)
      jcasType.jcas.throwFeatMissing("metaphor", "org.texttechnologylab.annotation.AbstractNamedEntity");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_metaphor, v);}    
   
    
    //*--------------*
    //* Feature: metonym

    /**
     * getter for metonym - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getMetonym() {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_metonym == null)
      jcasType.jcas.throwFeatMissing("metonym", "org.texttechnologylab.annotation.AbstractNamedEntity");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_metonym);}
    
    /**
     * setter for metonym - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setMetonym(boolean v) {
    if (AbstractNamedEntity_Type.featOkTst && ((AbstractNamedEntity_Type)jcasType).casFeat_metonym == null)
      jcasType.jcas.throwFeatMissing("metonym", "org.texttechnologylab.annotation.AbstractNamedEntity");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AbstractNamedEntity_Type)jcasType).casFeatCode_metonym, v);}    
  }

    