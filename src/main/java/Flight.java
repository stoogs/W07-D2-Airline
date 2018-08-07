import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customers;
    private ArrayList<Luggage> luggageList;
    private String flightno;
    private int weightLimit;


    public Flight(String flightno, int weightLimit){
    customers = new ArrayList<>();
    luggageList = new ArrayList<>();
    this.flightno = flightno;
    this.weightLimit = weightLimit;}

    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addLuggage(Luggage luggage){
        luggageList.add(luggage);
    }

    public int countCustomers(){
        return customers.size();
    }

    public int countLuggage(){
        return luggageList.size();
    }

    public String getFlightno() {
        return flightno;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void removeCustomer(){
        customers.remove(0);
    }
}
