
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class Protocol_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Protocol.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliamentary.Protocol");
 
  /** @generated */
  final Feature casFeat_electionPeriod;
  /** @generated */
  final int     casFeatCode_electionPeriod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElectionPeriod(int addr) {
        if (featOkTst && casFeat_electionPeriod == null)
      jcas.throwFeatMissing("electionPeriod", "org.texttechnologylab.annotation.parliamentary.Protocol");
    return ll_cas.ll_getIntValue(addr, casFeatCode_electionPeriod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElectionPeriod(int addr, int v) {
        if (featOkTst && casFeat_electionPeriod == null)
      jcas.throwFeatMissing("electionPeriod", "org.texttechnologylab.annotation.parliamentary.Protocol");
    ll_cas.ll_setIntValue(addr, casFeatCode_electionPeriod, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sessionNumber;
  /** @generated */
  final int     casFeatCode_sessionNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSessionNumber(int addr) {
        if (featOkTst && casFeat_sessionNumber == null)
      jcas.throwFeatMissing("sessionNumber", "org.texttechnologylab.annotation.parliamentary.Protocol");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sessionNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSessionNumber(int addr, int v) {
        if (featOkTst && casFeat_sessionNumber == null)
      jcas.throwFeatMissing("sessionNumber", "org.texttechnologylab.annotation.parliamentary.Protocol");
    ll_cas.ll_setIntValue(addr, casFeatCode_sessionNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.parliamentary.Protocol");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, double v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.parliamentary.Protocol");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_date, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Protocol_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_electionPeriod = jcas.getRequiredFeatureDE(casType, "electionPeriod", "uima.cas.Integer", featOkTst);
    casFeatCode_electionPeriod  = (null == casFeat_electionPeriod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_electionPeriod).getCode();

 
    casFeat_sessionNumber = jcas.getRequiredFeatureDE(casType, "sessionNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_sessionNumber  = (null == casFeat_sessionNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sessionNumber).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.Double", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

  }
}



    