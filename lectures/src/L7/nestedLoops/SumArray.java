package L7.nestedLoops;

// Time/data scaling example of nested loops
public class SumArray {
    public static void main(String[] args) {
        singleLoop(10_000_000_000L);
        doublyNestedLoop(100_000);
        triplyNestedLoop(2_000);
    }

    static void singleLoop(long n) {
        System.out.println("Running single loop");

        long sum = 0;
        for (long i = 0; i < n; i++) {
            sum = sum + 1;
        }
        System.out.println(sum);
    }

    static void doublyNestedLoop(long n) {
        System.out.println("Running double loop");

        long sum = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }

    static void triplyNestedLoop(long n) {
        System.out.println("Running triple loop");

        long sum = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                for (long k = 0; k < n; k++) {
                    sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
    }
}
