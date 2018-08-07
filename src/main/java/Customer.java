import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Luggage> luggageList;

    public Customer(String name) {
        this.name = name;
        this.luggageList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Luggage> getLuggage(){
        return luggageList;
    }

    public int countLuggage(){
        return luggageList.size();
    }

    public void addLuggage(Luggage luggage){
        luggageList.add(luggage);
    }

    public Luggage removeLuggage(){
        return luggageList.remove(0);
    }
}
