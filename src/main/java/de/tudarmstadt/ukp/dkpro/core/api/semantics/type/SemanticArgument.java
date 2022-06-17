

/* First created by JCasGen Fri Jun 17 16:34:14 CEST 2022 */
package de.tudarmstadt.ukp.dkpro.core.api.semantics.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The SemanticArgument annotation is attached to semantic arguments of semantic
predicates. Semantic arguments are characterized by their semantic role, e.g. Agent,
Experiencer, Topic. The semantic role of an argument is related to its semantic type
(for communication verbs, the Agent can be a person or an organization, but
typically not food). The semantic type of arguments is not yet covered by the
SemanticType.

@deprecated Use SemArg instead.
 * Updated by JCasGen Fri Jun 17 16:34:14 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SemanticArgument extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticArgument.class);
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SemanticArgument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticArgument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticArgument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticArgument(JCas jcas, int begin, int end) {
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
  //* Feature: role

  /** getter for role - gets The role which the argument takes. The value depends on the theory being used, e.g. Arg0, Arg1, etc. or Buyer, Seller, etc.
   * @generated
   * @return value of the feature 
   */
  public String getRole() {
    if (SemanticArgument_Type.featOkTst && ((SemanticArgument_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemanticArgument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticArgument_Type)jcasType).casFeatCode_role);}
    
  /** setter for role - sets The role which the argument takes. The value depends on the theory being used, e.g. Arg0, Arg1, etc. or Buyer, Seller, etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    if (SemanticArgument_Type.featOkTst && ((SemanticArgument_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemanticArgument");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticArgument_Type)jcasType).casFeatCode_role, v);}    
  }

    