import java.util.Objects;

/**
 * Truncate a TextBlock to a specified maximum width.
 * 
 * @author Rene Urias Jr.
 */
public class Truncated implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The original TextBlock to be truncated.
   */
  private TextBlock originalBlock;

  /**
   * The maximum width for truncation.
   */
  private int maxWidth;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new truncated block with the specified original block and maximum width.
   */
  public Truncated(TextBlock originalBlock, int maxWidth) {
    this.originalBlock = originalBlock;
    this.maxWidth = maxWidth;
  } // Truncated(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the truncated block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    // Get the original row
    String originalRow = originalBlock.row(i);

    // Truncate or pad the row to match the maxWidth
    if (originalRow.length() <= maxWidth) {
      return originalRow;
    } else {
      return originalRow.substring(0, maxWidth);
    }
  } // row(int)

  /**
   * Determine how many rows are in the truncated block.
   */
  public int height() {
    return originalBlock.height();
  } // height()

  /**
   * Determine how many columns are in the truncated block.
   */
  public int width() {
    return Math.min(originalBlock.width(), maxWidth);
  } // width()

  /**
   * Get the original TextBlock.
   */
  public TextBlock getOriginalBlock() {
    return originalBlock;
  }

  /**
   * Check if two Truncated objects are equal based on the content of their original blocks and
   * maxWidth.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Truncated other = (Truncated) obj;
    return Objects.equals(originalBlock, other.originalBlock) && maxWidth == other.maxWidth;
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalBlock, maxWidth);
  }
} // class Truncated
