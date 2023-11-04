import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PancakeHouseMenuTest {

    private PancakeHouseMenu m;

    @Before
    public void before() throws Exception{
        m = new PancakeHouseMenu();
    }


    @Test (expected = IllegalArgumentException.class)
    public void testAddItemNull(){m.addItem(null);}
}