public class DirectAssignment {
    int x;

    DirectAssignment() {
        this.x = 50; // Directly assigns value to the instance variable
    }

    public static void main(String[] args) {
        DirectAssignment obj = new DirectAssignment();
        System.out.println("x: " + obj.x); // Output: x: 50
    }
}

