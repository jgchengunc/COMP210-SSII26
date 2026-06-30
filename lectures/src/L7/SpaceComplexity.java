package L7;
// Example of O(n) Space Complexity, n=y.length
public class SpaceComplexity {
    public static void main(String[] args) {
        int[] y = {20, 5, 9, 25, 10, 4, 61};
        int key = 100;         // The number to search for
        System.out.println(copyArray(y, key)[0]);
    }
    static int[] copyArray(int[] y, int key) {
        int[] yCopy = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            yCopy[i] = y[i];
        }
        return yCopy;
    }
}
