

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 16:38:29 CEST 2025 */

package org.texttechnologylab.annotation.semaf.isobase;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed May 07 16:38:29 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Link extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isobase.Link";
  
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
   
  public final static String _FeatName_comment = "comment";
  public final static String _FeatName_figure = "figure";
  public final static String _FeatName_ground = "ground";
  public final static String _FeatName_trigger = "trigger";
  public final static String _FeatName_rel_type = "rel_type";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_comment = TypeSystemImpl.createCallSite(Link.class, "comment");
  private final static MethodHandle _FH_comment = _FC_comment.dynamicInvoker();
  private final static CallSite _FC_figure = TypeSystemImpl.createCallSite(Link.class, "figure");
  private final static MethodHandle _FH_figure = _FC_figure.dynamicInvoker();
  private final static CallSite _FC_ground = TypeSystemImpl.createCallSite(Link.class, "ground");
  private final static MethodHandle _FH_ground = _FC_ground.dynamicInvoker();
  private final static CallSite _FC_trigger = TypeSystemImpl.createCallSite(Link.class, "trigger");
  private final static MethodHandle _FH_trigger = _FC_trigger.dynamicInvoker();
  private final static CallSite _FC_rel_type = TypeSystemImpl.createCallSite(Link.class, "rel_type");
  private final static MethodHandle _FH_rel_type = _FC_rel_type.dynamicInvoker();

   
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


  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_comment));
  }
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_comment), v);
  }    
    
   
    
  //*--------------*
  //* Feature: figure

  /** getter for figure - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getFigure() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_figure)));
  }
    
  /** setter for figure - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFigure(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_figure), v);
  }    
    
   
    
  //*--------------*
  //* Feature: ground

  /** getter for ground - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getGround() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_ground)));
  }
    
  /** setter for ground - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGround(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_ground), v);
  }    
    
   
    
  //*--------------*
  //* Feature: trigger

  /** getter for trigger - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getTrigger() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_trigger)));
  }
    
  /** setter for trigger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrigger(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_trigger), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rel_type

  /** getter for rel_type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRel_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_rel_type));
  }
    
  /** setter for rel_type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRel_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_rel_type), v);
  }    
    
  }

    