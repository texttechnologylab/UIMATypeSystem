
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Agenda_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Agenda.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliamentary.Agenda");
 
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliamentary.Agenda");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_index;
  /** @generated */
  final int     casFeatCode_index;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIndex(int addr) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return ll_cas.ll_getIntValue(addr, casFeatCode_index);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndex(int addr, int v) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.parliamentary.Agenda");
    ll_cas.ll_setIntValue(addr, casFeatCode_index, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speeches;
  /** @generated */
  final int     casFeatCode_speeches;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpeeches(int addr) {
        if (featOkTst && casFeat_speeches == null)
      jcas.throwFeatMissing("speeches", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return ll_cas.ll_getRefValue(addr, casFeatCode_speeches);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeeches(int addr, int v) {
        if (featOkTst && casFeat_speeches == null)
      jcas.throwFeatMissing("speeches", "org.texttechnologylab.annotation.parliamentary.Agenda");
    ll_cas.ll_setRefValue(addr, casFeatCode_speeches, v);}
    
  
 
  /** @generated */
  final Feature casFeat_protocol;
  /** @generated */
  final int     casFeatCode_protocol;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getProtocol(int addr) {
        if (featOkTst && casFeat_protocol == null)
      jcas.throwFeatMissing("protocol", "org.texttechnologylab.annotation.parliamentary.Agenda");
    return ll_cas.ll_getRefValue(addr, casFeatCode_protocol);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProtocol(int addr, int v) {
        if (featOkTst && casFeat_protocol == null)
      jcas.throwFeatMissing("protocol", "org.texttechnologylab.annotation.parliamentary.Agenda");
    ll_cas.ll_setRefValue(addr, casFeatCode_protocol, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Agenda_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_index = jcas.getRequiredFeatureDE(casType, "index", "uima.cas.Integer", featOkTst);
    casFeatCode_index  = (null == casFeat_index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_index).getCode();

 
    casFeat_speeches = jcas.getRequiredFeatureDE(casType, "speeches", "uima.cas.FSList", featOkTst);
    casFeatCode_speeches  = (null == casFeat_speeches) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speeches).getCode();

 
    casFeat_protocol = jcas.getRequiredFeatureDE(casType, "protocol", "org.texttechnologylab.annotation.parliamentary.Protocol", featOkTst);
    casFeatCode_protocol  = (null == casFeat_protocol) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_protocol).getCode();

  }
}



    