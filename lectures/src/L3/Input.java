package L3;

import java.util.Scanner;

// Scanner demo
public class Input {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner s = new Scanner(System.in);

        int myInt = s.nextInt();
        String line = s.nextLine();
        boolean myBoolean = s.nextBoolean();

        System.out.println(myInt);
        System.out.println(line);
        System.out.println(myBoolean);
    }
}
