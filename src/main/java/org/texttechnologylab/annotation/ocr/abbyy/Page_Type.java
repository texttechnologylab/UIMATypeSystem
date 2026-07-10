
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div_Type;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class Page_Type extends Div_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Page.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.abbyy.Page");
 
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
      jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getIntValue(addr, casFeatCode_index);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndex(int addr, int v) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setIntValue(addr, casFeatCode_index, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pageNumber;
  /** @generated */
  final int     casFeatCode_pageNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPageNumber(int addr) {
        if (featOkTst && casFeat_pageNumber == null)
      jcas.throwFeatMissing("pageNumber", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pageNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPageNumber(int addr, String v) {
        if (featOkTst && casFeat_pageNumber == null)
      jcas.throwFeatMissing("pageNumber", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setStringValue(addr, casFeatCode_pageNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_uri;
  /** @generated */
  final int     casFeatCode_uri;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUri(int addr) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uri);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUri(int addr, String v) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setStringValue(addr, casFeatCode_uri, v);}
    
  
 
  /** @generated */
  final Feature casFeat_width;
  /** @generated */
  final int     casFeatCode_width;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getWidth(int addr) {
        if (featOkTst && casFeat_width == null)
      jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getIntValue(addr, casFeatCode_width);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWidth(int addr, int v) {
        if (featOkTst && casFeat_width == null)
      jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setIntValue(addr, casFeatCode_width, v);}
    
  
 
  /** @generated */
  final Feature casFeat_height;
  /** @generated */
  final int     casFeatCode_height;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHeight(int addr) {
        if (featOkTst && casFeat_height == null)
      jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getIntValue(addr, casFeatCode_height);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHeight(int addr, int v) {
        if (featOkTst && casFeat_height == null)
      jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setIntValue(addr, casFeatCode_height, v);}
    
  
 
  /** @generated */
  final Feature casFeat_resolution;
  /** @generated */
  final int     casFeatCode_resolution;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getResolution(int addr) {
        if (featOkTst && casFeat_resolution == null)
      jcas.throwFeatMissing("resolution", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getIntValue(addr, casFeatCode_resolution);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setResolution(int addr, int v) {
        if (featOkTst && casFeat_resolution == null)
      jcas.throwFeatMissing("resolution", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setIntValue(addr, casFeatCode_resolution, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rotation;
  /** @generated */
  final int     casFeatCode_rotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRotation(int addr) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRotation(int addr, String v) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    ll_cas.ll_setStringValue(addr, casFeatCode_rotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Page_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_index = jcas.getRequiredFeatureDE(casType, "index", "uima.cas.Integer", featOkTst);
    casFeatCode_index  = (null == casFeat_index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_index).getCode();

 
    casFeat_pageNumber = jcas.getRequiredFeatureDE(casType, "pageNumber", "uima.cas.String", featOkTst);
    casFeatCode_pageNumber  = (null == casFeat_pageNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pageNumber).getCode();

 
    casFeat_uri = jcas.getRequiredFeatureDE(casType, "uri", "uima.cas.String", featOkTst);
    casFeatCode_uri  = (null == casFeat_uri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uri).getCode();

 
    casFeat_width = jcas.getRequiredFeatureDE(casType, "width", "uima.cas.Integer", featOkTst);
    casFeatCode_width  = (null == casFeat_width) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_width).getCode();

 
    casFeat_height = jcas.getRequiredFeatureDE(casType, "height", "uima.cas.Integer", featOkTst);
    casFeatCode_height  = (null == casFeat_height) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_height).getCode();

 
    casFeat_resolution = jcas.getRequiredFeatureDE(casType, "resolution", "uima.cas.Integer", featOkTst);
    casFeatCode_resolution  = (null == casFeat_resolution) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_resolution).getCode();

 
    casFeat_rotation = jcas.getRequiredFeatureDE(casType, "rotation", "org.texttechnologylab.annotation.ocr.abbyy.Orientation", featOkTst);
    casFeatCode_rotation  = (null == casFeat_rotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rotation).getCode();

  }
}



    