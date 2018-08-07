import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

        Customer customer;
        Luggage luggage;
        @Before
        public void before(){
            customer = new Customer("Mike");
            luggage = new Luggage(5);
        }

        @Test
        public void hasName(){
            assertEquals("Mike", customer.getName());
        }

        @Test
        public void luggageStartsEmpty(){
            assertEquals(0, customer.countLuggage());
        }
        @Test
        public void addLuggageToCustomer(){
            customer.addLuggage(luggage);
            assertEquals(1, customer.countLuggage());
        }

        @Test
        public void removeLuggageFromCustomer(){
            customer.addLuggage(luggage);
            assertEquals(1, customer.countLuggage());
            customer.removeLuggage();
            assertEquals(0, customer.countLuggage());
        }
}
