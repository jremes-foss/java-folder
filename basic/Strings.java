/**
 * Demonstrates various string operations.
 *
 * @author Juha Remes
 *
 */

public class Strings {

  /**
   *  Removes a character from a string
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
     * Reverses a string
     *
     * @param str
     * @return
     */

  public static String reverseString(String str) {
      String reverse = "";

      for (int i = str.length() - 1; i >= 0; i--) {
          reverse += str.charAt(i);
      }

      return reverse;
  }
}
