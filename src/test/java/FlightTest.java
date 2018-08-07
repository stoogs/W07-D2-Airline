import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight;
    Customer customer;

    @Before
    public void before(){
        flight = new Flight("ABC123", 10);
        customer = new Customer("Bob");
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.getCustomers().size());
    }

    @Test
    public void addCustomer(){
        flight.addCustomer(customer);
        assertEquals(1, flight.getCustomers().size());
    }

    @Test
    public void flightRemoveCustomer(){
        flight.addCustomer(customer);
        assertEquals(1,flight.getCustomers().size());
        flight.removeCustomer();
        assertEquals(0,flight.getCustomers().size());
        }


    }
