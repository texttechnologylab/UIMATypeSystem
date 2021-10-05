
/* First created by JCasGen Tue Oct 05 17:20:02 CEST 2021 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Tue Oct 05 17:20:02 CEST 2021
 * @generated */
public class Attribute_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Attribute.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.schema.Attribute");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.Attribute");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.Attribute");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_description;
  /** @generated */
  final int     casFeatCode_description;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDescription(int addr) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.Attribute");
    return ll_cas.ll_getStringValue(addr, casFeatCode_description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.Attribute");
    ll_cas.ll_setStringValue(addr, casFeatCode_description, v);}
    
  
 
  /** @generated */
  final Feature casFeat_range;
  /** @generated */
  final int     casFeatCode_range;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRange(int addr) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "org.texttechnologylab.annotation.schema.Attribute");
    return ll_cas.ll_getRefValue(addr, casFeatCode_range);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRange(int addr, int v) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "org.texttechnologylab.annotation.schema.Attribute");
    ll_cas.ll_setRefValue(addr, casFeatCode_range, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mandatory;
  /** @generated */
  final int     casFeatCode_mandatory;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getMandatory(int addr) {
        if (featOkTst && casFeat_mandatory == null)
      jcas.throwFeatMissing("mandatory", "org.texttechnologylab.annotation.schema.Attribute");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_mandatory);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMandatory(int addr, boolean v) {
        if (featOkTst && casFeat_mandatory == null)
      jcas.throwFeatMissing("mandatory", "org.texttechnologylab.annotation.schema.Attribute");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_mandatory, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Attribute_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_description = jcas.getRequiredFeatureDE(casType, "description", "uima.cas.String", featOkTst);
    casFeatCode_description  = (null == casFeat_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_description).getCode();

 
    casFeat_range = jcas.getRequiredFeatureDE(casType, "range", "uima.cas.TOP", featOkTst);
    casFeatCode_range  = (null == casFeat_range) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_range).getCode();

 
    casFeat_mandatory = jcas.getRequiredFeatureDE(casType, "mandatory", "uima.cas.Boolean", featOkTst);
    casFeatCode_mandatory  = (null == casFeat_mandatory) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mandatory).getCode();

  }
}



    