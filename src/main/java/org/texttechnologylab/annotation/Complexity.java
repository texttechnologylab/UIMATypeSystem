

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 12:41:26 CET 2025 */

package org.texttechnologylab.annotation;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Complexity Output
 * Updated by JCasGen Tue Feb 25 12:41:26 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Complexity extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Complexity";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Complexity.class);
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
   
  public final static String _FeatName_Kind = "Kind";
  public final static String _FeatName_Output = "Output";
  public final static String _FeatName_SentenceI = "SentenceI";
  public final static String _FeatName_SentenceJ = "SentenceJ";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Kind = TypeSystemImpl.createCallSite(Complexity.class, "Kind");
  private final static MethodHandle _FH_Kind = _FC_Kind.dynamicInvoker();
  private final static CallSite _FC_Output = TypeSystemImpl.createCallSite(Complexity.class, "Output");
  private final static MethodHandle _FH_Output = _FC_Output.dynamicInvoker();
  private final static CallSite _FC_SentenceI = TypeSystemImpl.createCallSite(Complexity.class, "SentenceI");
  private final static MethodHandle _FH_SentenceI = _FC_SentenceI.dynamicInvoker();
  private final static CallSite _FC_SentenceJ = TypeSystemImpl.createCallSite(Complexity.class, "SentenceJ");
  private final static MethodHandle _FH_SentenceJ = _FC_SentenceJ.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Complexity.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Complexity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Complexity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Complexity(JCas jcas) {
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
  //* Feature: Kind

  /** getter for Kind - gets Kind of Complexity
   * @generated
   * @return value of the feature 
   */
  public String getKind() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Kind));
  }
    
  /** setter for Kind - sets Kind of Complexity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKind(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Kind), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Output

  /** getter for Output - gets Output of Complexity
   * @generated
   * @return value of the feature 
   */
  public double getOutput() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Output));
  }
    
  /** setter for Output - sets Output of Complexity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutput(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Output), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SentenceI

  /** getter for SentenceI - gets Reference to SentenceI
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceI() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_SentenceI)));
  }
    
  /** setter for SentenceI - sets Reference to SentenceI 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceI(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_SentenceI), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SentenceJ

  /** getter for SentenceJ - gets Reference to SentenceJ
   * @generated
   * @return value of the feature 
   */
  public Annotation getSentenceJ() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_SentenceJ)));
  }
    
  /** setter for SentenceJ - sets Reference to SentenceJ 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceJ(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_SentenceJ), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    