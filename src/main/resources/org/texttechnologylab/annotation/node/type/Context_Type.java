
/* First created by JCasGen Thu Nov 05 17:33:42 CET 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.type.Node_Type;

/** 
 * Updated by JCasGen Thu Nov 05 17:33:42 CET 2020
 * @generated */
public class Context_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Context.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.node.type.Context");
 
  /** @generated */
  final Feature casFeat_ReferencedID;
  /** @generated */
  final int     casFeatCode_ReferencedID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReferencedID(int addr) {
        if (featOkTst && casFeat_ReferencedID == null)
      jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.Context");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ReferencedID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferencedID(int addr, int v) {
        if (featOkTst && casFeat_ReferencedID == null)
      jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.Context");
    ll_cas.ll_setIntValue(addr, casFeatCode_ReferencedID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_displayName;
  /** @generated */
  final int     casFeatCode_displayName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDisplayName(int addr) {
        if (featOkTst && casFeat_displayName == null)
      jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.Context");
    return ll_cas.ll_getStringValue(addr, casFeatCode_displayName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDisplayName(int addr, String v) {
        if (featOkTst && casFeat_displayName == null)
      jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.Context");
    ll_cas.ll_setStringValue(addr, casFeatCode_displayName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_wikiDataID;
  /** @generated */
  final int     casFeatCode_wikiDataID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWikiDataID(int addr) {
        if (featOkTst && casFeat_wikiDataID == null)
      jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.Context");
    return ll_cas.ll_getStringValue(addr, casFeatCode_wikiDataID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWikiDataID(int addr, String v) {
        if (featOkTst && casFeat_wikiDataID == null)
      jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.Context");
    ll_cas.ll_setStringValue(addr, casFeatCode_wikiDataID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_image;
  /** @generated */
  final int     casFeatCode_image;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getImage(int addr) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.Context");
    return ll_cas.ll_getStringValue(addr, casFeatCode_image);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImage(int addr, String v) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.Context");
    ll_cas.ll_setStringValue(addr, casFeatCode_image, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Context_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ReferencedID = jcas.getRequiredFeatureDE(casType, "ReferencedID", "uima.cas.Integer", featOkTst);
    casFeatCode_ReferencedID  = (null == casFeat_ReferencedID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ReferencedID).getCode();

 
    casFeat_displayName = jcas.getRequiredFeatureDE(casType, "displayName", "uima.cas.String", featOkTst);
    casFeatCode_displayName  = (null == casFeat_displayName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_displayName).getCode();

 
    casFeat_wikiDataID = jcas.getRequiredFeatureDE(casType, "wikiDataID", "uima.cas.String", featOkTst);
    casFeatCode_wikiDataID  = (null == casFeat_wikiDataID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wikiDataID).getCode();

 
    casFeat_image = jcas.getRequiredFeatureDE(casType, "image", "uima.cas.String", featOkTst);
    casFeatCode_image  = (null == casFeat_image) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_image).getCode();

  }
}



    