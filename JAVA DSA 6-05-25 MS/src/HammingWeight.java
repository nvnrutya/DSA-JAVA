//LEETCODE QUESTION 191
public class HammingWeight {
    public static void main(String[] args) {
        System.out.println("Using Brian Kernighan's method:");
        System.out.println("HW of 5: " + hammingWeight(5));
        System.out.println("HW of 11: " + hammingWeight(11));
        System.out.println("HW of 128: " + hammingWeight(128));
        System.out.println("HW of -3: " + hammingWeight(-3));

        System.out.println("\nUsing Bit Shifting method:");
        System.out.println("HW of 5: " + hammingWeightShift(5));
        System.out.println("HW of 11: " + hammingWeightShift(11));
        System.out.println("HW of 128: " + hammingWeightShift(128));
        System.out.println("HW of -3: " + hammingWeightShift(-3));
    }

    // Brian Kernighan's method
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    // Bit shifting method
    public static int hammingWeightShift(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1; // unsigned right shift
        }
        return count;
    }
}
//Example Walkthrough:
//Let's take n = 11 (binary: 1011):
//
//Initial n = 11 (1011), count = 0
//
//First iteration:
//n & (n - 1) = 11 & 10 = 10 (1010), count = 1
//
//Second iteration:
//n & (n - 1) = 10 & 9 = 8 (1000), count = 2
//
//Third iteration:
//n & (n - 1) = 8 & 7 = 0 (0000), count = 3
//
//Loop exits, return count = 3.