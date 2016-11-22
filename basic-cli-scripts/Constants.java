/*
 *  Testing the constants in Java programming language
 */

public class Constants {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.61;
        double JOURNEY_MILES = 100;
        System.out.print("Journey of " + JOURNEY_MILES + " miles is ");
        System.out.print(KM_PER_MILE * JOURNEY_MILES + " kilometers.");
    }
}