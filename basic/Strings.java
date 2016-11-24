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
}
