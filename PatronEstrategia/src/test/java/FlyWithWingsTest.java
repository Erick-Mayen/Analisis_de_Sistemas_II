import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlyWithWingsTest {

    private IFly ifly;

    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        ifly= new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void fly() {
        ifly.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando..."));
    }

    @Test
    public void testToString() {
        String esperado= "flywithwings{}";
        String obtenido= ifly.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}