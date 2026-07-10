
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.duui;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** <p>ReproducibleAnnotation stores the information about a composer pipeline component in compressed form.
                The reproducibility mainly stems from the strict naming of docker containers.</p>
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class ReproducibleAnnotation_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ReproducibleAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.duui.ReproducibleAnnotation");
 
  /** @generated */
  final Feature casFeat_timestamp;
  /** @generated */
  final int     casFeatCode_timestamp;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getTimestamp(int addr) {
        if (featOkTst && casFeat_timestamp == null)
      jcas.throwFeatMissing("timestamp", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return ll_cas.ll_getLongValue(addr, casFeatCode_timestamp);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTimestamp(int addr, long v) {
        if (featOkTst && casFeat_timestamp == null)
      jcas.throwFeatMissing("timestamp", "org.texttechnologylab.duui.ReproducibleAnnotation");
    ll_cas.ll_setLongValue(addr, casFeatCode_timestamp, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pipelineName;
  /** @generated */
  final int     casFeatCode_pipelineName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPipelineName(int addr) {
        if (featOkTst && casFeat_pipelineName == null)
      jcas.throwFeatMissing("pipelineName", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pipelineName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPipelineName(int addr, String v) {
        if (featOkTst && casFeat_pipelineName == null)
      jcas.throwFeatMissing("pipelineName", "org.texttechnologylab.duui.ReproducibleAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_pipelineName, v);}
    
  
 
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
      jcas.throwFeatMissing("description", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.duui.ReproducibleAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_description, v);}
    
  
 
  /** @generated */
  final Feature casFeat_compression;
  /** @generated */
  final int     casFeatCode_compression;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCompression(int addr) {
        if (featOkTst && casFeat_compression == null)
      jcas.throwFeatMissing("compression", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_compression);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCompression(int addr, String v) {
        if (featOkTst && casFeat_compression == null)
      jcas.throwFeatMissing("compression", "org.texttechnologylab.duui.ReproducibleAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_compression, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ReproducibleAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_timestamp = jcas.getRequiredFeatureDE(casType, "timestamp", "uima.cas.Long", featOkTst);
    casFeatCode_timestamp  = (null == casFeat_timestamp) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timestamp).getCode();

 
    casFeat_pipelineName = jcas.getRequiredFeatureDE(casType, "pipelineName", "uima.cas.String", featOkTst);
    casFeatCode_pipelineName  = (null == casFeat_pipelineName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pipelineName).getCode();

 
    casFeat_description = jcas.getRequiredFeatureDE(casType, "description", "uima.cas.String", featOkTst);
    casFeatCode_description  = (null == casFeat_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_description).getCode();

 
    casFeat_compression = jcas.getRequiredFeatureDE(casType, "compression", "uima.cas.String", featOkTst);
    casFeatCode_compression  = (null == casFeat_compression) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_compression).getCode();

  }
}



    