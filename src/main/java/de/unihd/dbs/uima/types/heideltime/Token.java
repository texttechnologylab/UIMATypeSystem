

   
/* Apache UIMA v3 - First created by JCasGen Wed Sep 10 10:35:43 CEST 2025 */

package de.unihd.dbs.uima.types.heideltime;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 10 10:35:43 CEST 2025
 * XML source: C:/kevin/projects/duui/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Token extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.unihd.dbs.uima.types.heideltime.Token";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
   
  public final static String _FeatName_filename = "filename";
  public final static String _FeatName_tokenId = "tokenId";
  public final static String _FeatName_sentId = "sentId";
  public final static String _FeatName_pos = "pos";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_filename = TypeSystemImpl.createCallSite(Token.class, "filename");
  private final static MethodHandle _FH_filename = _FC_filename.dynamicInvoker();
  private final static CallSite _FC_tokenId = TypeSystemImpl.createCallSite(Token.class, "tokenId");
  private final static MethodHandle _FH_tokenId = _FC_tokenId.dynamicInvoker();
  private final static CallSite _FC_sentId = TypeSystemImpl.createCallSite(Token.class, "sentId");
  private final static MethodHandle _FH_sentId = _FC_sentId.dynamicInvoker();
  private final static CallSite _FC_pos = TypeSystemImpl.createCallSite(Token.class, "pos");
  private final static MethodHandle _FH_pos = _FC_pos.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Token(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: filename

  /** getter for filename - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFilename() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_filename));
  }
    
  /** setter for filename - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFilename(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_filename), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tokenId

  /** getter for tokenId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokenId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_tokenId));
  }
    
  /** setter for tokenId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_tokenId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: sentId

  /** getter for sentId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_sentId));
  }
    
  /** setter for sentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_sentId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pos));
  }
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pos), v);
  }    
    
  }

    