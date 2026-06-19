import org.apache.uima.cas.CASException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.junit.jupiter.api.Test;

public class TypeSystem {

    @Test
    public void testJCas() throws ResourceInitializationException, CASException {
        JCas jCas = JCasFactory.createJCas();
    }

}
