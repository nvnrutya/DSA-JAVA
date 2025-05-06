import java.util.Scanner;

public class SimpleCalculator {

    // Method to perform calculation
    public static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operator.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("----- Simple Calculator -----");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = calculate(num1, num2, operator);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            char choice = sc.next().toLowerCase().charAt(0);
            continueCalc = (choice == 'y');
        }

        System.out.println("Calculator closed.");
        sc.close();
    }
}

