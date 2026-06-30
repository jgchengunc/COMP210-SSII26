package L7.linearSearch;

// Example of linear search
public class LinearSearch {
    public static void main(String[] args) {
        int[] y = {20, 5, 9, 25, 10, 4, 61};
        int key = 10;         // key to search for
        System.out.println(searchArray(y, key));
    }
    static int searchArray(int[] y, int key) {  // conducts linear search for key in y
        for (int i = 0; i < y.length; i++) {
            if (y[i] == key) {
                return(i);     // returns index of key as soon as successful search
            }}
        return(-1);     // return -1 if search unsuccessful
    }}
