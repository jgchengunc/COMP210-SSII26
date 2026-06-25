package L3.java;

import java.util.Scanner;

public class JavaPracticeSoln {
    public static void main(String[] args) {
        // Create scanner and input variables
        Scanner s = new Scanner(System.in);
        int n, m;
        double a, b;

        // Get an integer n from the user
        System.out.println("Enter integer 'n':");
        n = s.nextInt();

        // Check value of n
        switch (n) {
            case 1 -> {
                // Task 1: Printing Numbers

                // Get 2 doubles a, b and an integer m from the user
                System.out.println("Enter double 'a':");
                a = s.nextDouble();
                System.out.println("Enter double 'b':");
                b = s.nextDouble();
                System.out.println("Enter integer 'm':");
                m = s.nextInt();

                // Print out a, b, and m
                System.out.println("a = " + a + ", b = " + b + ", m = " + m);
            } case 2 -> {
                // Task 2: Writing a Math Function

                // Get 2 doubles a, b and an integer m from the user
                System.out.println("Enter double 'a':");
                a = s.nextDouble();
                System.out.println("Enter double 'b':");
                b = s.nextDouble();
                System.out.println("Enter integer 'm':");
                m = s.nextInt();

                // Call quadFun on a, b, and m and print the output
                System.out.println(quadFun(a, b, m));
            } case 3 -> {
                // Task 3: Using Arrays

                // Get an integer m from the user
                System.out.println("Enter integer m:");
                m = s.nextInt();

                // Create a double array of size m
                double[] arr = new double[m];
                // Keeps track of total sum
                double sum = 0.0;

                // Get m doubles from the user
                System.out.println("Enter m doubles:");
                for (int i = 0; i < m; i++) {
                    // Save the double in arr
                    arr[i] = s.nextDouble();
                    // Add the double to sum
                    sum += arr[i];
                }

                // Print the average to 2 decimal places
                System.out.printf("Average = %.2f%n", sum / m);

                // Print arr contents in reverse order
                for (int i = m - 1; i >= 0; i--) {
                    System.out.println("arr[" + i + "]=" + arr[i]);
                }
            }
        }
    }

    public static double quadFun(double a, double b, int m) {
        return (a * m * m + b);
    }
}
