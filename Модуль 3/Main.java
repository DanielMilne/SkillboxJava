import com.skillbox.airport.Airport;

public class Main {

    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        airport.getTerminals();
        System.out.println(Integer.valueOf(airport.getAllAircrafts().size()));
    }
}
