package humans;
import org.junit.Before;
import org.junit.Test;
import vehicles.CarType;
import vehicles.FordMustang;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    FordMustang mustang1;
    FordMustang mustang2;
    FordMustang mustang3;
    Customer customer1;
    Customer customer2;
    Dealer dealer1;
    Dealer dealer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("Mark", 25, 1000);
        customer2 = new Customer("Paulo", 32, 40000);
        mustang1 = new FordMustang("Ford", "red", 25, CarType.PETROL);
        mustang2 = new FordMustang("FordX", "yellow", 2500, CarType.DIESEL);
        mustang3 = new FordMustang("THEBESTMAKE", "pink", 1000000, CarType.DILITHIUM);
        dealer1 = new Dealer("Colin", 34, 1000);
        dealer2 = new Dealer("Eugene", 21, 40000);
    }

    @Test
    public void canGetName(){
        assertEquals("Mark", customer1.getName());
    }

    @Test
    public void canGetAge(){
        assertEquals(25, customer1.getAge());
    }

    @Test
    public void canGetMoney(){
        assertEquals(1000, customer1.getMoney());
    }

    @Test
    public void canSetName() {
        customer1.setName("Jimbo");
        assertEquals("Jimbo", customer1.getName());
    }

    @Test
    public void canSetAge(){
        customer1.setAge(58);
        assertEquals(58, customer1.getAge());
    }

    @Test
    public void canSetMoney(){
        customer1.setMoney(200);
        assertEquals(200, customer1.getMoney());
    }

    @Test
    public void canGetVehicleList(){
        customer1.addVehicle(mustang1);
        customer1.addVehicle(mustang2);
        assertEquals(2, customer1.getVehicleList().size());
    }

    @Test
    public void canBuyVehicle(){
        dealer1.addVehicle(mustang1);
        dealer1.addVehicle(mustang2);
        dealer1.addVehicle(mustang3);
        mustang1.setDamaged(false);
        customer1.buyVehicle(mustang1, dealer1);
        assertEquals(1, customer1.getVehicleList().size());
        assertEquals(975, customer1.getMoney());
        assertEquals(2, dealer1.getVehicleList().size());
    }

    @Test
    public void canBuyVehicle__damaged(){
        dealer1.addVehicle(mustang1);
        mustang1.setDamaged(true);
        customer1.buyVehicle(mustang1, dealer1);
        assertEquals(988, customer1.getMoney());
    }
}