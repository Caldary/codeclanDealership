package humans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer1;
    Dealer dealer2;

    @Before
    public void setUp() throws Exception {
        dealer1 = new Dealer("Colin", 34, 1000);
        dealer2 = new Dealer("Eugene", 21, 40000);
    }

    @Test
    public void canGetName(){
        assertEquals("Colin", dealer1.getName());
    }

    @Test
    public void canGetAge(){
        assertEquals(34, dealer1.getAge());
    }

    @Test
    public void canGetMoney(){
        assertEquals(1000, dealer1.getMoney());
    }

    @Test
    public void canSetName(){
        dealer1.setName("Hanna");
        assertEquals("Hanna", dealer1.getName());
    }

    @Test
    public void canSetAge(){
        dealer1.setAge(12);
        assertEquals(12, dealer1.getAge());
    }

    @Test
    public void canSetMoney(){
        dealer1.setMoney(0);
        assertEquals(0, dealer1.getMoney());
    }
}
