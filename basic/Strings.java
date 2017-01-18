/**
 * Demonstrates various string operations.
 *
 * @author Juha Remes
 *
 */

public class Strings {

  /**
   *  Removes a character from a string.
   *
   *  @param str
   *  @param pos
   *  @return removedStr
   *
   */

  public static String removeCharacter(String str, int pos) {

    String removedStr = str.substring(0, pos) + str.substring(pos + 1);

    return removedStr;
  }

    /**
     * Reverses a string.
     *
     * @param str
     * @return reverse
     */

  public static String reverseString(String str) {
      String reverse = "";

      for (int i = str.length() - 1; i >= 0; i--) {
          reverse += str.charAt(i);
      }

      return reverse;
  }

   /**
    * Counts how many times character occurs in a string.
    * Demonstrates a basic needle/haystack functionality.
    *
    * @param haystack
    * @param needle
    * @return int
    */

  public static int howMany(String haystack, char needle) {
      int count = 0;

      for (int index = 0; index < haystack.length(); index++) {
          if (haystack.charAt(index) == needle) {
              count++;
          }
      }
      return count;
  }

  /**
    * Compares string lengths. Returns which ever of two strings
    * is longer. Demonstrates str.length() method usage.
    *
    * @param a first string
    * @param b second string
    * @return String
    */

  public static String compareLen(String a, String b) {
      int aLen = a.length();
      int bLen = b.length();

      if (aLen > bLen) {
          return a;
      } else if (aLen < bLen) {
          return b;
      } else {
          return "Both";
      }
  }
}
