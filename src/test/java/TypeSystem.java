import org.apache.uima.UIMAException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.junit.Test;

public class TypeSystem {

    @Test
    public void testJCas() throws UIMAException {
        JCas jCas = JCasFactory.createJCas();
    }

}
