public class ShadowExample {
    int x;

    ShadowExample(int x) {
        x = x;  // ❌ Doesn't assign to instance variable
    }

    public static void main(String[] args) {
        ShadowExample obj = new ShadowExample(100);
        System.out.println(obj.x); // Output: 0 (not 100!)
    }
}
