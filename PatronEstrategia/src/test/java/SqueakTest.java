import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SqueakTest {

    private ISound isound;

    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        isound= new Squeak();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void makeSound() {
        isound.makeSound();
        assertTrue(out.toString().toLowerCase().contains("squeak, squeak"));
    }

    @Test
    public void testToString() {
        String esperado= "squeak{}";
        String obtenido= isound.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}
