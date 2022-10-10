import java.math.BigDecimal;

public class SquareRootCalculator {
    public static String calculateSuareRoot(String input) {
        BigDecimal number = new BigDecimal(input);
        BigDecimal decimal = new BigDecimal("0.00001");
        BigDecimal squareRoot = new BigDecimal("0.00000");
        BigDecimal squareRootSquared = squareRoot;

        do {
            squareRoot = squareRoot.add(decimal);
            squareRootSquared = squareRoot.multiply(squareRoot);
        }
        while (number.compareTo(squareRootSquared) > 0);


        if (squareRootSquared.compareTo(number) == 0) {
            return squareRoot.toPlainString();
        }

        return squareRoot.subtract(decimal).toPlainString();
    }
}

