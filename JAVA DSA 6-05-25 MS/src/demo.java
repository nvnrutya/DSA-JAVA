public class demo {
    public static void main(String[] args) {
        // Check if the user passed at least two command-line arguments
        if (args.length < 2) {
            System.out.println("Please provide two command-line arguments.");
            return;
        }

        // Print command-line arguments
        System.out.println("Argument 1: " + args[0]);
        System.out.println("Argument 2: " + args[1]);

        // Variable declarations
        byte a = 127;
        float x = 4.5F;
        double y = 4.5;

        // Optional: Print the variables
        System.out.println("byte a = " + a);
        System.out.println("float x = " + x);
        System.out.println("double y = " + y);
    }
}
//if you'd like to change it to take user input use Scanner.