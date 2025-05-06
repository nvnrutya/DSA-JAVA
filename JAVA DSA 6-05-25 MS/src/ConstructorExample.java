public class ConstructorExample {
    int x;
    int y;

    // Default constructor
    ConstructorExample() {
        x = 10;
        y = 20;
    }

    // Parameterized constructor
    ConstructorExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        // Create object using default constructor
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println("obj1 x: " + obj1.x + ", y: " + obj1.y);

        // Create object using parameterized constructor
        ConstructorExample obj2 = new ConstructorExample(50, 100);
        System.out.println("obj2 x: " + obj2.x + ", y: " + obj2.y);
    }
}