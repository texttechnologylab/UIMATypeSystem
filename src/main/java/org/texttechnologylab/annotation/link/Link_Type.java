
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.link;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Base type for unidirectional links between entities
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Link_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Link.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.link.Link");
 
  /** @generated */
  final Feature casFeat_linkType;
  /** @generated */
  final int     casFeatCode_linkType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLinkType(int addr) {
        if (featOkTst && casFeat_linkType == null)
      jcas.throwFeatMissing("linkType", "org.texttechnologylab.annotation.link.Link");
    return ll_cas.ll_getStringValue(addr, casFeatCode_linkType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLinkType(int addr, String v) {
        if (featOkTst && casFeat_linkType == null)
      jcas.throwFeatMissing("linkType", "org.texttechnologylab.annotation.link.Link");
    ll_cas.ll_setStringValue(addr, casFeatCode_linkType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_linkId;
  /** @generated */
  final int     casFeatCode_linkId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getLinkId(int addr) {
        if (featOkTst && casFeat_linkId == null)
      jcas.throwFeatMissing("linkId", "org.texttechnologylab.annotation.link.Link");
    return ll_cas.ll_getLongValue(addr, casFeatCode_linkId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLinkId(int addr, long v) {
        if (featOkTst && casFeat_linkId == null)
      jcas.throwFeatMissing("linkId", "org.texttechnologylab.annotation.link.Link");
    ll_cas.ll_setLongValue(addr, casFeatCode_linkId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Link_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_linkType = jcas.getRequiredFeatureDE(casType, "linkType", "uima.cas.String", featOkTst);
    casFeatCode_linkType  = (null == casFeat_linkType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_linkType).getCode();

 
    casFeat_linkId = jcas.getRequiredFeatureDE(casType, "linkId", "uima.cas.Long", featOkTst);
    casFeatCode_linkId  = (null == casFeat_linkId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_linkId).getCode();

  }
}



    