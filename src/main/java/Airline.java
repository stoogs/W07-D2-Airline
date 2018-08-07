import java.util.ArrayList;

public class Airline {

    public void checkInCustomer(Customer customer, Flight flight){
        if (checkIfCheckedIn(customer, flight) == false){
            flight.addCustomer(customer);
        }
    }

    public void checkInLuggage(Customer customer, Flight flight){
        Luggage removedLuggage = customer.removeLuggage();
        flight.addLuggage(removedLuggage);
    }

    public void checkInCustomerWithLuggage(Customer customer, Flight flight){
        checkInCustomer(customer, flight);

        ArrayList<Luggage> customersLuggage = customer.getLuggage();
        int sizeOfLuggageList = customersLuggage.size();

        for (int i = 0; i < sizeOfLuggageList ; i++) {
            checkInLuggage(customer, flight);
        }
    }

    public boolean checkIfCheckedIn(Customer customer, Flight flight){
        ArrayList<Customer> customersOnFlight = flight.getCustomers();
        return customersOnFlight.contains(customer);
    }

    public boolean checkIfWeightTooHeavy(Luggage luggage, Flight flight){
        if (luggage.getWeight() > flight.getWeightLimit()){
            return true;
        }
        return false;
    }

}
