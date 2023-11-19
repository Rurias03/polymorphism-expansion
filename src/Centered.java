/**
 * Center a TextBlock within a specified width.
 * 
 * @author Rene Urias Jr.
 */
public class Centered implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The original TextBlock to be centered.
   */
  private TextBlock originalBlock;

  /**
   * The width for centering.
   */
  private int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new centered block with the specified original block and width.
   */
  public Centered(TextBlock originalBlock, int width) {
    this.originalBlock = originalBlock;
    this.width = width;
  } // Centered(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the centered block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    // Get the original row
    String originalRow = originalBlock.row(i);

    // Handle the case where width is 0 or less
    if (width <= 0) {
      return "";
    }

    // Calculate the padding for centering
    int padding = Math.max(0, (width - originalRow.length()) / 2);

    // Create the centered row with padding
    String centeredRow = TBUtils.spaces(padding) + originalRow;

    // If there is space on the right, add it
    int remainingWidth = width - centeredRow.length();
    if (remainingWidth > 0) {
      centeredRow += TBUtils.spaces(remainingWidth);
    }

    return centeredRow;
  }

  /**
   * Determine how many rows are in the centered block.
   */
  public int height() {
    return originalBlock.height();
  } // height()

  /**
   * Determine how many columns are in the centered block.
   */
  public int width() {
    return Math.min(originalBlock.width(), width);
  } // width()
} // class Centered
