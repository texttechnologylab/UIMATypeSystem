

   
/* Apache UIMA v3 - First created by JCasGen Fri Jan 30 15:15:29 CET 2026 */

package org.texttechnologylab.annotation.schema;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Fri Jan 30 15:15:29 CET 2026
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Relation extends Attribute {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.schema.Relation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
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
   
  public final static String _FeatName_attributes = "attributes";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_attributes = TypeSystemImpl.createCallSite(Relation.class, "attributes");
  private final static MethodHandle _FH_attributes = _FC_attributes.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Relation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Relation(JCas jcas) {
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
  //* Feature: attributes

  /** getter for attributes - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TOP> getAttributes() {
      return (FSArray<TOP>) (_getFeatureValueNc(wrapGetIntCatchException(_FH_attributes)));
  }
    
  /** setter for attributes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributes(FSArray<TOP> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_attributes), v);
  }


    /**
     * indexed getter for attributes - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    @SuppressWarnings("unchecked")
    public TOP getAttributes(int i) {
        return (TOP) (((FSArray<TOP>) (_getFeatureValueNc(wrapGetIntCatchException(_FH_attributes)))).get(i));
    }

    /**
     * indexed setter for attributes - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    @SuppressWarnings("unchecked")
    public void setAttributes(int i, TOP v) {
        ((FSArray<TOP>) (_getFeatureValueNc(wrapGetIntCatchException(_FH_attributes)))).set(i, v);
    }
  }

    