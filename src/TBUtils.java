import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Samuel A. Rebelsky & Rene Urias Jr.
 */
public class TBUtils {
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of dashes. This sequence may grow as the program operates.
   */
  static String lotsOfDashes = "--";

  /**
   * A really big sequence of spaces. This sequence may grow as the program operates.
   */
  static String lotsOfSpaces = "  ";

  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Build a sequence of dashes of a specified length.
   */
  static String dashes(int len) {
    // Note: This strategy probably represents an overkill in
    // attempts at efficiency.
    // Make sure the collection of dashes is big enough
    while (lotsOfDashes.length() < len) {
      lotsOfDashes = lotsOfDashes.concat(lotsOfDashes);
    } // while
    // Extract an appropriate length substring
    return lotsOfDashes.substring(0, len);
  } // dashes(int)

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block) {
    for (int i = 0; i < block.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.println();
      } // catch (Exception)
    } // for
  } // print(PrintWriter, TextBlock)

  /**
   * Build a sequence of spaces of a specified length.
   */
  static String spaces(int len) {
    // As with dashes, this is probably overkill.
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0, len);
  } // spaces(int)

  /**
   * Check if two TextBlocks are equal based on the content of their lines.
   */
  public static boolean equal(TextBlock t1, TextBlock t2) {
    if (t1 == null || t2 == null) {
      return t1 == t2;
    }

    if (t1.height() != t2.height() || t1.width() != t2.width()) {
      return false;
    }

    for (int i = 0; i < t1.height(); i++) {
      try {
        if (!t1.row(i).equals(t2.row(i))) {
          return false;
        }
      } catch (Exception e) {
        // Handle exception (if any)
        return false;
      }
    }

    return true;
  }

  /**
   * Check if two TextBlocks are equivalent based on how they were built.
   */
  /**
   * Check if two TextBlocks are equivalent based on how they were built.
   */
  /**
   * Check if two TextBlocks are equivalent based on how they were built.
   */
  public static boolean eqv(TextBlock t1, TextBlock t2) {
    if (t1 == t2) {
      return true;
    }

    if (t1 instanceof Truncated && t2 instanceof Truncated) {
      return t1.equals(t2);
    }

    if (t1.getClass() == t2.getClass()) {
      return equal(t1, t2);
    }

    return false;
  }

  /**
   * Check if two TextBlocks are identical based on memory location.
   */
  public static boolean eq(TextBlock t1, TextBlock t2) {
    return t1 == t2;
  }
} // class TBUtils
