/*
 *  Example to calculate circle area using Java
 *  Demonstrates the usage of:
 *  - Try-catch block
 *  - Error handling
 *  - Math functions
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleArea {
    public static void main(String[] args) {

        /* Initialize the radius to zero */
        int radius = 0;

        System.out.print("Radius > ");

        try {
            BufferedReader radiusConsole = new BufferedReader(new InputStreamReader(System.in));
            radius = Integer.parseInt(radiusConsole.readLine());
        }

        /* If incorrect value was entered, print an error message and exit */
        catch(NumberFormatException incorrectNumber) {
            System.out.println("Invalid radius:" + incorrectNumber);
            System.exit(0);
        }

        /* If I/O exception (like interruption) happens, print an error and exit */
        catch(IOException ioException) {
            System.out.println("I/O Error:" + ioException);
            System.exit(0);
        }

        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + circleArea);
    }
}