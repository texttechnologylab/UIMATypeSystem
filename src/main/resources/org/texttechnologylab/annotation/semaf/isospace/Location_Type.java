
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Apr 07 19:23:38 CEST 2020
 * @generated */
public class Location_Type extends SpatialEntity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Location.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.Location");
 
  /** @generated */
  final Feature casFeat_gazref;
  /** @generated */
  final int     casFeatCode_gazref;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGazref(int addr) {
        if (featOkTst && casFeat_gazref == null)
      jcas.throwFeatMissing("gazref", "org.texttechnologylab.annotation.semaf.isospace.Location");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gazref);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGazref(int addr, String v) {
        if (featOkTst && casFeat_gazref == null)
      jcas.throwFeatMissing("gazref", "org.texttechnologylab.annotation.semaf.isospace.Location");
    ll_cas.ll_setStringValue(addr, casFeatCode_gazref, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Location_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_gazref = jcas.getRequiredFeatureDE(casType, "gazref", "uima.cas.String", featOkTst);
    casFeatCode_gazref  = (null == casFeat_gazref) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gazref).getCode();

  }
}



    