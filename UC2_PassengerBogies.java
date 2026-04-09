import java.util.ArrayList;

public class UC2_PassengerBogies {

    public static void main(String[] args) {

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Sleeper exists: " + exists);

        System.out.println("Final Bogies: " + passengerBogies);
    }
}