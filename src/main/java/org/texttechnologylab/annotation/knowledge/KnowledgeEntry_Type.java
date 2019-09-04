
/* First created by JCasGen Mon Mar 11 19:34:15 CET 2019 */
package org.texttechnologylab.annotation.knowledge;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 04 14:12:24 CEST 2019
 * @generated */
public class KnowledgeEntry_Type extends Annotation_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = KnowledgeEntry.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.knowledge.KnowledgeEntry");

    /**
     * @generated
     */
    final Feature casFeat_uri;
    /**
     * @generated
     */
    final int casFeatCode_uri;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getUri(int addr) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uri);
  }
    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setUri(int addr, String v) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    ll_cas.ll_setStringValue(addr, casFeatCode_uri, v);}
    
  
 
    /**
     * @generated
     */
    final Feature casFeat_source;
    /**
     * @generated
     */
    final int casFeatCode_source;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.knowledge.KnowledgeEntry");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  



    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public KnowledgeEntry_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_uri = jcas.getRequiredFeatureDE(casType, "uri", "uima.cas.String", featOkTst);
    casFeatCode_uri  = (null == casFeat_uri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uri).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

  }
}



    