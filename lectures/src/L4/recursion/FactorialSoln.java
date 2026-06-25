package L4.recursion;

// Recursion practice solution
public class FactorialSoln {
    public static void main(String[] args) {
         System.out.println(factorial(0));
         System.out.println(factorial(1));
         System.out.println(factorial(7));
         System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        // Base case
        if (n == 0) return 1;

        // Recursive case
        return n * factorial(n - 1);
    }
}
