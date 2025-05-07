

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 16:38:29 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Document metadata.
 * Updated by JCasGen Wed May 07 16:38:29 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Document extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Document {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Document";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Document.class);
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
   
  public final static String _FeatName_documentName = "documentName";
  public final static String _FeatName_version = "version";
  public final static String _FeatName_producer = "producer";
  public final static String _FeatName_pagesCount = "pagesCount";
  public final static String _FeatName_mainLanguage = "mainLanguage";
  public final static String _FeatName_languages = "languages";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_documentName = TypeSystemImpl.createCallSite(Document.class, "documentName");
  private final static MethodHandle _FH_documentName = _FC_documentName.dynamicInvoker();
  private final static CallSite _FC_version = TypeSystemImpl.createCallSite(Document.class, "version");
  private final static MethodHandle _FH_version = _FC_version.dynamicInvoker();
  private final static CallSite _FC_producer = TypeSystemImpl.createCallSite(Document.class, "producer");
  private final static MethodHandle _FH_producer = _FC_producer.dynamicInvoker();
  private final static CallSite _FC_pagesCount = TypeSystemImpl.createCallSite(Document.class, "pagesCount");
  private final static MethodHandle _FH_pagesCount = _FC_pagesCount.dynamicInvoker();
  private final static CallSite _FC_mainLanguage = TypeSystemImpl.createCallSite(Document.class, "mainLanguage");
  private final static MethodHandle _FH_mainLanguage = _FC_mainLanguage.dynamicInvoker();
  private final static CallSite _FC_languages = TypeSystemImpl.createCallSite(Document.class, "languages");
  private final static MethodHandle _FH_languages = _FC_languages.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Document(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Document(JCas jcas, int begin, int end) {
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
  //* Feature: documentName

  /** getter for documentName - gets The name of this document in the XML files.
   * @generated
   * @return value of the feature 
   */
  public String getDocumentName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_documentName));
  }
    
  /** setter for documentName - sets The name of this document in the XML files. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_documentName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets The version of the source XML files.
   * @generated
   * @return value of the feature 
   */
  public String getVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_version));
  }
    
  /** setter for version - sets The version of the source XML files. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_version), v);
  }    
    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets The producer of the source XML files.
   * @generated
   * @return value of the feature 
   */
  public String getProducer() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_producer));
  }
    
  /** setter for producer - sets The producer of the source XML files. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProducer(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_producer), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pagesCount

  /** getter for pagesCount - gets The number of pages in this document (optional).
   * @generated
   * @return value of the feature 
   */
  public int getPagesCount() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_pagesCount));
  }
    
  /** setter for pagesCount - sets The number of pages in this document (optional). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPagesCount(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_pagesCount), v);
  }    
    
   
    
  //*--------------*
  //* Feature: mainLanguage

  /** getter for mainLanguage - gets The main language of this document.
   * @generated
   * @return value of the feature 
   */
  public String getMainLanguage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_mainLanguage));
  }
    
  /** setter for mainLanguage - sets The main language of this document. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMainLanguage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mainLanguage), v);
  }    
    
   
    
  //*--------------*
  //* Feature: languages

  /** getter for languages - gets All languages used in this document (optional).
   * @generated
   * @return value of the feature 
   */
  public String getLanguages() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_languages));
  }
    
  /** setter for languages - sets All languages used in this document (optional). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguages(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_languages), v);
  }    
    
  }

    