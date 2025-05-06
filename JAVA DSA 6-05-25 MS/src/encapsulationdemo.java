// EncapsulationDemo.java
public class encapsulationdemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Ananya");
        s1.setAge(20);
        s1.setRollNo(101);

        // Getting values using getters
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Roll Number: " + s1.getRollNo());
    }
}

