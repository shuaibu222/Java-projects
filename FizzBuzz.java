import java.util.*;

public class FizzBuzz {
    
    /*
     * FizzBuzz works as below:
     * 1 - if the num / 5 == fizz;
     * 2 - if the num / 3 == buzz;
     * 3 - if the num / 5 & 3 == fizzbuzz
     * 4 - if the num is not divisible by 3 or 5 it returns the num
     */

    public static void main(String[] args) {
            
            System.out.print("Enter number: ");
            Scanner number = new Scanner(System.in);
            int enteredNumber = number.nextInt();


            if (enteredNumber % 5 == 0 && enteredNumber % 3 == 0){
                System.out.println("FizzBuzz!");
            } else if (enteredNumber % 5 == 0){
                System.out.println("Fizz!");
            }else if (enteredNumber % 3 == 0){
                System.out.println("Buzz!");
            } else {
                System.out.println(enteredNumber);
            }

            number.close();
    }
}
