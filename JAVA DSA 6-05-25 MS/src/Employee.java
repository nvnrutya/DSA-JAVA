public class Employee {
    String name;
    String email;
    int salary;

    // Constructor
    Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;

        // Print details inside constructor
        System.out.println("Employee Created -> Name: " + name + ", Email: " + email + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating multiple employees (constructor prints details)
        Employee e1 = new Employee("Alice", "alice@example.com", 60000);
        Employee e2 = new Employee("Bob", "bob@example.com", 75000);
        Employee e3 = new Employee("Charlie", "charlie@example.com", 82000);
    }
}
/* Employee(String name, String email, int salary) {
    this.name = name;
    this.email = email;
    this.salary = salary;
}
This is a parameterized constructor — it takes values (name, email, salary) when you create an Employee object like this:

java
Copy code
Employee emp1 = new Employee("Alice", "alice@example.com", 60000);
At that point:

"Alice" gets passed to name

"alice@example.com" gets passed to email

60000 gets passed to salary

And inside the constructor, this.name = name; assigns the parameter to the object's field.*/


/* static final String company = "Wipro"; // Constant for all employees
System.out.println("Employee Created -> Name: " + name + ", Email: " + email + ", Salary: " + salary + ", Company: " + company); */
