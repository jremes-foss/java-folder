/**
 * Demonstrates the various Array operations.
 *
 * @author Juha Remes
 */

public class Arrays {

    /**
     * Searches for a value in an integer array.
     * Return true if found, false otherwise.
     * Demonstrates usage of for-loops in the array context.
     *
     * @param haystack
     * @param needle
     * @return
     */

    public static boolean containsVal(int[] haystack, int needle) {
        for (int i : haystack) {
            if (needle == i) {
                return true;
            }
        }

        return false;

    }

}
