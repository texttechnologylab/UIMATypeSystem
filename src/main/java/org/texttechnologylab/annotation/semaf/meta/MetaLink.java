

/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.meta;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Link;


/** ( COREFERENCE | SUBCOREFERENCE | SPLITCOREFERENCE )
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class MetaLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaLink.class);
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
  protected MetaLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetaLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaLink(JCas jcas) {
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
     
}

    