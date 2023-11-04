import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModelDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    public ModelDuckTest(){}

    @Before
    public void Before(){
        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream( out ));
    }

    @Test
    public void testToString(){
        String esperado = "modelduck{}";
        String obtenido = d.toString().toLowerCase();

        assertEquals(esperado, obtenido);

    }


    @Test
    public void testSwim(){
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("puedo flotar"));
    }

    @Test
    public void testPerformFly(){

        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));

        d.setFlyBehavior(new FlyLikeRocket());
        d.performFly();

        assertTrue(out.toString().toLowerCase().contains("vuelo como cohete"));
    }

    @Test
    public void testDisplay(){
        d.Display();
        String obtenido = out.toString().toLowerCase();
        String esperado = "hola, soy un pato modelo";
        assertEquals(obtenido, esperado);
    }

    @Test
    public void testPerformSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("no hago ningun sonido"));
    }
}
