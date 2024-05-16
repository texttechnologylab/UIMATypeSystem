

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:25:22 CEST 2024 */

package org.texttechnologylab.annotation.context.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.node.type.Context;


/** 
 * Updated by JCasGen Thu May 16 17:25:22 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OrganisationContext extends Context {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.context.type.OrganisationContext";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OrganisationContext.class);
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
   
  public final static String _FeatName_foundingDate = "foundingDate";
  public final static String _FeatName_contextInf = "contextInf";
  public final static String _FeatName_website = "website";
  public final static String _FeatName_headquarter = "headquarter";
  public final static String _FeatName_chiefExecutiveOfficer = "chiefExecutiveOfficer";
  public final static String _FeatName_setLabel = "setLabel";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_foundingDate = TypeSystemImpl.createCallSite(OrganisationContext.class, "foundingDate");
  private final static MethodHandle _FH_foundingDate = _FC_foundingDate.dynamicInvoker();
  private final static CallSite _FC_contextInf = TypeSystemImpl.createCallSite(OrganisationContext.class, "contextInf");
  private final static MethodHandle _FH_contextInf = _FC_contextInf.dynamicInvoker();
  private final static CallSite _FC_website = TypeSystemImpl.createCallSite(OrganisationContext.class, "website");
  private final static MethodHandle _FH_website = _FC_website.dynamicInvoker();
  private final static CallSite _FC_headquarter = TypeSystemImpl.createCallSite(OrganisationContext.class, "headquarter");
  private final static MethodHandle _FH_headquarter = _FC_headquarter.dynamicInvoker();
  private final static CallSite _FC_chiefExecutiveOfficer = TypeSystemImpl.createCallSite(OrganisationContext.class, "chiefExecutiveOfficer");
  private final static MethodHandle _FH_chiefExecutiveOfficer = _FC_chiefExecutiveOfficer.dynamicInvoker();
  private final static CallSite _FC_setLabel = TypeSystemImpl.createCallSite(OrganisationContext.class, "setLabel");
  private final static MethodHandle _FH_setLabel = _FC_setLabel.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OrganisationContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OrganisationContext(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OrganisationContext(JCas jcas) {
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
  //* Feature: foundingDate

  /** getter for foundingDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFoundingDate() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_foundingDate));
  }
    
  /** setter for foundingDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFoundingDate(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_foundingDate), v);
  }    
    
   
    
  //*--------------*
  //* Feature: contextInf

  /** getter for contextInf - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextInf() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_contextInf));
  }
    
  /** setter for contextInf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextInf(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_contextInf), v);
  }    
    
   
    
  //*--------------*
  //* Feature: website

  /** getter for website - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWebsite() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_website));
  }
    
  /** setter for website - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWebsite(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_website), v);
  }    
    
   
    
  //*--------------*
  //* Feature: headquarter

  /** getter for headquarter - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHeadquarter() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_headquarter));
  }
    
  /** setter for headquarter - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeadquarter(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_headquarter), v);
  }    
    
   
    
  //*--------------*
  //* Feature: chiefExecutiveOfficer

  /** getter for chiefExecutiveOfficer - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChiefExecutiveOfficer() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_chiefExecutiveOfficer));
  }
    
  /** setter for chiefExecutiveOfficer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChiefExecutiveOfficer(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_chiefExecutiveOfficer), v);
  }    
    
   
    
  //*--------------*
  //* Feature: setLabel

  /** getter for setLabel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSetLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_setLabel));
  }
    
  /** setter for setLabel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSetLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_setLabel), v);
  }    
    
  }

    