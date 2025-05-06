package com.oops.polymorphism.overriding;

public class StateBankOfIndia {
    double rateOfInterest() {
        return 7.5;
    }
}

class HDFC extends StateBankOfIndia {
    @Override
    double rateOfInterest() {
        return 8;
    }
}

// Test class (optional - if you want to run it)
class BankTest {
    public static void main(String[] args) {
        StateBankOfIndia sbi = new StateBankOfIndia();
        HDFC hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.rateOfInterest());
        System.out.println("HDFC Interest Rate: " + hdfc.rateOfInterest());
    }
}
