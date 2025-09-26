import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.GraphFactory;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.TypeSystem;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class GenerateGraph {

    @Test
    @DisplayName("GenerateGraph")
    public void generateGraph() throws ResourceInitializationException, CASException {

        JCas pCas = JCasFactory.createJCas();

        TypeSystem pTypes = pCas.getTypeSystem();
        Type pTop = pCas.getTypeSystem().getTopType();

        Set<Type> types = new HashSet<>();
        pTypes.getTypeIterator().forEachRemaining(types::add);

        Graph pGraph = GraphFactory.open("");
        System.out.println(pGraph);

        //YedFileWriter pWriter = new YedFileWriter();

    }

}
