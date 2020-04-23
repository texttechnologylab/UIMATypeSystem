
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Link_Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:56:12 CEST 2020
 * @generated */
public class MoveLink_Type extends Link_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MoveLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.MoveLink");
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, int v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_goal;
  /** @generated */
  final int     casFeatCode_goal;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGoal(int addr) {
        if (featOkTst && casFeat_goal == null)
      jcas.throwFeatMissing("goal", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_goal);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGoal(int addr, int v) {
        if (featOkTst && casFeat_goal == null)
      jcas.throwFeatMissing("goal", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_goal, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mid_point;
  /** @generated */
  final int     casFeatCode_mid_point;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMid_point(int addr) {
        if (featOkTst && casFeat_mid_point == null)
      jcas.throwFeatMissing("mid_point", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mid_point);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMid_point(int addr, int v) {
        if (featOkTst && casFeat_mid_point == null)
      jcas.throwFeatMissing("mid_point", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_mid_point, v);}
    
  
 
  /** @generated */
  final Feature casFeat_path_id;
  /** @generated */
  final int     casFeatCode_path_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPath_id(int addr) {
        if (featOkTst && casFeat_path_id == null)
      jcas.throwFeatMissing("path_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_path_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPath_id(int addr, int v) {
        if (featOkTst && casFeat_path_id == null)
      jcas.throwFeatMissing("path_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_path_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adjunct_id;
  /** @generated */
  final int     casFeatCode_adjunct_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAdjunct_id(int addr) {
        if (featOkTst && casFeat_adjunct_id == null)
      jcas.throwFeatMissing("adjunct_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_adjunct_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdjunct_id(int addr, int v) {
        if (featOkTst && casFeat_adjunct_id == null)
      jcas.throwFeatMissing("adjunct_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_adjunct_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_motionsignal_id;
  /** @generated */
  final int     casFeatCode_motionsignal_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMotionsignal_id(int addr) {
        if (featOkTst && casFeat_motionsignal_id == null)
      jcas.throwFeatMissing("motionsignal_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_motionsignal_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMotionsignal_id(int addr, int v) {
        if (featOkTst && casFeat_motionsignal_id == null)
      jcas.throwFeatMissing("motionsignal_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_motionsignal_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_goal_reached;
  /** @generated */
  final int     casFeatCode_goal_reached;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGoal_reached(int addr) {
        if (featOkTst && casFeat_goal_reached == null)
      jcas.throwFeatMissing("goal_reached", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_goal_reached);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGoal_reached(int addr, String v) {
        if (featOkTst && casFeat_goal_reached == null)
      jcas.throwFeatMissing("goal_reached", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_goal_reached, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MoveLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_goal = jcas.getRequiredFeatureDE(casType, "goal", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_goal  = (null == casFeat_goal) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_goal).getCode();

 
    casFeat_mid_point = jcas.getRequiredFeatureDE(casType, "mid_point", "uima.cas.FSList", featOkTst);
    casFeatCode_mid_point  = (null == casFeat_mid_point) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mid_point).getCode();

 
    casFeat_path_id = jcas.getRequiredFeatureDE(casType, "path_id", "org.texttechnologylab.annotation.semaf.isospace.Path", featOkTst);
    casFeatCode_path_id  = (null == casFeat_path_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_path_id).getCode();

 
    casFeat_adjunct_id = jcas.getRequiredFeatureDE(casType, "adjunct_id", "org.texttechnologylab.annotation.semaf.isospace.SpatialSignal", featOkTst);
    casFeatCode_adjunct_id  = (null == casFeat_adjunct_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adjunct_id).getCode();

 
    casFeat_motionsignal_id = jcas.getRequiredFeatureDE(casType, "motionsignal_id", "org.texttechnologylab.annotation.semaf.isospace.MotionSignal", featOkTst);
    casFeatCode_motionsignal_id  = (null == casFeat_motionsignal_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_motionsignal_id).getCode();

 
    casFeat_goal_reached = jcas.getRequiredFeatureDE(casType, "goal_reached", "uima.cas.String", featOkTst);
    casFeatCode_goal_reached  = (null == casFeat_goal_reached) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_goal_reached).getCode();

  }
}



    