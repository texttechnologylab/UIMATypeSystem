
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Relation_Type extends Attribute_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Relation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.schema.Relation");
 
  /** @generated */
  final Feature casFeat_attributes;
  /** @generated */
  final int     casFeatCode_attributes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAttributes(int addr) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.Relation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_attributes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttributes(int addr, int v) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.Relation");
    ll_cas.ll_setRefValue(addr, casFeatCode_attributes, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getAttributes(int addr, int i) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.Relation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAttributes(int addr, int i, int v) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.Relation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Relation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_attributes = jcas.getRequiredFeatureDE(casType, "attributes", "uima.cas.FSArray", featOkTst);
    casFeatCode_attributes  = (null == casFeat_attributes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attributes).getCode();

  }
}



    