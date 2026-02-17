

/* First created by JCasGen Tue Feb 17 20:19:38 CET 2026 */
package org.texttechnologylab.duui;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** <p>ReproducibleAnnotation stores the information about a composer pipeline component in compressed form.
                The reproducibility mainly stems from the strict naming of docker containers.</p>
 * Updated by JCasGen Tue Feb 17 20:19:38 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ReproducibleAnnotation extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ReproducibleAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ReproducibleAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ReproducibleAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ReproducibleAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets The timestamp at which this annotation was added, this is important for chronological ordering.
   * @generated
   * @return value of the feature 
   */
  public long getTimestamp() {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return jcasType.ll_cas.ll_getLongValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_timestamp);}
    
  /** setter for timestamp - sets The timestamp at which this annotation was added, this is important for chronological ordering. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(long v) {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.texttechnologylab.duui.ReproducibleAnnotation");
    jcasType.ll_cas.ll_setLongValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_timestamp, v);}    
   
    
  //*--------------*
  //* Feature: pipelineName

  /** getter for pipelineName - gets Stores the pipeline name, this can be a good way to later group the analysis engines from one pipeline run
   * @generated
   * @return value of the feature 
   */
  public String getPipelineName() {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_pipelineName == null)
      jcasType.jcas.throwFeatMissing("pipelineName", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_pipelineName);}
    
  /** setter for pipelineName - sets Stores the pipeline name, this can be a good way to later group the analysis engines from one pipeline run 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPipelineName(String v) {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_pipelineName == null)
      jcasType.jcas.throwFeatMissing("pipelineName", "org.texttechnologylab.duui.ReproducibleAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_pipelineName, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets Stores the actual information about the component, most of the time in compressed format with Base85 encoded.
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets Stores the actual information about the component, most of the time in compressed format with Base85 encoded. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.duui.ReproducibleAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: compression

  /** getter for compression - gets The compression used to compress the description, since the compression of the description
                        happens at initialization time it is most of the time wise to use a compression method with a higher compression
                        ratio.
   * @generated
   * @return value of the feature 
   */
  public String getCompression() {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_compression == null)
      jcasType.jcas.throwFeatMissing("compression", "org.texttechnologylab.duui.ReproducibleAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_compression);}
    
  /** setter for compression - sets The compression used to compress the description, since the compression of the description
                        happens at initialization time it is most of the time wise to use a compression method with a higher compression
                        ratio. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCompression(String v) {
    if (ReproducibleAnnotation_Type.featOkTst && ((ReproducibleAnnotation_Type)jcasType).casFeat_compression == null)
      jcasType.jcas.throwFeatMissing("compression", "org.texttechnologylab.duui.ReproducibleAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReproducibleAnnotation_Type)jcasType).casFeatCode_compression, v);}    
  }

    