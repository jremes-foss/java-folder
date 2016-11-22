import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Savings Calculator
 *  Demonstrates the usage of while loop
 */

public class SavingsCalculator {
    public static void main(String[] args) {

        /* Initialize the variables */
        double target = 0;
        double contrib = 0;
        double interestRate = 0;

        System.out.print("How much do you need to save? ");

        try {
            BufferedReader targetConsole = new BufferedReader(new InputStreamReader(System.in));
            target = Double.parseDouble(targetConsole.readLine());
        }

        /* If incorrect number print error and exit */
        catch(NumberFormatException incorrectTarget) {
            System.out.print("Incorrect target:" + incorrectTarget);
            System.exit(0);
        }

        catch(IOException ioException) {
            System.out.println("I/O Error:" + ioException);
            System.exit(0);
        }

        System.out.print("How much is your annual contribution? ");

        try {
            BufferedReader contribConsole = new BufferedReader(new InputStreamReader(System.in));
            contrib = Double.parseDouble(contribConsole.readLine());
        }

        catch(NumberFormatException incorrectContrib) {
            System.out.print("Incorrect contribution:" + incorrectContrib);
            System.exit(0);
        }

        catch(IOException ioException) {
            System.out.println("I/O Error:" + ioException);
            System.exit(0);
        }

        System.out.print("Interest rate? ");

        try {
            BufferedReader interestConsole = new BufferedReader(new InputStreamReader(System.in));
            interestRate = Double.parseDouble(interestConsole.readLine());
        }

        catch (NumberFormatException incorrectInterest) {
            System.out.print("Incorrect interest:" + incorrectInterest);
            System.exit(0);
        }

        catch(IOException ioException) {
            System.out.println("I/O Error:" + ioException);
            System.exit(0);
        }

        double balance = 0;
        int years = 0;

        while (balance < target) {
            balance += contrib;
            double interest = balance * (interestRate / 100);
            balance += interest;
            years++;
        }

        System.out.println("You have reached your target in " + years + " years.");
    }
}