

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.duui;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.TOP;


/** <p>ReproducibleAnnotation stores the information about a composer pipeline component in compressed form.
                The reproducibility mainly stems from the strict naming of docker containers.</p>
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ReproducibleAnnotation extends TOP {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.duui.ReproducibleAnnotation";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_timestamp = "timestamp";
  public final static String _FeatName_pipelineName = "pipelineName";
  public final static String _FeatName_description = "description";
  public final static String _FeatName_compression = "compression";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(ReproducibleAnnotation.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();
  private final static CallSite _FC_pipelineName = TypeSystemImpl.createCallSite(ReproducibleAnnotation.class, "pipelineName");
  private final static MethodHandle _FH_pipelineName = _FC_pipelineName.dynamicInvoker();
  private final static CallSite _FC_description = TypeSystemImpl.createCallSite(ReproducibleAnnotation.class, "description");
  private final static MethodHandle _FH_description = _FC_description.dynamicInvoker();
  private final static CallSite _FC_compression = TypeSystemImpl.createCallSite(ReproducibleAnnotation.class, "compression");
  private final static MethodHandle _FH_compression = _FC_compression.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ReproducibleAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ReproducibleAnnotation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getLongValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets The timestamp at which this annotation was added, this is important for chronological ordering. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pipelineName

  /** getter for pipelineName - gets Stores the pipeline name, this can be a good way to later group the analysis engines from one pipeline run
   * @generated
   * @return value of the feature 
   */
  public String getPipelineName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pipelineName));
  }
    
  /** setter for pipelineName - sets Stores the pipeline name, this can be a good way to later group the analysis engines from one pipeline run 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPipelineName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pipelineName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets Stores the actual information about the component, most of the time in compressed format with Base85 encoded.
   * @generated
   * @return value of the feature 
   */
  public String getDescription() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_description));
  }
    
  /** setter for description - sets Stores the actual information about the component, most of the time in compressed format with Base85 encoded. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_description), v);
  }    
    
   
    
  //*--------------*
  //* Feature: compression

  /** getter for compression - gets The compression used to compress the description, since the compression of the description
                        happens at initialization time it is most of the time wise to use a compression method with a higher compression
                        ratio.
   * @generated
   * @return value of the feature 
   */
  public String getCompression() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_compression));
  }
    
  /** setter for compression - sets The compression used to compress the description, since the compression of the description
                        happens at initialization time it is most of the time wise to use a compression method with a higher compression
                        ratio. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCompression(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_compression), v);
  }    
    
  }

    