

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 12:41:26 CET 2025 */

package de.tudarmstadt.ukp.dkpro.core.io.jwpl.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Wikipedia link
 * Updated by JCasGen Tue Feb 25 12:41:26 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class WikipediaLink extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.tudarmstadt.ukp.dkpro.core.io.jwpl.type.WikipediaLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WikipediaLink.class);
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
   
  public final static String _FeatName_LinkType = "LinkType";
  public final static String _FeatName_Target = "Target";
  public final static String _FeatName_Anchor = "Anchor";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_LinkType = TypeSystemImpl.createCallSite(WikipediaLink.class, "LinkType");
  private final static MethodHandle _FH_LinkType = _FC_LinkType.dynamicInvoker();
  private final static CallSite _FC_Target = TypeSystemImpl.createCallSite(WikipediaLink.class, "Target");
  private final static MethodHandle _FH_Target = _FC_Target.dynamicInvoker();
  private final static CallSite _FC_Anchor = TypeSystemImpl.createCallSite(WikipediaLink.class, "Anchor");
  private final static MethodHandle _FH_Anchor = _FC_Anchor.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected WikipediaLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public WikipediaLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WikipediaLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WikipediaLink(JCas jcas, int begin, int end) {
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
  //* Feature: LinkType

  /** getter for LinkType - gets The type of the link, e.g. internal, external, image, ...
   * @generated
   * @return value of the feature 
   */
  public String getLinkType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_LinkType));
  }
    
  /** setter for LinkType - sets The type of the link, e.g. internal, external, image, ... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinkType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_LinkType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Target

  /** getter for Target - gets The link target url
   * @generated
   * @return value of the feature 
   */
  public String getTarget() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Target));
  }
    
  /** setter for Target - sets The link target url 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Target), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Anchor

  /** getter for Anchor - gets The anchor of the link
   * @generated
   * @return value of the feature 
   */
  public String getAnchor() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Anchor));
  }
    
  /** setter for Anchor - sets The anchor of the link 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Anchor), v);
  }    
    
  }

    