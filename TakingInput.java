

import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String n = sc.nextLine(); // prints full line
        System.out.println("Your name is: " + n);


        sc.close();
    }
}