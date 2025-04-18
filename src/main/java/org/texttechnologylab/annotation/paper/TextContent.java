


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation.paper;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TextContent extends Annotation {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.paper.TextContent";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TextContent.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }


    /* *******************
     *   Feature Offsets *
     * *******************/



    /* Feature Adjusted Offsets */


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected TextContent() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public TextContent(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TextContent(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public TextContent(JCas jcas, int begin, int end) {
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

}

