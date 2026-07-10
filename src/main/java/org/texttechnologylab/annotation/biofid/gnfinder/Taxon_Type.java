
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Type for gnfinder-recognized taxonomic names that have not been verified.
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class Taxon_Type extends org.texttechnologylab.annotation.biofid.Taxon_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Taxon.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
 
  /** @generated */
  final Feature casFeat_cardinality;
  /** @generated */
  final int     casFeatCode_cardinality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public short getCardinality(int addr) {
        if (featOkTst && casFeat_cardinality == null)
      jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    return ll_cas.ll_getShortValue(addr, casFeatCode_cardinality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCardinality(int addr, short v) {
        if (featOkTst && casFeat_cardinality == null)
      jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    ll_cas.ll_setShortValue(addr, casFeatCode_cardinality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oddsLog10;
  /** @generated */
  final int     casFeatCode_oddsLog10;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getOddsLog10(int addr) {
        if (featOkTst && casFeat_oddsLog10 == null)
      jcas.throwFeatMissing("oddsLog10", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_oddsLog10);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOddsLog10(int addr, float v) {
        if (featOkTst && casFeat_oddsLog10 == null)
      jcas.throwFeatMissing("oddsLog10", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    ll_cas.ll_setFloatValue(addr, casFeatCode_oddsLog10, v);}
    
  
 
  /** @generated */
  final Feature casFeat_oddsDetails;
  /** @generated */
  final int     casFeatCode_oddsDetails;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOddsDetails(int addr) {
        if (featOkTst && casFeat_oddsDetails == null)
      jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    return ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOddsDetails(int addr, int v) {
        if (featOkTst && casFeat_oddsDetails == null)
      jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    ll_cas.ll_setRefValue(addr, casFeatCode_oddsDetails, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getOddsDetails(int addr, int i) {
        if (featOkTst && casFeat_oddsDetails == null)
      jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOddsDetails(int addr, int i, int v) {
        if (featOkTst && casFeat_oddsDetails == null)
      jcas.throwFeatMissing("oddsDetails", "org.texttechnologylab.annotation.biofid.gnfinder.Taxon");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_oddsDetails), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Taxon_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_cardinality = jcas.getRequiredFeatureDE(casType, "cardinality", "uima.cas.Short", featOkTst);
    casFeatCode_cardinality  = (null == casFeat_cardinality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cardinality).getCode();

 
    casFeat_oddsLog10 = jcas.getRequiredFeatureDE(casType, "oddsLog10", "uima.cas.Float", featOkTst);
    casFeatCode_oddsLog10  = (null == casFeat_oddsLog10) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oddsLog10).getCode();

 
    casFeat_oddsDetails = jcas.getRequiredFeatureDE(casType, "oddsDetails", "uima.cas.FSArray", featOkTst);
    casFeatCode_oddsDetails  = (null == casFeat_oddsDetails) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oddsDetails).getCode();

  }
}



    