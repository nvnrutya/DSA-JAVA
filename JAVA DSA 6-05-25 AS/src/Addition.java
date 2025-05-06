package com.oops.polymorphism.overloading;

public class Addition {
    // Method to add two integers
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method to add three integers
    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Method to add one integer and one float
    static void add(int a, float b) {
        System.out.println(a + b);
    }
}

class Overloading {
    public static void main(String[] args) {
        // Calling all three overloaded methods
        Addition.add(1, 2);          // Calls add(int, int)
        Addition.add(1, 2, 3);       // Calls add(int, int, int)
        Addition.add(1, 2.5f);       // Calls add(int, float)
    }
}
