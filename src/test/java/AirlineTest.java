import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline;
    Customer customer;
    Flight flight;
    Luggage luggage1;
    Luggage luggage2;

    @Before
    public void before(){
        airline = new Airline();
        customer = new Customer("Mike");
        flight = new Flight("ABC123", 10);
        luggage1 = new Luggage(50);
        luggage2 = new Luggage(5);

        customer.addLuggage(luggage1);
        customer.addLuggage(luggage2);
    }

    @Test
    public void canCheckIn(){
        airline.checkInCustomer(customer, flight);
        assertEquals(1, flight.countCustomers());
    }

    @Test
    public void canCheckInLuggage(){
        airline.checkInLuggage(customer, flight);
        assertEquals(1, flight.countLuggage());
        assertEquals(1, customer.countLuggage());
    }

    @Test
    public void canCheckInCustomerWithMultipleBags(){
        airline.checkInCustomerWithLuggage(customer, flight);
        assertEquals(2, flight.countLuggage());
        assertEquals(0, customer.countLuggage());
    }

    @Test
    public void cantCheckInTwice(){
        airline.checkInCustomer(customer, flight);
        airline.checkInCustomer(customer, flight);
        assertEquals(1, flight.countCustomers());
    }

    @Test
    public void luggageWeightTooHeavy() {
        assertEquals(true, airline.checkIfWeightTooHeavy(luggage1, flight));
    }

    @Test
    public void luggageWeightTooGood() {
        assertEquals(false, airline.checkIfWeightTooHeavy(luggage2, flight));
    }
    @Test
    public void showAirline(){
        System.out.println(airline);
    }
}
