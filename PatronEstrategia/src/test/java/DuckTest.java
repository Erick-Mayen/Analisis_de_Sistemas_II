import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;


public class DuckTest {
    private Duck d1;
    private ByteArrayOutputStream out;


    public DuckTest() {
    }

    @Before
    public void before(){
       Duck d1 = new Duck();
        out = new ByteArrayOutputStream();
    }

    @Test
    public void testToString(){
        String esperado = "duck{}";
        String obtenido = d1.toString().toLowerCase();

        assertEquals(esperado, obtenido);

    }

}
