
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two digits
        System.out.print("Enter the first digit: ");
        double digit1 = scanner.nextDouble();

        System.out.print("Enter the second digit: ");
        double digit2 = scanner.nextDouble();

        // Perform addition
        double sum = digit1 + digit2;
        System.out.println("Sum: " + sum);

        // Perform subtraction
        double difference = digit1 - digit2;
        System.out.println("Difference: " + difference);

        // Perform multiplication
        double product = digit1 * digit2;
        System.out.println("Product: " + product);

        // Perform division
        if (digit2 != 0) {
            // Check for division by zero
            double quotient = (double) digit1 / digit2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}
