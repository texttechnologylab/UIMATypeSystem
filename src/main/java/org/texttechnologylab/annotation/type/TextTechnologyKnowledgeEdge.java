

   
/* Apache UIMA v3 - First created by JCasGen Tue Jun 11 17:17:54 CEST 2024 */

package org.texttechnologylab.annotation.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Tue Jun 11 17:17:54 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TextTechnologyKnowledgeEdge extends Edge {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TextTechnologyKnowledgeEdge";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextTechnologyKnowledgeEdge.class);
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
   
  public final static String _FeatName_linktype = "linktype";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_linktype = TypeSystemImpl.createCallSite(TextTechnologyKnowledgeEdge.class, "linktype");
  private final static MethodHandle _FH_linktype = _FC_linktype.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TextTechnologyKnowledgeEdge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TextTechnologyKnowledgeEdge(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextTechnologyKnowledgeEdge(JCas jcas) {
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
  //* Feature: linktype

  /** getter for linktype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLinktype() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_linktype));
  }
    
  /** setter for linktype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinktype(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_linktype), v);
  }    
    
  }

    