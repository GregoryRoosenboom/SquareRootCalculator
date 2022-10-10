import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String tryAgain = "y";
        do{
            String input = getCorrectUserInput();
            System.out.println(SquareRootCalculator.calculateSuareRoot(input));
            tryAgain = getUserRetry();
        }
        while(tryAgain.equalsIgnoreCase("y"));

    }

    public static String getCorrectUserInput() throws IOException {
        String input = ensureNumericInput(getUserInput("Please enter number to calculate the suare root"));
        return input;
    }

    private static String getUserInput(String message) throws IOException {
        System.out.println(message);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        return reader.readLine();
    }
    private static String ensureNumericInput(String input) throws IOException {
        while(! input.matches("^[0-9]*$")){
            input = getUserInput("Please enter a partial postal code");
        }
        return input;
    }

    public static String getUserRetry() throws IOException {
        String tryAgain = getUserInput("do you want to try again? (yes/no)");
        if(tryAgain.equalsIgnoreCase("y") || tryAgain.equalsIgnoreCase("yes")){
            return "y";
        }
        else {
            return "n";
        }
    }
}
