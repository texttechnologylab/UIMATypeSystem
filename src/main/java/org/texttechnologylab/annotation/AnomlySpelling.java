

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:19:03 CET 2024 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import de.tudarmstadt.ukp.dkpro.core.api.anomaly.type.Anomaly;


/** 
 * Updated by JCasGen Wed Feb 28 22:19:03 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnomlySpelling extends Anomaly {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.AnomlySpelling";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnomlySpelling.class);
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
   
  public final static String _FeatName_SpellingType = "SpellingType";
  public final static String _FeatName_ModelName = "ModelName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_SpellingType = TypeSystemImpl.createCallSite(AnomlySpelling.class, "SpellingType");
  private final static MethodHandle _FH_SpellingType = _FC_SpellingType.dynamicInvoker();
  private final static CallSite _FC_ModelName = TypeSystemImpl.createCallSite(AnomlySpelling.class, "ModelName");
  private final static MethodHandle _FH_ModelName = _FC_ModelName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AnomlySpelling() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnomlySpelling(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnomlySpelling(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnomlySpelling(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: SpellingType

  /** getter for SpellingType - gets Output Type of the Spelling like wrong, skipped or unkown
   * @generated
   * @return value of the feature 
   */
  public String getSpellingType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_SpellingType));
  }
    
  /** setter for SpellingType - sets Output Type of the Spelling like wrong, skipped or unkown 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpellingType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_SpellingType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ModelName

  /** getter for ModelName - gets The name of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ModelName));
  }
    
  /** setter for ModelName - sets The name of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ModelName), v);
  }    
    
  }

    