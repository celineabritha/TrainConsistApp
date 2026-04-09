import java.util.LinkedHashSet;

public class UC5_LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper"); // duplicate

        System.out.println("Train Formation: " + train);
    }
}