import java.math.BigDecimal;
import java.math.RoundingMode;

public class SquareRootCalculator {
    public static void main(String[] args) {
        double number = 128;

        if (number < 0) {
            System.out.println("Square root of a negative number is not a real number.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.printf("The square root of %.2f is %.2f%n", number, squareRoot);

            // Example of a BigDecimal calculation
            BigDecimal bigNumber = new BigDecimal(number);
            BigDecimal bigSquareRoot = new BigDecimal(Math.sqrt(bigNumber.doubleValue()));
            bigSquareRoot = bigSquareRoot.setScale(10, RoundingMode.HALF_UP);
            System.out.println("Square root with high precision: " + bigSquareRoot);
        }
    }
}

