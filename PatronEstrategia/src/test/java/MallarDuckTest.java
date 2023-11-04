import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MallarDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    public MallarDuckTest(){}

    @Before
    public void Before(){
        d = new MallarDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }


    @Test
    public void testToString(){
        String esperado = "mallarduck{}";
        String obtenido = d.toString().toLowerCase();

        assertEquals(esperado, obtenido);

    }


    @Test
    public void testSwim(){
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testFly(){
        d.performFly();
        // assertTrue(out.toString().toLowerCase().contains("estoy volando"));

        String obtenido = out.toString().toLowerCase();
        String esperado = "estoy volando...";
        assertEquals(obtenido, esperado);
    }

    @Test
    public void testDisplay(){
        d.Display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato"));
    }

    @Test
    public void testPerformSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("quack, quack"));
    }
}
