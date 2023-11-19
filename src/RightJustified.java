/**
 * Right-justify a TextBlock within a specified width.
 * 
 * @author [Your Name]
 * @version 1.0 [Date]
 */
public class RightJustified implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The original TextBlock to be right-justified.
   */
  private TextBlock originalBlock;

  /**
   * The width for right justification.
   */
  private int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new right-justified block with the specified original block and width.
   */
  public RightJustified(TextBlock originalBlock, int width) {
    this.originalBlock = originalBlock;
    this.width = width;
  } // RightJustified(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the right-justified block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    // Get the original row
    String originalRow = originalBlock.row(i);

    // Calculate the padding needed for right justification
    int padding = Math.max(0, width - originalRow.length());

    // Create the right-justified row with padding
    return TBUtils.spaces(padding) + originalRow;
  } // row(int)

  /**
   * Determine how many rows are in the right-justified block.
   */
  public int height() {
    return originalBlock.height();
  } // height()

  /**
   * Determine how many columns are in the right-justified block.
   */
  public int width() {
    return Math.min(originalBlock.width(), width);
  } // width()
} // class RightJustified
