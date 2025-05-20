

   
/* Apache UIMA v3 - First created by JCasGen Tue May 20 10:53:53 CEST 2025 */

package org.texttechnologylab.annotation.link;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Base type for unidirectional links between entities
 * Updated by JCasGen Tue May 20 10:53:53 CEST 2025
 * XML source: /home/bagci/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Link extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.link.Link";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Link.class);
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
   
  public final static String _FeatName_linkType = "linkType";
  public final static String _FeatName_linkId = "linkId";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_linkType = TypeSystemImpl.createCallSite(Link.class, "linkType");
  private final static MethodHandle _FH_linkType = _FC_linkType.dynamicInvoker();
  private final static CallSite _FC_linkId = TypeSystemImpl.createCallSite(Link.class, "linkId");
  private final static MethodHandle _FH_linkId = _FC_linkId.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Link() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Link(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Link(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Link(JCas jcas, int begin, int end) {
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
  //* Feature: linkType

  /** getter for linkType - gets Type of the link
   * @generated
   * @return value of the feature 
   */
  public String getLinkType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_linkType));
  }
    
  /** setter for linkType - sets Type of the link 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinkType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_linkType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: linkId

  /** getter for linkId - gets Id of a Link
   * @generated
   * @return value of the feature 
   */
  public long getLinkId() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_linkId));
  }
    
  /** setter for linkId - sets Id of a Link 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinkId(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_linkId), v);
  }    
    
  }

    