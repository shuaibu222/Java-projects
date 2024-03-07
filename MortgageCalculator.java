import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgageCalculator {

    /*
     * We calculate annual interest. Since it's in percentage,
     * we first divide by 100 and then by 12 as the requirement said
     */

     // returning the interest value
    public static double annualInterest(double annualInterestType){
        return (annualInterestType / 100) / 12;
    }

    // manipulating years into months
    public static int monthly(int years){
        return years * 12;
    }

    // Calculate the numerator as shown from the formula
    public static double numeratorCalculation(int years, double annInterest){
        // get monthly interest rate
        double annInter = annualInterest(annInterest); 

        // get the power of (1 + r) power of number of months
        double annPower = Math.pow((1 + annInter), monthly(years));

        // multiply it by monthly rate
        return annInter * annPower;
    }

    public static double denominatorCalculation(int years, double annInterest) {
        // get monthly interest rate
        double annInter = annualInterest(annInterest); 

        return Math.pow((1 + annInter), monthly(years)) - 1;
    }
    public static void main(String[] args) {

        // to access the variables to outer of do-while block.
        double interest;
        int period, principal;

        // to reuse the same object
        Scanner scanner = new Scanner(System.in);

        // Inputs from the CLI

        // used do-while loop(i.e which executes at least once) to validate
        do {
            System.out.print("Loan Amount(Principal $1k - $1m): ");

            // check for valid integer
            while (!scanner.hasNextInt()) {
                System.out.println("It must be whole number");
                System.out.print("Loan Amount(Principal $1k - $1m): ");
                scanner.next();
            }
            principal = scanner.nextInt();
            if (principal < 1_000 || principal > 1_000_000){
                System.out.println("Enter a number between 1,000 - 1,000,000");
            }
        }
        while (principal < 1_000 || principal > 1_000_000);                                                      
        
        // validate period using do-while loop
        do {
            System.out.print("Period(years): ");

            // check for valid integer
            while (!scanner.hasNextInt()) {
                System.out.println("It must be whole number");
                System.out.print("Loan Amount(Principal $1k - $1m): ");
                scanner.next();
            }

            period = scanner.nextInt();
            if (period <= 0 || period > 30){
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }

        } while (period <= 0 || period > 30);

        // validate interest rate with do-while loop
        do {
            System.out.print("Interest Rate(Annual): ");

             // check for valid integer
            while (!scanner.hasNextInt()) {
                System.out.println("It must be whole number");
                System.out.print("Loan Amount(Principal $1k - $1m): ");
                scanner.next();
            }

            interest = scanner.nextDouble();
            if (interest <= 0 || interest > 30){
                System.out.println("Enter a value between 1 and 30");
            }
        } while (interest <= 0 || interest > 30);

        // numerator / denominator
        double numCalc = numeratorCalculation(period  , interest);
        double denomCalc = denominatorCalculation(period  , interest);

        // final value calculation
        double numDenomDivider = numCalc / denomCalc;
        double monthlyPayment = numDenomDivider * principal;

        // format the result to two decimal point
        DecimalFormat toTwo = new DecimalFormat("0.00");
        String monthlyPaymentFormat = toTwo.format(monthlyPayment);

        // print out the payment
        System.out.println("Monthly rate is: $" + monthlyPaymentFormat);

        // closed opened input to avoid memory leak.
        scanner.close();
    }
}
