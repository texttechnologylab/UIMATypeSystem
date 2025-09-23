

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** 
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class KnowledgeEntry extends Node {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.KnowledgeEntry";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(KnowledgeEntry.class);
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
   
  public final static String _FeatName_identifier = "identifier";
  public final static String _FeatName_source = "source";
  public final static String _FeatName_reference = "reference";
  public final static String _FeatName_parentEntity = "parentEntity";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_identifier = TypeSystemImpl.createCallSite(KnowledgeEntry.class, "identifier");
  private final static MethodHandle _FH_identifier = _FC_identifier.dynamicInvoker();
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(KnowledgeEntry.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(KnowledgeEntry.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();
  private final static CallSite _FC_parentEntity = TypeSystemImpl.createCallSite(KnowledgeEntry.class, "parentEntity");
  private final static MethodHandle _FH_parentEntity = _FC_parentEntity.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected KnowledgeEntry() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public KnowledgeEntry(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public KnowledgeEntry(JCas jcas) {
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
  //* Feature: identifier

  /** getter for identifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getIdentifier() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_identifier));
  }
    
  /** setter for identifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIdentifier(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_identifier), v);
  }    
    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSource() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_source));
  }
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_source), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReference() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_reference));
  }
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_reference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: parentEntity

  /** getter for parentEntity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParentEntity() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_parentEntity));
  }
    
  /** setter for parentEntity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentEntity(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_parentEntity), v);
  }    
    
  }

    