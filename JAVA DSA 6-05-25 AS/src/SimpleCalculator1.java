public class SimpleCalculator1 {
    void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        SimpleCalculator1 simpleCalc = new SimpleCalculator1();
        simpleCalc.addition(5, 3);
        System.out.println("-------------------------------------------------");

        AdvancedCalculator advancedCalc = new AdvancedCalculator();
        advancedCalc.addition(6, 2);  // Inherited from SimpleCalculator1
        advancedCalc.multiplication(4, 3);
        advancedCalc.division(10, 2);
        System.out.println("-------------------------------------------------");

        SuperAdvancedCalculator superCalc = new SuperAdvancedCalculator();
        superCalc.addition(8, 2);     // Inherited from SimpleCalculator1
        superCalc.subtraction(10, 5);
        System.out.println("-------------------------------------------------");
    }
}

class AdvancedCalculator extends SimpleCalculator1 {
    void multiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
}
class SuperAdvancedCalculator extends SimpleCalculator1 {
    void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}
