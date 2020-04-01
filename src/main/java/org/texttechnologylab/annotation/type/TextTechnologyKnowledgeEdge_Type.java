
/* First created by JCasGen Fri Mar 20 09:14:20 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Mar 20 09:14:20 CET 2020
 * @generated */
public class TextTechnologyKnowledgeEdge_Type extends Edge_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TextTechnologyKnowledgeEdge.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.TextTechnologyKnowledgeEdge");
 
  /** @generated */
  final Feature casFeat_linktype;
  /** @generated */
  final int     casFeatCode_linktype;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLinktype(int addr) {
        if (featOkTst && casFeat_linktype == null)
      jcas.throwFeatMissing("linktype", "org.texttechnologylab.annotation.type.TextTechnologyKnowledgeEdge");
    return ll_cas.ll_getStringValue(addr, casFeatCode_linktype);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLinktype(int addr, String v) {
        if (featOkTst && casFeat_linktype == null)
      jcas.throwFeatMissing("linktype", "org.texttechnologylab.annotation.type.TextTechnologyKnowledgeEdge");
    ll_cas.ll_setStringValue(addr, casFeatCode_linktype, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TextTechnologyKnowledgeEdge_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_linktype = jcas.getRequiredFeatureDE(casType, "linktype", "uima.cas.String", featOkTst);
    casFeatCode_linktype  = (null == casFeat_linktype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_linktype).getCode();

  }
}



    