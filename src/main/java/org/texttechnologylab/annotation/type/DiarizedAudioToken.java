

   
/* Apache UIMA v3 - First created by JCasGen Fri Jan 16 18:07:07 CET 2026 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Audio token with speaker information
 * Updated by JCasGen Fri Jan 16 18:07:07 CET 2026
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DiarizedAudioToken extends AudioToken {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.DiarizedAudioToken";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DiarizedAudioToken.class);
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
   
  public final static String _FeatName_speakerName = "speakerName";
  public final static String _FeatName_speakerId = "speakerId";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_speakerName = TypeSystemImpl.createCallSite(DiarizedAudioToken.class, "speakerName");
  private final static MethodHandle _FH_speakerName = _FC_speakerName.dynamicInvoker();
  private final static CallSite _FC_speakerId = TypeSystemImpl.createCallSite(DiarizedAudioToken.class, "speakerId");
  private final static MethodHandle _FH_speakerId = _FC_speakerId.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected DiarizedAudioToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DiarizedAudioToken(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DiarizedAudioToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DiarizedAudioToken(JCas jcas, int begin, int end) {
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
  //* Feature: speakerName

  /** getter for speakerName - gets Name of the speaker
   * @generated
   * @return value of the feature 
   */
  public String getSpeakerName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speakerName));
  }
    
  /** setter for speakerName - sets Name of the speaker 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeakerName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speakerName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speakerId

  /** getter for speakerId - gets ID of the speaker
   * @generated
   * @return value of the feature 
   */
  public String getSpeakerId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speakerId));
  }
    
  /** setter for speakerId - sets ID of the speaker 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeakerId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speakerId), v);
  }    
    
  }

    