import java.util.regex.Pattern;

public class UC11_RegexValidation {

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        boolean validTrain = Pattern.matches("TRN-\\d{4}", trainId);
        boolean validCargo = Pattern.matches("PET-[A-Z]{2}", cargoCode);

        System.out.println("Train ID valid: " + validTrain);
        System.out.println("Cargo Code valid: " + validCargo);
    }
}