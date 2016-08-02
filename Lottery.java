/*
 *  Lottery Odds
 *  This program demonstrates for-loop
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lottery {
    public static void main(String[] args) {

        /* Initialize amount of numbers and highest amount */

        int numbers = 0;
        int highest = 0;

        System.out.print("How many numbers? ");

        try {
            BufferedReader numbersConsole = new BufferedReader(new InputStreamReader(System.in));
            numbers = Integer.parseInt(numbersConsole.readLine());
        }

        /* If incorrect value was entered print error and exit */

        catch(NumberFormatException incorrectNumber) {
            System.out.println("Incorrect number:" + incorrectNumber);
            System.exit(0);
        }

        /* If I/O exception (like interruption) happens, print an error and exit */

        catch(IOException ioException) {
            System.out.println("I/O Error:" + ioException);
            System.exit(0);
        }

        System.out.print("The highest number to draw? ");

        try {
            BufferedReader highestConsole = new BufferedReader(new InputStreamReader(System.in));
            highest = Integer.parseInt(highestConsole.readLine());
        }

        catch(NumberFormatException incorrectHighest) {
            System.out.println("Incorrect number:" + incorrectHighest);
            System.exit(0);
        }

        catch(IOException ioException) {
            System.out.println("I/O Error:" + ioException);
            System.exit(0);
        }

        /* Formalities aside, here comes the magic! */

        int odds = 1;

        for (int i = 1; i <= numbers; numbers++) {
            odds *= (highest - i + 1) / i;
        }

        System.out.println("Odds are 1 in " + odds + ".");

    }
}