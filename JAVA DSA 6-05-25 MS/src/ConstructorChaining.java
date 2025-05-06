public class ConstructorChaining {
    int x;

    ConstructorChaining() {
        this(50); // Calls the parameterized constructor
    }

    ConstructorChaining(int x) {
        this.x = x; // Sets the instance variable
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
        System.out.println("x: " + obj.x); // Output: x: 50
    }
}

