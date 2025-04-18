

   
/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:31:39 CEST 2025 */

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


/** Toxic Output
 * Updated by JCasGen Fri Apr 18 23:31:39 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Toxic extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Toxic";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Toxic.class);
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
   
  public final static String _FeatName_Toxic = "Toxic";
  public final static String _FeatName_NonToxic = "NonToxic";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Toxic = TypeSystemImpl.createCallSite(Toxic.class, "Toxic");
  private final static MethodHandle _FH_Toxic = _FC_Toxic.dynamicInvoker();
  private final static CallSite _FC_NonToxic = TypeSystemImpl.createCallSite(Toxic.class, "NonToxic");
  private final static MethodHandle _FH_NonToxic = _FC_NonToxic.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Toxic.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Toxic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Toxic(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Toxic(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Toxic(JCas jcas, int begin, int end) {
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
  //* Feature: Toxic

  /** getter for Toxic - gets Probability of Toxic
   * @generated
   * @return value of the feature 
   */
  public double getToxic() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Toxic));
  }
    
  /** setter for Toxic - sets Probability of Toxic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToxic(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Toxic), v);
  }    
    
   
    
  //*--------------*
  //* Feature: NonToxic

  /** getter for NonToxic - gets Probability of not Toxic
   * @generated
   * @return value of the feature 
   */
  public double getNonToxic() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_NonToxic));
  }
    
  /** setter for NonToxic - sets Probability of not Toxic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNonToxic(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_NonToxic), v);
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

    