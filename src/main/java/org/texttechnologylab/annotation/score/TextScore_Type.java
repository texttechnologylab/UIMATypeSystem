
/* First created by JCasGen Mon Feb 15 16:49:38 CET 2021 */
package org.texttechnologylab.annotation.score;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Mon Feb 15 16:49:38 CET 2021
 * @generated */
public class TextScore_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TextScore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.score.TextScore");
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.score.TextScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.score.TextScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
  
 
  /** @generated */
  final Feature casFeat_documentURI;
  /** @generated */
  final int     casFeatCode_documentURI;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentURI(int addr) {
        if (featOkTst && casFeat_documentURI == null)
      jcas.throwFeatMissing("documentURI", "org.texttechnologylab.annotation.score.TextScore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentURI);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentURI(int addr, String v) {
        if (featOkTst && casFeat_documentURI == null)
      jcas.throwFeatMissing("documentURI", "org.texttechnologylab.annotation.score.TextScore");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentURI, v);}
    
  
 
  /** @generated */
  final Feature casFeat_documentName;
  /** @generated */
  final int     casFeatCode_documentName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentName(int addr) {
        if (featOkTst && casFeat_documentName == null)
      jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.score.TextScore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentName(int addr, String v) {
        if (featOkTst && casFeat_documentName == null)
      jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.score.TextScore");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TextScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSList", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

 
    casFeat_documentURI = jcas.getRequiredFeatureDE(casType, "documentURI", "uima.cas.String", featOkTst);
    casFeatCode_documentURI  = (null == casFeat_documentURI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentURI).getCode();

 
    casFeat_documentName = jcas.getRequiredFeatureDE(casType, "documentName", "uima.cas.String", featOkTst);
    casFeatCode_documentName  = (null == casFeat_documentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentName).getCode();

  }
}



    