package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FordMustangTest {
    FordMustang mustang1;
    FordMustang mustang2;

    @Before
    public void before(){
        mustang1 = new FordMustang("Ford", "red", 25);
        mustang2 = new FordMustang("FordX", "yellow", 2500);
    }

    @Test
    public void setMake(){
        mustang1.setMake("tickle me Elmo");
        assertEquals("tickle me Elmo", mustang1.getMake());
    }

    @Test
    public void setColor(){
        mustang1.setColor("Gold");
        assertEquals("Gold", mustang1.getColor());
    }

    @Test
    public void setPrice(){
        mustang1.setPrice(5);
        assertEquals(5, mustang1.getPrice());
    }

}
