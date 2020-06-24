package humans;

import org.junit.Before;
import org.junit.Test;
import vehicles.CarType;
import vehicles.FordMustang;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer1;
    Dealer dealer2;
    FordMustang mustang1;
    FordMustang mustang2;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() throws Exception {
        dealer1 = new Dealer("Colin", 34, 1000);
        dealer2 = new Dealer("Eugene", 21, 40000);
        mustang1 = new FordMustang("Ford", "red", 25, CarType.PETROL);
        mustang2 = new FordMustang("FordX", "yellow", 2500, CarType.DIESEL);
        customer1 = new Customer("Mark", 25, 1000);
        customer2 = new Customer("Paulo", 32, 40000);
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

    @Test
    public void canGetVehicleList(){
        dealer1.addVehicle(mustang1);
        dealer1.addVehicle(mustang2);
        assertEquals(2, dealer1.getVehicleList().size());
    }

    @Test
    public void canBuyVehicle(){
        dealer1.buyVehicle(mustang1, customer1);
        assertEquals(1, dealer1.getVehicleList().size());
        assertEquals(975, dealer1.getMoney());
    }
}
