
/* First created by JCasGen Wed Dec 02 17:54:51 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * @generated */
public class MLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.MLink");
 
  /** @generated */
  final Feature casFeat_event_id;
  /** @generated */
  final int     casFeatCode_event_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEvent_id(int addr) {
        if (featOkTst && casFeat_event_id == null)
      jcas.throwFeatMissing("event_id", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_event_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvent_id(int addr, int v) {
        if (featOkTst && casFeat_event_id == null)
      jcas.throwFeatMissing("event_id", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_event_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_related_to_time;
  /** @generated */
  final int     casFeatCode_related_to_time;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRelated_to_time(int addr) {
        if (featOkTst && casFeat_related_to_time == null)
      jcas.throwFeatMissing("related_to_time", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_related_to_time);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelated_to_time(int addr, int v) {
        if (featOkTst && casFeat_related_to_time == null)
      jcas.throwFeatMissing("related_to_time", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_related_to_time, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_event_id = jcas.getRequiredFeatureDE(casType, "event_id", "org.texttechnologylab.annotation.semaf.isobase.Event", featOkTst);
    casFeatCode_event_id  = (null == casFeat_event_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_event_id).getCode();

 
    casFeat_related_to_time = jcas.getRequiredFeatureDE(casType, "related_to_time", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3", featOkTst);
    casFeatCode_related_to_time  = (null == casFeat_related_to_time) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_related_to_time).getCode();

  }
}



    