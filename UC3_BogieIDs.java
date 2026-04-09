import java.util.HashSet;

public class UC3_BogieIDs {

    public static void main(String[] args) {

        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG103");

        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}