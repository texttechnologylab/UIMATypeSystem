

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.annotation.link;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Annotation represents a (unidirectional) Link between two Documents
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class DLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.link.DLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DLink.class);
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
   
  public final static String _FeatName_from = "from";
  public final static String _FeatName_to = "to";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_from = TypeSystemImpl.createCallSite(DLink.class, "from");
  private final static MethodHandle _FH_from = _FC_from.dynamicInvoker();
  private final static CallSite _FC_to = TypeSystemImpl.createCallSite(DLink.class, "to");
  private final static MethodHandle _FH_to = _FC_to.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected DLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public DLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DLink(JCas jcas, int begin, int end) {
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
  //* Feature: from

  /** getter for from - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getFrom() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_from));
  }
    
  /** setter for from - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrom(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_from), v);
  }    
    
   
    
  //*--------------*
  //* Feature: to

  /** getter for to - gets from (document_id) to (document_id)
   * @generated
   * @return value of the feature 
   */
  public String getTo() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_to));
  }
    
  /** setter for to - sets from (document_id) to (document_id) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTo(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_to), v);
  }    
    
  }

    