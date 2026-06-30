package L7.linearSearch;

import static java.lang.Math.random;

// example of linear search based on Random numbers
// prints out the time taken to search a random number (key) in array
public class LinearSearchRnd {
    public static void main(String[] args) {
        int n = 6_000_000;        // size of y
        int[] y = new int[n];   // array to be searched
        int repeat = 100;        // number of times to repeat the experiment

        // fill array with random numbers in range 0-n
        for (int j = 0; j < repeat; j++) {
            int key = (int) (n * random());     // key = random number to be searched
            for (int i = 0; i < n; i++) {
                y[i] = (int) (n * random());    // fill in array
            }
            long startTime = System.nanoTime();
            searchArray(y, key);                // conduct the search (result not being printed)
            long endTime = System.nanoTime();
            long duration = endTime - startTime;    // duration of search in nanoseconds
            long durationInMicro = duration / 1000;
            System.out.println(durationInMicro);       // prints out time taken for search in microseconds
        }
    }

    static int searchArray(int[] y, int key) {       // conducts linear search for key in array
        for (int i = 0; i < y.length; i++) {
            if (y[i] == key) {
                return(i);     // returns index of key as soon as successful search
            }}
        return(-1);     // return -1 if search unsuccessful
    }
}
