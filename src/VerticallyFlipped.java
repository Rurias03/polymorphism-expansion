/**
 * Flip the order of rows vertically in a TextBlock.
 * 
 * @author [Your Name]
 * @version 1.0 [Date]
 */
public class VerticallyFlipped implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The original TextBlock to have its rows flipped vertically.
   */
  private TextBlock originalBlock;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block with vertically flipped rows.
   */
  public VerticallyFlipped(TextBlock originalBlock) {
    this.originalBlock = originalBlock;
  } // VerticallyFlipped(TextBlock)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block with vertically flipped rows.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    // Get the original row with vertically flipped index
    int flippedIndex = originalBlock.height() - 1 - i;
    return originalBlock.row(flippedIndex);
  } // row(int)

  /**
   * Determine how many rows are in the block with vertically flipped rows.
   */
  public int height() {
    return originalBlock.height();
  } // height()

  /**
   * Determine how many columns are in the block with vertically flipped rows.
   */
  public int width() {
    return originalBlock.width();
  } // width()
} // class VerticallyFlipped
