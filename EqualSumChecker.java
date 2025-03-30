public class EqualSumChecker {
 
    public static boolean hasEqualSum(int a, int b, int c) {
        return (a + b) == c;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasEqualSum(1, 1, 2));     // Output: true (1 + 1 = 2)
        System.out.println(hasEqualSum(1, -1, 0));    // Output: true (1 + (-1) = 0)
        System.out.println(hasEqualSum(2, 2, 5));     // Output: false (2 + 2 ≠ 5)
        System.out.println(hasEqualSum(10, 5, 15));   // Output: true (10 + 5 = 15)
        System.out.println(hasEqualSum(3, 3, 6));     // Output: true (3 + 3 = 6)
    }
}
