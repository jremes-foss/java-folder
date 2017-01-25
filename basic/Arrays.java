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

    /**
     * Searches for a value in an integer array.
     * Once found, return the index. Otherwise,
     * return -1. Demonstrates alternative way to use
     * for-loops in an integer array.
     *
     * @param haystack
     * @param needle
     * @return int
     */

    public static int returnIndex(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return i;
            }
        }

        return -1;

    }

}
