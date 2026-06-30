package L7.nestedLoops;

// Visual example of nested loops
public class PrintArray {
    public static void main(String[] args) {
        int[] y = {1, 2, 3};
        int n = y.length;
        printAllElements(y);
        printAllPairs(y);
        printAllTriples(y);
    }

    static void printAllElements(int[] y) {
        System.out.println("Printing all elements");

        for (int i : y) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    static void printAllPairs(int[] y) {
        System.out.println("Printing all pairs");

        for (int i : y) {
            for (int j : y) {
                System.out.print("(" + i + ", " + j + "), ");
            }
            System.out.println();
        }
    }

    static void printAllTriples(int[] y) {
        System.out.println("Printing all triples");

        for (int i : y) {
            for (int j : y) {
                for (int k : y) {
                    System.out.print("(" + i + ", " + j + ", " + k + "), ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
