/*
 *
 * Lottery Draw
 * Demonstrates usage of arrays.
 *
 */

import java.util.*;

public class LotteryDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers to draw?");
        System.out.print("> ");
        int amount = in.nextInt();

        System.out.println("What is the highest numbers to dra?");
        System.out.print("> ");
        int highest = in.nextInt();

        /*
         * Now the tricky part: we need to fill out the numbers
         * 1, 2, 3, ... , n. This is where the arrays come into
         * play. This sort of logic is handy especially when
         * dealing with some mathematical problems.
         */

        int[] numbers = new int[highest];

        for (int m = 0; m < numbers.length; m++) {
            numbers[m] = m + 1;
        }

        /*
         * Now: we need to draw q numbers and insert them into
         * second array.
         */

        int[] result = new int[amount];

        /* Here be the dragons! */

        for (int m = 0; m < result.length; m++) {
            int r = (int)(Math.random() * highest);
            result[m] = numbers[r];
            numbers[r] = numbers[highest - 1];
            highest--;
        }

        /* Last but not least: print the sorted arrays. */

        Arrays.sort(result);
        System.out.println("Lottery-o-Matic has given you the following combination:");

        for (int r : result) {
            System.out.println(r);
        }
    }
}